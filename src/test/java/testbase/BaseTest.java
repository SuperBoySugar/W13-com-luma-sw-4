package testbase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.Utility;


public class BaseTest extends Utility {

    String browser = propertyreader.PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
//        closeBrowser();
    }

}
