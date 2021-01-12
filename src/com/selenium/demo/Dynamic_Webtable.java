package com.selenium.demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Webtable {

	public static String Country = "India";
	static int country_Index, new_Cases, new_Deaths, india_Row;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/coronavirus/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> all_Headers = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));

		for (int i = 0; i < all_Headers.size(); i++) {

			String headers = all_Headers.get(i).getText();

			String head = headers.replaceAll("\n", " ");

			if (head.contains("Country")) {

				country_Index = i;

				System.out.println("Country index : " + country_Index);

			}

			else if (head.equalsIgnoreCase("Total Recovered")) {
				new_Cases = i;
				System.out.println("New Cases Index : " + new_Cases);

			}

			else if (head.equalsIgnoreCase("Total Cases")) {
				new_Deaths = i;
				System.out.println("New Deaths index : " + new_Deaths);
			}

		}
		List<WebElement> row_Datas = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));

		for (int i = 0; i < row_Datas.size(); i++) {

			List<WebElement> column_Data = row_Datas.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < column_Data.size(); j++) {

				if (column_Data.get(j).getText().equals(Country)) {
					System.out.println("Total Cases : " + column_Data.get(country_Index).getText());
					System.out.println("New cases  :" + column_Data.get(new_Cases).getText());
					System.out.println("New Deaths : " + column_Data.get(new_Deaths).getText());
				
				}

			}

		}

	}

}
