package generic_utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BaseClass 
{
	public WebDriver driver;
	
	@BeforeSuite
	public void BS() 
	{
		System.out.println("Database connection");
	}
	
	@BeforeTest
	public void BT() 
	{
		System.out.println("parallel execution");
	}

	@BeforeClass
	public void BC() throws Throwable
	{
		
		System.out.println("launching the browser");
		
	}
	
	@BeforeMethod
	public void BM() throws Throwable
	{
		System.out.println("login to application");
	}
	
	@AfterMethod
	public void AM() 
	{
		System.out.println("logout of application");
	}
	
	@AfterClass
	public void AC() 
	{
		//driver.quit();
		System.out.println("close the browser");	
	}
	
	@AfterTest
	public void AT() 
	{
		System.out.println("parallel execution done ");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("database connection close ");
	}
}
