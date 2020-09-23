package com.mirketa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageUserspage {
	
	
		WebDriver driver;
		
		
		public ManageUserspage(WebDriver ldriver) {
			this.driver = ldriver;
		}
		
		@FindBy(xpath="//span[contains(text(),'Manage Users')]")
		WebElement ManageUser_Teams;
		
		@FindBy(xpath = "//iframe[@title='accessibility title']")
		WebElement iframeCriteria;
		
		@FindBy(xpath = "(//input[@type='radio'])[1]")
		WebElement ForUserRadioButton;
		
		@FindBy(xpath = "//input[@onchange='updateUsersTable()']")
		WebElement UserSearchField;
		
		@FindBy(xpath = "//a[@onclick='activateActualUser()'][contains(text(),'Mark Offline')]") 
		WebElement MarkOffline;
		
		@FindBy(xpath="//a[@onclick='activateActualUser()']")
		WebElement Marked;
		
		@FindBy(xpath = "//a[@onclick='activateActualUser()'][contains(text(),'Mark Online')]")
		WebElement MarkOnline;
		
		@FindBy(xpath = "//label[contains(text(),'Search By User:')]")
		WebElement SelectUser;
		
		public void ClickONMangeUserTab() throws InterruptedException {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
		      executor.executeScript("arguments[0].click();", ManageUser_Teams);
		     // driver.navigate().refresh();
		      
			//ManageUser_Teams.click();
			Thread.sleep(5000);	
		}
		
		public void navigateToCriteria() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.switchTo().frame(iframeCriteria);
		Thread.sleep(3000);
	    }
		
	
		
		public void MarkRRD_UserOffline() throws InterruptedException {
			ForUserRadioButton.click();
			Thread.sleep(3000);	
			UserSearchField.clear();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			UserSearchField.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			UserSearchField.sendKeys("RRD Mirketa (rrd_teamtest@mirketa.com)");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			SelectUser.click();
			Thread.sleep(5000);
			MarkOffline.click();
			Thread.sleep(5000);	
			driver.switchTo().alert().accept();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		
		public void MarkRRD_UserOnline() throws InterruptedException {
			ForUserRadioButton.click();
			Thread.sleep(3000);	
			UserSearchField.clear();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			UserSearchField.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			UserSearchField.sendKeys("RRD Mirketa (rrd_teamtest@mirketa.com)");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			SelectUser.click();
			Thread.sleep(5000);
			MarkOnline.click();
			Thread.sleep(3000);	
			driver.switchTo().alert().accept();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		
		public void MarkSecurity_UserOffline() throws InterruptedException {
			ForUserRadioButton.click();
			Thread.sleep(3000);	
			UserSearchField.clear();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			UserSearchField.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			UserSearchField.sendKeys("Security User (insightssecurity@00d3h000007rihgea0.com)");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			SelectUser.click();
			Thread.sleep(5000);
			MarkOffline.click();
			Thread.sleep(5000);	
			driver.switchTo().alert().accept();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		
		public void MarkSecurity_UserOnline() throws InterruptedException {
			ForUserRadioButton.click();
			Thread.sleep(3000);	
			UserSearchField.clear();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			UserSearchField.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			UserSearchField.sendKeys("Security User (insightssecurity@00d3h000007rihgea0.com)");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			SelectUser.click();
			Thread.sleep(5000);
			MarkOnline.click();
			Thread.sleep(3000);	
			driver.switchTo().alert().accept();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}
		
		
	//******************************************************	
		
	public void Mark_UserOffline(String useroff) throws InterruptedException {
			
			
			ForUserRadioButton.click();
			Thread.sleep(3000);	
			UserSearchField.clear();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			UserSearchField.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			UserSearchField.sendKeys(useroff);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			SelectUser.click();
			Thread.sleep(5000);
			String val=Marked.getText();
			try {
				if(val.contains("Mark Offline"))
		
			
			MarkOffline.click();
			Thread.sleep(3000);	
			driver.switchTo().alert().accept();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			}
			catch(Exception e)
			
			{
				System.out.println("user is online");
			}
				
			
		}
		
	}

	
	


