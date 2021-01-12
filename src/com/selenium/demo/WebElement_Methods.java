package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		// isEnabled
		boolean enabled = email.isEnabled();
		System.out.println(enabled);

		// isDisplayed
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);

		// send keys
		email.sendKeys("Abc@gmail.com");

		// click
		email.clear();

		// send keys
		email.sendKeys("Abc1710@gmail.com");

		// getAttribute

		String attribute = email.getAttribute("value");
		System.out.println(attribute);

		String attribute2 = email.getAttribute("id");
		System.out.println(attribute2);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Abc");

		WebElement login_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));

		// click
		login_Btn.click();

		Thread.sleep(3000);

		// isSelected

		WebElement radio_Btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		radio_Btn.click();

		boolean selected = radio_Btn.isSelected();
		System.out.println(selected);

	}

}
