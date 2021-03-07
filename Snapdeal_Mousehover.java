package learnselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal_Mousehover {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    driver.get("https://www.snapdeal.com/");
		    WebElement mf = driver.findElementByXPath("(//span[@class='catText'])[6]");
		    WebElement lf = driver.findElementByXPath("//span[text()='Loafers']");
		    Actions builder = new Actions (driver);
		    builder.moveToElement(mf).perform();
		   lf.click();
		   WebElement img = driver.findElementByXPath("(//img[@class='product-image '])[1]");
//		   WebElement qv = driver.findElementByXPath("(//div[@class='center quick-view-bar  btn btn-theme-secondary  '])[1]");
		   builder.moveToElement(img).perform();
		   img.click();
		   driver.close();
		    

	}

}
