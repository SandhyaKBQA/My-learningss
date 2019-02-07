package MypackagePO;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPo{
	
	public WebDriver driver;
	public AmazonPo(WebDriver driver) {
		this.driver=driver;
	}
	
	By SortBycat_xpath=By.xpath("//div[@id='nav-shop']//child::a[@id='nav-link-shopall']");
	By MobileCompr_xpath=By.xpath("//span[.='Mobiles, Computers']");
	By powerbank_xpath=By.xpath("//span[.='Power Banks']");
	By Electronics_xpath=By.xpath("//span[@class='nav-a-content']//img[@alt='Electronics']");
	
	
	
	
	//POM: Mouse over on Sort By dropdown
	public boolean MouseoveronSortBycat()throws Exception{
		try {
			Thread.sleep(10000);
			WebElement SortBycat_WebL=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(SortBycat_xpath));
			Actions builder=new Actions(driver);
			builder.moveToElement(SortBycat_WebL).perform();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	//POM: Click on Mobile Computor Link
	public boolean ClickonMobileComputor()throws Exception{
		try {
			WebElement MobileCompr_WebL=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(MobileCompr_xpath));
			MobileCompr_WebL.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean ClickonPowerbank() throws Exception{
		try {
			WebElement powerbank_webl=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(powerbank_xpath));
			powerbank_webl.click();
			return true;
			
			
		}
		catch (Exception e) {
			return false;
		}
	}
	public boolean VerifyElectronics() throws Exception {
		try {
			WebElement Electronics_webl=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(Electronics_xpath));
			Electronics_webl.isDisplayed();
			return true;
			
		}
		catch (Exception e) {
			return false;
		}
		
	}

}
