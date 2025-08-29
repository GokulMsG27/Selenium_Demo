package demo1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopupHandling  {

	public static void main(String[] args) throws InterruptedException{
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Alerts.html");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button = Driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		button.click();
	    Alert alert = Driver.switchTo().alert();	
	    Thread.sleep(2000);
	    System.out.println(alert.getText());
	    alert.accept();
	    
	
	}
}








