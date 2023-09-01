package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazonMaraton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[8]")).click();
		String display1 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(display1);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		//WebElement eleSort = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
		
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
		String bagName = driver.findElement(By.xpath("//span[text()='Unisex Printed School Backpack For Kids, Black (Ironman Marvel)']")).getText();
		System.out.println("Resulting bag name  : "+bagName);
		String bagPrice = driver.findElement(By.xpath("//span[text()='1,699']")).getText();
		System.out.println("bagPrice  : "+bagPrice);
		driver.close();
		
	}

}
