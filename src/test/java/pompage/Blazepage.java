package pompage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazepage 
{
	WebDriver driver;
	
	By name=By.name("name");
	By company=By.name("company");
	By regemail=By.name("email");
	By regpass=By.name("password");
	By confirmpass=By.name("password_confirmation");
	By regbutton=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	By login=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
	By logemail=By.name("email");
	By logpass=By.name("password");
	By logbutton=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	
	public Blazepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvaluesregister()
	{
		driver.findElement(name).sendKeys("Abraham");
		driver.findElement(company).sendKeys("Luminar");
		driver.findElement(regemail).sendKeys("abc123@gmail.com");
		driver.findElement(regpass).sendKeys("abcd1234");
		driver.findElement(confirmpass).sendKeys("abcd1234");
	}
	
	public void register()
	{
		driver.findElement(regbutton).click();
	}
	
	public void setvalueslogin()
	{
		driver.findElement(login).click();
		driver.findElement(logemail).sendKeys("abc123@gmail.com");
		driver.findElement(logpass).sendKeys("abcd1234");
	}
	
	public void login()
	{
		driver.findElement(logbutton).click();
	}
}
