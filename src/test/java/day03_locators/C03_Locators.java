package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // http://a.testaddressbook.com adresine gidiniz
        driver.get("https://a.testaddressbook.com");

        //sign in butonuna basiniz
        WebElement signInLinki = driver.findElement(By.linkText("sign-up highlight"));
        signInLinki.click();//bu linke tiklamamizi istiyor

        //FIRST NAME BUTONUNU locate ediniz
        WebElement emailTextBox=driver.findElement(By.id("first_name"));
        WebElement signInTextBox=driver.findElement(By.name("commit"));

        //daha sonrasini yazmadim username passport da da ayni methodlari uyguladik
        //driver'im calismadigi icin devam etmiyorum 3. VIDEO  ,1.47. Saniye



    }
}
