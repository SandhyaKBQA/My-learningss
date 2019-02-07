package MyLearningTs;

	import java.util.ArrayList;
	import java.util.List;

	import org.openqa.selenium.WebDriver;
	
	import org.testng.Assert;
	import org.testng.annotations.Test;



import MypackagePO.ActitimeLoginPo;
import MypackagePO.BaseTest;

	
	

	public class ActitimeLoginTc extends BaseTest{
		public ActitimeLoginPo ActitimeLoginPO;
		public ActitimeLoginTc ActitimeLoginTC;
		
		public ActitimeLoginTc(){}

		public ActitimeLoginTc(WebDriver driver){
			this.driver=driver;
		}
		@Test(groups="PM-1234")
		public void verifyActiTimeLogInFunc_1234()throws Exception{
			//ExtentTest Test1=extent.createTest("Verify Login to ActiTime Application functionality.", "ActiTime > Login Script");
			this.ActitimeLoginPO=new ActitimeLoginPo(driver);
			
			// Verify User name text field allow user to enter text.
			String UserName="admin";
			Assert.assertEquals(ActitimeLoginPO.EnterTextinUsernametextbox(UserName), true,"!Oops not ablre to User name text field allow user to enter text.");		
			//Test1.log(Status.PASS, "enter user name ");
			
			// Verify Password text field allow user to enter text.
			String UserPassword="manager";
			Assert.assertEquals(ActitimeLoginPO.EnterTextinPasswordtextbox(UserPassword), true,"!Oops not able to Enter text in Password field");
			//Test1.log(Status.PASS, "enter user password ");

			// Verify LogIn button click able.
			Assert.assertEquals(ActitimeLoginPO.VerifyLogInbuttonclickable(), true,"!Oops not able to Click on LogIn button");
			//Test1.log(Status.PASS, "Click on LogIn button");
			
			// extent.flush();
		}

		@Test
		public void verifyEnterTimedropdownFun_1235()throws Exception{
			
			this.ActitimeLoginTC=new ActitimeLoginTc(driver);
			ActitimeLoginTC.verifyActiTimeLogInFunc_1234();
			
			this.ActitimeLoginPO=new ActitimeLoginPo(driver);
		
			// Verify Enter Time drop-down Expandable
			Assert.assertEquals(ActitimeLoginPO.ExpandEnterTimeDropdown(), true,"!oops not able to Expand the drop-down.");
		
			List<String> list=new ArrayList<String>();
			list.add("abc");//0
			list.add("def");//1
			list.add("EFG");//1
			for(int i=0;i<list.size();i++){
			}
			
			String option="san, san (san)";
			Assert.assertEquals(ActitimeLoginPO.SelectanOptionindropdown(option), true,"!Oops not able to select an option in the drop-down");
		}
		
		
		@Test
		public void VerifyAllOptiondisplay_3245()throws Exception{
			
			this.ActitimeLoginTC=new ActitimeLoginTc(driver);
			ActitimeLoginTC.verifyActiTimeLogInFunc_1234();
			
			this.ActitimeLoginPO=new ActitimeLoginPo(driver);
		
			// Verify Enter Time drop-down Expandable
			Assert.assertEquals(ActitimeLoginPO.ExpandEnterTimeDropdown(), true,"!oops not able to Expand the drop-down.");
			
			List<String> ExpectedList=new ArrayList<String>();
			ExpectedList.add("san, san (san)");
			ExpectedList.add("sandhya, sandhya (sandhya)");
			ExpectedList.add("System, Administrator (admin)");
			/*for(int i=0;i<ExpectedList.size();i++) {
				Assert.assertEquals(ActitimeLoginPO.VerifyAllOptionDisplay(ExpectedList.get(i)), ExpectedList,"!Oops not able to verify all options");
			}
			*/
			Assert.assertEquals(ActitimeLoginPO.VerifyAllOptionDisplay(), ExpectedList,"!Oops not able to verify all options");
		}
			
		@Test
		public void verifyOptionPresent_1462()throws Exception{
			this.ActitimeLoginTC=new ActitimeLoginTc(driver);
			ActitimeLoginTC.verifyActiTimeLogInFunc_1234();
			
			this.ActitimeLoginPO=new ActitimeLoginPo(driver);
			
			// Verify Enter Time drop-down Expandable
			Assert.assertEquals(ActitimeLoginPO.ExpandEnterTimeDropdown(), true,"!oops not able to Expand the drop-down.");
			
			String OptionValue="System, Administrator (admin)";
			Assert.assertEquals(ActitimeLoginPO.VerifyOptionPresent(OptionValue), true,"!Oops not able Verify Option In The drop-down");
			
		}
			
			
		@Test
		public void verifyListofOptionPresent_146234()throws Exception{
			this.ActitimeLoginTC=new ActitimeLoginTc(driver);
			ActitimeLoginTC.verifyActiTimeLogInFunc_1234();
			
			this.ActitimeLoginPO=new ActitimeLoginPo(driver);
			
			// Verify Enter Time drop-down Expandable
			Assert.assertEquals(ActitimeLoginPO.ExpandEnterTimeDropdown(), true,"!oops not able to Expand the drop-down.");
			
			List<String> ListOptions=new ArrayList<String>();
			ListOptions.add("san, san (san)");
			ListOptions.add("System, Administrator (admin)");
			for(int i=0;i<ListOptions.size();i++){
			Assert.assertEquals(ActitimeLoginPO.VerifyOptionPresent(ListOptions.get(i)), true,"!Oops not able Verify Option In The drop-down");
			}
			
		}				
			
					
		}



