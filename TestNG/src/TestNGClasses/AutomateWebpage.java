package TestNGClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class AutomateWebpage {
	WebDriver wd;
	@Test
	@Parameters({"fn","ln","add","email","num","skill"})
	public void Login(String fn,String ln,String add,String email,String num,String skill) throws InterruptedException {
		wd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);
		wd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ln);
		wd.findElement(By.tagName("textArea")).sendKeys(add);
		wd.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);
		wd.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(num);
		wd.findElement(By.xpath("//input[@value='Male']")).click();
		wd.findElement(By.xpath("//input[@value='Cricket']")).click();
		wd.findElement(By.id("msdd"));
		Select s = new Select(wd.findElement(By.id("Skills")));
		s.selectByVisibleText(skill);
		Thread.sleep(5000);
	}
	@BeforeTest
	public void beforeTest() {
		wd = new ChromeDriver();
		wd.get("https://demo.automationtesting.in/Register.html");
		wd.manage().window().maximize();
	}
 
	@AfterTest
	public void afterTest() {
		wd.close();
	}
}