package com.NopEcommerce.Testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Login_page;
import com.NopEcommerce.Pageobject.Search_product;

public class TC_Search_product_006 extends Basepage{
	
	Search_product s;
    Login_page l;
	
	@Test(priority=1)
	public void login_feature()
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
	public void Serch_product_verify_prduct()
	{
		s=new Search_product();
		s.click_electronics_product();
		
    String Actual_Camera_text= s.Search_displayed_camera();
		
	String Dispalyed_camera_text=s.verify_displyedcamera_name();
	
	if(Dispalyed_camera_text.equals(Actual_Camera_text))
	{
		Assert.assertTrue(true);
		System.out.println("elament is matched---------"+true);
	}
	else
	{
		Assert.assertTrue(false);
		System.out.println("elament is not matched---------"+false);
		
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
