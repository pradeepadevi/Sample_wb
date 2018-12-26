package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class GoogleSearchResultsPage extends BaseClass {

	public GoogleSearchResultsPage()
	{
		//initializing the driver for elements in google search results page
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="a[href$='emeriocorp.com/'][href^='https']")
	private WebElement resultClkLnk;

	public WebElement getResultClkLnk() {
		return resultClkLnk;
	}
	
	
}
