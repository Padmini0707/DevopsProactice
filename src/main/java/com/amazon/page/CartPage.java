package com.amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	private WebDriver driver;
	public CartPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-cart-count-container")
	WebElement cartButton;
	
	@FindBy(id="a-autoid-0-announce")
	WebElement sign;
	
	
	public void clickOnCart() {
		cartButton.click();
	}
	
	public void navigatetoSign() {
		sign.click();
	}
	
	public String verifyAmazonCartPage() {
		return driver.getTitle();
	}

}
