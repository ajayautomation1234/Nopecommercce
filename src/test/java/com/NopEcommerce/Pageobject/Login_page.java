package com.NopEcommerce.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.NopEcommerce.Basepage.Basepage;

public class Login_page extends Basepage{

	@FindBy(xpath="//a[contains(text(),'Log in')]")
	@CacheLookup
	private WebElement login_link;
	
	@FindBy(id="Email")
	@CacheLookup
	private WebElement username;
	
	@FindBy(id="Password")
	@CacheLookup
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	@CacheLookup
	private WebElement loginbuton;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	@CacheLookup
	private WebElement  logout;
	
	
	
	public Login_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void login_link()
	{
		login_link.click();
	}
	
	public void loginPage(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
	}
	
	public void login_feature()
	{
		loginbuton.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
