package pages;

import org.openqa.selenium.By;

import static Test.SeleniumTest.driver;

public class HomePage {

    public static String humburgerMenu = "//*[@id=\'menuToggle\']/input";

    public static String onlineProducts = "//*[@id=\'menu\']/a[3]/li";

    public static void humburgerMenuClick(){
        driver.findElement(By.xpath(humburgerMenu)).click();
    }

    public static void onlineProductsClick() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(onlineProducts)).click();
    }
}
