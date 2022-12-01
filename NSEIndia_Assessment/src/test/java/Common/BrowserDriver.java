package Common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import Base.PageBase;

public class BrowserDriver {
	public static WebDriver driver=PageBase.driver;

	public BrowserDriver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

	public static void MovetoElement(WebElement element, String elementName) {
		Actions act = new Actions(driver);
		try {
			act.moveToElement(element).perform();	
			PageBase.test.log(Status.PASS,"Element : "+elementName);
		}catch(Exception e) {
			PageBase.test.log(Status.FAIL,"Element not : "+elementName);
		}
	}
	
	public static void MovetoElementStr(String element, String elementName) {
		Actions act = new Actions(driver);
		try {
			act.moveToElement(driver.findElement(By.xpath(element))).perform();	
			PageBase.test.log(Status.PASS,"Element : "+elementName);
		}catch(Exception e) {
			PageBase.test.log(Status.FAIL,"Element not : "+elementName);
		}
	}
	public static void ClickElement(WebElement element, String elementName) {
		try {			
			element.click();
			PageBase.test.log(Status.PASS,"Element clicked : "+elementName);
		}catch(Exception e) {
			PageBase.test.log(Status.FAIL,"Element not clicked : "+elementName);
		}
	}
	
	public static void ClickElementStr(String element, String elementName) {
		try {
			System.out.println("element : "+element);
			driver.findElement(By.xpath(element)).click();
			PageBase.test.log(Status.PASS,"Element clicked : "+elementName);
		}catch(Exception e) {
			PageBase.test.log(Status.FAIL,"Element not clicked : "+elementName);
			System.out.println(e);
		}
	}
	
	public static void NavigateBack() {
		driver.navigate().back();
	}
	
	public static void ThreadWait(int Seconds) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(Seconds));
	}

	public static void getTextStr(String element, String elementName) {
		Actions act = new Actions(driver);
		try {
			act.moveToElement(driver.findElement(By.xpath(element))).perform();
			String elementText=driver.findElement(By.xpath(element)).getText();
			if ((elementText).equals(elementName)){
				PageBase.test.log(Status.PASS,"Text Assertion passes : "+elementName);
			}else {
				PageBase.test.log(Status.FAIL,"Text Assertion failed : "+elementName+" The site Text : "+elementText);
			}
		}catch(Exception e) {
			PageBase.test.log(Status.FAIL,"Text Element not found : "+elementName);
		}

	}

	public static int getSize(String element, String elementName) {
		int elementSize = driver.findElements(By.xpath(element)).size();
		return elementSize;
	}
	public static void GetUrl(String element, String elementname) {	
		driver.get(driver.findElement(By.xpath(element)).getAttribute("href"));
	}
	
	
}
