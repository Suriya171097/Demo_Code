package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		// is Enabled
		boolean enabled = email.isEnabled();
		System.out.println(enabled);

		// sendkeys

		email.sendKeys("Abc@gmail.com");

		// clear

		email.clear();

		email.sendKeys("Abc1710@gmail.com");

		//getAttribute
		
		String attribute = email.getAttribute("value");
		System.out.println(attribute);
		
		String attribute_Value = email.getAttribute("id");
		System.out.println(attribute_Value);
		
		//isDisplayed
		
		boolean displayed = email.isDisplayed();
		System.out.println(displayed);
		
		//getText
		WebElement create_Txt = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String text = create_Txt.getText();
		System.out.println(text);
		
		// click
		WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		create_Btn.click();
		
		Thread.sleep(2000);
		
		WebElement gender_Btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gender_Btn.click();
		
		//is Selected
		boolean selected = gender_Btn.isSelected();
		System.out.println(selected);
		
		
		
		
		
		
	}

}
