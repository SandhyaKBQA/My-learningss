package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.IframePO;

public class IFrameTC extends BaseTest{
	public IframePO IframePo;
	public IFrameTC IFrameTc;
	
	public IFrameTC() {}
	
	public IFrameTC(WebDriver driver) {
		this.driver=driver;
	}
	
	
	@Test
	public void VeifyIframeFunctionality_1347()throws Exception{
		
		this.IframePo=new IframePO(driver);
		Assert.assertEquals(IframePo.ClickonsignUpButton(),true,"!Oops not able to click on signup iframe");
		String number="9878674367";
		Assert.assertEquals(IframePo.EnterMobileNumber(number),true,"!Oops not able to enter teh mobile number");
	}
	

}
