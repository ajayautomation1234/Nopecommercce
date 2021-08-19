package com.NopEcommerce.Testcase;

import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Login_page;
import com.NopEcommerce.Pageobject.Register_Page;

public class TC_Login_002 extends Basepage{
	
	Login_page l;
	Register_Page r;
	
	
	@Test
	public void login_feature()
	{
		 l=new Login_page();
		 r=new Register_Page();
		 l.login_link();
		 log.info("----user clicked on link-----");
		 
		 l.loginPage(r.email_pass, "ajay1234");
		 log.info("----user entered the username and password-----");
		 
		 l.login_feature();
		 log.info("----user clicked on login button-----");
		 
		 l.logout();
		 log.info("----user clicked on logout button-----");
		 
		 
	}

}
