package day04_xPath_cssLocater;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //amazon sayfasina gidin
        driver.get("https;//www.amazon.com/");

        //search(ara) "city bike"
        WebElement aramakutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("city bike"+ Keys.ENTER);//arama tusuna city bike 'i ara dedik

        //amazonda goruntulenen ilgili sonuclarin sayisini yazdirin
        List<WebElement> istenenElementListesi=driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));
        WebElement sonucYazisiElementi=istenenElementListesi.get(0);//listeden birinci elementtekini aldik getirdik
        System.out.println(sonucYazisiElementi.getText());

        //  //sonra karsiniza cikan ilk sonucun resmine tiklayin
        List<WebElement> urunResimleriList=driver.findElements(By.className("a"));//parantez ici yanlis yazdim
        WebElement ilkurunResmi=urunResimleriList.get(0);
        ilkurunResmi.click();//listenin birinci elementini aldik ve onu click yaptik




    }
}
