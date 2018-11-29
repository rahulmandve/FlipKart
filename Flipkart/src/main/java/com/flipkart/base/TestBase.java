package com.flipkart.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.flipkart.util.TestUtil;

public class TestBase {
	
	public static WebDriver d;
	public static Properties pro;
	
	public TestBase() {
	try {
		FileInputStream fis=new FileInputStream("F:\\Framework\\Flipkart\\src\\main\\java\\com\\flipkart\\config\\config.properties");
		pro=new Properties();
		pro.load(fis);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public void launchBrowser()
	{
	String browsername=	pro.getProperty("browser");
	
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver_win32\\chromedriver.exe");
			d=new ChromeDriver();
		}else if(browsername.equals("firefox"))
		{
			d=new FirefoxDriver();
		}
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLYWAIT, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		d.get(pro.getProperty("URl"));
		
	}

}
