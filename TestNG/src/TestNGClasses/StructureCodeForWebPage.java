package TestNGClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class StructureCodeForWebPage {
	
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement Username = driver.findElement(By.name("username"));
	  Username.sendKeys("Admin");
	  Thread.sleep(3000);
	  WebElement Password = driver.findElement(By.name("password"));
	  Password.sendKeys("admin123");
	  Thread.sleep(3000);
	  WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
	  loginButton.click();
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void browserSetUp() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void tearDown() {
	  driver.close();
  }

}
