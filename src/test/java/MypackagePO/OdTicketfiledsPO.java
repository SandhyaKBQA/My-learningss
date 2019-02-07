package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdTicketfiledsPO {
	public WebDriver driver;
	public OdTicketfiledsPO(WebDriver driver) {
		this.driver=driver;
	}

	By Ticketfiledtab_xpath=By.xpath("//div[@class='mat-list-item-content']//h3[.=' Ticket Fields']");
	By Addticketfiledbtn_xpath=By.xpath("//section[@class='right-part']//button[.=' + Add Ticket Field']");
	By Filedtypedropdown_xpath=By.xpath("//i[@class='icon-arrow-down']");
	By Filedtypedropdownoptionslist_xpath=By.xpath("//i[@class='icon-arrow-down']//following::ul[@class='chooser-suggestions expanded']//child::li//span");
	By Filedtitletextbox_xpath=By.xpath("//input[@placeholder='Enter Field Title']");
	By Noneditcheckbox_xpath=By.xpath("//label[@class='od-checkbox-label field-checkbox']");
	By Description_xpath=By.xpath("//textarea[@placeholder='Enter Description']");
	By Foragentcheckbox_xpath=By.xpath("//div[@class='form-field']//ul//following::li//label[@class='od-checkbox-label']");
	By Savebtn_xpath=By.xpath("//button[.='Save']");
	By Cancelbtn_xpath=By.xpath("//button[.='Cancel']");
    By Editicon_xpath=By.xpath("(//i[@class='icon-edit'])[1]");
    By Deleteicon_xpath=By.xpath("(//i[@class='icon-delete'])[1]");
    By Yesbutton_xpath=By.xpath("//button[.=' Yes ']");
    
    
    By Option1_xpath=By.xpath("//input[@placeholder='Value 1']");
    By Plusicon_xpath=By.xpath("//i[@class='icon-plus_line ']");
    By Option2_xpath=By.xpath("//input[@placeholder='Value 2']");
    By Option3_xpath=By.xpath("//input[@placeholder='Value 3']");
    
    
    By Choosefile_xpath=By.xpath("//input[@type='file']");
    
    By Expressiontextfield_xpath=By.xpath("//input[@placeholder='Expression']");
    By Errortextfield_xpath=By.xpath("//input[@placeholder='Error Text']");
    
    
    
    //POM:Verify Regex filed creation
    public boolean Expressiontextfield(String value) {
    	try {
    		Thread.sleep(5000);
    		WebElement Expressiontextfield_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Expressiontextfield_xpath));
    		Expressiontextfield_webl.sendKeys(value);
    		return true;
    	}
    	catch (Exception e) {
			return false;
		}
    }
    
    //POM:Verify Error text filed 
    public boolean Errortextfield(String errormsg) {
    	try {
    		Thread.sleep(5000);
    		WebElement Errortextfield_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Errortextfield_xpath));
    		Errortextfield_webl.sendKeys(errormsg);
    		return true;
    	}
    	catch (Exception e) {
			return false;
		}
    }
    
    
    
    
    
    
    //POM:Verify dependent drop down file selection
     public boolean Choosefile() {
    	 try {
    		 Thread.sleep(5000);
    		 WebElement Choosefile_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Choosefile_xpath));
    		 Choosefile_webl.sendKeys("/home/sandhyakb/Downloads/Custom Info (1).xlsx");
    		 return true; 
    	 }
    	 catch (Exception e) {
			return false;
		}
     }
    
    //POM:Verify the Increment option of the drop down fileds(plus(+) icon)
    
    public boolean Plusicon() {
    	try {
    		Thread.sleep(5000);
    		WebElement Plusicon_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Plusicon_xpath));
    		Plusicon_webl.click();
    		return true;
    	}
    	catch (Exception e) {
			return false;
			}
    }
    
    
    //POM:Verify the Drop down ticket field
    public boolean DropdownOption1(String Option1) {
    	
    	try {
    		Thread.sleep(5000);
    		WebElement Option1_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Option1_xpath));
    		Option1_webl.sendKeys(Option1);
    		return true;
    	}
    	catch (Exception e) {
			return false;
		}
    }
    
 public boolean DropdownOption2(String Option2) {
    	
    	try {
    		Thread.sleep(5000);
    		WebElement Option2_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Option2_xpath));
    		Option2_webl.sendKeys(Option2);
    		return true;
    	}
    	catch (Exception e) {
			return false;
		}
    }
	
 public boolean DropdownOption3(String Option3) {
 	
 	try {
 		Thread.sleep(5000);
 		WebElement Option3_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Option3_xpath));
 		Option3_webl.sendKeys(Option3);
 		return true;
 	}
 	catch (Exception e) {
			return false;
		}
 }
    //POM:Verify Yes button clickable
    public boolean Yesbutton() {
    	try {
    		Thread.sleep(5000);
    		WebElement Yesbutton_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Yesbutton_xpath));
    		Yesbutton_webl.click();
    		return true;
    	}
    	catch (Exception e) {
    		return false;
		}
    }
    
    
	//POM:Verify the Delete functionality
    public boolean Deleteicon() {
    	try {
    		Thread.sleep(5000);
    		WebElement Deleteicon_webl=driver.findElement(Deleteicon_xpath);
    		Actions builder=new Actions(driver);
    		builder.moveToElement(Deleteicon_webl).build().perform();
    		driver.findElement(Deleteicon_xpath).click();
    		return true;
    	}
    	catch (Exception e) {
			return false;
		}
    }
    
    
    
    //POM:Verify Edit icon clickable
    public boolean Editicon() {
    	try {
    		Thread.sleep(5000);
    		WebElement Editicon_webl=driver.findElement(Editicon_xpath);
    		Actions act=new Actions(driver);
    		act.moveToElement(Editicon_webl).build().perform();
    		driver.findElement(Editicon_xpath).click();
    		return true;
    		}
    	catch (Exception e) {
			return false;
			}
    }
    

	//POM:Verify Save button

		public boolean Savebtn()throws Exception{
			try {
				Thread.sleep(5000);
				WebElement Savebtn_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Savebtn_xpath));
				Savebtn_webl.click();
				Thread.sleep(5000);
				return true;
			}
			catch (Exception e) {
				return false;
			}
		}


	//POM:Verify the Closing and Resolving ticket check boxes
	public boolean Requiredcheckbox(String value)throws Exception{
		try {
			Thread.sleep(5000);
			List<WebElement>list=driver.findElements(Foragentcheckbox_xpath);
			for(WebElement webl:list) {
				String checkbox=webl.getText().trim();
				System.out.println(checkbox);
				if(checkbox.equalsIgnoreCase(value)) {
					System.out.println(checkbox);
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



	//POM:Verify the Description filed
	public boolean Descriptionfiled(String Description)throws Exception{
		try {
			Thread.sleep(2000);
			WebElement Description_webl=(new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(Description_xpath));
			Description_webl.sendKeys(Description);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}




	//POM:Verify Non editable check box checkable

	public boolean VerifyNoneditablecheckbox()throws Exception{
		try {
			WebElement Noneditcheckbox_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Noneditcheckbox_xpath));
			Noneditcheckbox_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}



	//POM:Verify filed title text filed
	public boolean Filedtitle(String title)throws Exception{
		try {
			Thread.sleep(2000);
			WebElement Filedtitletextbox_webl=(new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(Filedtitletextbox_xpath));
			Filedtitletextbox_webl.sendKeys(title);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Select the option from Filed type drop-down
	public boolean Selectfiledtype(String Filed)throws Exception{
		try {
			Thread.sleep(5000);
			List<WebElement>options=driver.findElements(Filedtypedropdownoptionslist_xpath);
			for(WebElement webl:options) {
				String type=webl.getText().trim();
				System.out.println(type);
				if(type.equalsIgnoreCase(Filed)) {
					webl.click();	
					System.out.println(type);
					return true;
				}
			}
			return false;
		}
		catch (Exception e) {
			return false; 

		}
	}


	//POM:Verify the filed type drop down expandable
	public boolean Fieldtypedropdownexpandable()throws Exception{
		try {
			WebElement Filedtypedropdown_webl=(new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(Filedtypedropdown_xpath));
			Filedtypedropdown_webl.click();
			Thread.sleep(5000);
			return true; 

		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Verify add Ticket filed button clickable
	public boolean Clickaddticketbtn()throws Exception{
		try {
			WebElement Addticketfiledbtn_webl=(new WebDriverWait(driver,20)).until(ExpectedConditions.visibilityOfElementLocated(Addticketfiledbtn_xpath));
			Addticketfiledbtn_webl.click();	
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Verify the ticket filed tab clickble
	public boolean Clickonticketfiledtab()throws Exception{
		try {
			WebElement Ticketfiledtab_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Ticketfiledtab_xpath));
			Ticketfiledtab_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}



}
