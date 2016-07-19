package com.javascript_dom.JavaScript_DOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GeneralHelper {

	static WebDriver driver ;
	public static void ExecuteScript(String id,String script){
		JavascriptExecutor jexe = (JavascriptExecutor)driver;		
		System.out.println("document.getElementById('"+id+"').value= '"+script+"'");
		jexe.executeScript("document.getElementById('"+id+"').value= '"+script+"'");		
		//jexe.executeScript("document.getElementById('"+id+"').value='knskumari'");
	}	
}