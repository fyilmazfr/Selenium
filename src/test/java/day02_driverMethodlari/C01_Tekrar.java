package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();//driver olusturuyoruz

        driver.get("https://techproeducation.com");//gitmek istedigimiz sayfaya get ile gidiyoruz
    }
}
