package ma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.github.dockerjava.api.model.Capability;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleSSlCertificate {
	public static String browser ="chrome";
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		if(browser.equals("chrome"))
		{
			/*
			 * //not working with latest version DesiredCapabilities handleSSLError = new
			 * DesiredCapabilities(); handleSSLError.setAcceptInsecureCerts(true);
			 * handleSSLError.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			 */
			 
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			
			driver = new ChromeDriver(cOptions);
			driver.get("https://expired.badssl.com/");
			System.out.println("The page title is : " +driver.getTitle());
			
			
			
		}
		
		

	}

}
