package MyLearningTs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonutilities.Utility;
import MypackagePO.BaseTest;
import MypackagePO.OdCannedresponsePO;

public class OdCannedresponseTC extends BaseTest {


	public OdCannedresponsePO OdCannedresponsePo;
	public OdCannedresponseTC OdCannedresponseTc;
	public OnedirectLoginTc OnedirectLoginTC;
	public Utility UtilitY;


	public OdCannedresponseTC(){}
	public OdCannedresponseTC(WebDriver driver) {
		this.driver=driver;
	}


	@Test
	public void CannedresponseCreation()throws Exception{

		this.OdCannedresponsePo=new OdCannedresponsePO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		this.UtilitY=new Utility(driver);
		String URL="https://testing.onedirect.in/brandfull#/settingsCannedResponsesTab";

		Assert.assertEquals(OdCannedresponsePo.ClickonCannedResponse(URL), true,"!Oops not able to click on Canned Response");

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Createnewcannedresponsebtn_xpath),true,"!Oops not able to click on craete new button");

		Assert.assertEquals(UtilitY.Sendingstrings(OdCannedresponsePo.Category_xpath,"Automation1"),true,"!Oops not able to enter the text into categary text filed");

		Assert.assertEquals(UtilitY.Sendingstrings(OdCannedresponsePo.Subcategory_xpath,"AUTOMATIONTEST"),true,"!Oops not able to enter the text into subcatery text filed");


		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Sourcedropdown_xpath),true,"!Oops not able to click on Source dropdown");

		List<String>expectedvalues=new ArrayList<String>();
		expectedvalues.add("All Sources");
		expectedvalues.add("Facebook");
		expectedvalues.add("Twitter");
		expectedvalues.add("Email");
		expectedvalues.add("Playstore");
		expectedvalues.add("Third Party Sources");
		expectedvalues.add("Instagram");

		Assert.assertEquals(UtilitY.VerifyDropdownoptions(OdCannedresponsePo.Sourceoptionslist_xpath), expectedvalues,"!Oops not able to verify the options,options are not matching");

		Assert.assertEquals(UtilitY.SelectanOptionindropdown(OdCannedresponsePo.Sourceoptionslist_xpath,"Instagram"),true,"!Oops not able to select the option from Source drop-down");

		Assert.assertEquals(UtilitY.Sendingstrings(OdCannedresponsePo.Titlefiled_xpath,"TESTING TITLE"),true,"!Oops not able to enter the Text into Title filed");

		Assert.assertEquals(UtilitY.Sendingstrings(OdCannedresponsePo.Contenttextarea_xpath,"QWERTTY TEST !@#$%^&*1234567890"),true,"!Oops not able to enter the text intoo Content filed");

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Savebtn_xpath),true,"!Oops not able to click on Save button");

	}


	@Test
	public void ApplyFilter()throws Exception{
		this.OdCannedresponsePo=new OdCannedresponsePO(driver);
		this.OdCannedresponseTc=new OdCannedresponseTC(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		this.UtilitY=new Utility(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		String URL="https://testing.onedirect.in/brandfull#/settingsCannedResponsesTab";

		Assert.assertEquals(OdCannedresponsePo.ClickonCannedResponse(URL), true,"!Oops not able to click on Canned Response");

		Thread.sleep(2000);
		Assert.assertEquals(OdCannedresponsePo.Applyfilter(),true,"!Oops not able to click on Apply Filter button");


		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Source_xpath),true,"!Oops not able to Click on Source dropdown");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdCannedresponsePo.Sourcelists_xpath, "Instagram"),true,"!Oops not able to select the option from Source drop-down");

		Thread.sleep(3000);

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.CategoryDD_xpath),true,"!Oops not able to Click on Category dropdown");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdCannedresponsePo.Categorylist_xpath, "Automation1"),true,"!Oops not able to select the option from Category drop-down");


		Thread.sleep(4000);

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.SubCategory_xpath),true,"!Oops not able to Click on SubCategory dropdown");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdCannedresponsePo.Subcategorylist_xpath, "AUTOMATIONTEST"),true,"!Oops not able to select the option from SubCategory drop-down");

		Thread.sleep(4000);

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.TitleDD_xpath),true,"!Oops not able to Click on Title dropdown");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(OdCannedresponsePo.Titlelist_xpath, "TESTING TITLE"),true,"!Oops not able to select the option from Title drop-down");

		Thread.sleep(4000);

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Applybtn_xpath),true,"!Oops not able to click on Apply button");
		Thread.sleep(4000);

		//UPDATE/EDIT Canned response

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Editicon_xpath),true,"!Oops not able to click on Edit icon");

		Assert.assertEquals(UtilitY.Sendingstrings(OdCannedresponsePo.Contenttextarea_xpath,"123"),true,"!Oops not able to enter the text intoo Content filed");

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Savebtn_xpath),true,"!Oops not able to click on Save button");

		//Delete  action
		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Deleteicon_xpath),true,"!Oops not able to click on Delete icon ");

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Deletebtn_xpath),true,"!Oops not able to click on Delete button");


	}



	@Test
	public void IntegrationofCannedResponse()throws Exception {
		this.OdCannedresponsePo=new OdCannedresponsePO(driver);
		this.OdCannedresponseTc=new OdCannedresponseTC(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		this.UtilitY=new Utility(driver);
		OnedirectLoginTC.VerifyServicecloudClickableFunctionality();

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Searchicon_xpath),true,"!Oops not able to click on Search icon");

		Assert.assertEquals(UtilitY.Sendingstrings(OdCannedresponsePo.Searchfield_Xpath,"5989813"),true,"!Oops not able to Enter the text into Search filed");


		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Searchedresult_xpath),true,"!Oops not able to click on Searched result");


		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Comment_xpath),true,"!Oops not able to click on Comment option");

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Cannedicon_xpath),true,"!Oops not able to click on Canned icon");

		Assert.assertEquals(UtilitY.SelectanOptionindropdown(OdCannedresponsePo.Categorytab_xpath,"Automation1"),true,"!Oops not able to select this option");

		Assert.assertEquals(UtilitY.Clickaction(OdCannedresponsePo.Contenttext_xpath),true,"!Oops not able to click on Content Text");

	}	

}
