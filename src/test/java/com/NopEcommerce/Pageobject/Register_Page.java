package com.NopEcommerce.Pageobject;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.NopEcommerce.Basepage.Basepage;

public class Register_Page extends Basepage{
	@FindBy(xpath="//a[contains(text(),'Register')]")
	@CacheLookup
    private WebElement register_link;
	
	@FindBy(id="gender-male")
	@CacheLookup
	private  WebElement Gender;
	
	@FindBy(id="FirstName")
	@CacheLookup
	private WebElement firstname;
	
	@FindBy(id="LastName")
	@CacheLookup
	private WebElement lastname;
	
	@FindBy(name="DateOfBirthDay")
	@CacheLookup
	private WebElement day;
	
	@FindBy(name="DateOfBirthMonth")
	@CacheLookup
	private WebElement month;
	
	@FindBy(name="DateOfBirthYear")
	@CacheLookup
	private WebElement year;
	
	@FindBy(id="Email")
	@CacheLookup
	private WebElement email;
	
	@FindBy(id="Company")
	@CacheLookup
	private WebElement company;
	
	@FindBy(id="Password")
	@CacheLookup
	private WebElement pasword;
	
	@FindBy(id="ConfirmPassword")
	@CacheLookup
	private WebElement ConfirmPassword;
	
	@FindBy(id="register-button")
	@CacheLookup
	private WebElement register_button;
	
	@FindBy(css="div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.registration-result-page div.page-body > div.result")//div[contains(text(),'Your registration completed')]
	@CacheLookup
	private WebElement Your_registration_completed;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	@CacheLookup
	private WebElement  logout;
	
	
	
	
	public Register_Page()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String email_pass;
	
	  
	public void Register()
	{
		 register_link.click();
	}
	public void Gender()
	{
		Gender.click();
	}

	public void first_last_name(String fn,String ln)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
	}
	
	public void date_month_year()
	{
	Select s=new Select(day);
		 s.selectByIndex(5);
		 	  
	Select s1=new Select(month);
		s1.selectByVisibleText("April");
			 
	Select s2=new Select(year);
		s2.selectByValue("1994");
	}
	
	public void  email()
	{
		email_pass=randomeString()+"@gmail.com";
		email.sendKeys(email_pass);
	  
	 }
	public WebElement copied_email()
	{
		  email.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		  return email;
	}
	
	public void company(String compan)
	{
		company.sendKeys(compan);
	}
	public void passwor_confirmpassword(String pass,String conpass)
	{
		pasword.sendKeys(pass);
		ConfirmPassword.sendKeys(conpass);
	}
	
	public void register()
	{
		register_button.click();
	}
	public String verify_message()
	{
		String b= Your_registration_completed.getText();
		return b;
	}
	
	public void logout()
	{
		logout.click();
	}
}
