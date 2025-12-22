package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	@Test
	void amazonWebSiteTest() {
		System.out.println(home.verifyAmazonPage());
		Assert.assertTrue(home.verifyAmazonPage().contains("Amazon"), "HomePage Title NotMatched"); 
		cart.clickOnCart();
		Assert.assertTrue(cart.verifyAmazonCartPage().contains("Shopping Cart"), "CartPage Title NotMatched");
		cart.navigatetoSign();
	}

}
