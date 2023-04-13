package ma;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;

		// display page title
		String script = "return document.title;";
		System.out.println(jsExec.executeScript(script));

		// click the button		
		driver.switchTo().frame("iframeResult");
		WebElement tryButton = driver.findElement(By.xpath("/html/body/button"));
		jsExec.executeScript("myFunction()", tryButton);
		driver.switchTo().alert().accept();
		
		//highlight the button
		jsExec.executeScript("arguments[0].style.border= \"5px solid yellow\"", tryButton);
		Thread.sleep(2000);
		
		//scroll to home page button
		driver.navigate().to("https://www.w3schools.com/");
		WebElement getStartedButton = driver.findElement(By.xpath("//*[@id=\"getdiploma\"]/a"));
		jsExec.executeScript("arguments[0].scrollIntoView(true)", getStartedButton);
		
		

	}

}
