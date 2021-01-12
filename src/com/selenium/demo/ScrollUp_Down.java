package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		WebElement amazon_Logo = driver.findElement
				(By.xpath("//div[@class='navFooterLine navFooterLogoLine']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", amazon_Logo);

		// WebElement top_Logo = driver.findElement(By.id("JJPXH5xNCsOjKDqUEwEElQ"));

		WebElement top = driver.findElement
				(By.xpath("//span[text()='Best Sellers in Sports, Fitness & Outdoors']"));

		System.out.println("ok1");

		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", top);

		System.out.println("ok");

		js.executeScript("window.scrollBy(0,-2200)");

	}

}
