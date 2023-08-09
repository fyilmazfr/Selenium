package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //maximize iken boyutlari ve konumu alalim
        System.out.println("maximize konum ; "+driver.manage().window().getPosition());//konum
        System.out.println("maximize boyut ; "+driver.manage().window().getSize());//boyut

        driver.manage().window().fullscreen();
        System.out.println("fulscreenden sonraki KONUM;"+ driver.manage().window().getPosition());
        System.out.println("fulscreenden sonraki BOYUT;"+driver.manage().window().getSize());
    }
}
