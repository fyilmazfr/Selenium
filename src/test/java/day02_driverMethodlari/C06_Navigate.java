package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_Navigate {
    public static void main(String[] args) throws InterruptedException {
   /*
eger testimiz sirasinda ileri geri hareket edeceksek driver.get yerine
driver .navigate().to methodunu kullaniriz
ve sonrasinda forward(), back() veya refresh methodlarini kullanabiliriz
 */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//tam ekran yapalim

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://facebook.com");
        Thread.sleep(2000);

        //amazona geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //yeniden facebooka gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayi refresh yapalim
        driver.navigate().refresh();
        Thread.sleep(2000);


        //sayfayi kapatalim
        driver.close();


    }
}
