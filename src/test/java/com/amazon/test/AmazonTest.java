package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
	WebDriver driver=null;
	@Test
	void amazonWebSiteTest() {
		System.out.println(home.verifyAmazonPage());
		Assert.assertTrue(home.verifyAmazonPage().contains("Amazon"), "HomePage Title NotMatched"); 
		cart.clickOnCart();
		Assert.assertTrue(cart.verifyAmazonCartPage().contains("Shopping Cart"), "CartPage Title NotMatched");
		cart.navigatetoSign();
	}

}
