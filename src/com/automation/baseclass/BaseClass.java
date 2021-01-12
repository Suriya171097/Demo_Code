package com.automation.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class BaseClass {

	public static WebDriver driver;

	/*
	 * public void add() { System.out.println(10 / 0); throw new
	 * ArithmeticException();
	 * 
	 * }
	 */
	public static WebDriver getDriver(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + ("\\Driver\\chromedriver.exe"));

				driver = new ChromeDriver();
			}

			else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + ("\\Driver\\IEDriverServer.exe"));

				driver = new InternetExplorerDriver();
			}

			else if (browserName.equalsIgnoreCase("Firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + ("\\Driver\\geckodriver.exe"));

				driver = new FirefoxDriver();

			}

			else {
				System.out.println("Browser Launch Is Invalid");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void getURL(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValueElement(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateTo(String URL) {

		try {
			driver.navigate().to(URL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateBack() {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateForward() {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateRefresh() {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollUp(WebElement element) {

		try {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void scrollDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void getText(WebElement element) {
		try {
			// element.getText();
			System.out.println(element.getText());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getAttribute(WebElement element, String value) {

		try {
			element.getAttribute(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getTitle() {

		try {
			driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void GetCurrentUrl(String getCurrentUrl) {

		try {
			driver.getCurrentUrl();
			System.out.println(getCurrentUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void elementIsDisplayed(WebElement element) {

		try {
			element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void elementIsEnabled(WebElement element) {

		try {
			System.out.println(element.isEnabled());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void elementIsSelected(WebElement element) {
		try {
			System.out.println(element.isSelected());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void driverClose() {

		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void driverQuit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void screenshot(String path) throws Throwable {

		try {
			TakesScreenshot snap = (TakesScreenshot) driver;

			File source = snap.getScreenshotAs(OutputType.FILE);
			File destination = new File(path);
			FileUtils.copyFile(source, destination);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void doubleClick(WebElement element) {

		try {
			Actions act = new Actions(driver);
			act.doubleClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void contextClick(WebElement element) {
		try {
			Actions act = new Actions(driver);
			act.contextClick(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void moveToElement(WebElement element) {
		try {
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dragAndDrop(WebElement source, WebElement Target) {
		try {
			Actions act = new Actions(driver);
			act.dragAndDrop(source, Target).build().perform();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnElement(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void radioButtonClick(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void maximize() {

		driver.manage().window().maximize();
	}

	public static void robotOperations(String Type) throws Throwable {

		try {
			Robot r = new Robot();
			if (Type.equalsIgnoreCase("DownAndEnter")) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);

				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
			}

			else if (Type.equalsIgnoreCase("DoubleDownAndEnter")) {

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);

				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);

				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);

			}

			else {
				System.out.println("Robot Class Not Used");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void frameOperations(String Type, String value, String Id, WebElement element) {

		try {
			if (Type.equalsIgnoreCase("byIndex")) {

				int parseInt = Integer.parseInt(value);
				driver.switchTo().frame(parseInt);

			}

			else if (Type.equalsIgnoreCase("byId")) {
				driver.switchTo().frame(Id);
			}

			else if (Type.equalsIgnoreCase("byWebElement")) {
				driver.switchTo().frame(element);
			}

			else {
				System.out.println("Frame Is Invalid");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public static void simpleAlert() {

		try {
			driver.switchTo().alert().accept();

			driver.switchTo().defaultContent();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void confirmAlert(String Ok, String Cancel) {

		try {
			if (Ok.equalsIgnoreCase("Ok")) {
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();
			}

			else if (Cancel.equalsIgnoreCase("Cancel")) {
				driver.switchTo().alert().dismiss();
				driver.switchTo().defaultContent();
			} else {
				System.out.println("Confirm Alert Is Not valid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void promptAlert(String Ok, String Cancel, String Text) {
		try {
			if (Ok.equalsIgnoreCase("Ok")) {
				driver.switchTo().alert().sendKeys(Text);
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();
			}

			else if (Cancel.equalsIgnoreCase("Cancel")) {
				driver.switchTo().alert().sendKeys(Text);
				driver.switchTo().alert().dismiss();
				driver.switchTo().defaultContent();
			} else {
				System.out.println("Prompt Alert Is Not valid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void windowsHandles(String type, String destination) {

		try {

			if (type.equalsIgnoreCase("singleWindow")) {
				String windowHandle = driver.getWindowHandle();
				System.out.println(windowHandle);

			} else if (type.equalsIgnoreCase("multiWindow")) {

				Set<String> windowHandles = driver.getWindowHandles();

				for (String inputwindow : windowHandles) {
					System.out.println(inputwindow);

					String title = driver.switchTo().window(inputwindow).getTitle();
					System.out.println(title);
				}

				String ActualTitle = destination;
				for (String inputwindow : windowHandles) {
					if (driver.switchTo().window(inputwindow).getTitle().equalsIgnoreCase(destination)) {
						break;
					}
				}
			}

			else {
				System.out.println("Windows Not Handled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDown(WebElement element, String type, String values) {

		try {
			Select s = new Select(element);

			if (type.equalsIgnoreCase("byIndex")) {
				int parseInt = Integer.parseInt(values);
				s.selectByIndex(parseInt);
			}

			else if (type.equalsIgnoreCase("byValue")) {

				s.selectByValue(values);

			} else if (type.equalsIgnoreCase("byVisibleText")) {
				s.selectByVisibleText(values);
			}

			else {
				System.out.println("Select Is Not Here");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	public static void waitconcepts(String Type, int Duration, TimeUnit format, WebElement element) {

		try {
			if (Type.equalsIgnoreCase("implicit")) {
				driver.manage().timeouts().implicitlyWait(Duration, format);
			}

			else if (Type.equalsIgnoreCase("pageloadtimeout")) {
				driver.manage().timeouts().pageLoadTimeout(Duration, format);
			}

			else if (Type.equalsIgnoreCase("explicit")) {
				WebDriverWait wait = new WebDriverWait(driver, Duration);
				wait.until(ExpectedConditions.visibilityOf(element));
			} else if (Type.equalsIgnoreCase("fluent")) {
				Wait wait1 = new FluentWait(driver).withTimeout(Duration, format).pollingEvery(Duration, format)
						.ignoring(Exception.class);
			}

			else {
				System.out.println("Wait Is Invalid");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void checkboxOperations(String Type, String path, String attributeName, String attributeValue,
			String attributeValue2, String attributeValue3) {

		if (Type.equalsIgnoreCase("TwoCheckBox")) {
			List<WebElement> allTests = driver.findElements(By.xpath(path));

			for (WebElement test : allTests) {
				if (test.getAttribute(attributeName).equals(attributeValue)
						|| test.getAttribute(attributeName).equals(attributeValue2)) {
					test.click();
				}
			}
		} else if (Type.equalsIgnoreCase("ThreeCheckBox")) {
			List<WebElement> allTests = driver.findElements(By.xpath(path));

			for (WebElement test : allTests) {
				if (test.getAttribute(attributeName).equals(attributeValue)
						|| test.getAttribute(attributeName).equals(attributeValue2)
						|| test.getAttribute(attributeName).equals(attributeValue3)) {
					test.click();
				}

			}
		}
	}

	/*
	 * public static void excelDriven(String Type, String Path, int index) throws
	 * Throwable {
	 * 
	 * if (Type.equalsIgnoreCase("All Data")) {
	 * 
	 * File f = new File(Path); FileInputStream fis = new FileInputStream(f);
	 * Workbook book = new XSSFWorkbook(fis);
	 * 
	 * Sheet sheetAt = book.getSheetAt(index);
	 * 
	 * for (int i = 1; i < sheetAt.getPhysicalNumberOfRows(); i++) {
	 * 
	 * Row row = sheetAt.getRow(i);
	 * 
	 * for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	 * 
	 * Cell cell = row.getCell(j);
	 * 
	 * CellType cellType = cell.getCellType();
	 * 
	 * if (cellType.equals(CellType.STRING)) {
	 * 
	 * String stringCellValue = cell.getStringCellValue();
	 * System.out.println(stringCellValue);
	 * 
	 * }
	 * 
	 * else if (cellType.equals(CellType.NUMERIC)) {
	 * 
	 * double values = cell.getNumericCellValue();
	 * 
	 * int value1 = (int) values; String value = cell.getStringCellValue();
	 * 
	 * System.out.println(value);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * }
	 */

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void getOptions() {

	}

	public static void firstSelectedOperations() {

	}

}
