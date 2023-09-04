package com.autointelli.demo;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GUITest {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		//Launching the Web Page
		
		
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("http://adactinhotelapp.com/");
		
		//Implicit Wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		//Login the User
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("suryas6398");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sury@6398");
		
		WebElement login = driver.findElement(By.id("login"));
		
		login.click();
		
		
		//Finding Locations
		
		WebElement findLocation = driver.findElement(By.xpath("//select[@name='location']"));
		
		//Explicit Wait
		
		WebDriverWait locationWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		locationWait.until(ExpectedConditions.visibilityOf(findLocation));
		
		Select selLoc = new Select(findLocation);
		
		selLoc.selectByValue("London");
		
		//Finding Hotels
		
		WebElement findHotel = driver.findElement(By.id("hotels"));
		
		Select selHotel = new Select(findHotel);
		
		selHotel.selectByIndex(2);
		
		//Select Room Type
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		
		Select selRoomType = new Select(roomType);
		
		selRoomType.selectByVisibleText("Super Deluxe");
		
		
		//Select No of Rooms
		
		WebElement noOfRooms = driver.findElement(By.name("room_nos"));
		
		Select selNoOfRooms = new Select(noOfRooms);
		
		selNoOfRooms.selectByIndex(6);
		
		//Check-in Date
		
		WebElement checkIn = driver.findElement(By.name("datepick_in"));
		
		checkIn.clear();
		
		checkIn.sendKeys("28/08/2023");
		
		//Check-out Date
		
		WebElement checkOut = driver.findElement(By.name("datepick_out"));
		
		checkOut.clear();
		
		checkOut.sendKeys("30/08/2023");
		
		//No of Adult
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		
		Select selAdultRoom = new Select(adultRoom);
		
		selAdultRoom.selectByValue("1");
		
		//No Child Room
		
		WebElement childRoom = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		
		Select selChildRoom = new Select(childRoom);
		
		selChildRoom.selectByVisibleText("1 - One");
		
		//Click Search
		
		WebElement srchBtn = driver.findElement(By.xpath("//input[@value='Search']"));
		
		srchBtn.click();
		
		//Click Radio Button
		
		WebElement selectRadioBtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		
		selectRadioBtn.click();
		
		//Click Continue to Next Page
		
		WebElement continueBtn = driver.findElement(By.name("continue"));
		
		continueBtn.click();
		
		//Enter First Name
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		
		firstName.sendKeys("Surya");
		
		//Enter LastName
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		
		lastName.sendKeys("S");
		
		//Enter Billing Address
		
		WebElement address = driver.findElement(By.name("address"));
		
		address.sendKeys("212/2 Road Street, Muniyappanthangal, Tiruvannamalai, 606802.");
		
		//Enter Credit Card Number
		
		WebElement creditCardNo = driver.findElement(By.name("cc_num"));
		
		creditCardNo.sendKeys("45678998764325678");
		
		//Select Card Type
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
		
		Select selCardType = new Select(cardType);
		
		selCardType.selectByIndex(2);
		
		//Enter Expire Month 
		
		WebElement cardMonth = driver.findElement(By.id("cc_exp_month"));
		
		Select selCardMonth = new Select(cardMonth);
		
		selCardMonth.selectByValue("3");
		
		//Enter Expire Year
		
		WebElement cardYear = driver.findElement(By.xpath("(//select[@class='select_combobox2'])[2]"));
		
		Select selCardYear = new Select(cardYear);
		
		selCardYear.selectByVisibleText("2026");
		
		//Enter CVV
		
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		
		cvv.sendKeys("786");
		
		//Click BookNow Button
		
		WebElement clickBookNow = driver.findElement(By.xpath("//input[@type='button']"));
		
		clickBookNow.click();
		
		//Printing Order ID
		
		WebElement orderNo = driver.findElement(By.id("order_no"));
		
		String printOrderId = orderNo.getAttribute("Value");
		
		System.out.println("Your Order Id is : " + printOrderId);
		
		//Take ScreenShot Booking Confirmation
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\BookingConfirmation.jpg");
		
		FileUtils.copyFile(srcFile, destFile);
		
		//Closing the Browser
		
		driver.quit();
		
		System.out.println("Your Booking is Confirmed and ScreenShot Saved");
		
	}

}
