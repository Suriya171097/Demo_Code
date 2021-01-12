package com.selenium.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

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

		// String parent_Id = driver.getWindowHandle();

		Set<String> all_Id = driver.getWindowHandles();

		for (String id : all_Id) {

			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}

		String actual_Title = "Amazon.in Bestsellers: The most popular items on Amazon";

		for (String id : all_Id) {

			if (driver.switchTo().window(id).getTitle().equalsIgnoreCase(actual_Title)) {

				break;

			}

		}

	}

}
