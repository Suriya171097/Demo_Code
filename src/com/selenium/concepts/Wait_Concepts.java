package com.selenium.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Concepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		// Explicit wait
		WebElement google_Img = driver.findElement(By.xpath("//img[@style='padding-top:1px']"));

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(google_Img));

		// Fluent wait

		Wait wait1 = new FluentWait(driver).
				withTimeout(30, TimeUnit.SECONDS).
				pollingEvery(10, TimeUnit.SECONDS)
				.ignoring(Exception.class);

	}

}
