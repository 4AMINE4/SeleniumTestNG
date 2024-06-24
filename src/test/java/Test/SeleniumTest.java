package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsPages;

public class SeleniumTest {

    public static WebDriver driver;

    @BeforeTest
    public static void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        HomePage.humburgerMenuClick();
        HomePage.onlineProductsClick();
    }

    @Test
    void validateTitles_OnlineProducts(){
        ProductsPages.formalShoes_verifyTitle();
        ProductsPages.sportShoes_verifyTitle();
        ProductsPages.sneakers_verifyTitle();
    }

    @Test
    void validateFirstTitleFormalShoes(){
        ProductsPages.formalShoes_firstName_verifyTitle();
    }
    @Test
    void validateFirstTitleSportShoes(){
        ProductsPages.sportShoes_firstName_verifyTitle();
    }

    @Test
    void validateFirstTitleSneakers(){
        ProductsPages.sneakers_firstName_verifyTitle();
    }


}
