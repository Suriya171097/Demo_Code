package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") +("\\Driver\\chromedriver.exe"));
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
	
		driver.manage().window().maximize();
		
		driver.switchTo().frame("singleframe");
		
		WebElement text_Box = driver.findElement(By.xpath("//input[@type='text']"));
		text_Box.sendKeys("Single_Frame");
		
		driver.switchTo().defaultContent();
		
		WebElement iframe_Btn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframe_Btn.click();
		
		//by using webelement
		
		WebElement parent_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(parent_Frame);
		
		WebElement child_Frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(child_Frame);
		
		WebElement text_Box2 = driver.findElement(By.xpath("//input[@type='text']"));
		text_Box2.sendKeys("Multiple_Frame");
		
		// parent frame
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Im in Application");
		
		WebElement video_Btn = driver.findElement(By.xpath("//a[text()='Video']"));
		video_Btn.click();
	}

}
