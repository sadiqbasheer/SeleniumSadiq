package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchAbhiBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//load browser
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[text()='31']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		System.out.println(driver.findElement(By.xpath("//h2[contains(text(),'Yolo')]")).getText());
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		//driver.findElement(By.xpath("//p[contains(text(),' Seats Available')]")).getText();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),' Seats Available')]")).getText());
		driver.findElement(By.xpath("//span[contains(text(),'Seat')]")).click();
		driver.findElement(By.xpath("  //a[@class='tooltip tooltipstered']")).click();
		//driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@id='seatnos']")).getText());
		//driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println(driver.findElement(By.xpath("//span[@id='ticketfare']")).getText());
		
		 WebElement element = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		
		Select sec = new Select(driver.findElement(By.xpath("//select[@id='boardingpoint_id']")));
		sec.selectByIndex(2);
		driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select secDropPoint = new Select(driver.findElement(By.xpath("//select[@id='droppingpoint_id']")));
		secDropPoint.selectByIndex(4);
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
