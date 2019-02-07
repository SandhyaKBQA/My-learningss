package MyLearningTs;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OdTeamsPo;

public class OdTeamsTc extends BaseTest {
	public OdTeamsPo OdTeamsPO;
	public OdTeamsTc OdTeamsTC;
	public OnedirectLoginTc OnedirectLoginTC;


	public OdTeamsTc() {}
	public OdTeamsTc(WebDriver driver) {
		this.driver=driver;
	}
	@Test
	public void VerifyTeamcreation()throws Exception{
		this.OdTeamsPO=new OdTeamsPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		//Verify Teams button clickable
		Assert.assertEquals(OdTeamsPO.Teamsbuttonclickable(), true,"!Oops not able to click on Teams");

		//Verify Add new team button clickable
		Assert.assertEquals(OdTeamsPO.AddnewTeamsbuttonclickable(),true,"!Oops not able to click on Add new team button");

		//Verify team name text filed
		String Teamname="Myteam";
		Assert.assertEquals(OdTeamsPO.EnterTeamname(Teamname),true ,"!opps not able to enter the text into team name filed");

		//Verify Description text area field
		String Description="Testing";
		Assert.assertEquals(OdTeamsPO.EnterDescription(Description), true,"!Oops not able to enter the text into Description filed");


		// Verify supervisor drop-down Expandable
		Assert.assertEquals(OdTeamsPO.Supervisordropdownclickable(), true,"!oops not able to Expand the spervisor drop-down.");


		//Verify user can able to select one admin/supervisors from supervisor drop down

		//  String option="VA Supervisor";
		//Assert.assertEquals(OdTeamsPO.Selectsupervisors(option), true,"!Oops not able to select supervisors");

		//verify user can able to select more than one supervisors
		List<String> ExpectedList=new ArrayList<String>();
		ExpectedList.add("newfirstname newlastname");
		ExpectedList.add("qwertyytrewqdddddddmail zsd");
		ExpectedList.add("VA Supervisor");
		for(int i=0;i<ExpectedList.size();i++) {
			Assert.assertEquals(OdTeamsPO.Moresupervisors(ExpectedList.get(i)), true,"!Oops not able to select more supervisors");
		}

		Assert.assertEquals(OdTeamsPO.Supervisordropdownclickable(), true,"!oops not able to Expand the spervisor drop-down.");

		//Verify agents drop down expandable
		Assert.assertEquals(OdTeamsPO.Agentdropdownclickable(),true,"!Oops not able expand the agents drop-down");


		//Verify the user can able to select one agents from agent drop down
		//String agents="zzRishabh A Bbcd";
		//	Assert.assertEquals(OdTeamsPO.Selectagentdropdown(agents),true,"!Oops not able to select the agent");

		//Verify user can able to select the more than one agent from the agent drop-down
		List<String> Expectedagents=new ArrayList<String>();
		Expectedagents.add("Sapana Sharmaji");
		Expectedagents.add("zzRishabh A Bbcd");
		Expectedagents.add("Name Change Testing1");
		for(int i=0;i<Expectedagents.size();i++) {
			Assert.assertEquals(OdTeamsPO.MoreAgents(Expectedagents.get(i)), true,"!Oops not able to select more agents");
		}



		Assert.assertEquals(OdTeamsPO.Agentdropdownclickable(),true,"!Oops not able expand the agents drop-down");

		//Verify user can able to select the Round robin radio button 

		Assert.assertEquals(OdTeamsPO.Roundrobinclickable(), true,"!Oops not able to select the round robin radio button");

		//Verify user can able to select the Load balenced radio button

		//Assert.assertEquals(OdTeamsPO.Loadbalenceclickable(),true,"!Oops not able to select Load balenced radio button");





		//Verify Business hour drop down expandable

		Assert.assertEquals(OdTeamsPO.Businesshrdrop(),true,"!Oops not able expand the Business hour drop-down");

		//Verify Business hour selectable



		Assert.assertEquals(OdTeamsPO.SingleBHclickable(),true,"!Oops not able to select the Business hour");


		//Verify the user can able to select one Business hour from Business hour drop down
		//String Hour="t2smfbs";
		// Assert.assertEquals(OdTeamsPO.SelectBusinesshr(Hour),true,"!Oops not able to select the Business hour");


		//Verify user can able to click on save button
		Assert.assertEquals(OdTeamsPO.Savebuttonclickable(),true,"!Oops not able to click on save button");

		//Verify user can able to click on save button
		//Assert.assertEquals(OdTeamsPO.Cancelbuttonclickable(),true,"!Oops not able to click on cancle button");
	}

	@Test
	public void VerifyTeamUpdation()throws Exception{
		this.OdTeamsPO=new OdTeamsPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		OdTeamsPO.Teamsbuttonclickable();

		String Teamname="Myteam";
		Assert.assertEquals(OdTeamsPO.Serchteam(Teamname),true ,"!opps not able to enter the text into team name filed");

		//Verify edit icon clickable
		Assert.assertEquals(OdTeamsPO.Editiconclickable(),true,"!Oops not able to click on edit icon");


		//Verify user can able to select the Load balenced radio button

		Assert.assertEquals(OdTeamsPO.Loadbalenceclickable(),true,"!Oops not able to select Load balenced radio button");

		//Verify user can able to click on save button
		Assert.assertEquals(OdTeamsPO.Savebuttonclickable(),true,"!Oops not able to click on save button");

	}
	@Test
	public void verifyTeamDeletion()throws Exception{
		this.OdTeamsPO=new OdTeamsPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		OdTeamsPO.Teamsbuttonclickable();

		String Teamname="Myteam";
		Assert.assertEquals(OdTeamsPO.Serchteam(Teamname),true ,"!opps not able to enter the text into team name filed");

		//Verify delete icon clickable
		//Assert.assertEquals(OdTeamsPO.Deleteiconclickable(),true,"!Oops not able to click on delete icon");

		//Verify edit icon clickable
		Assert.assertEquals(OdTeamsPO.Editiconclickable(),true,"!Oops not able to click on edit icon");

		//Verify edit icon clickable
		Assert.assertEquals(OdTeamsPO.Deletebuttonclickable(),true,"!Oops not able to click on Delete button");


		//Verify user can able to click on yes button in the team delete popup
		Assert.assertEquals(OdTeamsPO.Yesbuttonclickable(),true,"!Oops not able to click on yes button");
	}

}
