package MyLearningTs;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import MypackagePO.BaseTest;
import MypackagePO.DragAndDropPo;

public class DragandDropTc extends BaseTest {
	
	public DragAndDropPo DragAndDropPO;
	public DragandDropTc DragandDropTC;
	public DragandDropTc() {}
	public DragandDropTc(WebDriver driver) {this.driver=driver;}
	
	@Test
	public void VerifydragnDropFunc_135()throws Exception{
		this.DragAndDropPO=new DragAndDropPo(driver);
		String Source="London";
		Assert.assertEquals(DragAndDropPO.DragandDropElement(Source),true,"!Oops not able to drag and the drop the element");
	}
	

}
