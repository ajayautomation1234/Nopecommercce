package com.NopEcommerce.Testcase;

import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.page_link_verify;

public class TC_Page_link_verify_005 extends Basepage {
	
    @Test
	public void link_verify()
	{
    	page_link_verify p=new page_link_verify();
    	p.verify_link();
		
	}
	}
