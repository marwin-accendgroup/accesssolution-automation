package library;

import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class fullscreen {
public static void desktopScreenshots(WebDriver driver, String fn, String Brandname, String screenshotName) throws InterruptedException{
		
		Thread.sleep(1000);
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS,500)
		.withName(screenshotName)
		.save("C://Users//Marwin//Desktop//projects//accesssolution-automation//accesssolution//Screenshots//desktop//" + fn + "//"+ Brandname + "//");
		System.out.println("Screenshot Done on " + screenshotName);	
	}
	public static void mobileScreenshots(WebDriver driver, String fn, String Brandname, String screenshotName) throws InterruptedException{
		
		Thread.sleep(1000);
		Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS,500)
		.withName(screenshotName)
		.save("C://Users//Marwin//Desktop//projects//accesssolution-automation//accesssolution//Screenshots//mobile//" + fn + "//"+ Brandname + "//");
		System.out.println("Screenshot Done on " + screenshotName);	
	}
}
