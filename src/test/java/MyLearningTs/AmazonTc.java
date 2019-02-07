package MyLearningTs;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import MypackagePO.AmazonPo;
import MypackagePO.BaseTest;

public class AmazonTc extends BaseTest{

	public AmazonPo amazonPo;
	public AmazonTc amazonTc;
	
	public AmazonTc() {}
	
	public AmazonTc(WebDriver passdriver) {
		driver=passdriver;
	}
	
	
@Test
public void VerifySortByCatFunctionality() throws Exception {

	this.amazonPo=new AmazonPo(driver);
	
	Assert.assertEquals(amazonPo.MouseoveronSortBycat(),true, "!Oops not able to Mouse Over on SortBy categary");

	Assert.assertEquals(amazonPo.ClickonMobileComputor(), true,"!Oops not able to click on Mobile Computer");

}
@Test
public void verifyPowerBankLinkFunc_1231()throws Exception{
	
	this.amazonTc=new AmazonTc(driver);
	amazonTc.VerifySortByCatFunctionality();
	
	this.amazonPo=new AmazonPo(driver);
	
	Assert.assertEquals(amazonPo.ClickonPowerbank(), true,"!Oops not able to Click on Power Bank");
	
}

@Test

public void VerifyElectronicsTabAppea_6542() throws Exception{
	this.amazonTc=new AmazonTc(driver);
	amazonTc.verifyPowerBankLinkFunc_1231();
	
	this.amazonPo=new AmazonPo(driver);
	Assert.assertEquals(amazonPo.VerifyElectronics(), true,"!Oops not able to Verify electronic Tab");
	
}

}