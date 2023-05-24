package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import pages.N11Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;

public class N11StepDefinitions {
    N11Pages n11Pages = new N11Pages(DriverFactory.getDriver());

    @When("Kategorilere tıklanır")
    public void kategorilereTıklanır() {
        n11Pages.kategoriTıkla();
    }

    @When("Elektronik sekmesine tıklanır")
    public void elektronikSekmesineTıklanır() {
        n11Pages.elektronikTıkla();
    }

    @When("Telefon Aksesuarları seçilir")
    public void telefonAksesuarlarıSeçilir() {
        n11Pages.telefonAksesuarSeçimi();
    }

    @When("Cep telefonu seçilir")
    public void cepTelefonuSeçilir() {
        n11Pages.cepTelSeçimi();
    }

    @When("Filtrelemeye tıklanır")
    public void filtrelemeyeTıklanır() {
        n11Pages.filtrelemeTıkla();
    }

    @When("Filtreleme yapılır")
    public void filtrelemeYapılır() {
        n11Pages.filtrelemeYap();
    }

    @When("Sonuçları göstere tıklanır")
    public void sonuçlarıGöstereTıklanır() {
        n11Pages.sonuçlarıGöstereTıkla();
    }

    @When("Ürün sepete eklenir")
    public void ürünSepeteEklenir() {
        n11Pages.sepeteEkle();
    }

    @When("Sepete gidilir")
    public void sepeteGidilir() {
        n11Pages.sepeteGit();
    }

    @Then("Ürünün sepete geldiği kontrol edilir.")
    public void ürününSepeteGeldiğiKontrolEdilir() {
        n11Pages.sepetiKontrolEt();
    }
}
