package com.selenium.doubts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static WebDriver driver;

	public static void amazon_Concept() throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement gift_Cards = driver.findElement(By.xpath("//a[text()='Gift Cards']"));

		Actions a = new Actions(driver);

		a.contextClick(gift_Cards).build().perform();

		// Robot Actions

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement best_Sellers = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));

		a.contextClick(best_Sellers).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.contextClick(mobiles).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		WebElement new_Releases = driver.findElement(By.xpath("(//a[text()='New Releases'])[1]"));
		a.contextClick(new_Releases).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		Set<String> all_Id = driver.getWindowHandles();

		for (String id : all_Id) {

			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}

		String actual_Title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

		for (String id : all_Id) {

			if (driver.switchTo().window(id).getTitle().equalsIgnoreCase(actual_Title)) {

				break;
			}
		}
		}


	public static void main(String[] args) throws Throwable {
		amazon_Concept();
	}

}
