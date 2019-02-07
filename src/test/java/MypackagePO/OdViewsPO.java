package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class OdViewsPO {
	public WebDriver driver;
	public OdViewsPO( WebDriver driver) {this.driver=driver;}


	By Createviewbutton_xpath=By.xpath("(//span[@class='view-search']//following::button)[1]");
	By viewname_xpath=By.xpath("//div[@class='form-field-view']//input[@placeholder='Enter View Name']");
	By Description_xpath=By.xpath("//div[@class='form-field-view']//textarea[@placeholder='Enter Description']");
	By Selectcondition_xpath=By.xpath("/html/body/app-root/app-home/app-sidebar/md-sidenav-container/div[2]/div/app-main-content/app-settings/section/section/div[2]/app-add-edit-view/article/form/section/article[5]/div[2]/app-conditional-ui/div/div[1]/app-conditional-ui-item/div/div[1]/select");
	By selectconditionoptipns_xpath=By.xpath("//select[@class='text-type ng-pristine ng-valid ng-touched']//child::option");
	By Sourcelist_xpath=By.xpath("//div[@class='full-width' and @fxlayout='row']//div[@class='source-column']//div");

	By Sourceoption_xpath=By.xpath("/html/body/app-root/app-home/app-sidebar/md-sidenav-container/div[2]/div/app-main-content/app-settings/section/section/div[2]/app-add-edit-view/article/form/section/article[5]/div[2]/app-conditional-ui/div/div[1]/app-conditional-ui-item/div/div[1]/select/optgroup/option[2]");
	By EqualOption_xpath=By.xpath("/html/body/app-root/app-home/app-sidebar/md-sidenav-container/div[2]/div/app-main-content/app-settings/section/section/div[2]/app-add-edit-view/article/form/section/article[5]/div[2]/app-conditional-ui/div/div[1]/app-conditional-ui-item/div/div[3]/select/option[2]");
	By Thirddropdown_xpath=By.xpath("/html/body/app-root/app-home/app-sidebar/md-sidenav-container/div[2]/div/app-main-content/app-settings/section/section/div[2]/app-add-edit-view/article/form/section/article[5]/div[2]/app-conditional-ui/div/div[1]/app-conditional-ui-item/div/div[5]/div/div/app-auto-suggest/div/div");
	By Facebookall_xpath=By.xpath("/html/body/app-root/app-home/app-sidebar/md-sidenav-container/div[2]/div/app-main-content/app-settings/section/section/div[2]/app-add-edit-view/article/form/section/article[5]/div[2]/app-conditional-ui/div/div[1]/app-conditional-ui-item/div/div[5]/div/div/app-auto-suggest/div/div/ul/li[1]");


	By Source_xpath=By.xpath("//div[@class='full-width' and @fxlayout='row']//div[@class='source-column']//div//following::span[.='Updated At']");
	By Destinationlist_xpath=By.xpath("//div[@class='full-width' and @fxlayout='row']//div[@class='destination-column']//div");
	By Destination_xpath=By.xpath("//div[@class='destination-column']//child::div[@style]");
	By Destination1_xpath=By.xpath("//div[@class='destination-column']//div[@id='dropHere']//div[@class='m-l-5']//following::i]");
	By Dest_xpath=By.xpath("//div[@class='column-data drag-here-column'  and @id='dropHere' ]");
	By Savebutton_xpath=By.xpath("//button[.='Save']");
	
	By Statustogglebtn_xpath=By.xpath("//span[@class='toggle-switch']");



	//POM:Verify create new view button
	public boolean CreatenewViewbutton()throws Exception{
		try {
			WebElement Createviewbutton_webl= (new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Createviewbutton_xpath));
			Createviewbutton_webl.click();
			return true; 
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify View name text filed
	public boolean Viewname(String name)throws Exception{
		try {
			WebElement viewname_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(viewname_xpath));
			viewname_webl.sendKeys(name);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Verify Description text area  text filed
	public boolean Description(String Description)throws Exception{
		try {
			WebElement Description_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Description_xpath));
			Description_webl.sendKeys(Description);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	//POM:Click n status toggle button
	public boolean ClickonstatusTogglebtn()throws Exception{
		try {
			Thread.sleep(3000);
			WebElement Statustogglebtn_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Statustogglebtn_xpath));
			Statustogglebtn_webl.click();
			return true;
			
		}
		catch (Exception e) {
			return false;
		}
	}
	
	//POM:Click n status toggle button
		public boolean ClickonstatusTogglebutton(String Status)throws Exception{
			try {
				Thread.sleep(3000);
				WebElement Statustogglebtn_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Statustogglebtn_xpath));
				String value=Statustogglebtn_webl.getText().trim();
				
				if(value.equalsIgnoreCase(Status)) {
				Statustogglebtn_webl.click();
				return true;
				}
				return false;
			}
			catch (Exception e) {
				return false;
			}
		}
	
	
	
	

	//POM:verify the select condition first drop down clickable
	public boolean Firstdropdown()throws Exception{
		try {
			WebElement Selectcondition_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Selectcondition_xpath));
			Selectcondition_webl.click();
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Verify the option inside the first drop down
	public boolean Selectoption(String Option)throws Exception{
		try {
			List<WebElement>list=driver.findElements(selectconditionoptipns_xpath);
			for(WebElement webl:list) {
				String value=webl.getText().trim();
				if(value.equalsIgnoreCase(Option)) {
					System.out.println(value);
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


	//POM:Verify drag and drop functionality
	public boolean DragandDropElement(String Source)throws Exception{
		try {
			Thread.sleep(10000);
			List<WebElement> SourseWebList=driver.findElements(Sourcelist_xpath);
			WebElement Destination_WebL=driver.findElement(Destination_xpath);

			for(WebElement Webelement:SourseWebList) {
				String value=Webelement.getText().trim();
				if(value.equalsIgnoreCase(Source)) {
					System.out.println(value);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView();",Webelement);
					System.out.println(Webelement.getText());
					Actions builder=new Actions(driver);
					Thread.sleep(5000);
					builder.dragAndDrop(Webelement,Destination_WebL).click().build().perform();
					Thread.sleep(10000);
					return true;					
				}

			}

			return false;
		}
		catch (Exception e) {
			return false;
		}
	}
	public boolean Singledragdrop()throws Exception{
		try {
			WebElement Source_webl=driver.findElement(Source_xpath);
			
			//WebElement Destination1_webl=driver.findElement(Destination1_xpath);
			//WebElement Dest_webl=driver.findElement(Dest_xpath);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",Source_webl);
			Actions builder=new Actions(driver);
			Thread.sleep(5000);
			WebElement Destination_WebL=driver.findElement(Destination_xpath);
			builder.dragAndDrop(Source_webl,Destination_WebL).click().build().perform();
			//builder.dragAndDrop(Source_webl, Destination1_webl).click().build().perform();
			//builder.dragAndDrop(Source_webl, Dest_webl).click().build().perform();
			Thread.sleep(10000);

			return true;  
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:verify Save button clickable
	public boolean Savebutton()throws Exception{
		try {
			WebElement Savebutton_webl=(new WebDriverWait(driver,60))
					.until(ExpectedConditions.visibilityOfElementLocated(Savebutton_xpath));
			Savebutton_webl.click();
			Thread.sleep(5000);
			return true;

		}
		catch (Exception e) {
			return false;
		}
	}

	//Verify source option clickable
	public boolean Sourceoptionclick()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Sourceoption_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Sourceoption_xpath));
			Sourceoption_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;		
		}
	}



	//Verify Equal option clickable
	public boolean Equaloptionclick()throws Exception{
		try {Thread.sleep(5000);
		WebElement EqualOption_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(EqualOption_xpath));
		EqualOption_webl.click();
		return true;
		}
		catch (Exception e) {
			return false;		
		}
	}

	//Verify Third drop down clickable
	public boolean Thirddropdown()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Thirddropdown_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Thirddropdown_xpath));
			Thirddropdown_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;		
		}
	}

	//Verify Facebook all option clickable
	public boolean Facebookalloptionclick()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Facebookall_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Facebookall_xpath));
			Facebookall_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;		
		}
	}

}

