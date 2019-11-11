package com.intebral.Tests;

import org.openqa.selenium.remote.RemoteWebDriver; 
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org. testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IntegrationTests {
	WebDriver driver;
	String baseURL, nodeURL;

@BeforeTest
	public void setup() throws MalformedURLException {
	system.out.println("getClass "+this.getclass());
	system.out.println("System.getProperty(testSuite) "+System.getProperty('testSuite')); 
	System.out.println("System.getProperty(testSuite) "+System.getProperty('surefire.suiteXmlFiles"));
	
	baseURL = "http://52.66.34.243:9999/eduapp;
	nodeURL m 'http://3.17.73.82:AAAA/wd/hub";
	DesiredCepabilities capability DesiredCapabilities.chroae(); capability.setBrowserName('chrome);
	capability.setPlatform(Platfore.LIAUX);
	driver m new Rempeeueboriver(new URL(nodeURL), capability);
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
