package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		// Single frame

		WebElement single_Frame = driver.findElement(By.id("singleframe"));

		driver.switchTo().frame(single_Frame);

		// Enter a text
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("Abc");

		// Exit from the frame
		driver.switchTo().defaultContent();

		// Switch to multiple

		WebElement multi_Frame = driver.findElement(By.linkText("Iframe with in an Iframe"));
		multi_Frame.click();

		WebElement frame_Outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(frame_Outer);

		driver.switchTo().frame(1);
		
		System.out.println("Ok");

		Thread.sleep(2000);
		
		WebElement text1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		text1.sendKeys("Abc");

	}

}
