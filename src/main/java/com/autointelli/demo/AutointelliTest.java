package com.autointelli.demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutointelliTest {

	public WebDriver driver = new FirefoxDriver();

	public TakesScreenshot ts = (TakesScreenshot) driver;

	public JavascriptExecutor js = (JavascriptExecutor) driver;

	private void demoPage() throws InterruptedException, IOException {

		driver.get("https://www.autointelli.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		WebElement demoClick = driver.findElement(By.xpath("//a[text()='REQUEST FOR DEMO']"));

		demoClick.click();

		WebElement name = driver.findElement(By.xpath("//input[@id='txtdemofstname']"));

		name.sendKeys("Autointelli");

		WebElement email = driver.findElement(By.name("txtdemobusemail"));

		email.sendKeys("test@autointelli.com");

		WebElement phNo = driver.findElement(By.id("txtdemophnnumber"));

		phNo.sendKeys("9876543210");

		WebElement businessName = driver.findElement(By.id("txtdemofstcmpnyname"));

		businessName.sendKeys("autointelli systems pvt ltd");

		WebElement noIncidents = driver.findElement(By.name("txtdemonoofincident"));

		noIncidents.sendKeys("2");

		WebElement aGMS = driver.findElement(By.id("txtdemomonsys"));

		aGMS.sendKeys("10");

		WebElement autoToolPlace = driver.findElement(By.xpath("//select[@id='seldemoaitool']"));

		Select selATP = new Select(autoToolPlace);

		js.executeScript("arguments[0].scrollIntoView();", autoToolPlace);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(autoToolPlace));

		selATP.selectByValue("yes");

		WebElement hiddenTextarea = driver.findElement(By.xpath("//input[@id='txtdemoreasonforchange']"));

		hiddenTextarea.sendKeys("Nothing");

		WebElement captchaFrame = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));

		driver.switchTo().frame(captchaFrame);

		WebElement captcha = driver.findElement(By.xpath("//div[@id='rc-anchor-container']"));

		captcha.click();

		Thread.sleep(10000);

		driver.switchTo().defaultContent();

		WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));

		wait.until(ExpectedConditions.visibilityOf(submitBtn));

		js.executeScript("arguments[0].scrollIntoView();", submitBtn);

		submitBtn.click();

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\DemoPage.jpg");

		FileUtils.copyFile(srcFile, destFile);

		System.out.println("Demo Page ScreenShot Done");
		
		// POC Page

		driver.navigate().to("https://www.autointelli.com/poc.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		WebElement orgName = driver.findElement(By.id("txtpoccmpnyname"));

		orgName.sendKeys("Autointelli Private Ltd.");

		WebElement secName = driver.findElement(By.name("txtpocfstname"));

		secName.sendKeys("autointelli");

		WebElement spocEmail = driver.findElement(By.xpath("//input[@type='email']"));

		spocEmail.sendKeys("test@autointelli.com");

		WebElement captchaSecFrame = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));

		driver.switchTo().frame(captchaSecFrame);

		WebElement secCaptcha = driver.findElement(By.xpath("//div[@id='rc-anchor-container']"));

		secCaptcha.click();

		Thread.sleep(10000);

		driver.switchTo().defaultContent();

		WebElement submitSecBtn = driver.findElement(By.xpath("//button[@type='submit']"));

		submitSecBtn.click();

		File srcSecFile = ts.getScreenshotAs(OutputType.FILE);

		File destSecFile = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\PocPage.jpg");

		FileUtils.copyFile(srcSecFile, destSecFile);
		
		System.out.println("POC Page ScreenShot Done");

		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException, IOException {

		AutointelliTest ait = new AutointelliTest();

		ait.demoPage();

	}

}
