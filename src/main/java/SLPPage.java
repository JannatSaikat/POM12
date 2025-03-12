import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SLPPage extends Base{
    @FindBy(xpath = "//div[@class='MuiBox-root mui-gg4vpm']/div/form/div/div/div/div/select")
    WebElement sortOption;

    String optionValue = "item_location_pricing_salePrice+asc";

    void sortByPrice(){
        waitForElementVisibility(5000, sortOption);
        dropDown(sortOption, optionValue);
    }
}
