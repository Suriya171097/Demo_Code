package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("singleframe");
		
		WebElement text_Box = driver.findElement(By.xpath("//input[@type='text']"));
		text_Box.sendKeys("Single_Frame");
	
		driver.switchTo().defaultContent();
		
		WebElement iframe_Btn = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		iframe_Btn.click();
		
		WebElement outer_Frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		driver.switchTo().frame(outer_Frame);
		
		WebElement inner_Frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		
		driver.switchTo().frame(inner_Frame);
		
		WebElement text_Box2 = driver.findElement(By.xpath("//input[@type='text']"));
		text_Box2.sendKeys("Multiple_Frame");
		
		//driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		WebElement video_Btn = driver.findElement(By.xpath("//a[text()='Video']"));
		video_Btn.click();
	
	
	}

}
