package my_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jpet {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).clear();
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.partialLinkText(" Login ")).click();
		
		driver.findElement(By.partialLinkText("Sign Out")).click();
		//driver.close();
		
		
		
	}

}
