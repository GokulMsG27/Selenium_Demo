package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollBarHandling {

	public static void main(String[] args) throws InterruptedException{
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Register.html");
		Driver.manage().window().maximize();
	
		WebElement submit = Driver.findElement(By.id("Button1"));
		
		JavascriptExecutor js =(JavascriptExecutor) Driver;
		js.executeScript("arguments[0], scrollIntoView();",submit);
		//js.executeScript("scroll(0,400)");
		Thread.sleep(3000);
		//js.executeScript("scroll(0,-150)");
		
}
}