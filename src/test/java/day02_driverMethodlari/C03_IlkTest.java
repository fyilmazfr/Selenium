package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /* 1- https://www.amazon.com url'sine gidin
        2- basligin Amazon kelimesi icerdigini test edin
        3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        4- sayfayi kapatin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1- https://www.amazon.com url'sine gidin
        driver.get("https://www.amazon.com");
        // 2- basligin Amazon kelimesi icerdigini test edin
       String actualTitle= driver.getTitle();
       String arananKelime="Amazon";

       if (actualTitle.contains(arananKelime)){
           System.out.println("title testi passed");
       }else{
           System.out.println("title"+arananKelime+ "yi  icermiyor, title testi failed");
       }
       //3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl=driver.getCurrentUrl();
       String expectedUrl="https://www.amazon.com/";
       if (actualUrl.equals(expectedUrl)){
           System.out.println("url testi passed");
       }else {
           System.out.println("actual url: "+" beklenen  url'den farkli ,test FAILED");// bir slash isareti bile ONEMLIDIR
       }
      //   4- sayfayi kapatin
        driver.close();

    }
}
