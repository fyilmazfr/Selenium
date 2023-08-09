package day01SeleniumProje;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    @Test
    public void test(){
        /*en ilkel haliyle bir otomasyon yapmak icin class'imiza otomasyonumuza gerekli olan webdriver'in
        yerini gostermemiz gerekir, bunun icin java kutuphanesinden  System.setProperty () methodu kullaniriz

        method iki parametre istemektedir
        ilki kullanacagimiz driver:webdriver.corome.driver
        ikincisi ise bu driverin fiziki yolu:

         */



        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.techproeducation.com");
       // Thread.sleep(2000);
        driver.get("https://www.facebook.com");





    }


}
