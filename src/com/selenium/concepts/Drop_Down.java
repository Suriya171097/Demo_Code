package com.selenium.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.automationpractise.baseclass.Base_Class;

public class Drop_Down extends Base_Class {
	
	public static void main(String[] args) throws Throwable {
		
//		System.setProperty("webdriver.chrome.driver", 
//				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
//		
//		driver.manage().window().maximize();
//		
//		driver.manage().deleteAllCookies();
		
		
		getDriver("chrome");
		
		getUrl("https://www.facebook.com/");
		
		WebElement create_Btn = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		//create_Btn.click();
		clickOnElement(create_Btn);
		
		//Thread.sleep(3000);
		sleep(3000);
		
		WebElement day = driver.findElement(By.id("day"));
		
		WebElement month = driver.findElement(By.id("month"));
		
		WebElement year = driver.findElement(By.id("year"));
		
		
dropdown(day, "byValue", "17");
dropdown(month, "byVisibletext", "Nov");
dropdown(year, "byIndex", "6");
		
//snap_shot("C:\\Eclipse\\Demo\\Selenium_Project\\Screenshot\\snap.png");
		
	}

}
