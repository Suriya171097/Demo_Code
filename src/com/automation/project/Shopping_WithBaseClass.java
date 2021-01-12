package com.automation.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pom.Home_Page;
import com.automation.pom.Login_Page;
import com.automationpractise.baseclass.Base_Class;

public class Shopping_WithBaseClass extends Base_Class {

	public static WebDriver driver; // empty

	public static void main(String[] args) throws Throwable {

		driver = getDriver("chrome");

		getUrl("http://automationpractice.com/index.php");

		Home_Page home = new Home_Page(driver);
		
		clickOnElement(home.getSignin_Btn());

		sleep(3000);

		Login_Page login = new Login_Page(driver);
		inputValueElement(login.getEmail(), "emailid17@gmail.com");

		inputValueElement(login.getPassword(), "Music17");

		clickOnElement(login.getSignin_Btn());

		close();
		
		
	}

}
