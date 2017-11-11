package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class visiblescreen {
	public static void desktopScreenshots(WebDriver driver,String fn, String Brandname, String screenshotName) {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(1000);
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("Screenshots/desktop/" + fn + "/" + Brandname + "/" + screenshotName+".png")); 
			System.out.println("Screenshot Done on " + screenshotName);	
		} 
		catch (Exception e) {
			System.out.println("Exception while taking visible part screenshot" + e.getMessage());
		}
	}
	public static void mobileScreenshots(WebDriver driver,String fn, String Brandname, String screenshotName) {
		
		try {
			Thread.sleep(1000);
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("Screenshots/mobile/" + fn + "/" + Brandname + "/" + screenshotName + ".png")); 
			System.out.println("Screenshot Done on " + screenshotName);
		} 
		catch (Exception e) {
			System.out.println("Exception while taking visible part screenshot" + e.getMessage());
		}
	}
}

