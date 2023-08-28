package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lauch browser
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("https://www.facebook.com/");
		
		//maximize
		driver.manage().window().maximize();
		
		//Click on create button Inspect is not working
		
		//enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sadiq");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("basha");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9884594980");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");		
		
		

	}

}
