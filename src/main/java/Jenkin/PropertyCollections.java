package Jenkin;

import org.openqa.selenium.remote.RemoteWebDriver;

public class PropertyCollections {

	public static RemoteWebDriver driver;

	public static RemoteWebDriver getDriver() {
		return driver;
	}

	public static void setDriver(RemoteWebDriver driver) {
		PropertyCollections.driver = driver;
	}
}
