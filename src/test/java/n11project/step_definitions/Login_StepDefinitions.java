package n11project.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import n11project.pages.LoginPage;
import n11project.utilities.ConfigurationReader;
import n11project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("kullanici giris sayfasinda")
    public void kullanici_giris_sayfasinda() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("kullanici adini girer")
    public void kullanici_adini_girer() {
        loginPage.loginSign.click();

    }

    @When("kullanici sifresini girer")
    public void kullanici_sifresini_girer() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @When("kullanici siteye girer")
    public void kullanici_siteye_girer() {
        loginPage.loginSign.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "n11- Hayat Sana Gelir";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("kullanici iphone kelimesini aratir")
    public void kullanici_iphone_kelimesini_aratir() {
        loginPage.searchBox.sendKeys("Iphone" + Keys.ENTER);

    }

    @When("arama sonuclari sayfasi acilir")
    public void arama_sonuclari_sayfasi_acilir() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Iphone - n11.com";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("kullanici sayfadaki ucuncu urunu favorilere ekler")
    public void kullanici_sayfadaki_ucuncu_urunu_favorilere_ekler() {
        loginPage.addFavoriteSign.click();
    }

    @When("kullanici hesabindan favorilere gider")
    public void kullanici_hesabindan_favorilere_gider() {
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.myAccount).perform();
        loginPage.myFavoriteList.click();
        Assert.assertTrue(loginPage.myFavoriteListDisplay.isDisplayed());

    }

    @When("kullanici eklenen urunu favorilerden siler")
    public void kullanici_eklenen_urunu_favorilerden_siler() {
        loginPage.favoriteListDetails.click();
        loginPage.deleteProduct.click();
        loginPage.deleteConfirmButton.click();

    }

    @Then("kullanici siteden cikar")
    public void kullanici_siteden_cikar() {
        Actions actions= new Actions(Driver.getDriver());
        actions.moveToElement(loginPage.myAccount).perform();
        loginPage.exitAccount.click();

    }

}
