package MypackagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnedirectloginPo {
	By useremailid_xpath=By.xpath("//input[@name='email']");
	By password_xpath=By.name("password");
	By submitbutton_xpath=By.xpath("//button[@type='submit']");
	

	By serviceCloudImage_xpath=By.xpath("//img[@src='../../../sso/assets/img/Service cloud@2x.svg']");
	
	By Settings_xpath=By.xpath("//div[@class='mat-list-item-content']//span[@class='sprite settings_new']");
	
	
	public WebDriver driver;


	public  OnedirectloginPo(WebDriver driver){
		this.driver=driver;
		
	}
	 //POM: Verify email id text field
	public boolean EnterUserEmailId(String EmailId) throws Exception
	{

		try {
			Thread.sleep(5000);
			WebElement Emailid_webl=(new WebDriverWait(driver,60))
			.until(ExpectedConditions.visibilityOfElementLocated(useremailid_xpath));
			Emailid_webl.sendKeys(EmailId);
			return true;
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
			return false;
		}
			
		}
		
		//POM: Verify Password text field
		public boolean EnterPassword(String Password) throws Exception
		{

			try {
				Thread.sleep(5000);
				WebElement Password_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(password_xpath));
				Password_webl.sendKeys(Password);
				return true;
			}
			catch(Exception ex){
				return false;
			}
				
			}
			
			//POM: Verify submit button clickable
			public boolean Verifysubmitbuttonclickable() throws Exception
			{

				try {
					Thread.sleep(5000);
					WebElement Submitbutton_webl=(new WebDriverWait(driver,60)).until(ExpectedConditions.visibilityOfElementLocated(submitbutton_xpath));
					Submitbutton_webl.click();;
					return true;
				}
				catch(Exception ex){
					System.out.println(ex.getMessage());
					return false;
				}
					
				}
				
				//POM: Verify Service cloud symbol clickbale 
				public boolean VerifyServicecloudImage() throws Exception
				{
					try {
						Thread.sleep(10000);
						WebElement serviceCloudImage_webl=(new WebDriverWait(driver, 60)).
								until(ExpectedConditions.visibilityOfElementLocated(serviceCloudImage_xpath));
						serviceCloudImage_webl.click();
						return true;
					}
					catch(Exception ex) {
						return false;
					}
					
				}
				
				public boolean VerifySettingsClickabel()throws Exception{
					try {Thread.sleep(10000);
						WebElement Settings_webl=(new WebDriverWait(driver,120))
								.until(ExpectedConditions.visibilityOfElementLocated(Settings_xpath));
						Settings_webl.click();
						
						return true;
					}catch (Exception e) {
						return false;
					}
					
				}
			
		
	}





