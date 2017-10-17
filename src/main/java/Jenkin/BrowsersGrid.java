package Jenkin;

import java.net.MalformedURLException;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import java.net.URL;




public class BrowsersGrid {
	
	String Url,  FfPort,Ff64Port,ChPort,IePort,HostLeandro,HostLuciano;
	
	@Parameters("browser")
	@BeforeTest
	public void launchbrowser(String browser) throws MalformedURLException,	InterruptedException {
		
		FfPort = "4447/wd/hub";
		Ff64Port = "4448/wd/hub";
		ChPort = "4445/wd/hub";
		IePort = "4446/wd/hub";
		HostLuciano = "http://10.2.69.53:";
		HostLeandro = "http://MJ138631:";
		
		
		Url = "https://accesoalajusticia-test.jus.gob.ar/usuarios/login";

//		if (browser.equalsIgnoreCase("firefox")) {
//			System.out.println(" Executing on FIREFOX");
//			DesiredCapabilities dr = DesiredCapabilities.firefox();
//			dr.setBrowserName("firefox");
//			dr.setPlatform(Platform.VISTA);
//			PropertyCollections.driver = new RemoteWebDriver(new URL(HostDario+Ff64Port), dr);
//			PropertyCollections.driver.navigate().to(Url);
//			PropertyCollections.driver.manage().window().maximize();
//
//		} 
	if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" Executing on CHROME");
			DesiredCapabilities dr = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");			
			dr.setCapability(ChromeOptions.CAPABILITY, options);
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WINDOWS);
			PropertyCollections.driver = new RemoteWebDriver(new URL(HostLuciano+ChPort), dr);
			PropertyCollections.driver.navigate().to(Url);
			PropertyCollections.driver.manage().window().maximize();
		}
// 
//		else 
//		if (browser.equalsIgnoreCase("ie")) {
//			System.out.println(" Executing on IE");// Requiere safe mode igual en todas las zonas de seguridad. Crear TabProcGrowth DWORD en registro Equipo\HKEY_CURRENT_USER\Software\Microsoft\Internet Explorer\Main
//			DesiredCapabilities dr = DesiredCapabilities.internetExplorer();//TabProcGrowth editar registro
//			dr.setBrowserName("internet explorer");
//			dr.setPlatform(Platform.VISTA);
//			dr.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, true);
//			dr.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
//			dr.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
//			PropertyCollections.driver = new RemoteWebDriver(new URL(HostLuciano+IePort), dr);
//			PropertyCollections.driver.manage().window().maximize();
//			PropertyCollections.driver.navigate().to(Url);
//			Alert alert = PropertyCollections.driver.switchTo().alert();
//			alert.accept();// Creado para Aceptar el Alerta de seguridad de IE.
//			Thread.sleep(2000);
//		}

		else {
			throw new IllegalArgumentException("The Browser Type is Undefined");
		}
	

}
}