package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import page.HeaderPage;
import page.HomePage;


public class HomePageSteps extends ScenarioSteps {


    HomePage homePage;

    @Step
    public void isOnHomePage() {
        Assert.assertEquals(homePage.getTitle(), "Madison Island");
        System.out.println(homePage.getTitle());
    }

    @Step
    public void isURLCorrent() {
        Assert.assertEquals(homePage.getCurrentURL(), "http://qa2.dev.evozon.com/");
        System.out.println(homePage.getCurrentURL());
    }

    @Step
    public void isLogoDisplayed() {
        Assert.assertTrue(homePage.getLogo().isDisplayed());
    }

    @Step
    public void clickOnLogo() {
        isLogoDisplayed();
        homePage.getLogo().click();
    }

    @Step
    public void clicksOnAccount() {
        homePage.getAccountBtn().click();
    }

    @Step
    public void isAccountDropdownDisplayed() {
        clicksOnAccount();
        Assert.assertTrue(homePage.getAccountDropdown().isDisplayed());
    }

    @Step
    public void checkAccountText() {
        Assert.assertEquals("ACCOUNT", homePage.getAccountBtn().getText());
    }

    @Step
    public void verifyNumberOfLanguages() {
        Assert.assertTrue(homePage.getNumberOFLanguageOptions() == 3);
    }

    @Step
    public void languageDropdown() {
        homePage.selectDropdownValues();
    }
    @Step
    public void clearsSearchField(){
        homePage.clearSearchField();
    }
    @Step
    public void submitsInSearch(String word){

    }



}
