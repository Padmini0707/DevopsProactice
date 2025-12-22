package com.amazon.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.amazon.page.CartPage;
import com.amazon.page.HomePage;

public class BaseTest {

	 static WebDriver driver=null;
	HomePage home=null;
	CartPage cart=null;
	
	@BeforeClass
	public void setUpBrowser() {
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		
		home=new HomePage(driver);
		cart=new CartPage(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
