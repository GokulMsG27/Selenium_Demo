package TestNGClasses;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertiesFile {
  @Test
  public void f() throws Exception {
	  FileReader fr = new FileReader("D:\\Testing\\TestNG\\src\\TestNGClasses\\Data.properties");
	  Properties p= new Properties();
	  p.load(fr);
	  WebDriver d=new ChromeDriver();
	  d.get(p.getProperty("url"));
	  Thread.sleep(3000);
	  d.findElement(By.name("q")).sendKeys(p.getProperty("un"));
  }
}
