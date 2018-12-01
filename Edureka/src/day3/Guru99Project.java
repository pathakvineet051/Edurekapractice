package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	ChromeDriver driver;
	WebElement element;

	public void InvokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vp192x\\workspace\\Jar Files\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		String baseurl = "http://demo.guru99.com/v4/";

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // it will bypass the cookies but will not delete it .
		driver.get(baseurl);
	}

	public void gurulodin(String username, String pwd) {

		element = driver.findElement(By.name("uid"));
		element.sendKeys(username);

		element = driver.findElement(By.name("password"));
		element.sendKeys(pwd);

		element = driver.findElement(By.name("btnLogin"));
		element.click();
	}

	public void addNewCustomer() {

		driver.findElement(By.linkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value='m']")).click();
		driver.findElement(By.name("dob")).sendKeys("01/01/1998");
		driver.findElement(By.name("addr")).sendKeys("street 1 ");
		driver.findElement(By.name("city")).sendKeys("old bridge");
		driver.findElement(By.name("state")).sendKeys("NJ");
		driver.findElement(By.name("pinno")).sendKeys("12345");
		driver.findElement(By.name("telephoneno")).sendKeys("12345");

		String email = "aa" + System.currentTimeMillis() + "gmail.com";
		driver.findElement(By.name("emailid")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@name='sub']")).click();

	}

}
