package MyLearningTs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.AgentstatusPO;
import MypackagePO.BaseTest;

public class AgentstatusTC extends BaseTest {

	public AgentstatusTC AgentstatusTc;
	public AgentstatusPO AgentstatusPo;
	public OnedirectLoginTc OnedirectLoginTC;

	public AgentstatusTC() {}
	public AgentstatusTC(WebDriver driver) {this.driver=driver;}

	@Test
	public void Agentstatuscreation()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		this.AgentstatusPo=new AgentstatusPO(driver);
		this.AgentstatusTc=new AgentstatusTC(driver);
		OnedirectLoginTC.VerifySettingFunctionality();


		Assert.assertEquals(AgentstatusPo.Agentstatustab(),true,"!Oops not able to click on Agent status tab");
		Assert.assertEquals(AgentstatusPo.Createnewstatusbtn(),true,"!Oops not able to click on Create New status button");
		Assert.assertEquals(AgentstatusPo.Statusname("TEA BREAK"), true,"!Oops not able to Enter the Status name ");
		Assert.assertEquals(AgentstatusPo.Statusdesc("BREAK TIME"),true,"!Oops not  able to enter the Description");

		Assert.assertEquals(AgentstatusPo.Statustypredropdownexpand(),true,"!Oops not able to Expand the status type drop-down");


		List<String>expectedtypes=new ArrayList<String>();
		expectedtypes.add("Busy");
		expectedtypes.add("Offline");

		Assert.assertEquals(AgentstatusPo.Verifystatustypeoptions(),expectedtypes,"!Oops Status types are not matching");

		Assert.assertEquals(AgentstatusPo.Selectoption("Offline"),true,"!Oops not able to select the Status type");

		Assert.assertEquals(AgentstatusPo.Savebtn(),true,"!Oops not able to click on Save button");

	}

	@Test
	public void AgentstatusUpdation()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		this.AgentstatusPo=new AgentstatusPO(driver);
		this.AgentstatusTc=new AgentstatusTC(driver);
		OnedirectLoginTC.VerifySettingFunctionality();


		Assert.assertEquals(AgentstatusPo.Agentstatustab(),true,"!Oops not able to click on Agent status tab");
		Assert.assertEquals(AgentstatusPo.Editicon(),true,"!Oops not able to click on Edit icon");

		Assert.assertEquals(AgentstatusPo.Statusname("UPDATED BREAK"),true,"!Oops not able to edit the name");

		Assert.assertEquals(AgentstatusPo.Statusdesc("UPDATED"),true,"!Oops not able to edit the Description");

		Assert.assertEquals(AgentstatusPo.Savebtn(),true,"!Oops not able to click on Save button");

	}

	@Test
	public void AgentstatusDeletion()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		this.AgentstatusPo=new AgentstatusPO(driver);
		this.AgentstatusTc=new AgentstatusTC(driver);
		OnedirectLoginTC.VerifySettingFunctionality();


		Assert.assertEquals(AgentstatusPo.Agentstatustab(),true,"!Oops not able to click on Agent status tab");
		Assert.assertEquals(AgentstatusPo.Deleteicon(),true,"!Oops not able to click Delete icon");
		Assert.assertEquals(AgentstatusPo.Yesbtn(),true,"!Oops not able to clcik on Yes button");

	}

}
