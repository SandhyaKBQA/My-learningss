package MyLearningTs;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonutilities.Utility;
import MypackagePO.AssignmnetRulePO;
import MypackagePO.BaseTest;

public class AssignmentRuleTC extends BaseTest{
	public AssignmnetRulePO AssignmnetRulePo;
	public OnedirectLoginTc OnedirectLoginTC;
	public Utility UtilitY;
	public AssignmentRuleTC AssignmentRuleTc;

	public AssignmentRuleTC() {}
	public AssignmentRuleTC(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public void AsssignmentRulecreation()throws Exception{
		this.AssignmnetRulePo=new AssignmnetRulePO(driver);
		this.UtilitY=new Utility(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Assignmnetruletab_xpath),true,"!Oops not able to click on assignmentrule tab");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Createbutton_xpath),true,"!Oops not able to click on create new button");
		Assert.assertEquals(UtilitY.Sendingstrings(AssignmnetRulePo.Rulename_xpath,"Rule1"),true,"!Oops not able enter the rule name");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Dropdown1_xpath),true,"!Oops not able to click on dropdown1");		
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.d1value_xpath),true,"!Oops not able to select the value from the D1");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.D2_xpath),true,"!Oops not able to select the value");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.D3_xpath),true,"!Oops not able to click on dropdown3");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.D3values_xpath),true,"!Oops not able to select the option from the D3");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Teamdropdown_xpath),true,"!Oopss not able to click on teams dropdown");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Teams_xpath),true,"!Oops not able to select the team");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Agentsdropdown_xpath),true,"!Oops not able to click on agent dropdoown");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Agents_xpath),true,"!Oops not able to select the agent");
		Assert.assertEquals(UtilitY.Clickaction(AssignmnetRulePo.Savebtn_xpath),true,"!Oops not able to click on save button");
		
	}




}
