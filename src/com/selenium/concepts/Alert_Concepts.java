package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);

		WebElement alert = driver.findElement(By.xpath("(//button[contains(text(), 'click the button to')])[1]"));
		alert.click();

		Thread.sleep(3000);

		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();

		// return back to webPage

		driver.switchTo().defaultContent();

		System.out.println("Simple alert completed");

		WebElement ok_Cancel_Btn = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		ok_Cancel_Btn.click();

		WebElement confirmbox_Btn = driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]"));
		confirmbox_Btn.click();

		Thread.sleep(1000);

		Alert confirm_Alert = driver.switchTo().alert();
		confirm_Alert.accept();

		// return back to webpage
		driver.switchTo().defaultContent();

		System.out.println("Confirm Alert completed");

		WebElement textbox_Btn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textbox_Btn.click();

		WebElement promptbox_Btn = driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]"));
		promptbox_Btn.click();

		Thread.sleep(2000);

		Alert prompt_Alert = driver.switchTo().alert();
		String text = prompt_Alert.getText();
		System.out.println(text);

		Thread.sleep(1000);

		prompt_Alert.accept();

		driver.switchTo().defaultContent();

		System.out.println("Prompt alert completed");

	}

}
