package org.dayone.qa;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDayOne {
	static WebDriver driver;
	@BeforeClass
	public static void browse()
	
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		driver = new ChromeDriver();
	}
	@Test
	public void test() {

		System.out.println("Test1");
	}

	@Test
	public void test1() {
		System.out.println("Test2");

	}

	@Test
	public void test2() {
		System.out.println("Test3");
		
		
	}

	@Before
	public void launch() {
		
		
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// driver.navigate().forward();
		// driver.navigate().back();
		driver.navigate().refresh();
	}
	

	@AfterClass
	public static void terminate() {
		driver.close();
		System.out.println("After method");
	}

}
