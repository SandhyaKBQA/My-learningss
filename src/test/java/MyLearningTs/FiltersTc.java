package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.FilterPO;

public class FiltersTc extends BaseTest {
	
	public FilterPO FilterPo;
	public FiltersTc FiltersTC;
	public OnedirectLoginTc OnedirectLoginTC;
	public FiltersTc() {}
	
	public FiltersTc(WebDriver driver) {
		this.driver=driver;	
	}
	
	@Test
	public void VerifyFilteroption()throws Exception{
		this.FilterPo=new FilterPO(driver);
		this.OnedirectLoginTC=new OnedirectLoginTc(driver);
		OnedirectLoginTC.VerifySettingFunctionality();
		
		Assert.assertEquals(FilterPo.ClickonUserTab(),true,"!Oops not able to click on User tab");
		
		Assert.assertEquals(FilterPo.ClickonFilterButton(),true,"!Oops not able to click on Filter button");
		
		Assert.assertEquals(FilterPo.ClickonUserroleButton("Admin"),true,"!Oops not able to select User role");
		
		
		Assert.assertEquals(FilterPo.ClickonUserroleButton("Disable"),true,"!Oops not able to select User role");
		//Assert.assertEquals(FilterPo.VerifyChechboxEnable(), true,"!Oops Eneble check box is not checked");
		
		Assert.assertEquals(FilterPo.VerifydataunderUserTypecolumn("Admin"), true,"!Oops system is displaying invalid data under user type column.");
		
		Assert.assertEquals(FilterPo.VerifyDateunderAccountstatecolumn("Enable"),true,"!Oops Data under account stats column is wrong");
		
	}

}
