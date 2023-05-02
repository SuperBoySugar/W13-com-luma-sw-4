package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class PantsPage extends Utility {

    By cronusYogaPant = By.xpath("//a[contains(text(),'Cronus Yoga Pant')]");
    By size = By.cssSelector("#option-label-size-143-item-175");
    By black = By.cssSelector("#option-label-color-93-item-49");
    By addToCart = By.xpath("//span[text() = 'Add to Cart']");
    By textMessage = By.xpath("//div[contains(text(),'You added Cronus Yoga Pant  to your ')]");
    By shoppingCart = By.xpath("//a[text()='shopping cart']");

    // Mouse hover on product name
    public void mouseHoverOnProductName() {
        doMouseHoverNoClick(cronusYogaPant);
    }

    // Click on size
    public void clickOnsize() {
        pmClickOnElement(size);
    }

    // Select Black Colour
    public void clickOnColourBlack() {
        pmClickOnElement(black);
    }

    // Click on Add to cart button
    public void clickOnAddToCart() {
        pmClickOnElement(addToCart);
    }

    // Verifying product added to cart message
    public void verifyTextMessage() {
        verifyText("You added Cronus Yoga Pant to your shopping cart.", textMessage, "Message is not displayed");
    }

    // Clicking on Shopping cart button
    public void clickOnShoppingCart(){
        pmClickOnElement(shoppingCart);
    }

}
