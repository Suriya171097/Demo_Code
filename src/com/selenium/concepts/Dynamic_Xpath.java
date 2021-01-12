package com.selenium.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men-tshirts");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		List<WebElement> all_Prizes = driver.findElements(
				By.xpath("//span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']"));

		List<Integer> prize_List = new ArrayList<Integer>();

		for (WebElement prizes : all_Prizes) {

			String prize = prizes.getText().replace("Rs. ", "");

			int values = Integer.parseInt(prize);

			System.out.println(values);

			prize_List.add(values);

		}

		int size = prize_List.size();
		System.out.println("Size : " + size);
		System.out.println("Maximum value : " + Collections.max(prize_List));

	}

}
