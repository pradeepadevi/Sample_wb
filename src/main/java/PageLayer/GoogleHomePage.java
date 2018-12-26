package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class GoogleHomePage extends BaseClass {

	public GoogleHomePage()
	{
		//initializing the driver for elements in GoogleHomePage
		PageFactory.initElements(driver, this);
	}
	
	//finding elements
	@FindBy(css="input[type='text'][title='Search']")
	private WebElement txtSearch;

	//fetching elements
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	
}
