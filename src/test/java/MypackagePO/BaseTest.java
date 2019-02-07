package MypackagePO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
public WebDriver driver=null;
	
	@BeforeMethod
	public void beforeMethod()throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "/home/sandhyakb/Downloads/chromedriver");
		this.driver=new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().deleteAllCookies();
		//this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		this.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//this.driver.get("https://www.amazon.in");	
		//this.driver.get("https://www.naukri.com/");
		//this.driver.get("https://www.redbus.in/");
		//this.driver.get("http://testing.onedirectdev117.in");
		//this.driver.get("http://testing.onedirectdev215.in");
		this.driver.get("http://testing.onedirect.in");
		//this.driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
		//this.driver.get("https://www.goibibo.com/");

		
		
		
	}
	
	@AfterMethod
	public void afterMethod()throws Exception
	{
		driver.quit();
	}
	

}
