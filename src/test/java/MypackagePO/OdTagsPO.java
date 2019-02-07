package MypackagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdTagsPO {
	
	public WebDriver driver=null;
	public OdTagsPO(WebDriver driver) {
		this.driver=driver;
	}

	By Tagstab_xpath=By.xpath("//div[@class='mat-list-item-content']//h3[.=' Tags']");
	By Addtagbutton_xpath=By.xpath("//button[.=' + Add Tag']");
	By Entertagname_xpath=By.xpath("//input[@placeholder='Enter Tag Name']");
	By Plusicon_xpath=By.xpath("//i[@class='icon-add-circle']");
	By Savebutton_xpath=By.xpath("//button[.='Save']");
	By Cancelbutton_xpath=By.xpath("//button[.='Cancel']");
	
	By Editicon_xpath=By.xpath("(//i[@class='icon-edit'])[38]");
	By Deleteicon_xpath=By.xpath("(//i[@class='icon-delete'])[38]");
	By Yesbtn_xpath=By.xpath("//button[.=' Yes ']");
	By Nobtn_xpath=By.xpath("//button[.='No']");
	
	
	public By Checkboxcolumn_xpath=By.xpath("//th[@fxflex='5']");
	public By Tagnamecolumn_xpath=By.xpath("//th[.='Tag Name']");
	public By Createdbycolumn_xpath=By.xpath("//th[.='Created By']");
	public By Createdoncolumn_xpath=By.xpath("//th[.='Created On']");
	
	//POM:Verify tags tab clickable
	
	public boolean Tagtabclickable() {
		try {
			Thread.sleep(3000);
			WebElement Tagstab_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Tagstab_xpath));
			Tagstab_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	//POM:Verify Add tag button clickable
	public boolean Addtagbutton() {
		try {
			Thread.sleep(3000);
			WebElement Addtagbutton_webl=new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(Addtagbutton_xpath));
			Addtagbutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify the Enter tag name filed
	public boolean Entertagnamefield(String tagname) {
		try {
			Thread.sleep(3000);
			WebElement Entertagname_webl=new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(Entertagname_xpath));
			Entertagname_webl.sendKeys(tagname);
			return true; 
					
		}
		catch (Exception e) {
			return false; 			
		}
	}
	
	//POM:Verify plus icon clickable
	public boolean Plusiconclickable() {
		try {
			Thread.sleep(3000);
			WebElement Plusicon_webl=new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(Plusicon_xpath));
			Plusicon_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	//POM:Verify save button clickable
	public boolean Savebtn() {
		try {
			Thread.sleep(3000);
			WebElement Savebutton_webl=new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(Savebutton_xpath));
			Savebutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	//POM:Verify Editicon clickable
	public boolean Editicon() {
		try {
			Thread.sleep(10000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement Editicon_webl=driver.findElement(Editicon_xpath);
			js.executeScript("arguments[0].scrollIntoView();", Editicon_webl);
			Actions builder=new Actions(driver);
			builder.moveToElement(Editicon_webl).click().build().perform();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	//POM:Verify Delete icon clickable
	public boolean Deleteicon() {
		try {
			Thread.sleep(10000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement Deleteicon_webl=driver.findElement(Deleteicon_xpath);
			js.executeScript("arguments[0].scrollIntoView();", Deleteicon_webl);
			Actions builder=new Actions(driver);
			builder.moveToElement(Deleteicon_webl).build().perform();
			driver.findElement(Deleteicon_xpath).click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	
	//POM:Verify Yes button clickable
	public boolean Yesbutton(){
		try {
			Thread.sleep(3000);
			WebElement Yesbtn_webl=new WebDriverWait(driver,20).until(ExpectedConditions.visibilityOfElementLocated(Yesbtn_xpath));
			Yesbtn_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}	
}
