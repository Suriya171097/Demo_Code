package com.selenium.doubts;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Window_Handle extends Amazon {

	//public static WebDriver driver = Amazon.driver;

	public static void window() throws Throwable {

		Set<String> all_Id = driver.getWindowHandles();

		for (String id : all_Id) {

			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);

		}

		String actual_Title = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

		for (String id : all_Id) {

			if (driver.switchTo().window(id).getTitle().equals(actual_Title)) {

				break;

			}

		}

	}

	public static void main(String[] args) throws Throwable {
		amazon_Concept();

		window();

	}

}
