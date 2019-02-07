package MypackagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframePO {
	public WebDriver driver;
	
	public IframePO(WebDriver driver) {this.driver=driver;}
	
	By Iframe_xpath=By.xpath("//iframe[@id='authiframe']");
	By SingUp_button=By.xpath("//span[@class='ico13 blue db']//a[.='Sign up']");
	By EnterMBlNo_xpath=By.xpath("//input[@id='authMobile']");
	
	
	public boolean ClickonsignUpButton()throws Exception{
		try {
			WebElement SingUp_WebL=(new WebDriverWait(driver,60))
					.until(ExpectedConditions.visibilityOfElementLocated(SingUp_button));
			SingUp_WebL.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean EnterMobileNumber(String number)throws Exception{
		try {
			driver.switchTo().frame(driver.findElement(Iframe_xpath));
			WebElement EnterMBlNo_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(EnterMBlNo_xpath));
			EnterMBlNo_webl.sendKeys(number);
			Thread.sleep(5000);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	

}
