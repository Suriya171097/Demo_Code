package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_Down {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		WebElement amazon_Logo = driver.findElement
				(By.xpath("//div[@class='nav-logo-base nav-sprite']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", amazon_Logo);

		Thread.sleep(2000);
		
		WebElement home_Essentials = driver.findElement
				(By.xpath("//span[text()='Up to 60% off | Home essentials from Indian startups']"));
		js.executeScript("arguments[0].scrollIntoView();", home_Essentials);
	
		//alternate method
		js.executeScript("window.scrollBy(0,-2200);");
		
		
		
		
		
	}

}
