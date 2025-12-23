package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonParallelTest {
	//
	static WebDriver driver=null;
	
	@Parameters({"bname"})
	@Test
	void amzonUrl(String bname) {

		if (bname.contains("Chrome")) 
		{
				driver = new ChromeDriver();
			
		}

		else if (bname.contains("Firefox")) {
			driver = new FirefoxDriver();
		} 
		else if (bname.contains("Edge")) {
			driver = new EdgeDriver();
		}

		driver.get("https://www.amazon.com");
	}
}
