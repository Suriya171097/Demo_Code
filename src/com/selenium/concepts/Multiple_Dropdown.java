package com.selenium.concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		driver.manage().window().maximize();

		WebElement multi_Dropdown = driver.findElement(By.id("multi-select"));

		Select s = new Select(multi_Dropdown);

		boolean multiple = s.isMultiple();

		System.out.println(multiple);

		List<WebElement> all_Options = s.getOptions();

		int size = all_Options.size();
		System.out.println("Size : " + size);

		for (int i = 0; i < size; i++) {

			if (i == 1 || i == 3 || i == 5) {
				s.selectByIndex(i);
			}

		}

		// Selected Options
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		System.out.println("All Selected Options");
		for (WebElement selected : allSelectedOptions) {

			String values = selected.getText();
			System.out.println(values);

		}

		// First selected Option

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		String text = firstSelectedOption.getText();
		System.out.println("First Selected Option : " + text);

		System.out.println("All options");
		
		for (WebElement options : all_Options) {
			String values = options.getText();
			System.out.println(values);
			
		}
		
		
	}

}
