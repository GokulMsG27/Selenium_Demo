package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class  Task4  {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		wd.manage().window().maximize();
		WebElement user = wd.findElement(By.id("email"));
		Actions act = new Actions(wd);
		act.moveToElement(user).click().build().perform();
		act.contextClick(user).build().perform();
		user.sendKeys("gokulms");
		act.doubleClick(user).build().perform();
	}
 
}
 



//RigtClick_DoubleClick