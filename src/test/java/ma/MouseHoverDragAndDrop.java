package ma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverDragAndDrop {
	public static void main(String[] args) throws InterruptedException
	{
		
		/*
		 * //on mouse hover on element the screen changes
		 * WebDriverManager.firefoxdriver().setup(); FirefoxDriver driver = new
		 * FirefoxDriver(); driver.get("https://www.ebay.com/");
		 * driver.manage().window().maximize();
		 * 
		 * WebElement motorElement =
		 * driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"));
		 * 
		 * Actions motorHover = new Actions(driver);
		 * motorHover.moveToElement(motorElement).perform();
		 */
		
		//drag and drop
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver();
		 * 
		 * driver.get("https://jqueryui.com/droppable/");
		 * 
		 * driver.manage().window().maximize(); WebElement frame =
		 * driver.findElement(By.xpath("//*[@id='content']/iframe"));
		 * driver.switchTo().frame(frame);
		 * 
		 * WebElement drag = driver.findElement(By.id("draggable")); WebElement drop =
		 * driver.findElement(By.id("droppable"));
		 * 
		 * Actions mouseAction = new Actions(driver);
		 * mouseAction.dragAndDrop(drag,drop).build().perform();
		 */

		/*
		 * //Resize the element
		 *  WebDriverManager.chromedriver().setup(); ChromeDriver
		 * driver = new ChromeDriver(); driver.manage().window().maximize();
		 * 
		 * driver.get("https://jqueryui.com/resizable/");
		 * 
		 * WebElement iframe =
		 * driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 * driver.switchTo().frame(iframe); WebElement eleResize =
		 * driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		 * 
		 * Actions resizeAction = new Actions(driver);
		 * resizeAction.dragAndDropBy(eleResize, 200, 100); resizeAction.perform();
		 */
		
		/*
		 * //slider
		 *  WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(); driver.get("https://jqueryui.com/slider/#colorpicker");
		 * 
		 * WebElement iframe =
		 * driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 * 
		 * driver.switchTo().frame(iframe); WebElement sliderElement=
		 * driver.findElement(By.xpath("//*[@id=\"red\"]/div"));
		 * 
		 * Actions sliderAction = new Actions(driver);
		 * sliderAction.dragAndDropBy(sliderElement, 50, 0).perform();
		 */
		 
		/*
		 * //Right Click
		 * 
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.get("https://jqueryui.com/slider/#colorpicker");
		 * driver.manage().window().maximize();
		 * 
		 * WebElement iframe =
		 * driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		 * driver.switchTo().frame(iframe);
		 * 
		 * WebElement rClick = driver.findElement(By.xpath("//*[@id=\"swatch\"]"));
		 * 
		 * Actions rClickAction = new Actions(driver);
		 * rClickAction.moveToElement(driver.findElement(By.xpath("//*[@id=\"blue\"]")))
		 * ; rClickAction.contextClick(rClick).build().perform();
		 */
		//key events to copy the text
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
	
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement sourceTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]"));
			
		WebElement destinationTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]"));
		
		
		Actions textCopyAction = new Actions(driver);
		textCopyAction.keyDown(sourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		textCopyAction.keyDown(destinationTextArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);

		
		
		
		
		
		
		
		
		
	}

}
