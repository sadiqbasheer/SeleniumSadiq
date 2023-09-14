package week4.homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import homework.WebElement;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following::img")).click();
		//driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::img)[2]")).click();
		String pTitle = driver.getTitle();
		System.out.println(pTitle);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<>(windowHandles);
		driver.switchTo().window(handles.get(1));
		
		for(String each: handles)
		{
			System.out.println(each);
		}
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		
		//driver.findElement(By.xpath(" //a[text()='10455']")).click();
		 //driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']"));
		// Select mySelect = new Select(driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-partyId']")));
		// mySelect.selectByIndex(1);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windowHandle);
		Thread.sleep(2000);
		driver.findElement(By.xpath(" //table[@id='widget_ComboBox_partyIdTo']/following::img")).click();
		driver.switchTo().window(pTitle);
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> handles1 = new ArrayList<>(windowHandles1);
		driver.switchTo().window(handles1.get(1));
		
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::img)[2]")).click();
		//driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
	}

}
