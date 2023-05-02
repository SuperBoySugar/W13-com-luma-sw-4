package testsuite;

import org.testng.annotations.Test;
import pages.BagsPage;
import pages.HomePage;
import pages.OvernightDufflepage;
import testbase.BaseTest;

public class GearTest extends BaseTest {

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflepage overnightDufflepage = new OvernightDufflepage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCartForGear(){
        // Mouse hover on Gear tab
        homePage.mouseHoverOnGear();
        // Click on Bags
        homePage.clickOnBags();
        // Click on Overnight duffle
        bagsPage.clickOnOvernightDuffle();
        // Verify text message
        overnightDufflepage.verifyTextMessage();
        // Change Quantity
        overnightDufflepage.changeQuantity("3");
        // Click on Add to Cart button
        overnightDufflepage.clickOnAddToCart();
        // Verifying text
        overnightDufflepage.verifyText();
        // Clicking on Shopping cart link
        overnightDufflepage.clickOnShoppingCartLink();
        // Verify product name
        overnightDufflepage.verifyProductName();
        // Verify Product Price
        overnightDufflepage.verifyProductPrice();
        // Changing Product quantity
        overnightDufflepage.changeProductQuantity("5");
        // Click on Update
        overnightDufflepage.clickOnUpdate();
        // Verifying product price
        overnightDufflepage.verifyProductsPrice();
    }

}
