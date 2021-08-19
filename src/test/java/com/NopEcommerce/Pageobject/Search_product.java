package com.NopEcommerce.Pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NopEcommerce.Basepage.Basepage;

public class Search_product extends Basepage {
	
	@FindBy(xpath="//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
	@CacheLookup
	private WebElement Electronic;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	private WebElement camera;
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
	@CacheLookup
	private WebElement Nickon_camera;
	@FindBy(id="small-searchterms")
	@CacheLookup
	private WebElement serch_box;
	
	@FindBy(xpath="//body/div[6]/div[1]/div[2]/div[2]/form[1]/button[1]")
	@CacheLookup
	private WebElement Search;
	
	@FindBy(xpath="//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
	@CacheLookup
	private WebElement Displayed_product;
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	public Search_product()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_electronics_product()
	{
		Electronic.click();
		camera.click();
		js.executeScript("window.scrollBy(0,400)");
	}
	public String Search_displayed_camera()
	{
		String Camera_text=Nickon_camera.getText();
		
		serch_box.sendKeys(Camera_text);
		
		Search.click();
		
		return Camera_text;
	}
	public String verify_displyedcamera_name()
	{
		js.executeScript("window.scrollBy(0,400)");
		
		String camera_text=Displayed_product.getText();
		return camera_text;
		
	}
	
	
	
	
	
	
	
	

}
