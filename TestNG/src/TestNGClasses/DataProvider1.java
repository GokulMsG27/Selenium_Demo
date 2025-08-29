package TestNGClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DataProvider1 {
	@Test(dataProvider = "dp")
	  public void f(String n, String s) throws InterruptedException {
		  WebDriver dr =new ChromeDriver();
		  dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  dr.manage().window().maximize();
		  Thread.sleep(3000);
		  WebElement uname=dr.findElement(By.name("username"));
		  uname.sendKeys(n);
		  Thread.sleep(3000);
		  WebElement pass = dr.findElement(By.name("password"));
		  pass.sendKeys(s);
		  WebElement login = dr.findElement(By.xpath("//button[@type='submit"));
		  login.click();
		  dr.close();
	  }
	 
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "Admin", "admin123" },
	      new Object[] { "Admin", "admin12" },
	    };
	  }
	}