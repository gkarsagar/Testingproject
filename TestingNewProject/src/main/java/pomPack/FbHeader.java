package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbHeader {
	
	@FindBy (xpath = "//a[@aria-label='Home']") 
	private WebElement Home;
	
	@FindBy (xpath = "//a[@aria-label='Watch']")
	private WebElement Watch;
	
	@FindBy (xpath = "//a[@aria-label='Marketplace']")
	private WebElement Marketplace;
	
	
	@FindBy (xpath = "//a[@aria-label='Groups']")
	private WebElement Groups;
	
	@FindBy (xpath = "//a[@aria-label='More']")
	private WebElement More;
	
	
	@FindBy (xpath = "//div[@aria-label='Your profile']")
	private WebElement YourProfile;
	
	@FindBy (xpath = "//span[text()='Log Out']")
	private WebElement LogOut;
	
	public FbHeader (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonHome () {
		Home.click();
		
	}
	
	public void clickonWatch() {
		Watch.click();
	}
	public void clickonMarketplace() {
		Marketplace.click();
	}
	
    public void clickonGroups() {
    	Groups.click();
    }
    public void clickonMore() {
    	More.click();
    }
    public void clickonYourProfile() {
    	YourProfile.click();
    }
	public void clickonLogOut() {
		LogOut.click();
	}
	
	
}
