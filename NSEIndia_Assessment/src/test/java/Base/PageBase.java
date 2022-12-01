package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;

import Pages.HomePage;

public class PageBase {
	public static WebDriver driver;
	public static String browsername;
	public static  Properties prop = new Properties();
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@Parameters("browsername")
	@BeforeSuite
	public static void BrowserInitialisation(@Optional("chrome") String browsername) throws Exception {
		report = new ExtentSparkReporter("Execution_results.html");
		extent = new ExtentReports();
		extent.attachReporter(report);
		test = extent.createTest("NSE INDIA");
		InputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/Config/config.properties");
		prop.load(input);	
		//browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}
	
	@BeforeTest
	public static void GetUrl() {
		driver.get(prop.getProperty("url"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		test.log(Status.INFO, "URL Launched");
	}
	
	
	@AfterSuite
	public static void teardown() throws Exception {
		extent.flush();
		driver.quit();
	}
	
	
	

}
