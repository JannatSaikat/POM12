import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class HomePage extends Base{


    @FindBy(css = ".MuiBox-root.mui-saptuz a img") WebElement logo;
    @FindBy(xpath = "//input[@aria-label='Search Costco']") WebElement search;

    @FindBy(css = ".MuiBox-root.mui-gg4vapm h1") WebElement searchResult;

    @FindBy(css = ".mui-1pgflb3") WebElement noThanks;

    @FindBy(css = ".MuiBox-root.mui-aumc0b") WebElement footer;

    @FindBy(css = "[data-testid=\"jump-to-mainContent\"]") WebElement navPromo;

    boolean isLogoVisible(){
        waitForElementVisibility(5000, logo);
        return logo.isDisplayed();
    }

    void search(String text){
        clickNoThanks();
        search.sendKeys(text, Keys.ENTER);
    }

    String searchResult(){
        return searchResult.getText();
    }


    boolean footer(){
        return footer.isDisplayed();
    }

    boolean promo(){
        return navPromo.isDisplayed();
    }
    private void clickNoThanks(){
        waitForElementVisibility(10000, noThanks);
        noThanks.click();
    }

}
