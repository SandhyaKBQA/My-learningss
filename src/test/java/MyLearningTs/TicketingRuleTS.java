package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonutilities.Utility;
import MypackagePO.BaseTest;
import MypackagePO.TicketingRulePO;

public class TicketingRuleTS extends BaseTest {
	public TicketingRuleTS TicketingRuleTs;
	public TicketingRulePO  TicketingRulePo;
	public Utility UtilitY;
	public OnedirectLoginTc OnedirectLoginTC;
	
	public TicketingRuleTS() {}
	public TicketingRuleTS(WebDriver driver) {
		this.driver =driver;
	}
	
	@Test
	public void TicketruleCreation()throws Exception{
		this.TicketingRulePo=new TicketingRulePO(driver);
		this.UtilitY=new Utility(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
	
	Assert.assertEquals(UtilitY.Clickaction(TicketingRulePo.Ticketingruletab_xpath),true,"!Oops not able to click on Ticketrule tab");
    Assert.assertEquals(UtilitY.Clickaction(TicketingRulePo.Createrulebtn_xpath),true,"!Oops not able to click on ");
	Assert.assertEquals(UtilitY.Sendingstrings(TicketingRulePo.Rulenamefiled_xpath,"Rule1"),true,"!Oops not able to enter the rule name");
	Assert.assertEquals(UtilitY.Clickaction(TicketingRulePo.Dropdown1_xpath),true,"!Oops not able to click on Dropdown1");
	Assert.assertEquals(UtilitY.Clickaction(TicketingRulePo.DD1value_xpath),true,"!Oops not able to select the value from dropdown");
	Assert.assertEquals(UtilitY.Clickaction(TicketingRulePo.DD2value_xpath),true,"!Oops not able to select the value from dropdown");
	
	
	
	
	}
	
	

}
