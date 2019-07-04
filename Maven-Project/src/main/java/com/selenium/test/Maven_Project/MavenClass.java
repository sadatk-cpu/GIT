package com.selenium.test.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//initialize browser
		driver.get("https://connect.maveric-systems.com/");
		//Thread.sleep(500000);
		WebElement ele=driver.findElement(By.name("yt0"));
		driver.findElement(By.id("LoginForm_username")).sendKeys("shahistap");
		driver.findElement(By.id("LoginForm_password")).sendKeys("shaMG@29");
		//first commit
		//MindHacks
		//Catch me
	}
}
