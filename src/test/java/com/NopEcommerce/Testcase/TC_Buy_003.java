package com.NopEcommerce.Testcase;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Buy_page;
import com.NopEcommerce.Pageobject.Login_page;

public class TC_Buy_003 extends Basepage{
	
	
	Login_page l;
	Buy_page b;
	
	
	@Test(priority=1)
	public void login()
	{
		 l=new Login_page();
		 l.login_link();
		 log.info("----user clicked on link-----");
		 
		 l.loginPage("ajayam777777@gmail.com", "ajay1234");
		 log.info("----user entered the username and password-----");
		 
		 l.login_feature();
		 log.info("----user clicked on login button-----");
		 }
	
	
	@Test(priority=2)
	public void Buy_feature() throws InterruptedException
	{
		 b=new Buy_page();
		 b.computer();
		 log.info("----user clicked on computer feature link-----");
		 
		 b.desktop();
		 b.position_display();
		 b.addtocart();
		 log.info("----user clicked on add cart-----");
		 
		 b.RAM_HDD_select();
		 b.add_to_cart();
		 log.info("----user successfully added to shopping cart-----");
		 
		 b.shoppingcart();
		 b.termsservice();
		 b.checkout();
		 log.info("----user check out successfully -----");
		 
	     b.newaddress();
	     b.firstname_lastname("ajay", "am");
	     b.email_companay("ajayam1234@gmail.com", "wipro");
		 b.select_country();
		 b.select_city();
		 b.address1_address2("hulimavu someshwara layout 3rd main", "bangalore-76");
		 b.postalcode_phonenumber("560076","9353615291");
		 b.billing_feature();
		 b.shipping_feature();
		 b.payment_feature();
		 b.payment_inforamtion();
		 log.info("----user entered all billing details successfully -----");
		 
		 b.confirm_feature();
		 log.info("----deatails confirmed successfully -----");
		 
		
		 String actualtext=b.verify_successful_message();
		 if(actualtext.equals("Your order has been successfully processed!"))
		 {
			 Assert.assertTrue(true);
			 log.info("----user successfully order product-----");
		 }
		 else
		 {
			 Assert.assertTrue(false);
		 }
		 
		 String actual=b.order_no();
		 log.info("----order number captured successfully-----");
		 
		 System.out.println(actual);
		 
	}
	}






































/*	b.computer.click();
b.desktop.click();

 JavascriptExecutor js = (JavascriptExecutor) driver;
 js.executeScript("window.scrollBy(0,400)");

Select s=new Select(b.position);
s.selectByIndex(1);

Select s1=new Select(b.Dipsplay);
s1.selectByIndex(2);

js.executeScript("arguments[0].click();", b.Addtocart);
 

//Actions actions = new Actions(driver);
//actions.moveToElement(b.Addtocart).click().build().perform();



Thread.sleep(3000);


js.executeScript("window.scrollBy(0,400)");



Select s2=new Select(b.Ram_select);
try {
s2.selectByIndex(1);
}catch(StaleElementReferenceException e)
{
	   s2.selectByIndex(1);
}

b.HDD_select.click();

b.add_to_cart.click();

js.executeScript("window.scrollBy(0,-400)");

b.shopping_cart.click();

WebDriverWait wait=new WebDriverWait(driver,40);
wait.until(ExpectedConditions.elementToBeClickable(b.terms_service)).click();

//b.terms_service.click();

b.chekout.click();

  
Select s4=new Select(b.Newaddress);   
s4.selectByIndex(2);

b.firstname.sendKeys("ajay");
b.lastname.sendKeys("kumar");
b.Email.sendKeys("ajayam1234@gmail.com");
b.company.sendKeys("infosys");

Thread.sleep(2000);

for(int i=0;i<4;i++)
{
try
{
Select s3=new Select(b.select_country);
 s3.selectByVisibleText("India");
 break;
}catch(StaleElementReferenceException e)
{
	
System.out.println(e);


}
}

js.executeScript("document.getElementById('BillingNewAddress_City').value='bangalore';");

b.Address1.sendKeys("hulimavu someshware layout");
b.address2.sendKeys("hulimavu bangalore");
b.postalcode.sendKeys("560076");
b.honenumber.sendKeys("9353615291");

b.billing.click();

Thread.sleep(3000);

js.executeScript("arguments[0].click();", b.shipping);
System.out.println("shipping");
Thread.sleep(2000);
    
js.executeScript("arguments[0].click();", b.payment_method);

System.out.println("payument method");
Thread.sleep(3000);


//b.credit.click();

Thread.sleep(2000);

WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/form[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/input[1]"));

js.executeScript("arguments[0].click();", element);

//wait.until(ExpectedConditions.elementToBeClickable(b.master)).click();


Thread.sleep(2000);


js.executeScript("arguments[0].click();", b.payment_information);

System.out.println("payment information");

js.executeScript("arguments[0].click();", b.confirm);

System.out.println("confirm");



System.out.println("alert acepted");

String actual_text=b.verify.getText();
String expect_text="Your order has been successfully processed!";

if(actual_text.equals(actual_text))
{
	Assert.assertTrue(true);
	System.out.println("successfully text catured");
}
else
{
	Assert.assertTrue(false);
	System.out.println("not successfully text catured");

}


String orderno=b.orderno.getText();

System.out.println("successfully order no capture"+orderno);


*/	
