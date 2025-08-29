package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.changepond.com/");
		Driver.switchTo().newWindow(WindowType.TAB);
		String SW = Driver.getWindowHandle();
		Driver.get("https://www.google.com/");
		
	}

}
