package TestNGClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTask {
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver dr =new ChromeDriver();
	  dr.get("https://testtrack.org/login-demo");
	  dr.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement uname=dr.findElement(By.id("username"));
	  uname.sendKeys(n);
	  Thread.sleep(3000);
	  WebElement pass = dr.findElement(By.id("password"));
	  pass.sendKeys(s);
	  WebElement login = dr.findElement(By.id("login-submit"));
	  login.click();
	  //dr.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "testuser", "password123" },
      new Object[] { "testuser", "b" },
    };
  }
}
