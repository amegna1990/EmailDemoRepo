package ma;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		/*
		 * // for dropdown driver.get("https://www.sugarcrm.com/au/request-demo/");
		 * WebElement ddown =
		 * driver.findElement(By.xpath("//select[@name='employees_c']")); Select select
		 * = new Select(ddown); select.selectByIndex(7); Thread.sleep(1000);
		 * select.selectByValue("level5"); Thread.sleep(1000);
		 * select.selectByVisibleText("11 - 50 employees"); Thread.sleep(1000);
		 */

		/*
		 * //multi select drop down
		 * driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-03/");
		 * driver.manage().window().maximize(); WebElement ddown1 =
		 * driver.findElement(By.xpath(
		 * "/html/body/section/div/div[2]/div/div/div/select"));
		 * 
		 * Select select = new Select(ddown1); //select.selectByIndex(3);
		 * Thread.sleep(2000); //select.selectByValue("1"); Thread.sleep(2000);
		 * //select.selectByVisibleText("HTML"); List<WebElement> wElement =
		 * select.getAllSelectedOptions(); for(WebElement element : wElement) {
		 * System.out.println(element.getText()); } System.out.println(wElement.size());
		 * 
		 * //wElement.clear(); Thread.sleep(2000);
		 * 
		 * wElement = select.getAllSelectedOptions();
		 * System.out.println(wElement.size());
		 * 
		 */

		// autofill search dropdown

		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("fromCity"));

		WebElement span = driver.findElement(By.xpath("//span[text()='From']"));

		Actions sAction = new Actions(driver);
		sAction.moveToElement(from).click().build().perform();
		from.click();

		WebElement fromHolder = driver.findElement(By.xpath("//input[@placeholder='From']"));
		// *[@id="root"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input
		Thread.sleep(1000);
		fromHolder.sendKeys("hyderabad");
		Thread.sleep(1000);
		fromHolder.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		fromHolder.sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		// to list count of all anchor tags on a page
		List<WebElement> alltags = driver.findElements(ByTagName.tagName("a"));
		System.out.println("total tags" + alltags.size());
		// driver.close();

	}

}
