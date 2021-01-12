package com.selenium.demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("Abc@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");

		WebElement login_Btn = driver.findElement(By.name("login"));
		login_Btn.click();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File
				("C:\\Eclipse\\My_Class\\Screenshot_Images\\screenshot.png");
		FileUtils.copyFile(source, destination);
		
		driver.close();

	}

}
