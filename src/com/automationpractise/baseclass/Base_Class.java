package com.automationpractise.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getDriver(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {

				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

				driver = new ChromeDriver();

			}

			else if (browser.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));

				driver = new InternetExplorerDriver();

			}

			else if (browser.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));

				driver = new FirefoxDriver();

			}

			driver.manage().window().maximize();

			driver.manage().deleteAllCookies();

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

	public static void getUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static void close() {

		driver.close();

	}

	public static void sleep(int seconds) throws Throwable {

		Thread.sleep(seconds);

	}

	public static void dropdown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byIndex")) {

			int index = Integer.parseInt(value);
			s.selectByIndex(index);

		}

		else if (type.equalsIgnoreCase("byValue")) {

			s.selectByValue(value);
		}

		else if (type.equalsIgnoreCase("byVisibletext")) {

			s.selectByVisibleText(value);

		}

	}

	public static void snap_shot(String path) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	public static void frameOperations(String type, String id, String index, WebElement element) {

	}

}
