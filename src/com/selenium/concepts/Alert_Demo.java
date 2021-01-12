package com.selenium.concepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");

		Thread.sleep(2000);

		WebElement alert_Btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert_Btn.click();

		Thread.sleep(3000);

		Alert simple_Alert = driver.switchTo().alert();
		simple_Alert.accept();

		Thread.sleep(3000);

		WebElement ok_Cancel_Btn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ok_Cancel_Btn.click();

		WebElement confirm_Btn = driver.findElement(By.xpath("//button[contains(text(),'confirm box ')]"));
		confirm_Btn.click();

		Thread.sleep(2000);

		Alert confirm_Alert = driver.switchTo().alert();
		confirm_Alert.accept();

		WebElement textbox_Btn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		textbox_Btn.click();

		WebElement prompt_Btn = driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]"));
		prompt_Btn.click();

		Alert prompt_Alert = driver.switchTo().alert();
		String text = prompt_Alert.getText();
		System.out.println(text);

		prompt_Alert.accept();

	}

}
