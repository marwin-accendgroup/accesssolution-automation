package accesssolutionEN;

import library.fullscreen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ocrevus {

	public static void main(String[] args, WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions actions = new Actions(driver);
		
		//---->> ocrevus <<---- 37 screenshot for ocrevus
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-0.0");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/how-we-help-you.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-1.0");

		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-1.0-tab1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-1.0-GATCF-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-1.0-GATCF-2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("How do I enroll?")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-1.0-step1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("What will we find out?")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-1.0-step2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("What options are there?")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-1.0-step3");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/forms-and-documents.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-2.0");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-2.0-esubmit");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-2.0-more-info-1");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-2.0-more-info-2");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/frequently-asked-questions.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_191050647']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab3");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[1]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab4");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[2]/div[1]")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab5");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[3]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab6");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[1]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab7");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[2]/div[1]")).click();
		movecursor1(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab8");
		
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[3]/div[1]")).click();
		movecursor1(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab9");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[1]/div[1]")).click();
		movecursor1(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab10");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[2]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",   "accesssolutions-patient-ocrevus-3.0-tab11");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/patient-assistance-tool-page.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-part1");
		
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]"))).build().perform();
		Thread.sleep(1000);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-part2");
		jse.executeScript("window.scrollTo(0, 0)");
		
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-1-part1");
		
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[4]/div/p[6]"))).build().perform();
		Thread.sleep(1000);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-1-part2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-more-info-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-2-part1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[3]/div/p[6]"))).build().perform();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-2-part2");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[5]/div[2]/button")).click();
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-more-info-2");
		
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-3-part1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[2]/div/p[6]"))).build().perform();
		Thread.sleep(1000);
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-pat-3-part2");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/search.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-search");

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/site-map.html");
		fullscreen.desktopScreenshots(driver, "en", "ocrevus",  "accesssolutions-patient-ocrevus-site-map");			
	}
	public static void ocrevus_mobile(WebDriver driver) throws InterruptedException{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//---->> ocrevus <<---- 37 screenshot for ocrevus
		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-0.0");

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/how-we-help-you.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-1.0");

		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-1.0-tab1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-1.0-GATCF-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-1.0-GATCF-2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div/div/div[2]/div/div/div[1]/div/div"));
		jse.executeScript("arguments[0].setAttribute('style', 'padding-bottom:50px;')",element);
		driver.findElement(By.linkText("How do I enroll?")).click();
		jse.executeScript("arguments[0].setAttribute('style', 'padding-bottom:0px;')",element);
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-1.0-step1");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("What will we find out?")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-1.0-step2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("What options are there?")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-1.0-step3");

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/forms-and-documents.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-2.0");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-2.0-more-info-1");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-2.0-more-info-2");

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/frequently-asked-questions.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab1");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_191050647']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab3");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[1]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab4");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[2]/div[1]")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab5");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[3]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab6");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[1]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab7");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[2]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab8");

		driver.findElement(By.xpath("//*[@id='accordion_3']/div[3]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab9");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[1]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab10");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[2]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-3.0-tab11");

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/patient-assistance-tool-page.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-pat");
		jse.executeScript("window.scrollTo(0, 0)");

		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-pat-1");
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-more-info-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		fullscreen.mobileScreenshots(driver, "en", "perjeta",  "accesssolutions-mobile-patient-ocrevus-pat-2");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0, 0)");
		
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[5]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",   "accesssolutions-mobile-patient-ocrevus-more-info-2");

		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-pat-3");		

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/search.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-search");

		driver.get("http://localhost:4503/content/accesssolutions-site/en_us/patient/brands/ocrevus/site-map.html");
		fullscreen.mobileScreenshots(driver, "en", "ocrevus",  "accesssolutions-mobile-patient-ocrevus-site-map");
	}
	public static void movecursor(WebDriver driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement element;
		
		jse.executeScript("window.scrollTo(0, 0)");
		element = driver.findElement(By.name("q"));
		action.moveToElement(element).build().perform();
	}
	public static void movecursor1(WebDriver driver) {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions action = new Actions(driver);
		WebElement element;
		
		jse.executeScript("window.scrollTo(0, 0)");
		element = driver.findElement(By.linkText("FAQs"));
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
