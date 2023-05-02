package testsuite;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.PantsPage;
import pages.ShoppingCartpage;
import testbase.BaseTest;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartpage shoppingCartpage = new ShoppingCartpage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        // Mouser hover on Men
        homePage.mouseHoverOnMen();
        Thread.sleep(1000);
        // Mouer hover on bottom
        homePage.mouseHoverOnBottom();
        // Mouse hover on Pants
        homePage.clickOnPants();
        // Mousr hover on prduct name
        pantsPage.mouseHoverOnProductName();
        // Select  on Size
        pantsPage.clickOnsize();
        // Select on colour
        pantsPage.clickOnColourBlack();
        // Click on Add to cart button
        pantsPage.clickOnAddToCart();
        // Verifying text
        pantsPage.verifyTextMessage();
        // Clicking on Shopping cart
        pantsPage.clickOnShoppingCart();
        // Verify Text shopping cart
        shoppingCartpage.verifyTextShoppingCart();
        // Verify Product name
        shoppingCartpage.verifyProductName();
        // Verify product name
        shoppingCartpage.verifyProductSize();
        // Verifying product colour
        shoppingCartpage.verifyProductColour();
    }

}
