package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.PageBase;
import Pages.HomePage;

public class TestCases extends PageBase{


	WebDriver driver;
	
	
	
	@Test
	public static void HomePageTest() throws Exception {
		HomePage homepage = new HomePage(PageBase.driver);
		HomePage.AboutTab();		
	}

}
