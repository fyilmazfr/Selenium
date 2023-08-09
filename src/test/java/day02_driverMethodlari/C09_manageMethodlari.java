package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir yukleme suresine ihtiyac vardir
        //veya bir webelementinin kullanilabilmesi icin zamana ihtiyac olabilir
        //implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek Maximum sureyi
        //belirleme olanagi tanir

        driver.get("https://amaazon.com");
        driver.close();
    }
}
