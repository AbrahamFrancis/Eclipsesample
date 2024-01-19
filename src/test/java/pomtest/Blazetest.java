package pomtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pompage.Blazepage;

public class Blazetest 
{
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.blazedemo.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Test
	public void test()
	{
		Blazepage ob=new Blazepage(driver);
		ob.setvaluesregister();
		ob.register();
		
		ob.setvalueslogin();
		ob.login();
	}
}
