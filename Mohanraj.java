package com.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91866\\Documents\\workpase\\selenium\\Driver\\chromedriver.exe ");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://kyro.pages.dev/");
	driver.manage().window().maximize();
	WebElement btnLogin = driver.findElement(By.xpath("(//button[@class='LoginButton_login_button__ehTMa'])[1]"));
	btnLogin.click();

	driver.findElement(By.id("username")).sendKeys("raj2605kutty@gmail.com");

	driver.findElement(By.id("password")).sendKeys("Prabhaelumalai2605!");

	driver.findElement(By.name("action")).click();

	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@id='__next']//li[3]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
	
	Thread.sleep(2000);
	WebElement createTask = driver.findElement(By.xpath("//button[text()='Create Task']"));
	if (createTask.isDisplayed()) {
		createTask.click();
	}
	Thread.sleep(2000);
	driver.findElement(By.name("summary")).sendKeys("sample test");
	
	driver.findElement(By.name("task_type")).sendKeys("task");
	
	driver.findElement(By.name("description")).sendKeys("test");
	
	driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
	
	driver.findElement(By.xpath("//li[@data-value='1']")).click();
	
	driver.findElement(By.name("location")).sendKeys("chennai");
	
	driver.findElement(By.name("start_date")).sendKeys("25092022");
	
	driver.findElement(By.name("due_date")).sendKeys("25092022");
	
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(2000);
	List<WebElement> list = driver.findElements(By.xpath("//div[@class='MuiDataGrid-virtualScrollerRenderZone css-1inm7gi']//following::div[@role='row']"));
	
	System.out.println(list.size());
	
	
	
	
	
	
	
}
}
