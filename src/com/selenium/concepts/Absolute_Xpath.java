package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss");

		driver.manage().window().maximize();

		WebElement apple_Phone = driver.findElement(By.xpath(
				"//div[@id='search']/div/div[2]/div/span[3]/div[2]"
				+ "/div[3]/div/span/div/div/div/div/div[2]/div/div"
				+ "/div/span/a/div/img"));

		apple_Phone.click();

		driver.close();

	}

}
