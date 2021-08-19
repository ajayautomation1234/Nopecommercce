package com.NopEcommerce.Testcase;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Register_Page;

public class TC_Register_001 extends Basepage{
	Register_Page r;
	public String email;
	
	
	@Test()
	public void register() throws IOException
	{
		 r=new Register_Page();
		 log.info("----user clicked on link-----");
		 
		 r.Register();
		 r.Gender();
		 r.first_last_name("Ajay", "AM");
		 r.date_month_year();
		 r.email();
		 r.company("wipro");
		 r.passwor_confirmpassword("ajay1234", "ajay1234");
		 
		 r.register();
		 log.info("----user clicked on register button-----");
		 
	
		 String actualtext=r.verify_message();
	
	     if(actualtext.equals("Your registration completed"))
	     {
		  Assert.assertTrue(true);
		  System.out.println("successfull verified--"+actualtext);
		  
		  log.info("----user registered Details successfully-----");
		  
		  captureScreen(driver, "sucessfull registere");// we can use it where we can take screenshot
	      }
	     else
	     {
	    	 Assert.assertTrue(false);
	    	 System.out.println("successfully not verified--"+actualtext);
	    	 
	    	  log.info("----user not registered Details successfully-----");
	    	  
	      captureScreen(driver, "failure registered ");
	    	 
	     }
	     
	}
	
	
	
	
	}
		
	   
	   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


