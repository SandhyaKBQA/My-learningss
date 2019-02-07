package MypackagePO;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdSignaturePO {
	public WebDriver driver=null;

	public OdSignaturePO(WebDriver driver) {
		this.driver=driver;
	}

	By Signaturetab_xpath=By.xpath("//div[@class='mat-list-item-content']//h3[.=' Signature ']");
	By Facebooksignaturetogglebtn_xpath=By.xpath("(//span[.='Off '])[1]");
	By Placeholderdropdownexpand_xpath=By.xpath("(//i[@class='icon-arrow-down'])[1]");
	By Listofoptions_xpath=By.xpath("//ul[@class='chooser-suggestions expanded']//following::li//span");
	By Savebtn_xpath=By.xpath("//button[.=' Save']");
	By Cancelbtn_xpath=By.xpath("//button[.=' Cancel']");
	By Addplaceholdercheckbox_xpath=By.xpath("//small[.='Add PLACEHOLDER']");
	By Previewtextarea_xpath=By.xpath("//textarea");

	
	//TWITTER SIGNATURE:
	By Twittertab_xpath=By.xpath("(//div[@class='tab-item-label'])[2]");
	By Twittersignaturetogglebtn_xpath=By.xpath("(//span[.='Off '])[2]");
	By Placeholderdropdownexpand2_xpath=By.xpath("//i[@class='icon-arrow-down']");
	
	
	//EMAIL Signature:
	By Emailtab_xpath=By.xpath("");
	
	
	//PLACEHOLDERS will be replaced with agent and brand name while sending replies
	

	//POM:Verify Place holder drop down expandable
	public boolean TwitterPlaceholderdropdownexapand() {
		try {
			Thread.sleep(3000);
			WebElement Placeholderdropdownexpand2_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Placeholderdropdownexpand2_xpath));
			Placeholderdropdownexpand2_webl.click();
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	
	//POM:Verify Twitter signature  toggle button clickable
		public boolean TwitterSignatutetogglebtn() {
			try {
				WebElement Twittersignaturetogglebtn_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Twittersignaturetogglebtn_xpath));
				Twittersignaturetogglebtn_webl.click();
				return true;

			}
			catch (Exception e) {
				return false;
			}
		}
	
	public boolean Twittertab() {
		try {
			WebElement Twittertab_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Twittertab_xpath));
			Twittertab_webl.click();		
			return true;
		}
		catch (Exception e) {
			return false;
					 
		}
	}

	//POM:Verify Preview Text area filed

	public boolean Previewtextarea(String value) {
		try {
			Thread.sleep(3000);
			WebElement Previewtextarea_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Previewtextarea_xpath));
			Previewtextarea_webl.clear();
			Previewtextarea_webl.sendKeys(value);
			Thread.sleep(3000);
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Addplaceholder check box clickable

	public boolean Addplaceholdercheckbox() {
		try {
			WebElement Addplaceholdercheckbox_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Addplaceholdercheckbox_xpath));
			Addplaceholdercheckbox_webl.click();
			Thread.sleep(3000);
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Click on save button
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


	//POM: Select an Option under drop-down
	public boolean SelectanOptionindropdown(String option)throws Exception{
		try{
			Thread.sleep(5000);
			List<WebElement> List_WebL=driver.findElements(Listofoptions_xpath);
			for(WebElement ElementWebl:List_WebL){
				String value=ElementWebl.getText().trim();
				System.out.println(value);
				if(value.equalsIgnoreCase(option)){
					System.out.println("Selecte option is "+value);
					//ElementWebl.click();
					Actions builder=new Actions(driver);
					builder.moveToElement(ElementWebl).click().build().perform();
					return true;
				}
			}
			return false;
		}
		catch(Exception ex){
			return false;
		}
	}


	//POM:Verify the options present in the drop down
	public List<String> VerifyOptions() {
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


	//POM:Verify Place holder drop down expandable
	public boolean Placeholderdropdownexapand() {
		try {
			Thread.sleep(3000);
			WebElement Placeholderdropdownexpand_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Placeholderdropdownexpand_xpath));
			Placeholderdropdownexpand_webl.click();
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Verify Facebook signature  toggle button clickable
	public boolean FbSignatutetogglebtn() {
		try {
			WebElement Facebooksignaturetogglebtn_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Facebooksignaturetogglebtn_xpath));
			Facebooksignaturetogglebtn_webl.click();
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}



	//POM:Verify Signature tab clickable
	public boolean Signaturetab() {
		try {
			WebElement Signaturetab_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Signaturetab_xpath));
			Signaturetab_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


}
