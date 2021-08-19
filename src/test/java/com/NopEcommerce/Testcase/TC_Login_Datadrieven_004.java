package com.NopEcommerce.Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.NopEcommerce.Basepage.Basepage;
import com.NopEcommerce.Pageobject.Login_page;
import com.NopEcommerce.testdata.XLUtils;


public class TC_Login_Datadrieven_004 extends Basepage{
	
	
Login_page l;
	
	@Test(dataProvider="LoginData")
	public void login_feature(String un,String pw)
	{
		 l=new Login_page();
		 l.login_link();
		 log.info("----user clicked on link-----");
		 
		 l.loginPage(un,pw);
		 log.info("----user entered the username and password-----");
		 
		 l.login_feature();
		 log.info("----user clicked on login button-----");
		 
		 l.logout();
		 log.info("----user clicked on logout button-----");
		 
		 
	}
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/NopEcommerce/testdata/Nopecommerce_datadrieven.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}
	

}
	
	
	
	
	


