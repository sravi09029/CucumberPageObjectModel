package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class CarGuideHomePageLocators {

	//search key
	@FindBy(how = How.XPATH, using = "//input[@id='cgsearch']") 
	public WebElement searchkey;
	
	//search button
	@FindBy(how = How.XPATH, using = "//div[@class='search-input desktop']//a[@class='cgsearch-icon']//*[local-name()='svg']") 
	public WebElement searchbutton;
	
	//select my car button
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Sell my car']")
	public WebElement sellMyCar;
	
	//myshortlist
	@FindBy(how = How.XPATH, using = "//span[normalize-space()='My Shortlist']")
	public WebElement MyShortList;  
	
	//signin/signup
	@FindBy(how = How.XPATH, using = "//span[@class='uhf-logged-out-show uhf-user-label']")
	public WebElement signInsignUP;
	
	@FindBy(how = How.XPATH, using = "//a[@class='link uhf-sign-up']")
	public WebElement SignUp;
	
	@FindBy(how = How.XPATH, using = "//a[@class='link uhf-sign-in']")
	public WebElement SignIn;
	
	@FindBy(how = How.XPATH, using = "//li[@class='uhf-nav-child-item']//a[@target='_blank'][normalize-space()='Manage My Ad']")
	public WebElement ManageMyAd;
	
	//Buy+sell linst
	@FindBy(how = How.LINK_TEXT, using = "buy + sell")
	public WebElement BuySellLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Search Cars")
	public WebElement SearchCarsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Used")
	public WebElement UsedLink;
	
	@FindBy(how = How.LINK_TEXT, using = "New")
	public WebElement NewLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Find a Dealer")
	public WebElement FindaDealerLink;
	
	@FindBy(how = How.LINK_TEXT, using = "What car should I buy?")
	public WebElement WhatcarshouldIbuyLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Sell my car")
	public WebElement SellmycarLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Manage My Ad")
	public WebElement ManageMyAdLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Car Selling Tips")
	public WebElement CarSellingTipsLink;
	
	//reviews list
	@FindBy(how = How.LINK_TEXT, using = "reviews")
	public WebElement reviewsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "All reviews")
	public WebElement AllreviewsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Family")
	public WebElement FamilyLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Adventure")
	public WebElement AdventureLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Tradies")
	public WebElement TradiesLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Compare cars")
	public WebElement ComparecarsLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Used cars")
	public WebElement UsedcarsLink;
	
	@FindBy(how = How.XPATH, using = "//p[@class='guide-title']")
	public WebElement BuyingGuides;

	@FindBy(how = How.LINK_TEXT, using = "SUV")
	public WebElement SUVLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Ute")
	public WebElement UteLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Hybrid")
	public WebElement HybridLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Hatchback")
	public WebElement HatchbackLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Electric")
	public WebElement ElectricLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Sedan")
	public WebElement SedanLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Wagon")
	public WebElement WagonLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Coupe")
	public WebElement CoupeLink;
	
	@FindBy(how = How.LINK_TEXT, using = "People mover")
	public WebElement PeoplemoverLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Convertible")
	public WebElement ConvertibleLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Commerical")
	public WebElement CommericalLink;  
	
	//News Link list
	@FindBy(how = How.LINK_TEXT, using = "news")
	public WebElement NewsLink;
	
	
	//advice list
	@FindBy(how = How.LINK_TEXT, using = "advice")
	public WebElement adviceLink;
	
	//price speces
	@FindBy(how = How.LINK_TEXT, using = "pricing + specs")
	public WebElement pricingSpecsLink;
	
	//guides
	@FindBy(how = How.LINK_TEXT, using = "guides")
	public WebElement guidesLink;
	
	//Make drpdown
	@FindBy(how = How.XPATH, using = "//input[@id='uhf-make']")
	public WebElement Makedropdown; 
	
	//Model Dropdown
	@FindBy(how = How.XPATH, using = "//input[@id='uhf-model']")
	public WebElement Modeldropdown;
	
	
}
