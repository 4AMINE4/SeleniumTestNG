package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static Test.SeleniumTest.driver;

public class ProductsPages {
    public static String formalShoes = "/html/body/div[2]/center/h2";

    public static String sportShoes = "/html/body/div[3]/center/h2";

    public static String sneakers = "/html/body/div[4]/center/h2";

    public static String formalShoesDropdown = "/html/body/div[2]/center/div/i[1]";

    public static String sportShoesDropdown = "/html/body/div[3]/center/div/i[1]";

    public static String sneakersDropdown = "/html/body/div[4]/center/div/i[1]";

    public static String formalShoes_firstName = "/html/body/div[2]/table/tbody/tr[1]/td[1]";

    public static String sportShoes_firstName = "/html/body/div[3]/table/tbody/tr[1]/td[1]";

    public static String sneakers_firstName = "/html/body/div[4]/table/tbody/tr[1]/td[1]";



    public static void formalShoes_verifyTitle(){
        String expectedTitleFS = "Formal Shoes";
        String actualTitleFS = driver.findElement(By.xpath(formalShoes)).getText();
        Assert.assertEquals(expectedTitleFS, actualTitleFS);


    }

    public static void sportShoes_verifyTitle(){
        String expectedTitleSS = "Sports Shoes";
        String actualTitleSS = driver.findElement(By.xpath(sportShoes)).getText();
        Assert.assertEquals(expectedTitleSS, actualTitleSS);
    }

    public static void sneakers_verifyTitle(){
        String expectedTitleS = "Sneakers";
        String actualTitleS = driver.findElement(By.xpath(sneakers)).getText();
        Assert.assertEquals(expectedTitleS, actualTitleS);
    }

    public static void formalShoes_firstName_verifyTitle(){
        String expectedFirstNameFS = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalShoesDropdown)).click();
        String actualFirstNameFS = driver.findElement(By.xpath(formalShoes_firstName)).getText();
        Assert.assertEquals(expectedFirstNameFS, actualFirstNameFS);
    }

    public static void sportShoes_firstName_verifyTitle(){
        String expectedFirstNameSS = "   Ultimate";
        driver.findElement(By.xpath(sportShoesDropdown)).click();
        String actualFirstNameSS = driver.findElement(By.xpath(sportShoes_firstName)).getText();
        Assert.assertEquals(expectedFirstNameSS, actualFirstNameSS);
    }

    public static void sneakers_firstName_verifyTitle(){
        String expectedFirstNameS = "   Archivo";
        driver.findElement(By.xpath(sneakersDropdown)).click();
        String actualFirstNameS = driver.findElement(By.xpath(sneakers_firstName)).getText();
        Assert.assertEquals(expectedFirstNameS, actualFirstNameS);

    }


}

