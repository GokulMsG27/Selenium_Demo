package TestNGClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
  @Test
  public void f() {
	  WebDriver d = new ChromeDriver();
	  d.get("https://www.google.com");
	  SoftAssert sa = new SoftAssert();
	  String expTittle=d.getTitle();
	  String actTittle="Google";
	  assertEquals(expTittle, actTittle);
	  System.out.println("Test complete");
	  sa.assertAll();
  }
}
