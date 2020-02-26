package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;

import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class HomePageTest extends BaseTest {
    @Steps
    HomePageSteps homePageSteps;

    @Test
    public void checkTitleTest() {
        homePageSteps.isOnHomePage();
    }

    @Test
    public void checkCurrentURL() {
        homePageSteps.isURLCorrent();
    }

    @Test
    public void checkLogoIsDisplayed() {
        homePageSteps.isLogoDisplayed();
    }

    @Test
    public void clickOnAccount() {
        homePageSteps.clicksOnAccount();
    }

    @Test
    public void isAccountDropdownDisplayed() {
        homePageSteps.isAccountDropdownDisplayed();
    }

    @Test
    public void isAccountTextCorrect() {
        homePageSteps.checkAccountText();
    }

    @Test
    public void isNumberOfLangCorrect() {
        homePageSteps.verifyNumberOfLanguages();
    }

    @Test
    public void changeLanguageDropdown() {
        homePageSteps.languageDropdown();
    }
    @Test
    public void deleteSearchField(){
        homePageSteps.clearsSearchField();
    }
    String word = "DRESS";
    @Test
    public void submitInSearch(String word){

    }


}
