package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Types {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Amazon");
		
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Explicit wait

		WebElement google_Logo = driver.findElement(By.id("hplogo"));

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(google_Logo));

	}

}
