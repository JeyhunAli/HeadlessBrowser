package htmlUnitconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * 
 * @author jey
 * Advantages of the html unit driver 
 * 1. There's no browser everything is happening without browser behind the scene
 * 2. its very fast of the execution
 *  its not suitable for the actions class mouse movement or some other actions
 *  its not suitable for any other complex project
 *  its very handy when project is small and interview point 
 *  htmlunit driver is available in jar file and as well as in mvn dependency 
 *
 *
 */


public class HtmlUnit {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        System.out.println("after launching the browser title is : " +driver.getTitle());
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Azerbaijan");
        System.out.println("html unit works perfectly fine ");
		
	}

}
