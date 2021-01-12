package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Frames.html");

		driver.manage().window().maximize();

		// WebElement single_Frame =
		// driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));

		Thread.sleep(2000);

		driver.switchTo().frame("singleframe");

		System.out.println("Single Frame completed");

		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("Abc");

		System.out.println("Ok");

		driver.switchTo().defaultContent();

		WebElement multi_Frame = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		multi_Frame.click();

		Thread.sleep(2000);

		WebElement multiframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

		driver.switchTo().frame(multiframe);

		WebElement inner_Frame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inner_Frame);

		WebElement text_Box = driver.findElement(By.xpath("//input[@type='text']"));
		text_Box.sendKeys("Multi-Frame");

		System.out.println("Multi frame completed");

		// driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		WebElement video_Btn = driver.findElement(By.xpath("//a[text()='Video']"));
		video_Btn.click();

//		
	}

}
