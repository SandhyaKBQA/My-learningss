package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdBusinesshrPo {

	By BusinessHour_xpath=By.xpath("//a[@routerlink='business-hours']");
	By Createnewbutton_xpath=By.xpath("//section[@class='right-part']//button[@class='od-button small']");
	By Name_xpath=By.xpath("//div[@class='form-field']//input[@placeholder='Enter Schedule Name']");
	By Description_xpath=By.xpath("//div[@class='form-field']//textarea[@placeholder='Enter Description']");
	By Timezone_xpath=By.xpath("//div[@class='width-85']//span[.='Asia/Kolkata']");
	By FirstRadiobutton_xpath=By.xpath("//div[.='24 hours x 7 days']");
	By SecondRadiobutton_xpath=By.xpath("//div[.='Select Hours']");
	By Enterholidayfield_xpath=By.xpath("//input[@placeholder='Enter holiday name']");
	By Holidaydatefiled_xpath=By.xpath("//span[@class='date-input']");
	By Calendar_xpath=By.xpath("//ngui-datetime-picker[@draggable='true']//div[@class='ngui-datetime-picker']//div[@class='days']//div");
	By Nextmonthday_xpath=By.xpath("//b[@class='prev_next next month']");
	By Addholidaybutton_xpath=By.xpath("//button[.='Add Holiday']");
	By Savebutton_xpath=By.xpath("//button[.='Save']");
	By Cancelbutton_xpath=By.xpath("//button[.='Cancel']");
	By Toastmsg_xpath=By.xpath("//div[@id='toast-container']");
	By Editicon_xpath=By.xpath("//tr[@fxlayoutalign='space-between center']/following::td[.='Automation BH']/following::i[@class='icon-edit']");
	By Deleteicon_xpath=By.xpath("//tr[@fxlayoutalign='space-between center']/following::td[.='Automation BH']/following::i[@class='icon-delete']");
	By Deletebutton_xpath=By.xpath("//button[.=' Delete ']");


	public WebDriver driver;
	public OdBusinesshrPo(WebDriver driver) {
		this.driver=driver;
	}

	//POM:Verify Delete button clickable
	public boolean Deletebutton()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Deletebutton_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Deletebutton_xpath));
			Deletebutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


	//POM:Verify Edit icon clickable
	public boolean 	Deleteicon()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Deleteicon_webl= driver.findElement(Deleteicon_xpath);
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
	public boolean Editicon()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Editicon_webl= driver.findElement(Editicon_xpath);
			Actions builder=new Actions(driver);
			builder.moveToElement(Editicon_webl).build().perform();
			driver.findElement(Editicon_xpath).click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify toast messsage
	public boolean Toastmsg(String Message)throws Exception{
		try {
			WebElement Toastmsg_webl=driver.findElement(Toastmsg_xpath);
			String Toast=Toastmsg_webl.getText().trim();
			System.out.println("Toast message is "+Toast);
			if(Toast.equalsIgnoreCase(Message)){
				System.out.println("Toast message displayed is "+Toast);
				return true;
			}else
				return false;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Save button clickable
	public boolean Savebuttonclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Savebutton_webl=(new WebDriverWait(driver,30)) .until(ExpectedConditions.visibilityOfElementLocated(Savebutton_xpath));
			Savebutton_webl.click();
			Thread.sleep(10000);
			return true;

		}
		catch (Exception e) {
			return false;
		}

	}


	//POM:Verify Add holiday button clickable
	public boolean Addholiday()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Addholidaybutton_webl=(new WebDriverWait(driver,60)) .until(ExpectedConditions.visibilityOfElementLocated(Addholidaybutton_xpath));
			Addholidaybutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Next month  date arrow clickable
	public boolean Nextmonth()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Nextmonthday_webl=(new WebDriverWait(driver,60)) .until(ExpectedConditions.visibilityOfElementLocated(Nextmonthday_xpath));
			Nextmonthday_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify the Calendar date selectable
	public boolean Calendardate(String Date)throws Exception{
		try {
			Thread.sleep(5000);
			List<WebElement> dates=driver.findElements(Calendar_xpath);
			for(WebElement date:dates){
				String value=date.getText().trim();
				if(value.equals(Date)){
					System.out.println(value);
					date.click();
					return true;
				}
			}
			return false;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Select Holiday date text filed
	public boolean SelectHolidayDate()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Holidaydatefiled_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Holidaydatefiled_xpath));
			Holidaydatefiled_webl.click();
			return true;	
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Enter holiday text filed
	public boolean Enterholiday(String Holidayname)throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Enterholidayfield_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Enterholidayfield_xpath));
			Enterholidayfield_webl.sendKeys(Holidayname);
			return true;	
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM: Verify Selet hour radio button clickable
	public boolean SecondRadiobutton()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement SecondRadiobutton_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(SecondRadiobutton_xpath));
			SecondRadiobutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM: Verify 24*7 radio button clickable
	public boolean FirstRadiobutton()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement FirstRadiobutton_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(FirstRadiobutton_xpath));
			FirstRadiobutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM: Verify Timezone filed clickable
	public boolean TImezonefiled()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Timezone_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Timezone_xpath));
			Timezone_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Description text area filed 
	public boolean Descriptionfiled(String Description)throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Description_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Description_xpath));
			Description_webl.sendKeys(Description);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}



	//POM:Verify Name text filed
	public boolean Namefiled(String Name)throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Name_webl=(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOfElementLocated(Name_xpath));
			Name_webl.sendKeys(Name);;
			return true;	
		}
		catch (Exception e) {
			return false;			
		}
	}
	//POM:Verify Create new button clickable
	public boolean CreateNewbuttonclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement Createnewbutton_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(Createnewbutton_xpath));
			Createnewbutton_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}

	//POM:Verify Business hour link clickable
	public boolean BusinessHourlinkclickable()throws Exception{
		try {
			Thread.sleep(5000);
			WebElement BusinessHour_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(BusinessHour_xpath));
			BusinessHour_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


}
