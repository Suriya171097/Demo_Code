package com.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShoppingUserDetails {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Eclipse\\Demo\\Selenium_Project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		WebElement enterEmail = driver.findElement(By.id("email_create"));
		enterEmail.sendKeys("emailid17@gmail.com");

		WebElement confirm = driver.findElement(By.name("SubmitCreate"));
		confirm.click();
		Thread.sleep(3000);

		WebElement genderchoose = driver.findElement(By.id("id_gender1"));
		genderchoose.click();

		WebElement firstname = driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[1]"));
		firstname.sendKeys("suriya");

		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("Veeran");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Music17");

		WebElement Day = driver.findElement(By.id("days"));
		Select s = new Select(Day);
		s.selectByValue("17");

		WebElement Month = driver.findElement(By.id("months"));
		Select s1 = new Select(Month);
		s1.selectByValue("10");

		WebElement Year = driver.findElement(By.id("years"));
		Select s2 = new Select(Year);
		s2.selectByValue("1997");

		WebElement signup = driver.findElement(By.id("newsletter"));
		signup.click();

		WebElement AnotherSign = driver.findElement(By.id("optin"));
		AnotherSign.click();

		WebElement companyName = driver.findElement(By.id("company"));
		companyName.sendKeys("Mr & Mrs Smith Company & Co");

		WebElement Address = driver.findElement(By.id("address1"));
		Address.sendKeys("21/B , Baker Street ");

		WebElement Address2 = driver.findElement(By.id("address2"));
		Address2.sendKeys("Stark Apartment ,13th Floor");

		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Washington DC");

		WebElement state = driver.findElement(By.id("id_state"));
		Select s5 = new Select(state);
		s5.selectByVisibleText("New York");

		WebElement zipcode = driver.findElement(By.id("postcode"));
		zipcode.sendKeys("20001");

		WebElement additionalinformation = driver.findElement(By.id("other"));
		additionalinformation.sendKeys("I'm A Tester");

		WebElement homephone = driver.findElement(By.id("phone"));
		homephone.sendKeys("206-626-8602");

		WebElement phoneNo = driver.findElement(By.xpath("//input[@id='phone_mobile']"));
		phoneNo.sendKeys("1234567890");

		WebElement aliasinfo = driver.findElement(By.id("alias"));
		aliasinfo.sendKeys("No:17,GothamCity");

		WebElement Register = driver.findElement(By.xpath("//span[text()='Register']"));
		Register.click();
		
		System.out.println("Done");
	
		
	}

}
