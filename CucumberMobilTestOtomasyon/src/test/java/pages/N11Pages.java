package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ElementHelper;

import java.util.List;

public class N11Pages {

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public N11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    By kategoriButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By filtrelemeButonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By dahiliHafıza = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By gb1 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By gb2 = MobileBy.AndroidUIAutomator("new UiSelector().text(\"256 GB\")");
    By uygula = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/applyBtn\")");
    By model = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
    By araButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/et_attribute_search_bar\")");
    By sonucGoster = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/giybiFilterShowResultsBTN\")");
    By sepeteEkle = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
    By devamButonu = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/continueButton\")");
    By sepetim = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By basketItemTitle = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple iPhone 14 Pro 128 GB (Apple Türkiye Garantili)\")");


    public void kategoriTıkla() {

        driver.findElement(kategoriButonu).click();
    }

    public void elektronikTıkla() {
        List<WebElement> listOfElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(1).click();
    }

    public void telefonAksesuarSeçimi() {
        List<WebElement> listOfElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(0).click();
    }

    public void cepTelSeçimi() {
        List<WebElement> listOfElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        listOfElement.get(0).click();


    }

    public void filtrelemeTıkla() {

        driver.findElement(filtrelemeButonu).click();
    }

    public void filtrelemeYap() {
        driver.findElement(dahiliHafıza).click();
        driver.findElement(gb1).click();
        driver.findElement(gb2).click();
        driver.findElement(uygula).click();
        driver.findElement(model).click();
        driver.findElement(araButonu).click();
        //driver.findElement(araButonu).sendKeys("Iphone 14");
        elementHelper.sendKeys(araButonu,"Iphone 14"); //elementhelper classındaki sendKeys methodunu kullandık
        List<WebElement> listOfElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/nameTV\")"));
        listOfElement.get(1).click();
        listOfElement.get(2).click();
        driver.findElement(uygula).click();

    }

    public void sonuçlarıGöstereTıkla() {

        driver.findElement(sonucGoster).click();
    }

    public void sepeteEkle() {

        driver.findElement(sepeteEkle).click();
        List<WebElement> listOfElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/skuNameTV\")"));
        listOfElement.get(0).click();
        listOfElement.get(4).click();
        driver.findElement(devamButonu).click();
    }

    public void sepeteGit() {

        driver.findElement(sepetim).click();
    }

    public void sepetiKontrolEt() {

        elementHelper.checkVisible(basketItemTitle);

      }
}
