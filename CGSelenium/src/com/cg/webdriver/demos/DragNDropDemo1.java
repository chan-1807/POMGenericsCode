package com.cg.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragNDropDemo1 {
	
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		testDragAndDropExample();
	}

		public static void testDragAndDropExample() {
			
			System.setProperty("webdriver.chrome.driver","C:/Selenium Libs - Latest/chromedriver_win32/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String baseUrl = "http://jqueryui.com/droppable/";
			driver.get(baseUrl);
			
			//Wait for the frame to be available and switch to it
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
			WebElement Sourcelocator = driver.findElement(By.cssSelector(".ui-draggable"));
			WebElement Destinationlocator = driver.findElement(By.cssSelector(".ui-droppable"));
			dragAndDrop(Sourcelocator,Destinationlocator);
			String actualText=driver.findElement(By.cssSelector("#droppable>p")).getText();
			
		}
		
		public static void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {
			try {
				if (sourceElement.isDisplayed() && destinationElement.isDisplayed()) {
					Actions action = new Actions(driver);
					action.dragAndDrop(sourceElement, destinationElement).build().perform();
				} else {
					System.out.println("Element was not displayed to drag");
				}
			} catch (StaleElementReferenceException e) {
				System.out.println("Element with " + sourceElement + "or" + destinationElement + "is not attached to the page document "
						+ e.getStackTrace());
			} catch (NoSuchElementException e) {
				System.out.println("Element " + sourceElement + "or" + destinationElement + " was not found in DOM "+ e.getStackTrace());
			} catch (Exception e) {
				System.out.println("Error occurred while performing drag and drop operation "+ e.getStackTrace());
			}
		}
}