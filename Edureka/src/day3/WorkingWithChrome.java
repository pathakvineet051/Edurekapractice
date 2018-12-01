package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {

	ChromeDriver driver;

	public void InvokeBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vp192x\\workspace\\Jar Files\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		String baseurl = "https://qatechhub.com/";

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // it will bypass the cookies but will not delete it .
		driver.get(baseurl);
	}

	public void CloseBrowser() {
		driver.close(); // will close the currently active window
		// driver.quit(); // will close all the windows

	}

	public void GetTital() {

		System.out.println("Tital of the Page : " + driver.getTitle());

	}

}
