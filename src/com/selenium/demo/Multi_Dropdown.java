package com.selenium.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		driver.manage().window().maximize();

		WebElement multi_Dropdown = driver.findElement
				(By.id("multi-select"));

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

		// To get Selected Options

		System.out.println("Selected Options : ");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement selected : allSelectedOptions) {

			System.out.println(selected.getText());

		}

		// To get first selected option

		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First Selected : "+firstSelectedOption.getText());

		// To get all Options

		System.out.println("All options");
		for (WebElement options : all_Options) {

			System.out.println(options.getText());

		}

	}

}
