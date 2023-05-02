package testsuite;

import org.testng.annotations.Test;
import pages.*;
import testbase.BaseTest;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    JacketsPages jacketsPages = new JacketsPages();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartpage shoppingCartpage = new ShoppingCartpage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflepage overnightDufflepage = new OvernightDufflepage();

    @Test
    public void verifyTheByProductNameFilter() throws InterruptedException {
        // Mouse hover on women
        homePage.mouseHoverOnWomen();
        // Mouse hover on tops
        homePage.mouseHoverOnTops();
        // Mouse and click on Jackets
        homePage.mouseHoverOnJacketsAndClick();
        // Select sort by product name
        jacketsPages.selectSortByProductName("Product Name");
        // Verify product sorted in Ascending order
        jacketsPages.verifyProductShouldBeInAscendingOrder();
    }

    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException{
        // Mouse hover on Women
        homePage.mouseHoverOnWomen();
        // Mouse hover on tops
        homePage.mouseHoverOnTops();
        // Mouse hover and click on Jacket
        homePage.mouseHoverOnJacketsAndClick();
        // Select Sort by Price
        jacketsPages.selectSortByPrice("Price");
        Thread.sleep(1000);
        // Verifying product sorted in Low to High
        jacketsPages.verifyProductShouldBeInLowToHigh();
    }
}
