package Commonutilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {

	public WebDriver driver;
	public Utility(WebDriver driver) {
		this.driver=driver;
	}
	//verification of click action

	public boolean Clickaction(By Webxpath) {
		try {
			Thread.sleep(3000);
			WebElement webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Webxpath));
			if(webl.isDisplayed()) {
				webl.click();
				Thread.sleep(3000);
				return true;
			}else
				return false;
			
		}
		catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}
	
	
	//Sending the Strings or Enter the text into fields.
	
	public boolean Sendingstrings( By Webxpath,String value) {
		
		try {
			Thread.sleep(3000);
			WebElement webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Webxpath));
			if(webl.isDisplayed()) {
				WebElement webL=driver.findElement(Webxpath) ;
				webL.sendKeys(value);
				Thread.sleep(3000);
				return true;
			}else
				return false;
			
		}
		catch (Exception e) {
			return false;
		}
	}

	//Verification of element displayed.

	public boolean Verification(By xpath) {
		try {
			Thread.sleep(3000);
			WebElement webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(xpath));
			if(webl.isDisplayed()) {
				return true;
			}
			else {
				return false;
			}
		}
		catch (Exception e) {
			return false;
		}
	}

	//Verification of  drop-down values
	public List<String> VerifyDropdownoptions(By Listofoptions_xpath) {
		try {
			Thread.sleep(5000);
			List<String> list=new ArrayList<String>();
			List<WebElement>options=driver.findElements(Listofoptions_xpath);
			for(WebElement values:options) {
				String opt=values.getText().trim();
				System.out.println(opt);
				list.add(opt);
			}
			return list;
		}
		catch (Exception e) {
			return null;
		}
	}

	
	//Selection of value  from drop-down Mouse over action

		public boolean SelectanOptionindropdownMouseoveraction(By Listofoptions_xpath,String option){
			try{
				Thread.sleep(5000);
				List<WebElement> List_WebL=driver.findElements(Listofoptions_xpath);
				for(WebElement ElementWebl:List_WebL){
					String value=ElementWebl.getText().trim();
					System.out.println(value);
					if(value.equalsIgnoreCase(option)){
						System.out.println("Selected option is "+value);
						Actions builder=new Actions(driver);
						builder.moveToElement(ElementWebl);
						builder.click();
						builder.build().perform();
						return true;
					}
				}
				return false;
			}
			catch(Exception ex){
				return false;
			}
		}
	
	
	

	//Selection of value  from drop-down

	public boolean SelectanOptionindropdown(By Listofoptions_xpath,String option){
		try{
			Thread.sleep(5000);
			List<WebElement> List_WebL=driver.findElements(Listofoptions_xpath);
			for(WebElement ElementWebl:List_WebL){
				String value=ElementWebl.getText().trim();
				System.out.println(value);
				if(value.equalsIgnoreCase(option)){
					System.out.println("Selected option is "+value);
					Actions builder=new Actions(driver);
					builder.moveToElement(ElementWebl).click().build().perform();
					ElementWebl.click();
					return true;
				}
			}
			return false;
		}
		catch(Exception ex){
			return false;
		}
		
		
	}

	// column verification
	public boolean Verificationofelements(By xpath) {
		try {
			WebElement webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(xpath));
			if(webl.isDisplayed()) {
				return true;
			}
			else{
				return false;
			}

		}
		catch (Exception e) {
			return false;
		}
	}
	
	//New window or click on link
	public boolean ClickonLinks(By Webxpath,String url) {
		try {
			String parentWin=driver.getWindowHandle();
			WebElement WebL=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(Webxpath));
			WebL.click();
			
			Set<String> ChildWin=driver.getWindowHandles();
			for(String handler:ChildWin) {
				if(!parentWin.equals(handler)) {
					driver.switchTo().window(handler);
				}
				String URL=driver.getCurrentUrl();
				System.out.println(URL);
				if(URL.equals(url)) {
					driver.close();
					return true;
				}else
					return false;
			}
			return true;
			}catch (Exception e) {
				return false;
			
			
		}
		
	}





}
