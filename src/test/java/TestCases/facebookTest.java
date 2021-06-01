package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class facebookTest {
    private WebDriver driver;


    @Test(groups = "run")
    public void facebookTest(){
        System.out.println("Entro a facebook desde Jenkis con el valor de parametro: ");

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com");
    }

}
