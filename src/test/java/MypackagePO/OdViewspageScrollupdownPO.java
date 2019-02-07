package MypackagePO;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OdViewspageScrollupdownPO {
	public WebDriver driver;
	public OdViewspageScrollupdownPO (WebDriver driver) {
		this.driver=driver;
		}
	
	
	By pages_xpath=By.xpath("//span[@class='ui-paginator-pages']//child::a");
	
	//verify Views page scroll down and navigate to the other pages
	 public boolean Scrollupdown(String pageNo)throws Exception {
		 try {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
				Thread.sleep(5000);
				 //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				 List<WebElement> list=driver.findElements(pages_xpath);
				 for(WebElement webwl:list) {
					String value= webwl.getText().trim();
					 js.executeScript("arguments[0].scrollIntoView();", webwl);
					if(value.equals(pageNo)){
						System.out.println(value);
						Thread.sleep(5000);
						webwl.click();
						String url=driver.getCurrentUrl();
						 System.out.println(url);
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
	 
