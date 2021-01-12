package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		WebElement alert_Btn = driver.findElement(By.xpath("(//button[contains(text(),'click the ')])[1]"));
		alert_Btn.click();
		Thread.sleep(2000);
		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();

		System.out.println("Simple Alert Completed");

		Thread.sleep(2000);

		// It Come back To the main page
		driver.switchTo().defaultContent();

		WebElement alert_WithOk = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alert_WithOk.click();
		WebElement confirm_Box_Btn = driver.findElement(By.xpath("(//button[contains(text(),'click the')])[2]"));
		confirm_Box_Btn.click();
		Thread.sleep(2000);
		Alert confirm_Alert = driver.switchTo().alert();
		confirm_Alert.accept();

		System.out.println("Confirm Alert is Completed");

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		WebElement alert_Textbox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alert_Textbox.click();

		WebElement prompt_Box = driver.findElement(By.xpath("//button[contains(text(),' the prompt box ')]"));
		prompt_Box.click();

		Alert promptAlert = driver.switchTo().alert();
		String warning_Msg = promptAlert.getText();
		System.out.println(warning_Msg);

		Thread.sleep(2000);

		promptAlert.accept();

		driver.switchTo().defaultContent();

		Thread.sleep(2000);

		System.out.println("prompt alert Completed");

	}

}
