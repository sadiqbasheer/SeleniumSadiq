package homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LauchPvrMarathon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//i[@class='icon-bar icon'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		//Thread.sleep(9000);
		//driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']/option[text()='Chennai']")).click();
		   //driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']/option[text()='ANIMATION']")).click();
		//driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']/option[text()='ENGLISH']")).click();
		//driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		Select secCity = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		secCity.selectByVisibleText("Chennai");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
		Select secGen = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		secGen.selectByVisibleText("ANIMATION");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
		Select secLan = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		secLan.selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='movie-wrapper ng-star-inserted']/img")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(6000);
		WebElement eleCinema = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select secCinema = new Select(eleCinema);
		secCinema.selectByIndex(3);
		WebElement eleTime = driver.findElement(By.xpath("//select[@name='timings']"));
		Select secTime = new Select(eleTime);
		secTime.selectByIndex(3);
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name = 'name']")).sendKeys("sadiq");
		driver.findElement(By.xpath("//input[@name = 'email']")).sendKeys("sadiqbasheer@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'mobile']")).sendKeys("9884594983");
		WebElement eleFood = driver.findElement(By.xpath("//select[@name='food']"));
		Select secFood = new Select(eleFood);
		secFood.selectByIndex(1);
		driver.findElement(By.xpath("//input[@name = 'comment']")).sendKeys("no");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		
	}

}
