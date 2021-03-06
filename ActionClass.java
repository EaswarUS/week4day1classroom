package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Dropdown.html");
		WebElement Appium = driver.findElementByXPath("(//option[text()='Appium'])[6]");
		WebElement Loadrunner = driver.findElementByXPath("(//option[text()='Loadrunner'])[6]");
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(Appium).click(Loadrunner).keyUp(Keys.CONTROL).perform();

	}

}
