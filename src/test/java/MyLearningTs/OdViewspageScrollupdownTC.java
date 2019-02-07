package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OdViewspageScrollupdownPO;

public class OdViewspageScrollupdownTC extends BaseTest{
	
	public OdViewspageScrollupdownPO OdViewspageScrollupdownPo;
	public OdViewspageScrollupdownTC OdViewspageScrollupdownTc;
	public OnedirectLoginTc OnedirectLoginTC;
	public OdViewspageScrollupdownTC() {}
	public OdViewspageScrollupdownTC(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public void Scroolpage()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifyServicecloudClickableFunctionality();
		
		this.OdViewspageScrollupdownPo=new OdViewspageScrollupdownPO(driver);
		String pageNo="5";
		Assert.assertEquals(OdViewspageScrollupdownPo.Scrollupdown(pageNo),true,"!Oops not able scroll down the page");
		
	}
	
}
