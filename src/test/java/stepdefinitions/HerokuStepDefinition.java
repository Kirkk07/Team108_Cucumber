package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuStepDefinition {
    HerokuPage herokupage= new HerokuPage();

    @Then("AddElement butonuna basar")
    public void add_element_butonuna_basar() {

    herokupage.addElementButton.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekler")
    public void delete_butonu_gorunur_oluncaya_kadar_bekler() {
    // Implicitly wait suresi yeterli oldugu icin bu adimda kod yazilmadi.
    }
    @Then("Delete butonunun gorunur oldugunu test eder")
    public void delete_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(herokupage.deleteButton.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
        herokupage.deleteButton.click();

    }
    @Then("Delete butonunun gorunmedigini test eder")
    public void delete_butonunun_gorunmedigini_test_eder() {
        try {
            Assert.assertFalse(herokupage.deleteButton.isDisplayed());


        } catch (NoSuchElementException e) {
            Assert.assertTrue(true);
        }

    }
}
