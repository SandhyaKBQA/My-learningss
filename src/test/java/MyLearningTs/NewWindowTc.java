package MyLearningTs;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import MypackagePO.BaseTest;
import MypackagePO.NewWindowPo;

public class NewWindowTc extends BaseTest{
	
	public NewWindowPo NewwindowPo;
	public NewWindowTc NewwindowTc;
	public OnedirectLoginTc OnedirectLoginTC;

	
	public NewWindowTc(){
		
	}
	public NewWindowTc(WebDriver driver){
		this.driver=driver;
	}
	
//	@Test
//	public void VerifyClassicLinkClickable_1487()throws Exception{
//		
//		this.NewwindowPo=new NewWindowPo(driver);
//		
//		String URL="http://seleniumpractice.blogspot.com/?view=classic";
//		Assert.assertEquals(NewwindowPo.ClickonClassicLink(URL), true,"!Oops not able to click on classic link");
//		
//	}
	
	@Test
	public void ApplynowbuttonClickable_1487()throws Exception{
		this.NewwindowPo=new NewWindowPo(driver);
		String URL="https://company.naukri.com/landing-page/cognizant/17sep2018/index.html";
		Assert.assertEquals(NewwindowPo.ClickonApllyNowButton(NewwindowPo.ApplynowButton_xpath,URL), true,"!Oops not able to click on classic link");
	
	}
	
	
	
	
	@Test
	public void Keywordsclickable()throws Exception{
		
		this.NewwindowPo=new NewWindowPo(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		String url="https://testing.onedirect.in/brandfull#/settingsKeywordsTab";
		Assert.assertEquals(NewwindowPo.ClickonKeywords(url), true,"!Oops not able to click on Keywords");
		
}

		@Test
		public void Cannedresponseclickable()throws Exception{
			
			this.NewwindowPo=new NewWindowPo(driver);
			this.OnedirectLoginTC=new OnedirectLoginTc(driver);
			OnedirectLoginTC.VerifySettingFunctionality();
			String URL="https://testing.onedirect.in/brandfull#/settingsCannedResponsesTab";
			
			Assert.assertEquals(NewwindowPo.ClickonCannedResponse(URL), true,"!Oops not able to click on Canned Response");
			
		}
	
	
	

}

