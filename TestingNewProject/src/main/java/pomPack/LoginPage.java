package pomPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (xpath = "//input[@name='email']")
     private WebElement userName;
	
	@FindBy (xpath = "//input[@type='password']")
    private WebElement passWord;
	
	@FindBy (xpath = "//button[@name='login']")
    private WebElement LoginButton;
	
	
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void senduserName() {
		userName.sendKeys("sagar.gunturkar@rediffmail.com");
		
	}
	
	public void sendpassWordName() {
		passWord.sendKeys("9420072061");
	}
	
	public void clickLoginbutton() {
		LoginButton.click();
	}
		
	
	}
