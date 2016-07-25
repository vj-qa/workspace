import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RandomSeleniumAssignments {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.espncricinfo.com/ci/engine/match/913637.html");
		Thread.sleep(5000);
		driver.findElement(By.id("st_1")).click();
		Thread.sleep(3000);
		List<WebElement> row =driver.findElements(By.xpath("//*[@id='full-scorecard']//table[1]//tr"));
		for ( int i =2 ; i<row.size();i++){
			System.out.println("Row size " +row.size()+" "+ i);
			String path = "//*[@id='full-scorecard']//tr["+i+"]/td";
			List<WebElement> cells =driver.findElements(By.xpath(path));

			for ( int j=1 ; j<=9;j++){
				String info = cells.get(j).getText();
				System.out.print("\t"+info);
			}
			System.out.println("");
		}
	}

}
