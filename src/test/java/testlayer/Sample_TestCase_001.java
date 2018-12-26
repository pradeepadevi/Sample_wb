package testlayer;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageLayer.GoogleHomePage;
import PageLayer.GoogleSearchResultsPage;

public class Sample_TestCase_001 extends BaseClass {
	
	static GoogleHomePage objGoogleHomePage;
	static GoogleSearchResultsPage objGoogleSearchResultsPage;
	
	@Test
	public void SearchEmerio() throws InterruptedException
	{
		objGoogleHomePage = new GoogleHomePage();
		objGoogleSearchResultsPage = new GoogleSearchResultsPage();
		
		String url = prop.getProperty("EnterUrl");
		getDriver(url);
		
		Thread.sleep(4000);
		
		implicitWait();
		objGoogleHomePage.getTxtSearch().sendKeys(prop.getProperty("TxtSearch"), Keys.ENTER);
		
		Thread.sleep(5000);
	}

}
