package dev.selenium.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

    public static void main(String[] args) {
        // Configura o caminho para o ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\chromedriver\\chromedriver-win64\\chromedriver.exe");

        // Inicializa o WebDriver
        WebDriver driver = new ChromeDriver();

        // Abre o Google
        driver.get("https://www.google.com");

        // Exibe o título da página
        System.out.println("Título da página: " + driver.getTitle());

        // Fecha o navegador
        driver.quit();
    }
}
