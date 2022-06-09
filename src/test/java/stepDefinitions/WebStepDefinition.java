package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import pages.WebPage;
import utilities.Driver;

import java.util.List;
import java.util.Set;

public class WebStepDefinition {
    Actions actions = new Actions(Driver.getDriver());
    String ilkhandel;
    WebPage webPage = new WebPage();

    @Then("Login portala kadar asagi inildi")
    public void login_portala_kadar_asagi_inildi() {
        ilkhandel = Driver.getDriver().getWindowHandle();
        System.out.println("1.   :  "+ ilkhandel);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Then("Login Portal a tiklayin")
    public void login_portal_a_tiklayin() {

        webPage.loginButton.click();


    }

    @Then("Diger window'a gecin")
    public void diger_window_a_gecin() {
        Set<String> handels = Driver.getDriver().getWindowHandles();
        String ikincihandel = "";
        for (String each : handels
        ) {
            if (!ilkhandel.equals(each)) {

                ikincihandel = each;
                System.out.println("2. :   "+ikincihandel);

            }

        }

       // Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().switchTo().window(ikincihandel);
    }

    @Then("{string} ve {string} kutularina deger yazdirin")
    public void ve_kutularina_deger_yazdirin(String isim, String sifre) {

        webPage.username.sendKeys("Veysel");
        webPage.password.sendKeys("12343");

    }

    @Then("login butonuna basin")
    public void login_butonuna_basin() {
        webPage.login.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldugunu test edin")
    public void popup_ta_cikan_yazinin_oldugunu_test_edin(String testyazi) {

        String extendTitel="validation failed";
        String actualtitel=Driver.getDriver().switchTo().alert().getText();

        Assert.assertTrue(actualtitel.contains(extendTitel));

        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Ok diyerek Popup'i kapatin")
    public void ok_diyerek_popup_i_kapatin() {

    }

    @Then("Ilk sayfaya geri donun")
    public void ılk_sayfaya_geri_donun() {

        Driver.getDriver().switchTo().window(ilkhandel);

    }

    @Then("Ilk sayfaya donuldugunu test edin")
    public void ılk_sayfaya_donuldugunu_test_edin() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(webPage.loginButton.isDisplayed());


    }
}
