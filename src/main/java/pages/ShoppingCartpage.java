package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class ShoppingCartpage extends Utility {

    By textShoppingCart = By.xpath("//span[text()='Shopping Cart']");
    By productName = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
    By productSize = By.xpath("//dd[contains(text(),'32')]");
    By productColour = By.xpath("//dd[contains(text(),'Black')]");

    // Verifying text shopping cart
    public void verifyTextShoppingCart(){
        verifyText("Shopping Cart",textShoppingCart,"Incorrect Text");
    }
    // Verify Product Name
    public void verifyProductName(){
        verifyText("Cronus Yoga Pant",productName,"Product name is Incorrect");
    }
    // Verify product size
    public void verifyProductSize(){
        verifyText("32",productSize,"Size displayed incorrect");
    }
    // Verify Product colour
    public void verifyProductColour(){
        verifyText("Black",productColour,"Select different colour");
    }
}
