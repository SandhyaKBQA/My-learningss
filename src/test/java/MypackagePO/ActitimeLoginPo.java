package MypackagePO;

	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class ActitimeLoginPo {
		
		public WebDriver driver;
		public ActitimeLoginPo(WebDriver driver){
			this.driver=driver;
		}
		
		By Username_xpath=By.xpath("//input[@name='username']");
		By Password_xpath=By.xpath("//input[@name='pwd']");
		By Loginbutton_xpath=By.xpath("//div[text()='Login ']");
		
		By EnterTimetrackforDropdown_Xpath=By.xpath("//img[@id='ext-gen7']");
		By EnterTimedropdownOpns_xpath=By.xpath("//div[starts-with(@id,'ext-gen')]//div[@style='padding:3px 0 3px 20px']");
		
		
		//POM: Verify Perticular Option present in the drop-down
		public boolean VerifyOptionPresent(String OptionValue)throws Exception{
			try{
				List<WebElement> List_WebL=driver.findElements(EnterTimedropdownOpns_xpath);
				 for(WebElement ElementWebl:List_WebL){
					 String value=ElementWebl.getText().trim();
					 if(value.equals(OptionValue)){
						 System.out.println(value);
						 return true;
					 }
				 }
				return false;
			}
			catch(Exception ex){
				return false;
			}
		}
		
		//POM: Verify all Options display
		public List<String> VerifyAllOptionDisplay()throws Exception{
			try{
				Thread.sleep(5000);
				List<String> list=new ArrayList<String>();
			 List<WebElement> List_WebL=driver.findElements(EnterTimedropdownOpns_xpath);
			 for(WebElement ElementWebl:List_WebL){
				 String value=ElementWebl.getText().trim();
				 System.out.println(value);
				 list.add(value);
				 }
			 return list;
			}
			catch(Exception ex){
				return null;
			}
		}
		
		//POM: Select an Option under drop-down
		public boolean SelectanOptionindropdown(String option)throws Exception{
			try{
				Thread.sleep(5000);
			 List<WebElement> List_WebL=driver.findElements(EnterTimedropdownOpns_xpath);
			 for(WebElement ElementWebl:List_WebL){
				 String value=ElementWebl.getText().trim();
				 if(value.equalsIgnoreCase(option)){
					 System.out.println("Selecte option is "+value);
					 //ElementWebl.click();
					 Actions builder=new Actions(driver);
					 builder.moveToElement(ElementWebl).click().build().perform();
					 return true;
				 }
			 }
			 return false;
			}
			catch(Exception ex){
				return false;
			}
		}
		//POM: Verify Enter Time drop-down Expandable
		public boolean ExpandEnterTimeDropdown()throws Exception{
			try{
				Thread.sleep(5000);
				WebElement EnterTimetrackforDropdown_WebL=(new WebDriverWait(driver, 60))
						.until(ExpectedConditions.visibilityOfElementLocated(EnterTimetrackforDropdown_Xpath));
				EnterTimetrackforDropdown_WebL.click();
			
				return true;
			}
			catch(Exception ex){
				return false;
			}
		}
		
		//POM: Verify User name text field allow user to enter text.
		public boolean EnterTextinUsernametextbox(String UserName)throws Exception{
			try{
				WebElement Username_WebL=(new WebDriverWait(driver, 60))
						.until(ExpectedConditions.visibilityOfElementLocated(Username_xpath));
				Username_WebL.sendKeys(UserName);
				return true;
			}
			catch(Exception ex){
				return false;
			}
		}
		
		//POM: Verify Password text field allow user to enter text.
		public boolean EnterTextinPasswordtextbox(String UserPassword)throws Exception {
			try{
				WebElement Password_Webl=(new WebDriverWait(driver, 60))
						.until(ExpectedConditions.visibilityOfElementLocated(Password_xpath));
				Password_Webl.sendKeys(UserPassword);
				return true;
			}
			catch(Exception ex){
				return false;
			}
		}
		
		//POM: Verify LogIn button clickable.
		
		public boolean VerifyLogInbuttonclickable() throws Exception{
			try{
				Thread.sleep(5000);
				WebElement Loginbutton_WebL=(new WebDriverWait(driver, 60))
						.until(ExpectedConditions.visibilityOfElementLocated(Loginbutton_xpath));
				Loginbutton_WebL.click();
				return true;
			}
			catch(Exception ex){
				return false;
			}
		}
		

		

	}
	


