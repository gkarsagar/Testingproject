package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPack.FbHeader;
import pomPack.LoginPage;

public class VerifyAppHeader2 {
	
		
		WebDriver driver;//declaring driver global
		FbHeader fbHeader;
		LoginPage loginpage;
		@BeforeClass
		public void launchthebrowser() { 
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Automation folder\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();//global variable initialization
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
			driver.get("https://www.facebook.com/?stype=lo&jlou=AfdbuSVxFSOwmwSenevn_e_0ftMmABP9YviAQT-RTsipLPG9Z519ChJoGZpo_hUHNtsauIJ0Z3HO-zVqcQOMFp95TGOSsn2v4qv4xVgsck5rCg&smuh=46976&lh=Ac_pK1HIQftNL6iCzR4");
			
		}  
		
		@BeforeMethod 
		public void logintoFb () {
			
			driver.get("https://www.facebook.com/?stype=lo&jlou=AfdbuSVxFSOwmwSenevn_e_0ftMmABP9YviAQT-RTsipLPG9Z519ChJoGZpo_hUHNtsauIJ0Z3HO-zVqcQOMFp95TGOSsn2v4qv4xVgsck5rCg&smuh=46976&lh=Ac_pK1HIQftNL6iCzR4");
		    loginpage = new LoginPage(driver);
			loginpage.senduserName();
			loginpage.sendpassWordName();
			loginpage.clickLoginbutton();
		    fbHeader = new FbHeader(driver);
			
			
		}
		
		@Test
		public void verifyGroups() {
			fbHeader.clickonMarketplace();
			
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
			
		}
		
		
		
		@Test
		public void verifyMore() throws InterruptedException {
			Thread.sleep(5000);
			fbHeader.clickonWatch();
			
			String url = driver.getCurrentUrl();
			String title = driver.getTitle();
			System.out.println(url);
			System.out.println(title);
			
			if (url.equals("https://www.facebook.com/marketplace/?ref=app_tab") && title.equals("Watch | Facebook"))
			{
				System.out.println("Pass");
			}
			else 
			{
				System.out.println("Fail");
			}
			
		}
		 
		@AfterMethod 
		public void logoutfromFb() {
			fbHeader.clickonYourProfile();
			
			fbHeader.clickonLogOut();
		}
		
		
		
		@AfterClass
		public void alpha() {
			
			driver.close();
		}

	}



	


