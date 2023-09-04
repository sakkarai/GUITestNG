package com.autointelli.demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutointelliPageTest {

	public WebDriver driver = new FirefoxDriver();

	public TakesScreenshot ts = (TakesScreenshot) driver;

	public JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public void allPageTest() throws IOException, InterruptedException {

		// Home Page

		driver.get("https://www.autointelli.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		

		File homeFile = ts.getScreenshotAs(OutputType.FILE);

		File homeDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\HomePage.png");

		FileUtils.copyFile(homeFile, homeDest);

		System.out.println("Home Page ScreenShot Done!");

		// Product Page
		

		WebElement productPage = driver.findElement(By.xpath("//a[text()=' Product ']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(productPage));
		productPage.click();

		File productFile = ts.getScreenshotAs(OutputType.FILE);

		File productDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\ProductPage.png");

		FileUtils.copyFile(productFile, productDest);

		System.out.println("Product Page ScreenShot Done!");

		// Media Page

		WebElement mediaPage = driver.findElement(By.xpath("//a[text()=' Media ']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(mediaPage));
		mediaPage.click();
		
		File mediaFile = ts.getScreenshotAs(OutputType.FILE);

		File mediaDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\MediaPage.png");

		FileUtils.copyFile(mediaFile, mediaDest);

		System.out.println("Media Page ScreenShot Done!");

		// Resource Page

		WebElement resourceDown = driver.findElement(By.xpath("//a[text()=' Resource ']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(resourceDown));
		resourceDown.click();
		
		File resourceFile = ts.getScreenshotAs(OutputType.FILE);

		File resourceDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\ResourcePage.png");

		FileUtils.copyFile(resourceFile, resourceDest);

		System.out.println("Resource Page ScreenShot Done!");

		// Infograph Page

		WebElement infographPage = driver.findElement(By.xpath("//a[text()='infographics']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(infographPage));
		infographPage.click();
		
		File infographFile = ts.getScreenshotAs(OutputType.FILE);

		File infographDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\InfographPage.png");

		FileUtils.copyFile(infographFile, infographDest);

		System.out.println("Infograph Page ScreenShot Done!");

		WebElement resourceDownOne = driver.findElement(By.xpath("//a[text()=' Resource ']"));

		resourceDownOne.click();

		// Video Page

		WebElement videoPage = driver.findElement(By.xpath("//a[text()='Video']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(videoPage));
		videoPage.click();
		
		File videoFile = ts.getScreenshotAs(OutputType.FILE);

		File videoDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\VideoPage.png");

		FileUtils.copyFile(videoFile, videoDest);

		System.out.println("Video Page ScreenShot Done!");

		WebElement resourceDownTwo = driver.findElement(By.xpath("//a[text()=' Resource ']"));

		resourceDownTwo.click();

		// WhitePaper & EBook Page

		WebElement whitebook = driver.findElement(By.xpath("//a[text()='Whitepaper & EBook']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(whitebook));
		whitebook.click();
		
		File whiteBookFile = ts.getScreenshotAs(OutputType.FILE);

		File whiteBookDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\WhiteBookPage.png");

		FileUtils.copyFile(whiteBookFile, whiteBookDest);

		System.out.println("WhiteBook & EBook Page ScreenShot Done!");

		WebElement resourceDownThree = driver.findElement(By.xpath("//a[text()=' Resource ']"));

		resourceDownThree.click();

		// Datasheet Page

		WebElement datasheetPage = driver.findElement(By.xpath("//a[text()='Datasheet']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(datasheetPage));
		datasheetPage.click();
		
		File dataFile = ts.getScreenshotAs(OutputType.FILE);

		File dataDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\DataSheetPage.png");

		FileUtils.copyFile(dataFile, dataDest);

		System.out.println("DataSheet Page ScreenShot Done!");

		WebElement company = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		company.click();

		// Story Page

		WebElement storyPage = driver.findElement(By.xpath("//a[text()='Our Story']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(storyPage));
		storyPage.click();
		
		File storyFile = ts.getScreenshotAs(OutputType.FILE);

		File storyDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\StoryPage.png");

		FileUtils.copyFile(storyFile, storyDest);

		System.out.println("Story Page ScreenShot Done!");

		WebElement companyOne = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		companyOne.click();

		// Carrer page

		WebElement carrerPage = driver.findElement(By.xpath("//a[text()='Career']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(carrerPage));
		carrerPage.click();
		
		File carrerFile = ts.getScreenshotAs(OutputType.FILE);

		File carrerDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\CarrerPage.png");

		FileUtils.copyFile(carrerFile, carrerDest);

		System.out.println("Carrer Page ScreenShot Done!");

		WebElement companyTwo = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		companyTwo.click();

		// Blog Page

		WebElement blogPage = driver.findElement(By.xpath("//a[text()='Blog']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(blogPage));
		blogPage.click();
		
		File blogFile = ts.getScreenshotAs(OutputType.FILE);

		File blogDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\BlogPage.png");

		FileUtils.copyFile(blogFile, blogDest);

		System.out.println("Blog Page ScreenShot Done!");

		WebElement companyThree = driver.findElement(By.xpath("(//span[text()='Company'])[1]"));

		companyThree.click();

		// Partner Page

		WebElement partnersPage = driver.findElement(By.xpath("//a[text()='Our Partner']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(partnersPage));
		partnersPage.click();
		
		File partnerFile = ts.getScreenshotAs(OutputType.FILE);

		File partnerDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\PartnerPage.png");

		FileUtils.copyFile(partnerFile, partnerDest);

		System.out.println("Partner Page ScreenShot Done!");

		WebElement companyFour = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		companyFour.click();

		// Contact Page

		WebElement contactPage = driver.findElement(By.xpath("//a[text()='Contact US']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(contactPage));
		contactPage.click();
		
		File contactFile = ts.getScreenshotAs(OutputType.FILE);

		File contactDest = new File(
				"C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot\\ContactPage.png");

		FileUtils.copyFile(contactFile, contactDest);

		System.out.println("Contact Page ScreenShot Done!");
		
		

		driver.quit();

	}
	
	public void imgToPdf() {
		
		
		 String inputImageDirectory = "C:\\Users\\surya\\Autiintelli\\GUITest\\ScreenShot";
	        String outputPdfPath = "C:\\Users\\surya\\Autiintelli\\GUITest\\Pdf\\Pdfoutput.pdf"; 

	        try {
	            PDDocument combinedPdf = new PDDocument();

	            File[] imageFiles = new File(inputImageDirectory).listFiles((dir, name) -> name.endsWith(".jpg") || name.endsWith(".png"));
	            
	            if (imageFiles != null) {
	                for (File imageFile : imageFiles) {
	                    try {
	                        PDDocument pdfDocument = new PDDocument();
	                        PDPage page = new PDPage();
	                        pdfDocument.addPage(page);

	                        PDImageXObject image = PDImageXObject.createFromFile(imageFile.getAbsolutePath(), pdfDocument);
	                        PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, page);
	                        contentStream.drawImage(image, 0, 0, page.getMediaBox().getWidth(), page.getMediaBox().getHeight());
	                        
	                        
	                        contentStream.close();

	                        combinedPdf.addPage(pdfDocument.getPage(0));
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
	                }

	                combinedPdf.save(outputPdfPath);
	                combinedPdf.close();

	                System.out.println("PDF created successfully!");
	            } else {
	                System.out.println("No image files found in the directory.");
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
		

	

	public static void main(String[] args) throws IOException, InterruptedException {

		AutointelliPageTest apt = new AutointelliPageTest();

		apt.allPageTest();
		apt.imgToPdf();

	}

}
