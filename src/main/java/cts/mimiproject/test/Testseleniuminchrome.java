package cts.mimiproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cts.miniproject.utility.Configreader;



public class Testseleniuminchrome {


	ConfigReader config;
	@BeforeTest
	public void setup() {

	config=new ConfigReader();

	System.setProperty("webdriver.chrome.driver", config.getchromepath());

	System.out.println("Set up is Ready");

	}

	@Test
	public void testchrome() {
	System.out.println("Navigate to URL");
	WebDriver driver=new ChromeDriver();
	driver.get(config.getApplicationURL());


	}
	}


