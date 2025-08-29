package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args)  throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Static.html");
		Driver.manage().window().maximize();
		
		Actions action = new Actions(Driver);
		
		WebElement drag = Driver.findElement(By.id("angular"));
		WebElement drop = Driver.findElement(By.id("droparea"));
		
		action.dragAndDrop(drag, drop).build().perform();

	}

}







