package IntegrationTest;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntegrationTests {
	
	WebDriver driver;
	String baseURL, nodeURL;

@BeforeTest
	public void setUp() throws MalformedURLException 
    {
	System.out.println("getClass "+this.getClass());
	System.out.println("System.getProperty(testSuite) "+System.getProperty("testSuite")); 
	System.out.println("System.getProperty(testSuite) "+System.getProperty("surefire.suiteXmlFiles"));
	
	baseURL = "http://52.66.34.243:9999/MyDevPipeline/";
	nodeURL = "http://13.233.192.185:4444/wd/hub";
	DesiredCapabilities capability = DesiredCapabilities.chrome(); 
	capability.setBrowserName("chrome");
	capability.setPlatform(Platform.LINUX);
	driver = new RemoteWebDriver(new URL(nodeURL), capability);
	}

@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}
@Test
	public void sampleTest() 
	{
		driver.get(baseURL);
		System.out.println("driver.getTitle() "+driver.getTitle());
		System.out.println("driver.getTitle().contains(\"DevOps Registration Form\") "+driver.getTitle().contains("DevOps Registration form"));
		if (driver.getTitle().contains("DevOps Registration form")) 
		{
			AssertJUnit.assertTrue("DevOps Registration form", true);
		} 
		
		else 
		{
			AssertJUnit.assertTrue("Failed: DevOps Registration form",false);
		}
	}
}
