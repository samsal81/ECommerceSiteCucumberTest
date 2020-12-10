package steps;

import org.openqa.selenium.WebDriver;

import util.BrowserFactory;

public class BaseStep {
	protected static WebDriver driver;

	protected WebDriver GetDriver() {
		if (driver == null) {
			driver = BrowserFactory.LaunchBrowser();
		}
		return driver;
	}
}