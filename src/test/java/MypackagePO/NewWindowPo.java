package MypackagePO;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewWindowPo {

	public WebDriver driver;
	public NewWindowPo(WebDriver driver){
		this.driver=driver;
	}

	By ClassicLink_xpath=By.xpath("//div[@id='header-container']//descendant::a[.='Classic']");
	public By ApplynowButton_xpath=By.xpath("(//div[@class='bmsTop']//descendant::a)[1]");

	By CannedResponse_xpath=By.xpath("//div[@class='mat-list-item-content']//a[@class='cursor-pointer']//h3[.=' Canned responses']");
	By Keywords_xpath=By.xpath("//div[@class='mat-list-item-content']//a[@class='cursor-pointer']//h3[.=' Keywords']");


	
	

	
	


	//POM:Click on canned response link
	public boolean ClickonCannedResponse(String URL)throws Exception{
		try {
			String Parentpage=driver.getWindowHandle();
			WebElement CannedResponse_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(CannedResponse_xpath));
			CannedResponse_webl.click();
			Set<String> Pages=driver.getWindowHandles();
			for(String Childpage:Pages) {
				if(!Parentpage.equals(Childpage)){
					driver.switchTo().window(Childpage);
					System.out.println(driver.getCurrentUrl());
				}
			}
			String Url=driver.getCurrentUrl().trim();
			System.out.println("Current URL is "+Url);
			if(Url.equals(URL)){
				return true;
			}else

				return true;
		}
		catch (Exception e) {
			return false;
		}
	}	
	
	
	
	//POM:Click on Keywords link
	public boolean ClickonKeywords(String url)throws Exception{
		try {
			String Parentpage=driver.getWindowHandle();
			WebElement Keywords_webl=(new WebDriverWait(driver,30)) .until(ExpectedConditions.visibilityOfElementLocated(Keywords_xpath));
			Keywords_webl.click();
			Set<String> pages=driver.getWindowHandles();
			for(String childpage:pages) {
				if(!Parentpage.equals(childpage)) {
					driver.switchTo().window(childpage);
					System.out.println(driver.getCurrentUrl());
				}
			}
			String URL=driver.getCurrentUrl();
			System.out.println(URL);
			if(URL.equals(url)) {
				driver.close();
				return true;
			}
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}




	//POM: Click on Applynow Button.
	public boolean ClickonApllyNowButton(By webElement, String URL)throws Exception{
		try{

			String Parentwindow=driver.getWindowHandle();
			WebElement ApplynowButton_webl=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(webElement));
			ApplynowButton_webl.click();
			Set<String> Winhandlers=driver.getWindowHandles();
			for(String ChildWindow:Winhandlers){
				if(!Parentwindow.equals(ChildWindow)){
					driver.switchTo().window(ChildWindow);
				}
			}
			String Url=driver.getCurrentUrl().trim();
			System.out.println("Current URL is "+Url);
			if(Url.equals(URL)){
				driver.close();
				return true;
			}else 
				return true;
		}
		catch(Exception ex){
			return false;
		}


	}

	//POM: Click on Classic Link.
	public boolean ClickonClassicLink(String URL)throws Exception{
		try{
			String Parentwindow=driver.getWindowHandle();
			WebElement ClassicLink_Webl=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(ClassicLink_xpath));
			ClassicLink_Webl.click();
			Set<String> Winhandlers=driver.getWindowHandles();
			for(String ChildWindow:Winhandlers){
				if(!Parentwindow.equals(ChildWindow)){
					driver.switchTo().window(ChildWindow);
				}
			}
			String Url=driver.getCurrentUrl().trim();
			System.out.println("Current URL is "+Url);
			if(Url.equals(URL)){
				return true;
			}else

				return true;
		}
		catch(Exception ex){
			return false;
		}
	}



}


