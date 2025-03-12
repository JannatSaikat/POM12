import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHome extends Base{
    @FindBy(css = "[aria-label='Search for anything']")
    WebElement search;

    @FindBy(css = ".srp-controls__count-heading span:nth-of-type(2)") WebElement searchResult;

    void search(String word){
        search.sendKeys(word, Keys.ENTER);
    }

    String result(){
        return searchResult.getText();
    }




}
