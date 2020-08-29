/*package com.amazon;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {
	
	private WebDriver driver; 
	
	//private final String checkbox_class_name = "a-icon a-icon-checkbox"; tener en cuebta
	
	@Before
	public void setUp() { 
		
		//Esto ya
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	}
	
	@Test
	public void testAmazonPage() {
		
		//By searchbox = By.name("field-keywords");
		WebElement searchbox = driver.findElement(By.name("field-keywords"));

		searchbox.clear();
		searchbox.sendKeys("Mobile Phones");
		searchbox.submit();
	
		WebElement Samsungchkbox = driver.findElement(By.xpath("//*[@id='p_89/SAMSUNG']//span[@class='a-size-base a-color-base']"));
		Samsungchkbox.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement ListaD = driver.findElement(By.className("a-button-inner"));
		//WebElement ListaD = driver.findElement(By.id("s-result-sort-select_1"));

	
		ListaD.click();

		WebElement cheaper = driver.findElement(By.xpath("//*[@id='s-result-sort-select_1']"));
		cheaper.click();

		//WebElement fisrtElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
		//fisrtElement.click();
		

	}
	
	@After
	public void tearDown() {
	  driver.quit();
	}
}
*/		
	
	
		
	