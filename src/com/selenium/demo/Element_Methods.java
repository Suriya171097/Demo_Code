package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Methods {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Abc@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));

		password.sendKeys("Abc");

		Thread.sleep(2000);

		// clear
		email.clear();

		// getAttribute
		String attribute = password.getAttribute("type");
		System.out.println(attribute);

		WebElement create_Text = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = create_Text.getText();
		System.out.println(text);

		// click

		WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		create_Btn.click();
		
		Thread.sleep(2000);
		
		WebElement first_Name = driver.findElement(By.name("firstname"));
		
		//Displayed
		boolean displayed = first_Name.isDisplayed();
		System.out.println("Displayed or not : "+displayed);
		
		//Enable
		boolean enabled = first_Name.isEnabled();
		System.out.println("Enabled Or not : "+enabled);

		
		WebElement radio_Btn = driver.findElement(By.xpath("//input[@value='2']"));
		//Selected
		boolean selected = radio_Btn.isSelected();
		System.out.println("Selected Or not : "+selected);
		
		
		

	}

}
