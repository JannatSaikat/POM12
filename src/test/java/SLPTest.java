import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SLPTest extends Base{


    SLPPage slp;

    @BeforeMethod
    void openBrowser(){
        setup("https://www.costco.com/s?keyword=shoe");
        slp = PageFactory.initElements(driver, SLPPage.class);
    }

    @AfterMethod
    void closeBrowser(){
//        clean();
    }

    @Test
    void checkSorting(){
        slp.sortByPrice();
        
    }
}
