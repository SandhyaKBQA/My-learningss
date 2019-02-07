package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.OnedirectloginPo;


public class OnedirectLoginTc extends BaseTest{
		public OnedirectloginPo OnedirectloginPO;
		public OnedirectLoginTc OnedirectLoginTC;
		public OnedirectLoginTc() {}
		public OnedirectLoginTc(WebDriver driver) {
			this.driver=driver;
		} 

		@Test
		public void Verifyonedirectloginfunctionality() throws Exception{
			this.OnedirectloginPO=new OnedirectloginPo(driver);
			//verify email id
			String Email="charlie.onedirect@gmail.com";
			Assert.assertEquals(OnedirectloginPO.EnterUserEmailId(Email),true ,"Invalid email id");
			
			//verify password
			String Password="t";
			Assert.assertEquals(OnedirectloginPO.EnterPassword(Password),true ,"Invalid password");
			
			//verify submit button clickable
					Assert.assertEquals(OnedirectloginPO.Verifysubmitbuttonclickable(),true ,"!Oops Not able to click submit button");
			
		}

		
		
		@Test
		public void VerifyServicecloudClickableFunctionality()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);	
		OnedirectLoginTC.Verifyonedirectloginfunctionality();
		this.OnedirectloginPO=new OnedirectloginPo(driver);
		//POM:verify service cloud product clickable
		
		Assert.assertEquals(OnedirectloginPO.VerifyServicecloudImage(),true ,"!Oops Not able to click on service cloud");
		}
		
		@Test
		public void VerifySettingFunctionality()throws Exception{
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);	
		OnedirectLoginTC.VerifyServicecloudClickableFunctionality();
		this.OnedirectloginPO=new OnedirectloginPo(driver);
		//POM:verify setting functionality clickable
		Thread.sleep(5000);
		Assert.assertEquals(OnedirectloginPO.VerifySettingsClickabel(),true, "!Oops not able to click on settings");
		}
		
}
