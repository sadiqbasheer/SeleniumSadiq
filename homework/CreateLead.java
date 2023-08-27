package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// launch browser
		
		ChromeDriver driver = new ChromeDriver();
		
		// Load Url 
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// maximize url
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		// enter user name and password and click submit
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		//  id locator
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SadiqCompany");
		
		// first name id loc
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohammed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Basha");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MOHAMMED-Local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("HISTORY");
		driver.findElement(By.name("description")).sendKeys("DESCRIPTION");
		driver.findElement(By.name("primaryEmail")).sendKeys("sadiqbasheer@gmail.com");
		
		// web element state
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		//Instantiate Select class
		Select sec = new Select(stateDD);
		sec.selectByVisibleText("Hawaii");
		Thread.sleep(1000);
		driver.findElement(By.name("submitButton")).click();
	//	Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
	}

}
