package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPO {
	
	public WebDriver driver=null;
	public FilterPO(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By UserTab_xpath=By.xpath("//div[@class='mat-list-item-content']//a[@routerlink='app-users']//h3[.=' Users ']");
	By FilterBtn_xpath=By.xpath("//div[@class='filter-box']//button[@class='od-button greyed medium apply-filter-btn']");
	By UserRolelist_xpath=By.xpath("//div[@class='filter-option-box collapsed expanded']//child::ul//li");
	By EnableCheckBox_xpath=By.xpath("(//div[@class='filter-option-box collapsed expanded']//child::ul//li)[5]//span");
	
	public boolean ClickonUserTab() {
		try {
			WebElement UserTab_WebL=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(UserTab_xpath));
			UserTab_WebL.click();
			return true;
		}
		catch (Exception e) {
			return false;

		}

	}
	public boolean ClickonFilterButton() {
		try {
			Thread.sleep(3000);
			WebElement FilterBtn_WebL=(new WebDriverWait(driver, 60))
					.until(ExpectedConditions.visibilityOfElementLocated(FilterBtn_xpath));
			FilterBtn_WebL.click();
			return true;
		}
		catch (Exception e) {
			return false;

		}

	}
	public boolean ClickonUserroleButton(String user) {
		try {
			Thread.sleep(5000);
			//WebElement Admin_WebL=driver.findElement(By.xpath("//ul[@_ngcontent-c53]//following::b[text()='\"+user+\"']"));
			List<WebElement> UserRolelist_list=driver.findElements(UserRolelist_xpath);
			for(WebElement rolewebl:UserRolelist_list) {
				String value=rolewebl.getText().trim();
				System.out.println(value);
				if(value.equalsIgnoreCase(user)) {
					rolewebl.click();
					System.out.println(value);
					return true;
				}
			}
			
			
			return false;
		}
		catch(Exception ex) {
			return false;
		}
	}
		/*public boolean VerifyChechboxEnable() {
			try {
				WebElement rolewebl=(new WebDriverWait(driver, 60))
						.until(ExpectedConditions.visibilityOfElementLocated(EnableCheckBox_xpath));
				
				if(rolewebl.isSelected()) {
						return true;
						}else
				
				return false;
			}
			catch(Exception ex) {
				return false;
			}*/
	
	
	
	public boolean VerifydataunderUserTypecolumn(String data) {
		try {
			Thread.sleep(5000);
			List<WebElement> WebList=driver.findElements(By.xpath("//tbody//td[4]"));
			for(WebElement WebL:WebList) {
				String vale=WebL.getText().trim();
				if(!vale.equalsIgnoreCase(data)) {
					System.out.println("Invalid data is "+vale);
					return false;
				}
			}
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public boolean VerifyDateunderAccountstatecolumn(String data )throws Exception{
		try {
			Thread.sleep(5000);
		List<WebElement> WebList=driver.findElements(By.xpath("//tbody//td[7]"));
		for(WebElement WebL:WebList) {
			String value=WebL.getText().trim();
			if(!value.equalsIgnoreCase(data)) {
				System.out.println("Invalid data is "+value);
				return false;
			}
		}
		return true;
	}
		catch (Exception e) {
			return false;
		}
	}
}

