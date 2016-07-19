package com.javascript_dom.JavaScript_DOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DOM_practice {

	WebDriver driver;
	@BeforeClass
	public void Init(){
		driver = new FirefoxDriver();
		driver.navigate().to("https://trello.com/login");
	}
	
	@AfterClass
	public void CleanUp(){
		driver.close();
	}
	
	@Test
	public void Dom_Execute_Trello(){
		
		
//		((JavascriptExecutor)driver).executeScript("document.getElementById('user').value='knskumari'");
		
		
		JavascriptExecutor jexe = (JavascriptExecutor)driver;
		jexe.executeScript("document.getElementById('user').value='knskumari'");
		jexe.executeScript("document.getElementById('password').value = 'pass@word1'");
		jexe.executeScript("document.getElementById('login').click()");
		
		
//		String id = "user";
//		String value = "knskumari";
//		jexe.executeScript("document.getElementById('"+id+"').value = '"+value+"'");
		
		//not working
//		GeneralHelper.ExecuteScript("user", "knskumari");		
	}
}