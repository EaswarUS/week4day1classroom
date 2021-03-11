package learnSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://erail.in/trains-between-stations/new-delhi-NDLS/mumbai-central-BCT");
		List<WebElement> allTrainNumbers= driver.findElementsByXPath("(//table[@class='DataTable TrainList TrainListHeader']//tr/td[1])");
		List<WebElement> allTrainNames = driver.findElementsByXPath("(//table[@class='DataTable TrainList TrainListHeader']//tr/td[2])");
		for (int i = 0; i < allTrainNumbers.size(); i++) {
			System.out.println(allTrainNumbers.get(i).getText());
			System.out.println(allTrainNames.get(i).getText());
		}
		/*
		 * // for (WebElement numbers : allTrainNumbers) { //
		 * System.out.println(numbers.getText()); // // } // for (WebElement names :
		 * allTrainNames) { // System.out.println(names.getText()); // // }
		 */	}

}
