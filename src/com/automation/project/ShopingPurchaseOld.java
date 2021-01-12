package com.automation.project;

import java.io.File;
import java.io.IOException;
//import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

import com.automationpractise.baseclass.Base_Class;

public class ShopingPurchaseOld extends Base_Class{

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"//Driver//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();
		
		Thread.sleep(3000);

		WebElement EnterEmail = driver.findElement(By.id("email"));
		EnterEmail.sendKeys("emailid17@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("Music17");

		WebElement signInEntry = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		signInEntry.click();

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"))).build().perform();

		WebElement casualdress = driver.findElement(By.xpath("(//a[@title='Casual Dresses'])[2]"));
		casualdress.click();
		Thread.sleep(3000);

		WebElement quickview = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		quickview.click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);
		Thread.sleep(5000);

		WebElement plus = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span"));
		plus.click();
		Thread.sleep(3000);

		WebElement size = driver.findElement(By.id("group_1"));
//		Select s2 = new Select(size);
//		s2.selectByIndex(1);

		dropdown(size, "byIndex", "1");
		
	//	dropdown(size, "byVisibletext", null, "Oct");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		submit.click();
		Thread.sleep(4000);

		WebElement proceed = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
		proceed.click();

		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		Thread.sleep(2000);

		WebElement proceed3 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proceed3.click();
		Thread.sleep(3000);

		WebElement termsandservice = driver.findElement(By.id("cgv"));
		termsandservice.click();

		WebElement prooced4 = driver.findElement(By.name("processCarrier"));
		prooced4.click();
		Thread.sleep(3000);

		WebElement cashbybank = driver.findElement(By.xpath("(//p[@class='payment_module'])[1]"));
		cashbybank.click();
		Thread.sleep(3000);

		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		Thread.sleep(3000);

		// take screenshot

		WebElement javascript1 = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", javascript1);

		TakesScreenshot snapshot = (TakesScreenshot) driver;
		File sourceFile = snapshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Eclipse\\Projects\\Screenshot Images\\op done.png");
		FileUtils.copyFile(sourceFile, destinationFile);
		System.out.println("Snapshot DONE");
		Thread.sleep(4000);

		WebElement backtoorders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		backtoorders.click();
		Thread.sleep(4000);

		WebElement Tshirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		Tshirts.click();
		Thread.sleep(3000);

		WebElement quickviewforTshirt = driver.findElement(By.xpath("//img[@itemprop='image']"));
		quickviewforTshirt.click();
		Thread.sleep(3000);

		driver.switchTo().frame(0);
		Thread.sleep(5000);

		WebElement clickplus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickplus.click();
		Thread.sleep(3000);

		WebElement sizefortshirt = driver.findElement(By.id("group_1"));
		sizefortshirt.sendKeys("M");
		Thread.sleep(2000);

		WebElement colourblue = driver.findElement(By.xpath("//a[@title='Blue']"));
		colourblue.click();
		Thread.sleep(3000);

		WebElement addtocartintshirts = driver.findElement(By.id("add_to_cart"));
		addtocartintshirts.click();
		Thread.sleep(3000);

		WebElement proceed1fortshirts = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed1fortshirts.click();
		Thread.sleep(3000);

		WebElement proceed2fortshirts = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2fortshirts.click();
		Thread.sleep(3000);

		WebElement proceed3fortshirts = driver.findElement(By.xpath("//button[@name='processAddress']"));
		proceed3fortshirts.click();
		Thread.sleep(3000);

		WebElement termsandconditions2 = driver.findElement(By.id("cgv"));
		termsandconditions2.click();

		WebElement proceed4fortshirts = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		proceed4fortshirts.click();
		Thread.sleep(3000);

		WebElement paybycheck = driver.findElement(By.xpath("(//div[@class='col-xs-12 col-md-6'])[2]"));
		paybycheck.click();
		Thread.sleep(3000);

		WebElement confirmorder2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder2.click();
		Thread.sleep(3000);

		WebElement javascript = driver.findElement(By.xpath("//h1[text()='Order confirmation']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", javascript);

		TakesScreenshot snapshot2 = (TakesScreenshot) driver;
		File sourceFile2 = snapshot2.getScreenshotAs(OutputType.FILE);
		File destinationFile2 = new File("C:\\Eclipse\\Projects\\Screenshot Images\\op2done.png");
		FileUtils.copyFile(sourceFile2, destinationFile2);
		System.out.println("Snapshot2 DONE");
		Thread.sleep(3000);

		WebElement signout = driver.findElement(By.xpath("//a[@class='logout']"));
		signout.click();

	}

}
