package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Demo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.switchTo().frame("singleframe");

		WebElement text_Box = driver.findElement
				(By.xpath("//input[@type='text']"));
		text_Box.sendKeys("Abc");

		driver.switchTo().defaultContent();

		System.out.println("Single frame completed");

		WebElement multiframe_Btn = driver.findElement
				(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multiframe_Btn.click();

		WebElement outer_Frame = driver.findElement
				(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(outer_Frame);

		WebElement inner_Frame = driver.findElement
				(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner_Frame);

		WebElement text_Box2 = driver.findElement
				(By.xpath("//input[@type='text']"));
		text_Box2.sendKeys("MultiFrame");

		//driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		WebElement video_Btn = driver.findElement
				(By.xpath("//a[text()='Video']"));
		video_Btn.click();
	}

}
