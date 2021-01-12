package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Methods {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		create_Btn.click();

		Thread.sleep(2000);

		WebElement day_Dd = driver.findElement(By.id("day"));

		Select s = new Select(day_Dd);
		s.selectByValue("17");

		WebElement month_Dd = driver.findElement(By.id("month"));

		Select s1 = new Select(month_Dd);
		s1.selectByIndex(10);

		WebElement year_Dd = driver.findElement(By.id("year"));

		Select s2 = new Select(year_Dd);
		s2.selectByVisibleText("1996");

		Thread.sleep(2000);

		s2.selectByVisibleText("1997");

	}

}
