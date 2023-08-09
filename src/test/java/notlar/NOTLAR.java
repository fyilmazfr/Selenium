package notlar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOTLAR {
    /*
      en ilkel haliyle bir otomasyon yapmak icin class'imiza otomasyonumuza gerekli olan webdriver'in
      yerini gostermemiz gerekir, bunun icin java kutuphanesinden  System.setProperty () methodu kullaniriz
      method iki parametre istemektedir
      ilki kullanacagimiz driver:webdriver.corome.driver
      ikincisi ise bu driverin fiziki yolu:

      System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();




    *
    driver.get("https://techproeducation.com");//gitmek istedigimiz sayfaya get ile gidiyoruz

    *
    driver.manage().window().maximize();//browser'i tam ekran yapmak istedigimizde bunu yapariz

    * baslik istedigimizde get methodu ile aliriz
    System.out.println("actual title "+ driver.getTitle());//basligi istedik ve yazdirdik
        System.out.println("actual url "+ driver.getCurrentUrl());//basligin url'sini istedik

    * sayfayi kapatmak istersek,son acik olan sayfayi kapatir
     driver.close();

    * hash kodu isteyecegimiz zaman
    System.out.println(driver.getWindowHandle())

    *
      eger testimiz sirasinda ileri geri hareket edeceksek driver.get yerine
    driver .navigate().to methodunu kullaniriz
    ve sonrasinda forward(), back() veya refresh methodlarini kullanabiliriz
        driver.navigate().to("https://www.amazon.com");
        driver.navigate().to("https://facebook.com");
         //amazona geri donelim
        driver.navigate().back();
        //yeniden facebooka gidelim
        driver.navigate().forward();
         //sayfayi refresh yapalim
        driver.navigate().refresh();


    *
    driver.manage().window().getSize();
        System.out.println("pencere olculeri ; "+ driver.manage().window().getSize());
        System.out.println("pencere konumu ; "+driver.manage().window().getPosition() );
        Thread.sleep(2000);

       // pencerenin konumunu ve buyuklugunu degistirelim
        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        System.out.println("YENI pencere olculeri ; "+ driver.manage().window().getSize());
        System.out.println(" YENI pencere konumu ; "+driver.manage().window().getPosition() );

    *
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore bir yukleme suresine ihtiyac vardir
        veya bir webelementinin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek Maximum sureyi
        belirleme olanagi tanir
        sayfayi buyutme methodu maximize ve implicity methodunu herzaman yapmakta fayda var.

    *
        driver.quit(); acik olan tum broserlari kapatir

    *
    eger bir web elementin hdml kodunu bulabiliyorsaniz bir sekilde bunu otomasyonda kullanabilirsiniz

    * LOCATORS KONUM BELIRLEYICILER, YER BULUCU

       XPath en cok kullanilan LOCATORS 'dir.

       ornegin bur bir amazon arama butonunun attribute'leri

       <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
     placeholder="Rechercher Amazon.fr" class="nav-input nav-progressive-attribute" dir="ltr" tabindex="0"
     aria-label="Rechercher Amazon.fr" spellcheck="false">

    *
        bir web elementini tanimlamak icin 8 tane selenium locator vardir
    1. id
    2. className
    3. tagName
    5. linkText (input)
    6. partialLinkText
    7. xpath  ==> xpath yazmanin birden fazla yolu vardir
    8. cssSelector ==> css yazmanin birden fazla yolu vardir

   *
    1)  tanimladigimiz web elementinin yerini driver'in bulabilmesi icin findElement(LOCATOR) method'unu kullaniriz.
      driver.findElement(Locator);

    2)  findElement(LOCATOR) method'unun icine parametre olarak yazacagimiz Locator'in 8 locatordan hangisi oldugunu
      belirtmek icin By.LOCATORturu("locateBilgisi"); kullanilir
      orn;     driver.findElement(By.id("twotabsearchtextbox"));

    3)  Locate ettigimiz Web elementini kullanabilmek icin bir variable'a atama yapariz
       WebElement arama kutusu= driver.findElement(By.id("twotabsearchtextbox"));

    *
      herhangi bir Web elementine  ISTEDIGIMIZ yaziyi yollamak istersek yani (aratmak) istersek
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        1) By.id();
        web ogesini tanimlamanin en populer yolu id kullanmaktir
        id en guvenli ve en hizli locator secenegi olarak kabul edilir ve her zaman birden cok locators arasinda
        ilk oncelik olmalidir
        eger yanlis id locate edilirse ; NoSuchElementException hatasi olusur

        2) By name();
          WebElement arama kutusu= driver.findElement(By.name("field-keywords"));
          Name ve value unique ise bu metodu da kullanabilirsiniz.

        3) By.className();
         WebElement arama kutusu= driver.findElement(By.className("form-control"));

        4) By.linkText();
           WebElement arama kutusu= driver.findElement(By.linkText("Addresses"));
          buyuk kucuk harflere bosluga duyarlidir

        5) By.partialLinkText();
           WebElement arama kutusu= driver.findElement(By.partialLinkText("dresses"));

        6)By.tagName();
           WebElement arama kutusu= driver.findElement(By.tagName("input"));
           orn;

            kactane link olduguna bakmak icin;
        driver.get("https://www.amazon.com");
        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));//kactane link olduguna bakalim,byueden list
        olusturduk.
        System.out.println("sayfadaki link sayisi : "+linkListesi.size());
         bunlari for each ile yazdirabiliriz.

      *bir webElentin uzerinde ne yazmasini gormek istersek webElementIsmi.getText() kullaniriz aksi halde referansini
      bize yazdirir


      * bir web elementinin gorunup gorunmedigini test etmek istiyorsak
      isDisplayed() methoduyla test ederiz ve bize sonuc boolean dondurur.

      *
      webElementISMI.getTagname()  daha once locate ettigimiz bir web elementin tagname'ini dondurur
        webElementISMI.getAttribute(attributeIsmi )   daha once locate ettigimiz bir webelementin istedigim
         attribute'unuN degerini dondurur(html)

         MAVEN
         Framewor'un altini dolduracak isler yapmistir
         Bir yazilim proje yonetimi ve anlama aracidir
         POM project pbject model konseptine dayalidir
         pom xml;
         Ilgili kutuphanenin kutuphanesine gidip ordaki gitub a gidip repostory'i alip geliyor



































     */
}
