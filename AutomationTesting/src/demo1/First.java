package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver(); 
		String s = "https://www.google.com/";
		WebDriver wd1 = new FirefoxDriver();   // to open chrome browser
         wd.get(s);
         wd.manage().window().maximize();
        
         Thread.sleep(1000);
      //   wd.manage().window().minimize();
         System.out.println(wd.getTitle());
         System.out.println( wd.getCurrentUrl());
         System.out.println(wd.getPageSource());
         wd.close();
       
	}

}
