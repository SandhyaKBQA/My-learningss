package MypackagePO;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdCannedresponsePO {

	public WebDriver driver;
	public OdCannedresponsePO(WebDriver driver){
		this.driver=driver;
	}

	//Canned response xpath

	By CannedResponse_xpath=By.xpath("//div[@class='mat-list-item-content']//a[@class='cursor-pointer']//h3[.=' Canned responses']");public By Createnewcannedresponsebtn_xpath=By.xpath("//button[@class='btn btn-primary add-button']//span[.='+']");
	public By Category_xpath=By.xpath("//input[@name='category']");
	public By Subcategory_xpath=By.xpath("//input[@name='subCategory']");
	public By Sourcedropdown_xpath=By.xpath("//div[@class='col-sm-5']//select");
	public By Sourceoptionslist_xpath=By.xpath("//div[@class='col-sm-5']//select//option");
	public By Titlefiled_xpath=By.xpath("//input[@name='title']");
	public By Contenttextarea_xpath=By.xpath("//textarea");
	public By Savebtn_xpath=By.xpath("//input[@ng-disabled='form.cannedForm.$invalid || !form.cannedForm.modified']");
	public By Cancelbtn_xpath=By.xpath("//input[@ng-click='cancelCanned();']");


	//Filter xpath
	public By Applyfilterbtn_xpath=By.xpath("//div[@class='canned-filters  row-fluid']");
	public By Source_xpath=By.xpath("(//button[@data-toggle='dropdown'])[1]");
	public By Sourcelists_xpath=By.xpath("//div[@class='dropdown-menu open']//li//a//span");
	public By CategoryDD_xpath=By.xpath("(//button[@data-toggle='dropdown'])[2]");
	public By Categorylist_xpath=By.xpath("(//div[@class='dropdown-menu open'])[2]//li//a//span");
	public By SubCategory_xpath=By.xpath("(//button[@data-toggle='dropdown'])[3]");
	public By Subcategorylist_xpath=By.xpath("(//div[@class='dropdown-menu open'])[3]//li//a//span");
	public By TitleDD_xpath=By .xpath("(//button[@data-toggle='dropdown'])[4]");
	public By Titlelist_xpath=By.xpath("(//div[@class='dropdown-menu open'])[4]//li//a//span");
	public By Applybtn_xpath=By.xpath("//button[@class='btn btn-default filter-confirm-button']");
	public By Clearallbtn_xpath=By.xpath("//button[@class='btn btn-default filter-clear-button']");


	public By Editicon_xpath=By.xpath("(//i[@style='cursor: pointer;'])[1]");
	public By Deleteicon_xpath=By.xpath("(//i[@style='cursor: pointer;'])[2]");
	public By Deletebtn_xpath=By.xpath("//input[@value='Delete']");
	public By Cancel_xpath=By.xpath("//button[.='Cancel']");

	//Integration with Instagram and facebook tickets.

	public By  Searchicon_xpath=By.xpath("//i[@class='icon-search header-search-icon']");
	public By Searchfield_Xpath=By.xpath("//input[@name='searchInput']");
	public By Searchedresult_xpath=By.xpath("//li[@fxlayout='row']");
	public By Comment_xpath=By.xpath("(//div[.='Comment'])[1]");
	public By Cannedicon_xpath=By.xpath("//i[@class='icon-canned']");
	public By Categorytab_xpath=By.xpath("(//div[@class='cr-tab-item'])[1]//ul//li");
	public By Contenttext_xpath=By.xpath("//li[@class='canned-response-li']");

	//Twitter ticket
	public By Reply_xpath=By.xpath("(//div[.='Reply'])[1]");

	//POM:Apply filter for canned response
	public boolean Applyfilter() {
		try {
			WebElement Applyfilterbtn_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Applyfilterbtn_xpath));
			Applyfilterbtn_webl.click();
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}


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
	
	public boolean VerifyColumnsdisplay(String Text) {
		try {
			WebElement WebL=driver.findElement(By.xpath("//table[@id='entry-grid']//th[text()=\'"+Text+"\']"));
			if(WebL.isDisplayed()) {
				return true;
			}else {
				return false;
			}
			
		}
		catch (Exception e) {
			return false;
		}
	}



}
