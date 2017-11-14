package accesssolutionEs;

import library.fullscreen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class es_herceptin {

	public static void main(String[] args, WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Actions actions = new Actions(driver);
		
		//---->> herceptin <<---- 29 screenshot for herceptin
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin.html");
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-0.0");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/how-we-help-you.html");
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-1.0");
		
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-1.0-tab1");
		
		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-1.0-tab2");
		jse.executeScript("window.scrollTo(0, 0)");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-1.0-GATCF-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-1.0-GATCF-2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("�C�mo me inscribo?")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin", "accesssolutions-patient-herceptin-1.0-step1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("�Qu� averiguaremos?")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin", "accesssolutions-patient-herceptin-1.0-step2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("�Qu� Opciones Hay?")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin", "accesssolutions-patient-herceptin-1.0-step3");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/forms-and-documents.html");
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-2.0");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div[2]/div/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-2.0-esubmit");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-2.0-more-info-1");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-2.0-more-info-2");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/frequently-asked-questions.html");
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_1321572214']/div/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab3");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[1]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab4");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[2]/div[1]")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab5");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[3]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab6");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[1]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab7");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[2]/div[1]")).click();
		movecursor1(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab8");
		
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[3]/div[1]")).click();
		movecursor1(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab9");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[1]/div[1]")).click();
		movecursor1(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab10");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[2]/div[1]")).click();
		movecursor(driver);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",   "accesssolutions-patient-herceptin-3.0-tab11");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/patient-assistance-tool-page.html");
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-part1");
		
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]"))).build().perform();
		Thread.sleep(1000);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-part2");
		jse.executeScript("window.scrollTo(0, 0)");
		
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-1-part1");
		
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[4]/div/p[6]"))).build().perform();
		Thread.sleep(1000);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-1-part2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-more-info-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-2-part1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[3]/div/p[6]"))).build().perform();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-2-part2");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[5]/div[2]/button")).click();
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[1]/a")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-more-info-2");
		
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-3-part1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		actions.moveToElement(driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[2]/div/p[6]"))).build().perform();
		Thread.sleep(1000);
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-pat-3-part2");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/search.html");
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-search");
		
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/site-map.html");
		fullscreen.desktopScreenshots(driver, "es", "herceptin",  "accesssolutions-patient-herceptin-sitemap");			
	}
	public static void herceptin_mobile(WebDriver driver) throws InterruptedException{
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		//---->> herceptin <<---- 29 screenshot for herceptin
		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin.html");
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-0.0");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/how-we-help-you.html");
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-1.0");

		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-1.0-tab1");

		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-1.0-tab2");
		
		jse.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-1.0-GATCF-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-1.0-GATCF-2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		jse.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(1000);
//		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[6]/div/div/div[2]/div/div/div[1]/div/div"));
//		jse.executeScript("arguments[0].setAttribute('style', 'padding-bottom:50px;')",element);
		driver.findElement(By.linkText("�C�mo me inscribo?")).click();
//		jse.executeScript("arguments[0].setAttribute('style', 'padding-bottom:0px;')",element);
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-1.0-step1");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("�Qu� averiguaremos?")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-1.0-step2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.linkText("�Qu� Opciones Hay?")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-1.0-step3");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/forms-and-documents.html");
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-2.0");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-2.0-more-info-1");
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[2]/div/div[3]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-2.0-more-info-2");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/frequently-asked-questions.html");
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab1");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_0']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab2");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_1321572214']/div/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab3");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[1]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab4");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[2]/div[1]")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab5");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_2']/div[3]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab6");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[1]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab7");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_3']/div[2]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab8");

		driver.findElement(By.xpath("//*[@id='accordion_3']/div[3]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab9");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[1]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab10");

		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accordion_4']/div[2]/div[1]")).click();
		movecursorm(driver);
		fullscreen.mobileScreenshots(driver, "es", "herceptin",   "accesssolutions-mobile-patient-herceptin-3.0-tab11");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/patient-assistance-tool-page.html");
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-pat");
		jse.executeScript("window.scrollTo(0, 0)");

		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[2]")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-pat-1");
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.className("start-over")).click();
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[1]/div[2]/fieldset/button[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-pat-more-info-1");
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[2]")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-pat-2");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[5]/div[2]/button")).click();
		
		jse.executeScript("window.scrollTo(0, 0)");
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[2]/div[2]/fieldset/button[1]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[1]/a")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-pat-more-info-2");
		
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[3]/div[2]/fieldset/button[2]")).click();
		driver.findElement(By.xpath("//*[@id='accesssolutionsembed']/div/div/div/div[2]/div[1]/ul/li[4]/div[2]/fieldset/button[1]")).click();
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-pat-3");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/search.html");
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-search");

		driver.get("http://localhost:4503/content/accesssolutions-site/es/patient/brands/herceptin/site-map.html");
		fullscreen.mobileScreenshots(driver, "es", "herceptin",  "accesssolutions-mobile-patient-herceptin-sitemap");
		
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
		element = driver.findElement(By.linkText("Preguntas frecuentes"));
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
