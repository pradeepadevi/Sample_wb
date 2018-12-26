package testlayer;

import org.testng.annotations.Test;

import Base.BaseClass;
import PageLayer.GoogleSearchResultsPage;

public class Sample_TestCase_002 extends BaseClass {
	
	static GoogleSearchResultsPage objGoogleSearchResultsPage;
	
	@Test
	public void NavigateToEmerio() throws InterruptedException
	{
		objGoogleSearchResultsPage = new GoogleSearchResultsPage();
		
		implicitWait();
		objGoogleSearchResultsPage.getResultClkLnk().click();
		
		Thread.sleep(8000);
		
	}

}
