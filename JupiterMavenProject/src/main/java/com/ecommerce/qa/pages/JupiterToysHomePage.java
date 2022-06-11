package com.ecommerce.qa.pages;

import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class JupiterToysHomePage {
	
	private static WebElement  element= null;
	

	public static WebElement Hamburger(WebDriver driver) {
		element  = driver.findElement(By.id("nav-hamburger-menu"));
		return element;
	}
	
	public static WebElement PassName(WebDriver driver) {
		element  = driver.findElement(By.id("login_form_password_input"));
		return element;
	}
	
	
	public static WebElement Login(WebDriver driver) {
		element  = driver.findElement(By.id("login_form_login_btn"));
		return element;
	}
	
	public static WebElement SearchBar(WebDriver driver)
	{
		element  = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
		
	}
	
	public static WebElement SearchBarButton(WebDriver driver)
	{
		element  = driver.findElement(By.id("nav-search-submit-button"));
		return element;
		
	}

	
	/*
	 * public static WebElement TVAppliances(WebDriver driver) {
	 * element=driver.findElement(By.cssSelector(("#twotabsearchtextbox")));
	 * element.sendKeys("apple");
	 * element=driver.findElement(By.cssSelector((".nav-search-submit")));
	 * element.click(); return element; }
	 */

	public static WebElement BestSellers(WebDriver driver) {
		List<WebElement> elements  = driver.findElements(By.xpath("//a[contains(text(),'Best Sellers')]"));
		element = elements.get(1);
		return element;
	}

	public static WebElement Samsung(WebDriver driver) {
		element  = driver.findElement(By.xpath("(//span[contains(text(),'Samsung')])[2]"));
		return element;
	}

	public static WebElement FilterRow(WebDriver driver) {
		element  = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		return element;
	}
	
	public static WebElement HighToLow(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[contains(text(),'Price: High to Low')]"));
		return element;
	}
	
	public static WebElement FirstRowElement(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[2]"));
		return element;
	}
	
	public static WebElement ProductTitle(WebDriver driver) {
		element = driver.findElement(By.id("productTitle"));
		return element;
	}

	public static WebElement AddToCart(WebDriver driver) {
		element = driver.findElement(By.id("add-to-cart-button"));
		return element;
	}
	
	public static WebElement noThanks(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"attachSiNoCoverage\"]/span/input"));
		return element;
	}
	
	public static WebElement NavCartLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input"));
		return element;
	}
	
		
	public static WebElement NavCart(WebDriver driver) {
		element = driver.findElement(By.id("nav-cart"));
		return element;
	}
	
		
	public static WebElement Assert(WebDriver driver) {
		element = driver.findElement(By.xpath("//h1[@class='a-size-base-plus a-text-bold']"));
		return element;
	}
	public static WebElement Quantity(WebDriver driver) {
		element = driver.findElement(By.name("quantity"));
		return element;
	}
	
	public static WebElement price(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-buybox\"]/span"));
		return element;
	}	
	
	  public static String removefirstChar(String str)
	    {
		  Pattern p = Pattern.compile("[^0-9]*([0-9]*,?([0-9]+(\\.[0-9]*))?)");
		  Matcher m = p.matcher(str);
		  m.matches();
		  String s_num = m.group(1).replace(",", "");
		  return s_num;
	    }
	
	
}
