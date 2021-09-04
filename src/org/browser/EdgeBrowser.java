package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "");
		WebDriver driver=new EdgeDriver();
		driver.get("http://en-gb.facebook.com/");
	}

}
