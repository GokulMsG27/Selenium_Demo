package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver = new ChromeDriver();
		String pw = Driver.getWindowHandle();
		Driver.get("https://www.changepond.com/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Driver.switchTo().newWindow(WindowType.TAB);
		String sw = Driver.getWindowHandle();
		Driver.get("https://demo.automationtesting.in/Index.html");
		Thread.sleep(3000); 
		
		
		
		Driver.switchTo().newWindow(WindowType.TAB);
		String tw = Driver.getWindowHandle();
		Driver.get("https://www.google.com/");
		Thread.sleep(3000); 
		
		Driver.switchTo().window(pw);
		Thread.sleep(3000); 
		
		Driver.switchTo().window(sw);
		Thread.sleep(3000); 
		
		Driver.switchTo().window(tw);
		Thread.sleep(3000); 
		
		Driver.close();
		Driver.quit();
			
		
	}

}
