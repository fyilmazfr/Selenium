package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    public static void main(String[] args) {
        //amazona.com'a gidip arama kutusunu locate edin
        //arama kutusunun tagName'inin input oldugunu test edin
        // arama kutusunun name attribute'nun degerinin ...... oldugunu test edin

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazona.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));//locate ettik yerini bulduk

        //arama kutusunun tagName'inin input oldugunu test edin
        String expectedTagName="input";
        String actualTagName=aramakutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("TagName testi PASSED");
        }else {
            System.out.println("TagName testi FAILED");

        }

        // arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        String expectedNameDegeri="field-keywords";
        String actualNameDegeri=aramakutusu.getAttribute("name");
        if (expectedNameDegeri.equals(actualTagName)){
            System.out.println("name attribute degeri passed");
        }else {
            System.out.println("name attribute degeri Failed");


        }
        driver.close();

        //webElementISMI.getTagname()  daha once locate ettigimiz bir web elementin tagname'ini dondurur
        //webElementISMI.getAttribute(attributeIsmi )   daha once locate ettigimiz bir webelementin istedigim
        // attribute'unuN degerini dondurur

    }


}
