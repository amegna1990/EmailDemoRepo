package ma;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}
		
		driver.get("http://www.saucedemo.com/");
		WebElement pwd = driver.findElement(By.id("password"));
		By username=RelativeLocator.with(By.tagName("input")).above(pwd);
		driver.findElement(username).sendKeys("relative locator");
		
	
		
		/*driver.get("https://www.selenium.dev/documentation/");
		driver.findElement(By.partialLinkText("Test")).click();
		//driver.findElement(By.linkText("Test Practices")).click();
		 
		 */
		
		//driver.get("http://www.saucedemo.com/");
		//driver.findElement(By.className( "form_input")).sendKeys("testing");
		//driver.findElement(By.tagName("input")).sendKeys("standard");
		//driver.findElement(By.linkText(linkText))
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/input")).click();
		//driver.close();

	}



}
