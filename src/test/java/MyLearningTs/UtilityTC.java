package MyLearningTs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commonutilities.Utility;
import MypackagePO.BaseTest;
import MypackagePO.UtilityPO;

public class UtilityTC extends BaseTest {

	public UtilityTC UtilityTc;
	public UtilityPO UtilityPo;
	public Utility UtilitY;
	public OnedirectLoginTc OnedirectLoginTC;

	public UtilityTC() {}
	public UtilityTC(WebDriver driver) {
		this.driver=driver;
	}






	@Test
	public void Emailsignature() throws Exception{
		this.UtilityPo=new UtilityPO(driver);
		this.UtilityTc=new UtilityTC(driver);
		this.UtilitY=new Utility(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();

		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.Signatutetab_xpath),true,"!Oops not able to click on Signature tab");

		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.email_xpath),true,"!Oops not able to click on Email tab");

		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.Emailsignaturetogglebtn_xpath),true,"!Oops not  able to click on Email signature toggle button");

		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.Placeholderdropdownexpand_xpath),true,"!Oops not able to expand the Placeholder drop-down");


		List<String>list=new ArrayList<String>();
		list.add("Agent name");
		list.add("Agent name and Brand Name");
		list.add("Custom");
		Assert.assertEquals(UtilitY.VerifyDropdownoptions(UtilityPo.Listofoptions_xpath),list,"!Oops not able to verify all the options");

		Assert.assertEquals(UtilitY.SelectanOptionindropdownMouseoveraction(UtilityPo.Listofoptions_xpath,"Custom"),true,"!Oops not able to select the option");

		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.Addplaceholdercheckbox_xpath),true,"!Oops not able to check the check box");

		Assert.assertEquals(UtilityPo.Signatureiframe("THANKS & REGARDS SANDHYA K.B"),true,"!Oops not able to enter the signature text");

		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.Signaturesurveytogglebtn_xpath),true,"!Oops not able to click on survey toggle button");


		Assert.assertEquals(UtilitY.Clickaction(UtilityPo.Savebtn_xpath),true,"!Oops not able to click on Save button");








	}
}
