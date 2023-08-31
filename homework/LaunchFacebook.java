package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//lauch browser
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("https://en-gb.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		
		//Click on create button Inspect is not working
		
		//enter first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sadiq");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("basha");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9884594980");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='day']/option[text()='17']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='month']/option[text()='May']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='year']/option[text()='2023']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		

	}

}
