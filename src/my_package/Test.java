package my_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
	String pgtittile=driver.getTitle();
	
	if(pgtittile.equalsIgnoreCase("Google Imegaes"))
	{
	
		System.out.println("Test case Pass");
	}else
	{
		System.out.println("Test case Fail");
	}
	
	driver.quit();

}
}
