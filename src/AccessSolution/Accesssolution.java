package AccessSolution;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.DocumentException;

public class Accesssolution {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException, DocumentException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32-v2.33\\chromedriver.exe");

		desktop.main(args);
//		mobile.main(args);
		pdfcreator.main(args);
	}
}