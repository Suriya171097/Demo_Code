package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Launch {

	public static void main(String[] args) {

		// Chrome

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		// IE

		System.setProperty("webdriver.ie.driver", 
				"C:\\Eclipse\\My_Class\\Driver\\IEDriverServer.exe");

		WebDriver driver1 = new InternetExplorerDriver();

		driver1.get("https://www.facebook.com/");

		// FireFox

		System.setProperty("webdriver.gecko.driver", 
				"C:\\Eclipse\\My_Class\\Driver\\geckodriver.exe");

		WebDriver driver2 = new FirefoxDriver();

		driver2.get("https://www.facebook.com/");

	}

}
