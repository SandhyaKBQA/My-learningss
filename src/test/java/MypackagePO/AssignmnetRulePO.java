package MypackagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignmnetRulePO {
	public WebDriver driver;
	public AssignmnetRulePO(WebDriver driver) {
		this.driver=driver;
	}
	public By Assignmnetruletab_xpath=By.xpath("//h3[.=' Assignment Rules']");
	public By Createbutton_xpath=By.xpath("//app-assignment-rule//section[@class='right-part']//button[@class='od-button small']");
	public By Rulename_xpath=By.xpath("//input[@placeholder='Enter Rule Name']");
	public By Dropdown1_xpath=By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select");
	public By d1value_xpath=By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='source']");
	public By D2_xpath=By.cssSelector("app-conditional-ui-item div[class='pos-rel'] select option[value='is_equal']");
	public By D3_xpath=By.xpath("(//div[@class='ng-chips-holder'])[1]");
	public By D3values_xpath=By.xpath("//div[@class='ng-chips-holder']//ul//li");
	public By Teamdropdown_xpath=By.xpath("//div[@class='condition-ui-setting']//app-auto-suggest");
	public By Teams_xpath=By.xpath("//div[@class='condition-ui-setting']//app-auto-suggest//ul//li[2]");
	public By Agentsdropdown_xpath=By.xpath("(//div[@class='ng-chips-holder'])[2]");
	public By Agents_xpath=By.xpath("(//div[@class='ng-chips-holder'])[2]//ul//li");
	public By Savebtn_xpath=By.xpath("//button[.='Save']");
	public By Cancelbtn_xpath=By.xpath("//button[.='Cancel']");






}
