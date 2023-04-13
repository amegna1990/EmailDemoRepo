package ma;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioCheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
	
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
	driver.get("https://www.singaporeair.com/en_UK/plan-and-book/your-booking/searchFlight/#/book/bookflight");
	driver.manage().window().maximize();
	
	
	WebElement radio1=driver.findElement(By.id("bookFlights")); 
	WebElement radio2=driver.findElement(By.id("redeemFlights")); 
	System.out.println(radio1.isSelected());
	System.out.println(radio2.isSelected());
	radio2.click();
	System.out.println(radio2.isSelected());
			 
		/*// check box
		 * driver.get("https://demo.automationtesting.in/Register.html");
		 * driver.manage().window().maximize(); Actions scrolld = new Actions(driver);
		 * //action to scroll to the password field
		 * scrolld.moveToElement(driver.findElement(By.id("firstpassword")));
		 * scrolld.perform(); Thread.sleep(1000); WebElement radio =
		 * driver.findElement(By.id("checkbox2")); WebElement radio1 =
		 * driver.findElement(By.id("checkbox3")); radio.click();
		 * 
		 * Thread.sleep(1000); radio1.click(); Thread.sleep(1000); radio.click();//to
		 * uncheck List<WebElement> allcheck=
		 * driver.findElements(By.xpath("//input[@type='checkbox']"));
		 * System.out.println(allcheck.size());
		 */
	

	}

}
