package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarPageLocators {
	
	  //AnyMAke drop down
		@FindBy(how = How.XPATH, using = "//select[@id='makes']")
		public WebElement selectCarAnyMakedropdown;
		
		//Any Card model
		@FindBy(how = How.XPATH, using = "//select[@id='models']")
		public WebElement selectcarAnyModeldropdown;
		
		//Any car Locatoon
		@FindBy(how = How.XPATH, using = "//select[@id='locations']")
		public WebElement selectCarAnyLocationdropdown;
		
		//price drop down
		@FindBy(how = How.XPATH, using = "//select[@id='priceTo']")
		public WebElement selectCarPricedropdown;
		
		//FInd My Next Car
		@FindBy(how = How.XPATH, using = "//input[@id='search-submit']")
		public WebElement findMyNextCar;
		
		//MITSUBISHI
		@FindBy(how = How.LINK_TEXT, using = "MITSUBISHI")
		public WebElement MITSUBISHIink;
}
