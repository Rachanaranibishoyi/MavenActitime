package com.generics.actitime;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.pom.actitime.HomePage;
import com.pom.actitime.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;	
//	@Parameters("browser")
	
	@BeforeClass
	public void setup()
	{
		/*
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
		 * 
		 * else if (browser.equalsIgnoreCase("edge")) {
		 * WebDriverManager.edgedriver().setup(); driver=new EdgeDriver(); }
		 * 
		 * else { WebDriverManager.firefoxdriver().setup(); driver=new FirefoxDriver();
		 * }
		 */
		
		WebDriverManager.chromedriver().setup(); 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	@BeforeMethod
	public void logintoapp() throws InterruptedException, IOException 
	{
		
		LoginPage login=new LoginPage(driver);
		login.loginMethod();
	}
	@AfterMethod
	public void logout() 
	{
		HomePage hom=new HomePage(driver);
		hom.logoutMethod();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
	

