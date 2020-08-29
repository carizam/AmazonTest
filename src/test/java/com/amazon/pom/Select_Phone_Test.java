package com.amazon.pom;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Select_Phone_Test {  
	
	private WebDriver driver; 
	SearchInAmazon searchInAmazon;

	@Before
	public void setUp() throws Exception {
		searchInAmazon  = new SearchInAmazon(driver);
		driver = searchInAmazon.chromeDriverConnection();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit(); 
	}

	@Test
	public void test() throws InterruptedException   {
		searchInAmazon.Search();  
		searchInAmazon.FilterByBrand();
		searchInAmazon.SearchByLowest();
		searchInAmazon.FirstItem();	
		searchInAmazon.addphonecar();
		Thread.sleep(200);
	}
	 

}

