package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/s?k=mobiles&ref=nb_sb_noss");

		driver.manage().window().maximize();

//		WebElement image = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div"));
//		
//		image.click();
//		
		
		WebElement image = driver.findElement(By.xpath("//div[@id='search']/div/div[2]/div/span[3]/div[2]div[4]/div/span/div/div/div/div/div[2]/div/div/div/span/a/div/img"));
		image.click();
	}

}
