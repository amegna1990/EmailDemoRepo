package ma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotsDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");

		Date currentDate = new Date();		
		String filenameDate = currentDate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(filenameDate);
		
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File screenshotInputFile = screenShot.getScreenshotAs(OutputType.FILE);
		
		// File screenshotOutputFile = new File(".//ScreenShots/ScreenShot1.png"); // manual way of specifying file name
		//Generally we specify file name with time to make it unique
		File screenshotOutputFile = new File(".//ScreenShots/" + filenameDate + ".png");
		FileUtils.copyFile(screenshotInputFile, screenshotOutputFile);

	}

}
