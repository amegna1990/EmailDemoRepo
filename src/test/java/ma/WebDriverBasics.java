package ma;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

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
		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		/*
		 * driver.get("https://www.saucedemo.com/");
		 * 
		 * driver.manage().window().maximize();
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.xpath("//input [@placeholder='Password']")).sendKeys(
		 * "secret_sauce"); try { Thread.sleep(1000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 * driver.findElement(By.cssSelector("#login-button")).click(); String
		 * urlCurrent = driver.getCurrentUrl(); System.out.println(urlCurrent);
		 * 
		 * String pgSource = driver.getPageSource(); System.out.println(pgSource);
		 * 
		 * System.out.println(driver.getTitle());
		 * 
		 * List<WebElement> webElements =
		 * driver.findElements(By.xpath("//div[@class= 'inventory_list']/div"));
		 * System.out.println(webElements);
		 * 
		 * driver.navigate().to("https://www.sugarcrm.com/au/"); String windowhndl =
		 * driver.getWindowHandle(); System.out.println(windowhndl);
		 * 
		 * driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/p/a")).
		 * click();
		 * 
		 * Set<String> windowhndls = driver.getWindowHandles();
		 * System.out.println(windowhndls); driver.quit();
		 */
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testing@gmail.com");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@name='email']")).getAttribute("type"));
		System.out.println(driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).getLocation());
		
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@data-testid=\"royal_login_button\"]")).isSelected());
		
		driver.close();
		
	}

}
