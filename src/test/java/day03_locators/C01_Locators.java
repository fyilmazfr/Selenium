package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona gidip nutella aratalim

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));//boylece arama kutusunu bulduk
        //findElement(By.id("twotabsearchtextbox")  istedigimiz web elementini bize dondurur ,biz de o webelementini
        //kullanmak icin bir objeye assign ederiz

        //herhangi bir Web elementine  ISTEDIGIMIZ yaziyi yollamak istersek yani (aratmak) istersek
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //bazen sectigimiz locators calismayabilir.bir locators calisirken gozumuzden kacan detaylar olabilir
        //aldigimiz BIR locators calismazsa alternatif locators'lar denemeliyiz .



    }
}
