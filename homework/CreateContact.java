package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lauch browser
		ChromeDriver driver = new ChromeDriver();
		
		//load url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// maximize
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("( //a[contains(text(),'Contact')])[3]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("sadiqbasha");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("bashabhai");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("localsadiq");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("lastbashalocal");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("television");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("sadiq bhai area");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("sadiqbasheer@gmail.com");
		//driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select sec = new Select(driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"))); 
		sec.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[text()='sadiq bhai area']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("important ji");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
