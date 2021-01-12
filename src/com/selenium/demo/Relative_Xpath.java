package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement create_Btn = driver.findElement(By.
				xpath("//a[text()='Create a Page']"));
		String text = create_Btn.getText();
		System.out.println(text);

		WebElement facebook_Txt = driver.findElement(By.xpath
				("//h2[contains(text(),'Facebook ')]"));
		String text2 = facebook_Txt.getText();
		System.out.println(text2);

		WebElement email = driver.findElement(By.xpath
				("//input[contains(@placeholder,'Email address ')]"));
		email.sendKeys("Abc@gmail.com");

		WebElement password = driver.findElement(By.xpath
				("(//input[contains(@data-testid,'royal_')])[2]"));
		password.sendKeys("12344");

		WebElement login_Btn = driver.findElement(By.xpath
				("//button[@name='login']"));
		login_Btn.click();

	}

}
