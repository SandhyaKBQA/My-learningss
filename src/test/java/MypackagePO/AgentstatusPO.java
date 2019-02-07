package MypackagePO;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgentstatusPO {
	public WebDriver driver=null;
	public AgentstatusPO(WebDriver driver) {this.driver=driver;}

	By Agentstatustab_xpath=By.xpath("//div[@class='mat-list-item-content']//h3[.=' Agent Status ']");
	By Createnewstatusbtn_xpath=By.xpath("//button[.=' + Create New Status']");
	By Statusname_xpath=By.xpath("//input[@placeholder='Enter Status Name']");
	By Statusdesc_xpath=By.xpath("//input[@placeholder='Enter Status Description']");
	By Statustypeexpand_xpath=By.xpath("//div[@class='chooser-box']");
	By Statustypevalues_xpath=By.xpath("//ul[@class='chooser-suggestions expanded']//li//span");
	By Savebtn_xpath=By.xpath("//button[.='Save']");
	By Cancelbtn_xpath=By.xpath("//button[.='Cancel']");


	By Editicon_xpath=By.xpath("(//i[@class='icon-edit'])[8]");
	By Deleteicon_xpath=By.xpath("(//i[@class='icon-delete'])[5]");
	By Yesbtn_xpath=By.xpath("//button[.=' Yes ']");
	By Nobtn_xpath=By.xpath("//button[.='No']");

	public boolean Agentstatustab() {
		try {
			WebElement Agentstatustab_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Agentstatustab_xpath));
			Agentstatustab_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean Createnewstatusbtn() {
		try {
			WebElement Createnewstatusbtn_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Createnewstatusbtn_xpath));
			Createnewstatusbtn_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean Statusname(String name) {
		try {
			WebElement Statusname_webl=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Statusname_xpath));
			Statusname_webl.sendKeys(name);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean Statusdesc(String description) {
		try {
			WebElement Statusdesc_webl=new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(Statusdesc_xpath));
			Statusdesc_webl.sendKeys(description);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


	public boolean Statustypredropdownexpand() {
		try {
			WebElement Statustypeexpand_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Statustypeexpand_xpath));
			Statustypeexpand_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	public List<String> Verifystatustypeoptions() {
		try {
			Thread.sleep(3000);
			List<String>list=new ArrayList<String>();
			List<WebElement>options=driver.findElements(Statustypevalues_xpath);
			for(WebElement webl:options) {
				String type=webl.getText().trim();
				System.out.println(type);
				list.add(type);
			}
			return list;
		}
		catch (Exception e) {
			return  null;
		}
	}

	public boolean Selectoption(String value) {
		try {
			Thread.sleep(3000);
			List<WebElement>options=driver.findElements(Statustypevalues_xpath);
			for(WebElement webl:options) {
				String type=webl.getText().trim();
				System.out.println(type);
				if(type.equalsIgnoreCase(value)) {
					System.out.println("Selected status type is "+value);
					webl.click();
					return true;
				}
			}

			return false;
		}
		catch (Exception e) {
			return false;

		}
	}


	public boolean Savebtn() {
		try {
			WebElement Savebtn_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Savebtn_xpath));
			Savebtn_webl.click();
			Thread.sleep(3000);
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}

	public boolean Editicon(){
		try {
			Thread.sleep(3000);
			WebElement Editicon_webl= driver.findElement(Editicon_xpath);
			Actions builder=new Actions(driver);
			builder.moveToElement(Editicon_webl).build().perform();
			driver.findElement(Editicon_xpath).click();
			Thread.sleep(3000);
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}


	public boolean Deleteicon() {
		try {
			Thread.sleep(3000);
			WebElement Editicon_webl= driver.findElement(Deleteicon_xpath);
			Actions builder=new Actions(driver);
			builder.moveToElement(Editicon_webl).build().perform();
			driver.findElement(Deleteicon_xpath).click();
			Thread.sleep(3000);
			return true;

		}
		catch(Exception ex) {
			return false;
		}

	}
	public boolean Yesbtn() {
		try {
			Thread.sleep(3000);
			WebElement Yesbtn_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Yesbtn_xpath));
			Yesbtn_webl.click();
			Thread.sleep(3000);
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}






}
