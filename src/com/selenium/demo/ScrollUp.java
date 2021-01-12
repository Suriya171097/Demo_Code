package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement amazon_Logo = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLogoLine']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", amazon_Logo);

		System.out.println("Scroll Down is Complete");

		Thread.sleep(2000);

		// Alternate Way

		js.executeScript("window.scrollBy(0, -2000);");

		System.out.println("Scroll Up is Completed");

		WebElement signin_Btn = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));

		Thread.sleep(2000);

		js.executeScript("arguments[0].click();", signin_Btn);

		System.out.println("Click is Completed");

	}

}
