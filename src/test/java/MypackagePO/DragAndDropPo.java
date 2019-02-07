package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPo {
	public WebDriver driver;
	public DragAndDropPo(WebDriver driver) {this.driver=driver;}
	
	By SourceList_Xpath=By.xpath("//div[@id='dhtmlgoodies_listOfItems']//descendant::li");
	//By Destinations_xptah=By.xpath("//div[@id='dhtmlgoodies_mainContainer']//descendant::p//following-sibling::ul");
	By DestUS_xpath=By.xpath("//div[@id='dhtmlgoodies_mainContainer']//descendant::p[.='United States']//following-sibling::ul");
	
	public boolean DragandDropElement(String Source)throws Exception{
		try {
			Thread.sleep(10000);
			List<WebElement> SourseWebList=driver.findElements(SourceList_Xpath);
			WebElement DestUS_WebL=driver.findElement(DestUS_xpath);

			for(WebElement Webelement:SourseWebList) {
				String value=Webelement.getText().trim();
				if(value.equalsIgnoreCase(Source)) {
					
			        JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView();",Webelement );	
					Actions builder=new Actions(driver);
					Thread.sleep(5000);
					builder.dragAndDrop(Webelement,DestUS_WebL).build().perform();
					Thread.sleep(10000);
					return true;					
				}
				
			}

			return false;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	

}
