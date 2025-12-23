package com.amazon.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	
	WebDriver driver=null;
	
	@Parameters({"bname"})
	@Test
	public void setUpBrowser(String bname) {
		if(bname.contains("Chrome")){
			ChromeOptions options=new ChromeOptions();
			try {
				driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		else if(bname.contains("Firefox")){
		FirefoxOptions foptions=new FirefoxOptions();
		try {
			driver=new RemoteWebDriver(new URL("http://localhost:4444"),foptions);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		else if(bname.contains("Edge")){
		EdgeOptions eoptions=new EdgeOptions();
		try {
			driver=new RemoteWebDriver(new URL("http://localhost:4444"),eoptions);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	driver.get("https://www.amazon.com");
	
 }
	

	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
