package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropExample2  {

	public static void main(String[] args)  throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.guru99.com/test/drag_drop.html");
		Driver.manage().window().maximize();
		WebElement bank = Driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement account = Driver.findElement(By.id("bank"));
		WebElement amount = Driver.findElement(By.id("amt8"));
		WebElement cash = Driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		Actions action = new Actions(Driver);
		action.dragAndDrop(bank,account).build().perform();
		
		
	}
}



