package com.automation.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getDriver(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

				driver = new ChromeDriver();

			}

			else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));

				driver = new InternetExplorerDriver();

			}

			else if (browserName.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("Driver\\geckodriver.exe"));

				driver = new FirefoxDriver();

			}

			driver.manage().window().maximize();


			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void clickOnElement(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
