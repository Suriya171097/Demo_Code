package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteX_path {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss");

		Thread.sleep(2000);

//		WebElement image = driver.findElement(By.xpath(
//				"//div[@id='search']/div/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div/div/div/span/a/div"));
//		image.click();

		Thread.sleep(2000);

		driver.close();
		
		

	}

}
