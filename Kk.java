package p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\venkatrao\\Desktop\\Selinium\\geckodriver-v0.10.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		  driver1.get("http://localhost:1981");
		  Thread.sleep(5000);
		  driver1.quit();
	}

}
