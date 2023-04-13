package ma;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAndWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*//handle swithching to multiple frames 
		 * driver.get(("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert"));
		 * driver.manage().window().maximize();
		 * 
		 * 
		 * driver.switchTo().frame("iframeResult"); WebElement tryItButton
		 * =driver.findElement(By.xpath("/html/body/button")); tryItButton.click();
		 * 
		 * //handle alert() box String alertText = driver.switchTo().alert().getText();
		 * System.out.println(alertText); Thread.sleep(1000);
		 * 
		 * driver.switchTo().alert().accept(); // move to parent frame
		 * driver.switchTo().parentFrame(); System.out.println(driver.getTitle());
		 * 
		 */
		//switching to multiple windows
		
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		WebElement mainWindow=driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a"));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"learn-what-salesforce-can-do-for-you\"]/span"))).perform();
		Thread.sleep(2000);
		mainWindow.click();
		Set<String> windowhandlers=driver.getWindowHandles();
		Iterator<String> iterator = windowhandlers.iterator();
		String parentWindow =iterator.next();
		System.out.println(parentWindow);
		String childWindow = iterator.next();
		System.out.println(childWindow);
		
		driver.switchTo().window(childWindow);
		driver.findElement(By.cssSelector("input[id^='UserFirstName-']")).sendKeys("myname");
		driver.findElement(By.cssSelector("input[id^='UserLastName-']")).sendKeys("sample");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parentWindow);
		
		

	}

}
