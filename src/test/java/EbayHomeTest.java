import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayHomeTest extends Base{

    EbayHome ebay;

    @BeforeMethod
    void openBrowser(){
        setup("https://ebay.com");
        ebay = PageFactory.initElements(driver, EbayHome.class);
    }

    @Test
    void checkSearch(){
        String word = "laptop";
        ebay.search(word);
        Assert.assertEquals(ebay.result(), word);
    }

}
