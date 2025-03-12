import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Base{

    @FindBy(css = "[automation-id='continueShoppingButton']")
    WebElement continueShopping;

    @FindBy(id = "footer-search-field") WebElement searchStore;

    void clickContinueShopping(){
        waitForElementVisibility(5000, continueShopping);
        continueShopping.click();
    }

    void searchLocation(){
        searchStore.sendKeys("New York", Keys.ENTER);
    }
}
