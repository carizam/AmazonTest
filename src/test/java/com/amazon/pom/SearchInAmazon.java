package com.amazon.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchInAmazon extends Base{
	 
	By searchbox = By.name("field-keywords"); 
	By submit = By.id("nav-search-submit-text");
	By checkbox = By.xpath("//*[@id='p_89/SAMSUNG']//span[@class='a-size-base a-color-base']");
	By listLowest = By.className("a-button-inner");
	By FirstPhone = By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img");
	By car = By.id("add-to-cart-button-ubb");
	
			 
	public SearchInAmazon(WebDriver driver) {
		super(driver);
	}  
	
	public void Search() {
		type("Mobile Phone",searchbox); 
		click(submit); 
		}
	
	public void FilterByBrand() {
		click(checkbox);
	}
	 
	public void SearchByLowest()   { 
		click(listLowest);
	}
	
	public void FirstItem()   {
		click(FirstPhone);
	}
	
	public void addphonecar() {
		click(car);
		
	}

	
}
