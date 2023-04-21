package mavendemopackage;
import org.testng.annotations.Test;

import generic_utility.BaseClass;

public class DemoTest extends BaseClass
{
	@Test
	public void demotest() throws Throwable 
	{
	//1st pull
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");*/
		System.out.println("hello maven");
	}
}
