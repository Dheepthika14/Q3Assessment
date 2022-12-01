package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import Base.PageBase;
import Common.BrowserDriver;

public class HomePage {
	public static WebDriver driver=PageBase.driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@id='main_navbar']//a[contains(text(),'About')])[1]")
	private static WebElement AboutTab;
	
	@FindBy(xpath="(//a[contains(text(),'Regulations')])[1]")
	private static WebElement Regulations;
	
	@FindBys(@FindBy(xpath="//li[@class='nav-item dropdown show']//li"))
	private static List<WebElement> AboutLinks;
	
	private static String AboutLinkString ="//li[@class='nav-item dropdown show']//li//a";
	
	private static String RegulationUrl ="(//a[contains(text(),'Regulations')])[1]";
	
	public static void AboutTab() throws Exception {	
		BrowserDriver.MovetoElement(AboutTab, "About Tab");
		BrowserDriver.ClickElement(AboutTab, "About Tab");
		int elementSize = BrowserDriver.getSize(AboutLinkString, "About Tab size");	
		Thread.sleep(5000);
		for(int i=1;i<=elementSize;i++) {
			AboutLinkString="("+AboutLinkString+")["+i+"]";

			if(i==1) 
			{
				BrowserDriver.MovetoElementStr(AboutLinkString, "About Us");
				BrowserDriver.getTextStr(AboutLinkString, "About Us");
			}
			if(i==2) 
				{
				BrowserDriver.MovetoElementStr(AboutLinkString, "Structure & Key Personnel");
				BrowserDriver.getTextStr(AboutLinkString, "Structure & Key Personnel");
				}
			if(i==3) 
				{
				BrowserDriver.MovetoElementStr(AboutLinkString, "Investor Relations");
				BrowserDriver.getTextStr(AboutLinkString, "Investor Relations");
				}
			if(i==4) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Awards and Recognitions");
				BrowserDriver.getTextStr(AboutLinkString, "Awards and Recognitions");
			}
			if(i==5) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Regulations");
				BrowserDriver.getTextStr(AboutLinkString, "Regulations");
			}
			if(i==6) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Event Gallery");
				BrowserDriver.getTextStr(AboutLinkString, "Event Gallery");
			}
			if(i==7) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Media");
				BrowserDriver.getTextStr(AboutLinkString, "Media");
			}
			if(i==8) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Holidays");
				BrowserDriver.getTextStr(AboutLinkString, "Holidays");
			}
			if(i==9) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Careers");
				BrowserDriver.getTextStr(AboutLinkString, "Careers");
			}
			if(i==10) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Contact Us");
				BrowserDriver.getTextStr(AboutLinkString, "Contact Us");
			}
			if(i==11) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE Academy");
				BrowserDriver.getTextStr(AboutLinkString, "NSE Academy");
			}
			if(i==12) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE Clearing");
				BrowserDriver.getTextStr(AboutLinkString, "NSE Clearing");
			}
			if(i==13) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE Data & Analytics");
				BrowserDriver.getTextStr(AboutLinkString, "NSE Data & Analytics");
			}
			if(i==14) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE Foundation");
				BrowserDriver.getTextStr(AboutLinkString, "NSE Foundation");
			}
			if(i==15) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE Indices");
				BrowserDriver.getTextStr(AboutLinkString, "NSE Indices");
			}
			if(i==16) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE International Exchange");
				BrowserDriver.getTextStr(AboutLinkString, "NSE International Exchange");
			}
			if(i==17) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE International Clearing");
				BrowserDriver.getTextStr(AboutLinkString, "NSE International Clearing");
			}
			if(i==18) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSE Investments");
				BrowserDriver.getTextStr(AboutLinkString, "NSE Investments");
			}
			if(i==19) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "NSEIT");
				BrowserDriver.getTextStr(AboutLinkString, "NSEIT");
			}
			if(i==20) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "View All");
				BrowserDriver.getTextStr(AboutLinkString, "View All");
			}
			if(i==21) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Equity Market");
				BrowserDriver.getTextStr(AboutLinkString, "Equity Market");
			}
			if(i==22) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Indices");
				BrowserDriver.getTextStr(AboutLinkString, "Indices");
			}
			if(i==23) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Emerge Platform");
				BrowserDriver.getTextStr(AboutLinkString, "Emerge Platform");
			}
			if(i==24) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Mutual Funds");
				BrowserDriver.getTextStr(AboutLinkString, "Mutual Funds");
			}
			if(i==25) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Equity Derivatives");
				BrowserDriver.getTextStr(AboutLinkString, "Equity Derivatives");
			}
			if(i==26) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Currency Derivatives");
				BrowserDriver.getTextStr(AboutLinkString, "Currency Derivatives");
			}
			if(i==27) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Commodity Derivatives");
				BrowserDriver.getTextStr(AboutLinkString, "Commodity Derivatives");
			}
			if(i==28) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Intrest Rate Derivatives");
				BrowserDriver.getTextStr(AboutLinkString, "Intrest Rate Derivatives");
			}
			if(i==29) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Fixed Income and Debt");
				BrowserDriver.getTextStr(AboutLinkString, "Fixed Income and Debt");
			}
			if(i==30) {
				BrowserDriver.MovetoElementStr(AboutLinkString, "Public Issues");			
				BrowserDriver.getTextStr(AboutLinkString, "Public Issues");			
			}
			
		}
		//BrowserDriver.ClickElement(Regulations, "RegulationTab");//Access Denied page
		BrowserDriver.GetUrl(RegulationUrl, "Regulation URL");//Access Denied page
		
		
		
		
	}

}
