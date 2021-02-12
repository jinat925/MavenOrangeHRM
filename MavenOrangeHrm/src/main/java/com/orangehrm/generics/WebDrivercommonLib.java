package com.orangehrm.generics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;





/**
 * generic class for webdriver method
 * @author jinat
 */
public class WebDrivercommonLib {
	
/**
 * Explicit wait For element is displayed or not
 * @param driver
 * @param element
 */
	public void waitforelement(WebDriver driver, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	/**
	 * Implicit wait for element present in Gui
	 * @param driver
	 */
	public void waitForElementGui(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	/**
	 * custom wait for element present or not
	 * @param element
	 */
	public void customWait(WebElement element) {
		int i=0;
		while(i<1000) {
			try {
			element.isDisplayed();
			break;
			}
			catch(NoSuchElementException e) {
				i++;
				
			}
			
		}
		
	}
	/**
	 * Select the option in the list box by using index
	 * @param element
	 * @param i
	 */
	public void selectOption(WebElement element,int i) {
		Select s = new Select(element);
		s.selectByIndex(i);
		
	}
	/**
	 * Select the option in the list box by using text
	 * @param element
	 * @param text
	 */
	public void selectbytext(WebElement element,String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
		
	}
	/**
	 * Movetoelement by actions class
	 * @param Driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver Driver,WebElement element) {
		Actions actions= new Actions(Driver);
		actions.moveToElement(element).perform();
		
	}
	/**
	 * Rightclick by actions class
	 * @param driver
	 * @param element
	 */
	public void rightclick(WebDriver driver,WebElement element) {
		Actions actions= new Actions(driver);
		actions.contextClick(element).perform();
		
	}
	
	
	
}
