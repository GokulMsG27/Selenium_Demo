package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSinglePage {

	public static void main(String[] args) throws InterruptedException{
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Register.html");
		Driver.manage().window().maximize();
		
		Driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("GOKUL");
		Driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("M");
		Driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Salem,TamilNadu"); 
		Driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("ms2701@gmail.com"); 
		Driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6389796232"); 
		Driver.findElement(By.xpath("//input[@value='Male']")).click(); 
		Driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		Driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6389796232"); 
		
		Select s = new Select(Driver.findElement(By.id("Skills")));
		s.selectByContainsVisibleText("SQL");
		Select year = new Select(Driver.findElement(By.id("yearbox")));
		year.selectByValue("1934");
		Select month = new Select(Driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		month.selectByVisibleText("September");
		Select Day = new Select(Driver.findElement(By.id("daybox")));
		Day.selectByValue("6");
		Driver.findElement(By.xpath("//div[@id='msdd']")).click();
		Driver.findElement(By.xpath("//a[contains(text() ,'Hindi')]")).click();
		Driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("MSGOKU1");
	}

}
