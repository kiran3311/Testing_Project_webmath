package com.web_math.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.web_math.utilities.readConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	readConfig config = new readConfig();

	String url = config.getUrl();

	WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
