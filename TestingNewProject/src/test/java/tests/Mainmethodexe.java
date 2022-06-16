package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPack.FbHeader;
import pomPack.LoginPage;

public class Mainmethodexe {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Automation folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/?stype=lo&jlou=AfdbuSVxFSOwmwSenevn_e_0ftMmABP9YviAQT-RTsipLPG9Z519ChJoGZpo_hUHNtsauIJ0Z3HO-zVqcQOMFp95TGOSsn2v4qv4xVgsck5rCg&smuh=46976&lh=Ac_pK1HIQftNL6iCzR4");
		
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.senduserName();
		loginpage.sendpassWordName();
		loginpage.clickLoginbutton(); 
		Thread.sleep(5000);
		
		FbHeader fbHeader = new FbHeader(driver);
		fbHeader.clickonMarketplace();
		Thread.sleep(5000);
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println(url);
		System.out.println(title);
		
		if (url.equals("https://www.facebook.com/marketplace/?ref=app_tab") && title.equals("Facebook Marketplace | Facebook"))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		fbHeader.clickonYourProfile();
		
		fbHeader.clickonLogOut();
		
		 
		
		
		
		
		
		
		
		
		
		
	}

}



