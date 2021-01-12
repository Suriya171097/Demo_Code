package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

		driver.manage().window().maximize();

		System.out.println("Row Datas : ");
		List<WebElement> allRowDatas = driver.findElements(
				By.xpath("//table/tbody/tr[2]/td"));

		for (WebElement rowData : allRowDatas) {

			String value = rowData.getText();
			System.out.println(value);

		}

		// To get a Single Column data

		System.out.println("*****Column Datas********");

		List<WebElement> allColumndatas = driver.findElements(
				By.xpath("//table/tbody/tr/td[2]"));

		for (WebElement columnData : allColumndatas) {

			System.out.println(columnData.getText());

		}

		// To get a Particular data

		WebElement particular_Data = driver.findElement(By.xpath(
				"//table/tbody/tr[2]/td[2]"));

		String data = particular_Data.getText();

		System.out.println("Particular data : " + data);

		// To get a All Datas
		
		System.out.println("******All Datas****");

		List<WebElement> allDatas = driver.findElements(By.xpath(
				"//table/tbody/tr/td"));

		for (WebElement datas : allDatas) {

			System.out.println(datas.getText());

		}

	}

}
