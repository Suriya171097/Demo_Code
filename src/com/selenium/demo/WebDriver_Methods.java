package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		// maximize

		driver.manage().window().maximize();

		// Title
		String title = driver.getTitle();
		System.out.println(title);

		// Url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// navigation methods

		driver.navigate().to("https://www.amazon.in/");

		// back

		driver.navigate().back();

		// forward

		driver.navigate().forward();

		// refresh
		driver.navigate().refresh();

		// close
		driver.close();

	}

}
