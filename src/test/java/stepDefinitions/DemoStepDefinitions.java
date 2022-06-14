package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.DemoPage;
import utilities.Driver;

import java.time.Duration;

public class DemoStepDefinitions {

DemoPage demoPage=new DemoPage();
    @Then("“Will enable {int} seconds” butonunun enable olmasini beklenir")
    public void will_enable_seconds_butonunun_enable_olmasini_beklenir(Integer int1) {

        WebDriverWait wait =new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

       wait.until(ExpectedConditions.visibilityOf(demoPage.yazi));


    }
    @Then("“Will enable {int} seconds” butonunun enable oldugunu test edilir")
    public void will_enable_seconds_butonunun_enable_oldugunu_test_edilir(Integer int1) {

        Assert.assertTrue(demoPage.yazi.isDisplayed());

    }
    @Then("sayfa kapanir")
    public void sayfa_kapanir() {

    }
}
