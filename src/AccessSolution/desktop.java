package AccessSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class desktop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		// start
//		desktop_en.main(args, driver);
		desktop_es.main(args, driver);
		
		driver.quit();
	}
}
