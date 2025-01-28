package selenium_web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	
    public static void main(String[] args) {
    	
    
    /*public static WebDriver driver;
    
    public void setDriver(WebDriver driver) {
    	Selenium.driver = driver;
    }
    protected WebElement find(By locator) {
    	return driver.findElement(locator);
    }
    protected void set(By locator, String text) {
    	driver.findElement(locator);
    	find(locator).clear();
    }
    
    protected void click(By locator) {
    	find(locator).click();
    }*/
    
        WebDriverManager.chromedriver().setup(); // WebDriverManager gerencia o ChromeDriver
        WebDriver driver = new ChromeDriver();
        try {
        	driver.manage().window().maximize();
            driver.get("https://www.google.com");
            WebElement searchBox = driver.findElement(By.name("q"));
            Thread.sleep(1000);
            searchBox.sendKeys("DISCORD");
            searchBox.submit();
            Thread.sleep(500000);
            System.out.println("Título da página: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
