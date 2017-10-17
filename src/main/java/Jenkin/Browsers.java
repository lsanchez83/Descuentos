package Jenkin;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import java.net.URL;



public class Browsers {
	

	
	@Parameters("browser")
	@BeforeTest
	public void launchbrowse() {
		

		
		String Url = "http://www.bancogalicia.com/banca/online/web/Personas/BeneficiosyPromociones/buscador-beneficios/TODAS-LAS-PROMOS";


		    System.setProperty("webdriver.chrome.driver","C:/Browsers/chromedriver_win32 -2.30/chromedriver.exe");		
			DesiredCapabilities dr = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");			
			dr.setCapability(ChromeOptions.CAPABILITY, options);
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS);
			PropertyCollections.driver = new ChromeDriver(options);
			PropertyCollections.driver.navigate().to(Url);
			PropertyCollections.driver.manage().window().maximize();
		

}
	@AfterTest
	public void CloseBrowser(){
		
		PropertyCollections.driver.close();		
	}
	
	
	
	
	@Test
	public void TestOne(){
		
		
		
	}
	@Test
	public void TestDos(){
		
		
		
	}
}