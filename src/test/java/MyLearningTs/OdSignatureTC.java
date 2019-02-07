package MyLearningTs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OdSignaturePO;

public class OdSignatureTC extends BaseTest {

	public OdSignatureTC OdSignatureTc;
	public OdSignaturePO OdSignaturePo;
	public OnedirectLoginTc OnedirectLoginTC;

	public OdSignatureTC() {}
	public OdSignatureTC(WebDriver driver) {
		this.driver=driver;
	}

	//FACEBOOK SIGNATUTE

	@Test
	public void EnableFacebookSignature()throws  Exception{
		this.OdSignaturePo=new OdSignaturePO(driver);
		this.OdSignatureTc=new OdSignatureTC(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		Assert.assertEquals(OdSignaturePo.Signaturetab(),true,"!Oops not able to click on Signature Tab");

		Assert.assertEquals(OdSignaturePo.FbSignatutetogglebtn(),true,"!Oops not able to click on Facebook signature Toggle button");

		Assert.assertEquals(OdSignaturePo.Placeholderdropdownexapand(),true,"!Oops not able to expand the placeholder drop-down");

		List<String> ExpectedList=new ArrayList<String>();
		ExpectedList.add("First name of agent");
		ExpectedList.add("First and second name of agent");
		ExpectedList.add("First letter of first name and first letter of second name");
		ExpectedList.add("Custom");
		Assert.assertEquals(OdSignaturePo.VerifyOptions(), ExpectedList,"!Oops not able to verify all options");

		Assert.assertEquals(OdSignaturePo.SelectanOptionindropdown("Custom"),true,"!Oops not  able to select the option");

		Assert.assertEquals(OdSignaturePo.Addplaceholdercheckbox(),true,"!Oops not able to click on Check box");

		Assert.assertEquals(OdSignaturePo.Previewtextarea("Thanks and regards SANDHYA K.B"),true,"!Oops not able to enter the text into preview area");

		Assert.assertEquals(OdSignaturePo.Savebtn(),true,"!Oops not able to click on Save button");
	}

	
	//TWITTER SIGNATURE
	@Test
	public void EnableTwitterSignature()throws  Exception{
		this.OdSignaturePo=new OdSignaturePO(driver);
		this.OdSignatureTc=new OdSignatureTC(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		Assert.assertEquals(OdSignaturePo.Signaturetab(),true,"!Oops not able to click on Signature Tab");
		Assert.assertEquals(OdSignaturePo.Twittertab(),true,"!Oops not able to click on Twitter Tab");

		Assert.assertEquals(OdSignaturePo.TwitterSignatutetogglebtn(),true,"!Oops not able to click on twitter signature Toggle button");

		Assert.assertEquals(OdSignaturePo.TwitterPlaceholderdropdownexapand(),true,"!Oops not able to expand the placeholder drop-down");

		List<String> ExpectedList=new ArrayList<String>();
		ExpectedList.add("First name of agent");
		ExpectedList.add("First and second name of agent");
		ExpectedList.add("First letter of first name and first letter of second name");
		ExpectedList.add("Custom");
		Assert.assertEquals(OdSignaturePo.VerifyOptions(), ExpectedList,"!Oops not able to verify all options");

		Assert.assertEquals(OdSignaturePo.SelectanOptionindropdown("Custom"),true,"!Oops not  able to select the option");

		Assert.assertEquals(OdSignaturePo.Addplaceholdercheckbox(),true,"!Oops not able to click on Check box");

		Assert.assertEquals(OdSignaturePo.Previewtextarea("Thanks and regards SANDHYA K.B"),true,"!Oops not able to enter the text into preview area");

		Assert.assertEquals(OdSignaturePo.Savebtn(),true,"!Oops not able to click on Save button");
	}
}