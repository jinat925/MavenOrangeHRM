package com.orangehrm.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.objectrepository.Homepage;
import com.orangehrm.objectrepository.Loginpage;

public class Baseclass {
	static {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");
	}

	public static WebDriver driver;
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open browser",true);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public  void Login() throws IOException {
		//Reporter.log("Login application",true);
		FileLib f =new FileLib();
		String url = f.getpropertyvalue("url");
		String un = f.getpropertyvalue("username");
		String pw = f.getpropertyvalue("password");
		driver.get(url);
		Loginpage l=new Loginpage(driver);
		
		l.setlogin(un,pw);

	}
	
	
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout Application",true);
		Homepage h= new Homepage(driver);
		h.setlogout();
		
		
	}
	
	@AfterClass
	public void closebrowser() {
		//Reporter.log("Close Browser",true);
		driver.close();
	}
	
	
	
}
