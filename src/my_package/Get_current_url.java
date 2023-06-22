package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_current_url {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();
	String pgcurent_url=driver.getCurrentUrl();
	if(pgcurent_url.contains("gmail")) {
		System.out.println("Test case Pass");
		System.out.println(pgcurent_url);
	}else
	{
		System.out.println("Test case Fail");
	}

	driver.quit();
	}

}
