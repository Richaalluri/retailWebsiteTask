package com.ecommerce.qa.testcases;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.ecommerce.qa.pages.JupiterToysHomePage;

public class JupiterTestCase1 {
	
	private static WebDriver driver=null;
	static JavascriptExecutor js;
	JupiterToysHomePage jupiterHome;
	
	public static void main(String[] args) throws Exception {

		JupiterTestCase1 jupiterTestCase = new JupiterTestCase1();
		jupiterTestCase.jupiterContactTest();
	}

	@Test
	public void jupiterContactTest() throws InterruptedException, IOException {
		

		//Declarations		
		WebElement element;
				
		//browser Launch
		String currentDirectory = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		
		//Amazon launch
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		//Verify title
		String title = driver.getTitle();		
		System.out.println("Title Of the page : " + title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		
		//Menu click
		JupiterToysHomePage.Hamburger(driver).click();
		Thread.sleep(2000);
		
		//Bestsellers click
		JupiterToysHomePage.BestSellers(driver).click();
		Thread.sleep(2000);
		
		//Search for samsung
		 element = JupiterToysHomePage.SearchBar(driver);
		 element.sendKeys("samsung"); 
		 Thread.sleep(2000);
			
		 //searchBar submit button
		 JupiterToysHomePage.SearchBarButton(driver).click();
		 Thread.sleep(2000);
		 
		//Samsung link click
			JupiterToysHomePage.Samsung(driver).click();
			Thread.sleep(1000);
		 
		
//		//Filter click
//		JupiterToysHomePage.FilterRow(driver).click();
//		Thread.sleep(1000);
//		
//		//filter option change
//		JupiterToysHomePage.HighToLow(driver).click();
//		Thread.sleep(1000);
		
		//First element click
		//JupiterToysHomePage.FirstRowElement(driver).click();
		//Thread.sleep(2000);
		
		//Verify title		
		String text= JupiterToysHomePage.ProductTitle(driver).getText();
		Assert.assertTrue(text.contains("Samsung"));
			
		JupiterToysHomePage.AddToCart(driver).click();
		Thread.sleep(2000);
		
		JupiterToysHomePage.noThanks(driver).click();
		Thread.sleep(2000);
		
		JupiterToysHomePage.NavCartLink(driver).click();
		Thread.sleep(2000);
						
		text= JupiterToysHomePage.price(driver).getText();
		text= JupiterToysHomePage.removefirstChar(text);
		
		float price1 = Float.parseFloat(text);
		price1=price1*5;
		System.out.println(price1);
		
			
		//Add the Count Of the Product as 5
		Select dropdown =new Select(JupiterToysHomePage.Quantity(driver));
		dropdown.selectByVisibleText("5");
		Thread.sleep(2000);
		
		text= JupiterToysHomePage.price(driver).getText();
		text= JupiterToysHomePage.removefirstChar(text);
		float price5 = Float.parseFloat(text);
		System.out.println(price5);
		
		
		if(price1==price5)
		{
			System.out.println("PASS");
			
		}
		else
			System.out.println("FAILS");
		
        
        driver.close();
	}
	
	@AfterTest
	public void close() {
		
	}
	

}
