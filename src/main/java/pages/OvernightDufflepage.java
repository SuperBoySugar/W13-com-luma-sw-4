package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utility.Utility;

public class OvernightDufflepage extends Utility {

    By textMessage = By.xpath("//span[contains(text(),'Overnight Duffle')]");
    By quantity = By.id("qty");
    By addToCart = By.id("product-addtocart-button");
    By text = By.xpath("//div[contains(text(),'You added Overnight Duffle to your ')]");
    By shoppingCartLink = By.xpath("//a[text()='shopping cart']");
    By productName = By.cssSelector("td[class='col item'] strong[class='product-item-name']");
    By productPrize = By.xpath("//td[@class='col subtotal']//span[@class='price']");
    By changeQuantity = By.cssSelector("td[class='col qty'] input[class*='input-text qty']");
    By updateShoppingCart = By.xpath("//span[text()='Update Shopping Cart']");
    By productsPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][text()='$225.00']");


    // Verifying text
    public void verifyTextMessage(){
        verifyText("Overnight Duffle",textMessage,"Incorrect Text");
    }
    // Changing quantity
    public void changeQuantity(String qty){
        sendTextToElement(quantity, Keys.DELETE + qty);
    }
    // Clicking on Add to Cart
    public void clickOnAddToCart(){
        pmClickOnElement(addToCart);
    }
    // verify message
    public void verifyText(){
        verifyText("You added Overnight Duffle to your shopping cart.",text,"Message is not displayed");
    }
    // Clicking on Shopping cart link
    public void clickOnShoppingCartLink(){
        pmClickOnElement(shoppingCartLink);
    }
    // Verifying product name
    public void verifyProductName(){
        verifyText("Overnight Duffle",productName,"Product is not displayed");
    }
    // verifying product price
    public void verifyProductPrice(){
        verifyText("$135.00", productPrize,"Prize displayed incorrect");
    }
    // Changing product quantity
    public void changeProductQuantity(String qty1){
        sendTextToElement(changeQuantity,Keys.DELETE + qty1);
    }
    // Click on Update button
    public void clickOnUpdate(){
        pmClickOnElement(updateShoppingCart);
    }
    // Verifying product price
    public void verifyProductsPrice(){
        verifyText("$225.00",productsPrice, "Price is Incorrect");
    }
}
