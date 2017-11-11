package accesssolutionEs;

import library.fullscreen;
import library.visiblescreen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class es_patient {

	public static void main(String[] args, WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//---->> patient <<---- 12 screenshot for patient homepage
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient.html");
		driver.findElement(By.id("select-treatment")).click();
		visiblescreen.desktopScreenshots(driver, "es", "patient",  "accesssolutions-patient-select-treatment");
		
		Thread.sleep(1000);
		driver.findElement(By.className("product-popup")).click();
		visiblescreen.desktopScreenshots(driver, "es", "patient",  "accesssolutions-patient-product-popup");
		
		driver.findElement(By.xpath("//*[@id='product-selector']/div/div/div[2]/div/div/ul/li[15]/a")).click();
		visiblescreen.desktopScreenshots(driver, "es", "patient",   "accesssolutions-patient-rituxan-popup");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",  "accesssolutions-patient-0.0");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/home.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",  "accesssolutions-patient-home");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/home/patient-assistance-tool-page.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",  "accesssolutions-patient-pat");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/search.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",   "accesssolutions-patient-search");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/pan.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",   "accesssolutions-patient-pan");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/biooncology.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",   "accesssolutions-patient-biooncology");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/rheumatology.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",   "accesssolutions-patient-rheumatology");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/contact-us.html");
		fullscreen.desktopScreenshots(driver, "es", "patient",  "accesssolutions-patient-contact-us");
	}
	public static void patient_mobile(WebDriver driver) throws InterruptedException{
		
		//---->> patient mobile <<---- 13 screenshot for patient homepage mobile
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient.html");
		driver.findElement(By.id("select-treatment")).click();
		visiblescreen.mobileScreenshots(driver, "es", "patient",  "accesssolutions-mobile-patient-select-treatment");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient.html");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/button")).click();;
		visiblescreen.mobileScreenshots(driver, "es", "patient",   "accesssolutions-mobile-patient-navigation");
		
		Thread.sleep(1000);
		driver.findElement(By.className("product-popup")).click();
		visiblescreen.mobileScreenshots(driver, "es", "patient",  "accesssolutions-mobile-patient-product-popup");
		
		driver.findElement(By.xpath("//*[@id='product-selector']/div/div/div[2]/div/div/ul/li[15]/a")).click();
		visiblescreen.mobileScreenshots(driver, "es", "patient",   "accesssolutions-mobile-patient-rituxan-popup");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient.html");
		fullscreen.mobileScreenshots(driver, "es", "patient",  "accesssolutions-mobile-patient-0.0");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/home.html");
		Thread.sleep(500);
		fullscreen.mobileScreenshots(driver, "es", "patient",  "accesssolutions-mobile-patient-home");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/home/patient-assistance-tool-page.html");
		fullscreen.mobileScreenshots(driver, "es", "patient",  "accesssolutions-mobile-patient-pat");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/search.html");
		fullscreen.mobileScreenshots(driver, "es", "patient",   "accesssolutions-mobile-patient-search");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/pan.html");
		fullscreen.mobileScreenshots(driver, "es", "patient",   "accesssolutions-mobile-patient-pan");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/biooncology.html");
		movecursor(driver);
		fullscreen.mobileScreenshots(driver, "es", "patient",   "accesssolutions-mobile-patient-biooncology");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/rheumatology.html");
		fullscreen.mobileScreenshots(driver, "es", "patient",   "accesssolutions-mobile-patient-rheumatology");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/contact-us.html");
		fullscreen.mobileScreenshots(driver, "es", "patient",  "accesssolutions-mobile-patient-contact-us");
	}
	public static void movecursor(WebDriver driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement element;
		
		jse.executeScript("window.scrollTo(0, 0)");
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/button"));
		action.moveToElement(element).build().perform();
	}
	public static void movecursorm(WebDriver driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement element;
		
		jse.executeScript("window.scrollTo(0, 0)");
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/button"));
		action.moveToElement(element).build().perform();
	}
}
