package MypackagePO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityPO {
	public WebDriver driver;
	public UtilityPO (WebDriver driver) {this.driver=driver;}
	
	public By Signatutetab_xpath=By.xpath("//div[@class='mat-list-item-content']//h3[.=' Signature ']");
	public By email_xpath=By.xpath("(//od-tab-item//div[@class='tab-item'])[3]");
	public By Emailsignaturetogglebtn_xpath=By.xpath("(//label[@class='mat-slide-toggle-label'])[3]");
	public By Placeholderdropdownexpand_xpath=By.xpath("//i[@class='icon-arrow-down']");
	public By Listofoptions_xpath=By.xpath("//ul[@class='chooser-suggestions expanded downside']//following::li//span");
	public By Signatureiframe_xpath=By.xpath("//iframe[@id='emailSignature_ifr']");	
	public By Signaturetext_xpath=By.xpath("//body[@id='tinymce']");
			
	public By Addplaceholdercheckbox_xpath=By.xpath("//small[.='Add PLACEHOLDER']");
	public By Signaturesurveytogglebtn_xpath=By.xpath("(//label[@class='mat-slide-toggle-label'])[4]");
    public By Savebtn_xpath=By.xpath("//button[.=' Save']");
    
    
    public boolean Signatureiframe(String signature) {
    	try {
    		Thread.sleep(5000);
    		driver.switchTo().frame(driver.findElement(Signatureiframe_xpath));
    		WebElement Signaturetext_webl=new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(Signaturetext_xpath));
    		Signaturetext_webl.clear();
    		Signaturetext_webl.sendKeys(signature);
    		driver.switchTo().parentFrame();
    		return true;
    	}
    	catch (Exception e) {
			return  false;
		}
    }
	}
