package ma;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAutomation {

	public static void main(String[] args) {
	
		//System.setProperty("webdriver.chrome.driver","C:\\MySelinium\\webdriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.gecko.driver","C:\\MySelinium\\webdriver\\geckodriver.exe" );
		//FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
		
		

	}

}
