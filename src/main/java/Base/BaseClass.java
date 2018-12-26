package Base;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;

public class BaseClass {

	   public static Properties prop;
	   public static ExtentReports extent;
	   public static WebDriver driver;
	   
	@BeforeSuite
	public static void BeforeSuite()
	{
       prop = new Properties();
		
		try {
			
			FileInputStream in = new FileInputStream("src\\main\\java\\Config\\config.properties");
			prop.load(in);
		} 
	      catch (IOException e) {
	
			e.printStackTrace();
		}
	}
	
    @Parameters("browsername")
	@BeforeTest
	public static void initializeDriver(String browsername) {
			
	if(browsername.equalsIgnoreCase("chrome"))
	{
			System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
			driver=new ChromeDriver();	
	}
	else if(browsername.equalsIgnoreCase("Safari"))
	{
	    	 driver=new SafariDriver();
	    	
    }
	else if (browsername.equalsIgnoreCase("firefox"))
    { 
   	System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
 		driver=new FirefoxDriver();
 			 
    }
   }
    
   public static void getDriver(String url)
   {
    	driver.get(url);
     
        driver.manage().window().maximize();
     
   }
   
   public static void implicitWait()
   {
   	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   }
   
   @AfterTest
	public static void quitDriver()
	{
	    driver.quit();
	}
	
	@AfterSuite
	public static void afterSuite()
	{
		System.out.println("Test Run completed");
	}
	
    
}
