import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeTest extends Base{

    HomePage home;

    @BeforeMethod
    void openBrowser(){
        setup("https://costco.com");
        home  = PageFactory.initElements(driver, HomePage.class);
    }
    
    @Test(enabled = true, groups = {"smoke", "regression"})
    void checkLogo(){
        boolean test = home.isLogoVisible();
        Assert.assertTrue(test);
    }

    @Test(groups = "smoke")
    void checkSearch(){
        String word = "kitchen";
        home.search(word);
        String searchUrl = driver.getCurrentUrl();
        Assert.assertTrue(searchUrl.contains(word));
    }

    @Test(groups = "smoke")
    void checkFooter(){
        Assert.assertTrue(home.footer());
    }

    @Test
    void checkPromo(){
        Assert.assertTrue(home.promo());
    }

    @AfterMethod
    void cleanup(){
        //clean();
    }

}
