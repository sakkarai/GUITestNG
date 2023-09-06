package com.autointelli.GUITestNG;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.pdfbox.io.IOUtils;

public class AutointelliFullPage {

	FirefoxOptions headOption = new FirefoxOptions();

	public static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	public static long du;

	public static long end;

	public static long start;

	public static String duration;

	@Test
	public void allPageTest() throws IOException, InterruptedException {

		Date startDate = new Date();
		System.out.println("Testing Start Time: " + dateFormat.format(startDate));

		// Home Page
		headOption.addArguments("--headless");

		WebDriver driver = new FirefoxDriver(headOption);

		TakesScreenshot ts = (TakesScreenshot) driver;

		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		start = System.currentTimeMillis();

		driver.get("https://www.autointelli.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		File homeFile = ts.getScreenshotAs(OutputType.FILE);

		File homeDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\01-HomePage.png");

		FileUtils.copyFile(homeFile, homeDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		Date Homedate = new Date();

		System.out.println("Home Page ScreenShot Done!   " + "Execution Time: " + duration + "   Testing Start Time: "
				+ dateFormat.format(Homedate));

		// Product Page

		start = System.currentTimeMillis();

		WebElement productPage = driver.findElement(By.xpath("//a[text()=' Product ']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(productPage));
		productPage.click();

		File productFile = ts.getScreenshotAs(OutputType.FILE);

		File productDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\02-ProductPage.png");

		FileUtils.copyFile(productFile, productDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);
		Date Productdate = new Date();

		System.out.println("Product Page ScreenShot Done!    " + "Execution Time: " + duration
				+ "  Testing Start Time: " + dateFormat.format(Productdate));

		// Media Page

		start = System.currentTimeMillis();

		WebElement mediaPage = driver.findElement(By.xpath("//a[text()=' Media ']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(mediaPage));
		mediaPage.click();

		File mediaFile = ts.getScreenshotAs(OutputType.FILE);

		File mediaDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\03-MediaPage.png");

		FileUtils.copyFile(mediaFile, mediaDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Media Page ScreenShot Done!    " + "Execution Time: " + duration);

		// Resource Page
		start = System.currentTimeMillis();

		WebElement resourceDown = driver.findElement(By.xpath("//a[text()=' Resource ']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(resourceDown));
		resourceDown.click();

		File resourceFile = ts.getScreenshotAs(OutputType.FILE);

		File resourceDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\04-ResourcePage.png");

		FileUtils.copyFile(resourceFile, resourceDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Resource Page ScreenShot Done!    " + "Execution Time: " + duration);

		// Infograph Page
		start = System.currentTimeMillis();

		WebElement infographPage = driver.findElement(By.xpath("//a[text()='infographics']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(infographPage));
		infographPage.click();

		File infographFile = ts.getScreenshotAs(OutputType.FILE);

		File infographDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\05-InfographPage.png");

		FileUtils.copyFile(infographFile, infographDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Infograph Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement resourceDownOne = driver.findElement(By.xpath("//a[text()=' Resource ']"));

		resourceDownOne.click();

		// Video Page
		start = System.currentTimeMillis();

		WebElement videoPage = driver.findElement(By.xpath("//a[text()='Video']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(videoPage));
		videoPage.click();

		File videoFile = ts.getScreenshotAs(OutputType.FILE);

		File videoDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\06-VideoPage.png");

		FileUtils.copyFile(videoFile, videoDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Video Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement resourceDownTwo = driver.findElement(By.xpath("//a[text()=' Resource ']"));

		resourceDownTwo.click();

		// WhitePaper & EBook Page
		start = System.currentTimeMillis();

		WebElement whitebook = driver.findElement(By.xpath("//a[text()='Whitepaper & EBook']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(whitebook));
		whitebook.click();

		File whiteBookFile = ts.getScreenshotAs(OutputType.FILE);

		File whiteBookDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\07-WhiteBookPage.png");

		FileUtils.copyFile(whiteBookFile, whiteBookDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("WhiteBook & EBook Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement resourceDownThree = driver.findElement(By.xpath("//a[text()=' Resource ']"));

		resourceDownThree.click();

		// Datasheet Page
		start = System.currentTimeMillis();

		WebElement datasheetPage = driver.findElement(By.xpath("//a[text()='Datasheet']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(datasheetPage));
		datasheetPage.click();

		File dataFile = ts.getScreenshotAs(OutputType.FILE);

		File dataDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\08-DataSheetPage.png");

		FileUtils.copyFile(dataFile, dataDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("DataSheet Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement company = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		company.click();

		// Story Page
		start = System.currentTimeMillis();

		WebElement storyPage = driver.findElement(By.xpath("//a[text()='Our Story']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(storyPage));
		storyPage.click();

		File storyFile = ts.getScreenshotAs(OutputType.FILE);

		File storyDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\09-StoryPage.png");

		FileUtils.copyFile(storyFile, storyDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Story Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement companyOne = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		companyOne.click();

		// Carrer page
		start = System.currentTimeMillis();

		WebElement carrerPage = driver.findElement(By.xpath("//a[text()='Career']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(carrerPage));
		carrerPage.click();

		File carrerFile = ts.getScreenshotAs(OutputType.FILE);

		File carrerDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\10-CarrerPage.png");

		FileUtils.copyFile(carrerFile, carrerDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Carrer Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement companyTwo = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		companyTwo.click();

		// Blog Page
		start = System.currentTimeMillis();

		WebElement blogPage = driver.findElement(By.xpath("//a[text()='Blog']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(blogPage));
		blogPage.click();

		File blogFile = ts.getScreenshotAs(OutputType.FILE);

		File blogDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\11-BlogPage.png");

		FileUtils.copyFile(blogFile, blogDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Blog Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement companyThree = driver.findElement(By.xpath("(//span[text()='Company'])[1]"));

		companyThree.click();

		// Partner Page
		start = System.currentTimeMillis();

		WebElement partnersPage = driver.findElement(By.xpath("//a[text()='Our Partner']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(partnersPage));
		partnersPage.click();

		File partnerFile = ts.getScreenshotAs(OutputType.FILE);

		File partnerDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\12-PartnerPage.png");

		FileUtils.copyFile(partnerFile, partnerDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Partner Page ScreenShot Done!    " + "Execution Time: " + duration);

		WebElement companyFour = driver.findElement(By.xpath("//a[text()=' Company  ']"));

		companyFour.click();

		// Contact Page
		start = System.currentTimeMillis();

		WebElement contactPage = driver.findElement(By.xpath("//a[text()='Contact US']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(contactPage));
		contactPage.click();

		File contactFile = ts.getScreenshotAs(OutputType.FILE);

		File contactDest = new File("C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot\\13-ContactPage.png");

		FileUtils.copyFile(contactFile, contactDest);

		end = System.currentTimeMillis();

		du = start - end;

		duration = getDuration(du);

		System.out.println("Contact Page ScreenShot Done!    " + "Execution Time: " + duration);

		driver.quit();

	}

	@Test
	public void imgToPdf() throws IOException, InterruptedException {

		start = System.currentTimeMillis();
		String inputImageDirectory = "C:\\Users\\surya\\Autiintelli\\GUITestNG\\ScreenShot";
		String outputPdfPath = "C:\\Users\\surya\\Autiintelli\\GUITestNG\\pdf\\Pdfoutput.pdf";

		try {
			PDDocument combinedPdf = new PDDocument();

			File[] imageFiles = new File(inputImageDirectory)
					.listFiles((dir, name) -> name.endsWith(".jpg") || name.endsWith(".png"));

			if (imageFiles != null) {
				for (File imageFile : imageFiles) {
					try {
						PDDocument pdfDocument = new PDDocument();
						PDPage page = new PDPage();
						pdfDocument.addPage(page);

						PDImageXObject image = PDImageXObject.createFromFile(imageFile.getAbsolutePath(), pdfDocument);
						PDPageContentStream contentStream = new PDPageContentStream(pdfDocument, page);
						contentStream.drawImage(image, 0, 0, page.getMediaBox().getWidth(),
								page.getMediaBox().getHeight());

						contentStream.close();

						combinedPdf.addPage(pdfDocument.getPage(0));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				combinedPdf.save(outputPdfPath);
				combinedPdf.close();

				end = System.currentTimeMillis();

				du = start - end;

				duration = getDuration(du);

				System.out.println("PDF created successfully!    " + "Execution Time: " + duration);

			} else {
				System.out.println("No image files found in the directory.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		Date Enddate = new Date();
		System.out.println("Testing End Time: " + dateFormat.format(Enddate));
	}

	public static String getDuration(long millis) {
		long days = TimeUnit.MILLISECONDS.toDays(millis);
		millis -= TimeUnit.DAYS.toMillis(days);

		millis = Math.abs(millis);

		long hours = TimeUnit.MILLISECONDS.toHours(millis);
		millis -= TimeUnit.HOURS.toMillis(hours);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
		millis -= TimeUnit.MINUTES.toMillis(minutes);

		long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		millis -= TimeUnit.SECONDS.toMillis(seconds);

		StringBuilder sb = new StringBuilder(64);
		sb.append(String.format("%02d", hours));
		sb.append(":");
		sb.append(String.format("%02d", minutes));
		sb.append(":");
		sb.append(String.format("%02d", seconds));
		sb.append(".");
		sb.append(String.format("%02d", millis));
		return sb.toString();

	}

}
