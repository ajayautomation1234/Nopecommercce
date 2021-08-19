package com.NopEcommerce.Pageobject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NopEcommerce.Basepage.Basepage;

public class Buy_page extends Basepage{

	@FindBy(xpath="//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	private WebElement computer;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
	@CacheLookup
	private WebElement desktop;
	
	@FindBy(id="products-orderby")
	@CacheLookup
	private WebElement position;
	
	@FindBy(id="products-pagesize")
	@CacheLookup
	private WebElement Dipsplay;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
	@CacheLookup
	private WebElement Addtocart;
	
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[7]/dl[1]/dd[2]/select[1]")
	@CacheLookup   
	private WebElement Ram_select;
	
	@FindBy(css="#product_attribute_3_6")
	@CacheLookup
	private WebElement HDD_select;
	
	@FindBy(css="#add-to-cart-button-1")
	@CacheLookup
	private WebElement add_to_cart;
	
	@FindBy(css="body:nth-child(2) div.bar-notification-container:nth-child(5) > div.bar-notification.success")
	@CacheLookup
	private WebElement bar_notification_success;
	
	@FindBy(xpath="//span[contains(text(),'Shopping cart')]")
	@CacheLookup
	private WebElement shopping_cart;
	
	@FindBy(id="termsofservice")
	@CacheLookup
	private WebElement terms_service;
	
	@FindBy(id="checkout")
	@CacheLookup
	private WebElement chekout;
	
	@FindBy(xpath="//select[@id='BillingNewAddress_CountryId']")
	@CacheLookup
	private WebElement select_country;
	
	@FindBy(id="BillingNewAddress_StateProvinceId")
	@CacheLookup
	private WebElement state;
	
	@FindBy(id="BillingNewAddress_City")
	@CacheLookup
	private WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	@CacheLookup
	private WebElement Address1;
	
	@FindBy(id="BillingNewAddress_Address2")
	@CacheLookup
	private WebElement address2;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	@CacheLookup
	private WebElement postalcode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	@CacheLookup
	private WebElement honenumber;
	
	@FindBy(name ="save")
	@CacheLookup
	private WebElement billing;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
	@CacheLookup
	private WebElement shipping;
	
	@FindBy(name="save")
	@CacheLookup
	private WebElement payment_method;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
	@CacheLookup
	private WebElement payment_information;
	
	@FindBy(xpath="//button[contains(text(),'Confirm')]")
	@CacheLookup
	private WebElement confirm;
	
	@FindBy(xpath="//strong[contains(text(),'Your order has been successfully processed!')]")
    @CacheLookup
    private WebElement verify;  //Your order has been successfully processed!
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]")
	@CacheLookup
	private WebElement orderno;
	
	
	@FindBy(xpath="//select[@id='billing-address-select']")
	@CacheLookup
	private WebElement Newaddress;
	

	@FindBy(id="BillingNewAddress_FirstName")
	@CacheLookup
	private WebElement firstname;
	

	@FindBy(id="BillingNewAddress_LastName")
	@CacheLookup
	private WebElement lastname;
	

	@FindBy(id="BillingNewAddress_Email")
	@CacheLookup
	private WebElement Email;
	

	@FindBy(id="BillingNewAddress_Company")
	@CacheLookup
	private WebElement company;
	
	@FindBy(css="//label[contains(text(),'Credit Card')]")
	@CacheLookup
	private WebElement credit;
	
	@FindBy(xpath="/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/input[1]")
    @CacheLookup
    private WebElement master;
	
	
	
	
	
	
	public  Buy_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	JavascriptExecutor js;
	WebDriverWait wait=new WebDriverWait(driver,40);
	
	public void computer()
	{
		computer.click();

	}
	public void desktop()
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		desktop.click();
   
	}
	public void position_display()
	{
		Select s=new Select(position);
		s.selectByIndex(1);
		
		Select s1=new Select(Dipsplay);
		s1.selectByIndex(2);
	}
	
	public void addtocart()
	{
		js.executeScript("arguments[0].click();",Addtocart);
		
		
	}
	
    public void RAM_HDD_select()
	{  
    	wait.until(ExpectedConditions.visibilityOfAllElements(Ram_select));
		
		 Select s2=new Select(Ram_select);
	            s2.selectByIndex(1);
	     
	        HDD_select.click();
	        
	  js.executeScript("window.scrollBy(0,400)");     
	}
	public void add_to_cart() 
	{
  	wait.until(ExpectedConditions.elementToBeClickable(add_to_cart)).click();
	
    }
	public void shoppingcart()
	{  
		//js.executeScript("window.scrollBy(0,-400)");
		shopping_cart.click();
	}
	
	public void  termsservice()
	{
	   js.executeScript("window.scrollBy(0,400)");
		wait.until(ExpectedConditions.elementToBeClickable(terms_service)).click();
	}
	public void checkout()
	{
		chekout.click();
	}
	
	public void newaddress()
	{
		Select s=new Select(Newaddress);   
		s.selectByIndex(1);	
	}
	public void firstname_lastname(String fn,String ln)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
	}
	public void email_companay(String mail,String companay)
	{
		Email.sendKeys(mail);
		company.sendKeys(companay);
		
	}
	public void select_country()
	{
		for(int i=0;i<4;i++)
		{
		try
		{
		Select s=new Select(select_country);
		 s.selectByVisibleText("India");
		 break;
		}catch(StaleElementReferenceException e)
		{
			
		System.out.println(e);
	
	
		}
	}
		
	}
	public void select_city()
	{
		js.executeScript("document.getElementById('BillingNewAddress_City').value='bangalore';");
	}
	
	public void address1_address2(String add1,String add2)
	{
		Address1.sendKeys(add1);
		address2.sendKeys(add2);
	}
	public void postalcode_phonenumber(String post,String phone)
	{  postalcode.sendKeys(post);
	
	   honenumber.sendKeys(phone);     
	}
	public void billing_feature()
	{
		billing.click();
	}
	public void shipping_feature()
	{
	js.executeScript("arguments[0].click();", shipping);
	}
	
	public void payment_feature()
	{
		js.executeScript("arguments[0].click();", payment_method);
		System.out.println("payument method");
		wait.until(ExpectedConditions.elementToBeClickable(master)).click();
	
		
    }
	public void payment_inforamtion()
	{
		js.executeScript("arguments[0].click();", payment_information);
		System.out.println("payment information");
	}
	
	public void confirm_feature()
	{
		js.executeScript("arguments[0].click();", confirm);
		System.out.println("confirm feature");
	}
	public String verify_successful_message()
	{
	String text=verify.getText();
	return text;
	}
    public String order_no()
    {
     String order=orderno.getText();
    return order;
    }
}
