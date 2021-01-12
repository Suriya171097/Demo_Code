package com.selenium.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_Product {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/men-tshirts");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		List<WebElement> all_Prizes = driver
				.findElements(By.xpath("//span[@class='product-discountedPrice']//following-sibling::span"));

		List<Integer> prize_List = new ArrayList<Integer>();

		for (int i = 0; i < all_Prizes.size(); i++) {

			String prize = all_Prizes.get(i).getText().replace("Rs. ", "");
			System.out.println(prize);
			int values = Integer.parseInt(prize);

			prize_List.add(values);

		}

		System.out.println(prize_List);

		int size = prize_List.size();
		System.out.println("Size : " + size);

		// To get a maximum values

		System.out.println("Maximum values : " + Collections.max(prize_List));

	}

}
