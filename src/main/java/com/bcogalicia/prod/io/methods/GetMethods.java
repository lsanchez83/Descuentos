package com.bcogalicia.prod.io.methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class GetMethods {
	
	 public static String GetText(WebElement elemento) {
		 return elemento.getAttribute("value");
		 
	 }
	 
	 public static String GetTextFromDDList(WebElement elemento){
		 return new Select(elemento).getAllSelectedOptions().toString();
	 }
	

}
