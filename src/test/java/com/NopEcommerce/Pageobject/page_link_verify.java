package com.NopEcommerce.Pageobject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NopEcommerce.Basepage.Basepage;

public class page_link_verify extends Basepage{
	
	@FindBy(tagName ="a")
	private List<WebElement> link; 
	
	
     public page_link_verify()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verify_link()
	{ 
		driver.navigate().refresh();
		int size=link.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			WebElement e1=link.get(i);
			String linkverify=e1.getAttribute("href");
			
			try
	        {
	            URL url = new URL(linkverify);

	            //Now we will be creating url connection and getting the response code
	            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
	            httpURLConnect.setConnectTimeout(5000);
	            httpURLConnect.connect();
	            if(httpURLConnect.getResponseCode()>=400)
	            {
	            	System.out.println(linkverify+" - "+httpURLConnect.getResponseMessage()+"is a broken link");
	            }    
	       
	            //Fetching and Printing the response code obtained
	            else{
	                System.out.println(linkverify+" - "+httpURLConnect.getResponseMessage()+"link is working ");
	            }
	        }catch (Exception e) {
	      }
	   }
			
			
			
			
		}
		
		
		
		
	}
	


