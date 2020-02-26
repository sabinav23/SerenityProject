package page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;


import java.util.List;

import static org.hamcrest.CoreMatchers.is;


@DefaultUrl("http://qa2.dev.evozon.com/")
public class HomePage extends AbstractPage {

    @FindBy(css = ".logo")
    private WebElementFacade logo;
    @FindBy(css = ".skip-account")
    private WebElementFacade accountBtn;
    @FindBy(css = "#header-account")
    private WebElementFacade accountDropdown;
    @FindBy(css = "#select-language > option")
    private List<WebElementFacade> languageOpt;
    @FindBy(css = "#select-language")
    private WebElementFacade languageOption;
    @FindBy(css="#search")
    private WebElementFacade searchField;


    public String getTitle() {
        return getDriver().getTitle();
    }

    public String getCurrentURL() {
        return getDriver().getCurrentUrl();
    }

    public WebElementFacade getLogo() {
        return logo;
    }

    public WebElementFacade getAccountBtn() {
        return accountBtn;
    }

    public WebElementFacade getAccountDropdown() {
        return accountDropdown;
    }

    public int getNumberOFLanguageOptions() {
        return languageOpt.size();
    }

    public void selectDropdownValues() {
        languageOption.selectByVisibleText("French");
        Assert.assertThat(languageOption.getSelectedVisibleTextValue(), is("French"));
    }
    public void clearSearchField(){
        searchField.clear();
        Assert.assertTrue(searchField.getTextContent().isEmpty());
    }
    public void fillSearchField(String word){
        searchField.sendKeys(word);
        searchField.submit();
    }
}













