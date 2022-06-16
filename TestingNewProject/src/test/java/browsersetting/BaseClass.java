package browsersetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass  {
	
	public static WebDriver openChromeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\automation fol\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    return driver;
	}
	public static WebDriver openedgeBrowser() {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Auto2\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver = new EdgeDriver();
	    return driver;
	    
	}
	
	
	
	
	
	
	
	

}
