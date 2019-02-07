package MypackagePO;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OdSLAPO {
	public WebDriver driver;
	public OdSLAPO(WebDriver driver) {
		this.driver=driver;
	}

	public By SLAtab_xpath=By.xpath("//h3[.=' SLA ']");
	
	public By Createslabtn_xpath=By.xpath("//button[@class='btn btn-primary add-button']");
	public By Slaname_xpath=By.xpath("//input[@id='add_name']");
	public By Sourcedropdownexpand_xpath=By.xpath("(//span[@class='fa fa-angle-down'])[1]");
	public By Sourcevalues_xpath=By.xpath("(//button[@aria-expanded='true']//following::div[@class='dropdown-menu open'])[1]//li");
	public By Sourceoptions_xpath=By.xpath("(//button[@aria-expanded='true']//following::div[@class='dropdown-menu open'])[1]//li//span");
	public By Targetsduringdd_xpath=By.xpath("(//span[@class='fa fa-angle-down'])[2]");
	public By Targetsduringddvalues_xpath=By.xpath("(//div[@class='dropdown-menu open'])[2]//ul//li");
	public By Tddoptions_xpath=By.xpath("(//div[@class='dropdown-menu open'])[2]//ul//li//span");
	public By Respondwithin_xpath=By.xpath("//input[@id='add_frt_hrs']");
	public By Responddd_xpath=By.xpath("(//span[@class='fa fa-angle-down'])[3]");
	public By Respondddvalues_xpath=By.xpath("(//div[@class='dropdown-menu open'])[3]//ul//li");
	public By Respondddoptions_xpath=By.xpath("(//div[@class='dropdown-menu open'])[3]//ul//li//span");
	public By Resolvewithin_xpath=By.xpath("//input[@id='add_rt_hrs']");
	public By Resolveexpand_xpath=By.xpath("(//span[@class='fa fa-angle-down'])[4]");
	public By Resolvevalues_xpath=By.xpath("(//div[@class='dropdown-menu open'])[4]//ul//li");
	public By Resolveoptions_xpath=By.xpath("(//div[@class='dropdown-menu open'])[4]//ul//li//span");
	
	public By Escalationemail_xpath=By.xpath("//span[.='Off']");
	public By Savebtn_xpath=By.xpath("//input[@value='Save']");
	public By Cancelbtn_xpath=By.xpath("//input[@value='Cancel']");
	
	
	public By Editsla_xpath=By.xpath("(//img[@alt='Edit'])[1]");
	public By Deletesla_xpath=By.xpath("(//img[@alt='Delete'])[1]");
	public By Yesbtn_xpath=By.xpath("//input[@value='Yes']");
	public By Nobtn_xpath=By.xpath("//input[@value='No']");
	
	
	
	
	//POM:Click on SLA link
		public boolean ClickonSLAtab(String URL)throws Exception{
			try {
				String Parentpage=driver.getWindowHandle();
				WebElement CannedResponse_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(SLAtab_xpath));
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
		
	
}

