package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonutilities.Utility;
import MypackagePO.BaseTest;
import MypackagePO.OdTagsPO;

public class OdTagsTC extends BaseTest {
	
	
	public OdTagsPO OdTagsPo;
	public OnedirectLoginTc OnedirectLoginTC;
	public OdTagsTC OdTagsTc;
	public Utility UtilitY;
	
	public OdTagsTC() {}
	public OdTagsTC(WebDriver driver) {
		this.driver=driver;
	}

	//Tags creation
	
	@Test
	public void Tagscreation() throws Exception {
		this.OdTagsPo=new OdTagsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		this.UtilitY=new Utility(driver);
		
		Assert.assertEquals(OdTagsPo.Tagtabclickable(),true,"!Oops not able to click on Tags tab");
		
		Assert.assertEquals(OdTagsPo.Addtagbutton(),true,"!Oops not able to click on Add tag button");
		
		Assert.assertEquals(OdTagsPo.Entertagnamefield("NEW QWERTY"),true,"!Oops not able to enter the tag name");
		
		Assert.assertEquals(OdTagsPo.Plusiconclickable(),true,"!Oops not able to click on plus icon");
		
		Assert.assertEquals(OdTagsPo.Entertagnamefield("MY TAG124"),true,"!Oops not able to enter the tag name");
		
		Assert.assertEquals(OdTagsPo.Plusiconclickable(),true,"!Oops not able to click on plus icon");
		
		Assert.assertEquals(OdTagsPo.Savebtn(),true,"!Oops not able to click on Save button");
		
		
		//Verification of columns
		Assert.assertEquals(UtilitY.Verificationofelements(OdTagsPo.Checkboxcolumn_xpath),true,"!Oops This column is not present in the page");
		Assert.assertEquals(UtilitY.Verificationofelements(OdTagsPo.Tagnamecolumn_xpath),true,"!Oops This column is not present in the page");
		Assert.assertEquals(UtilitY.Verificationofelements(OdTagsPo.Createdbycolumn_xpath),true,"!Oops This column is not present in the page");
		Assert.assertEquals(UtilitY.Verificationofelements(OdTagsPo.Createdoncolumn_xpath),true,"!Oops This column is not present in the page");

	
	
	}
	
	//Tags updation
	
	@Test
	public void Tagsupdation() throws Exception {
		this.OdTagsPo=new OdTagsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		
		Assert.assertEquals(OdTagsPo.Tagtabclickable(),true,"!Oops not able to click on Tags tab");
		
		Assert.assertEquals(OdTagsPo.Editicon(),true,"!Oops not able to click on Edit icon");
		
		Assert.assertEquals(OdTagsPo.Entertagnamefield("MY TAG1245"),true,"!Oops not able to enter the tag name");
		
		Assert.assertEquals(OdTagsPo.Savebtn(),true,"!Oops not able to click on Save button");
		
	}
	
	
	//TAGS DELETION
	@Test
	public void TagsDeletion() throws Exception {
		this.OdTagsPo=new OdTagsPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		
		Assert.assertEquals(OdTagsPo.Tagtabclickable(),true,"!Oops not able to click on Tags tab");
		
		Assert.assertEquals(OdTagsPo.Deleteicon(),true,"!Oops not able to click on Delete icon");
		
		Assert.assertEquals(OdTagsPo.Yesbutton(),true,"!Oops not able to clcik on Yes button");
		
	}
	
	
	
	
	
}
