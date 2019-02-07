package MypackagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketingRulePO {


	public WebDriver driver;
	public TicketingRulePO(WebDriver driver) {
		this.driver=driver;
	}
	public By Ticketingruletab_xpath=By.xpath("//h3[.=' Ticketing Rules']");
	public By Createrulebtn_xpath=By.xpath("//section[@class='right-part']//button[@class='od-button small']");
	public By Rulenamefiled_xpath=By.xpath("//input[@placeholder='Enter Rule Name']");
	public By Dropdown1_xpath=By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select");
	public By DD1value_xpath=By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='source']");
	public By DD2value_xpath=By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='is_equal");
	
	
	

	public By Savebtn_xpath=By.xpath("//button[.='Save']");
	public By Cancelbtn_xpath=By.xpath("//button[.='Cancel']");
}
