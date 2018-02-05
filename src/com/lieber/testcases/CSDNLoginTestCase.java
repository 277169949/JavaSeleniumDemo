package com.lieber.testcases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;

import com.lieber.tools.BrowserDriverTools;

public class CSDNLoginTestCase {
	private static WebDriver driver = BrowserDriverTools.getBrowserDriverInstance("chrome");
	private static String baseUrl = "https://passport.csdn.net/account/login";

	public static void login() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(baseUrl);
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("277169949@qq.com");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("277169949");
		driver.findElement(By.className("logging")).click();
		Thread.sleep(3000);
		driver.get("https://www.baidu.com");
	}

	 public static void main(String[] args) throws InterruptedException {
		login();
		//driver.quit();
	}

}
