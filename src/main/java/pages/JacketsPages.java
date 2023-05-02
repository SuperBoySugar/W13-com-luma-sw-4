package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class JacketsPages extends Utility {

    By sortByProduct = By.id("sorter");
    By productTitle = By.cssSelector(".products .product-item-info .product-item-name");
    By price = By.id("sorter");
    By productPrice = By.cssSelector(".products .product-item-info .price");


    // Selecting Product Name option from Sort By filter
    public void selectSortByProductName(String product){
        pmSelectByVisibleTextFromDropDown(sortByProduct, product);
    }

    // Verifying product is sorted in Ascending order
    public void verifyProductShouldBeInAscendingOrder(){
        verifyProductAreInAscendingOrder(productTitle);
    }
    // Selecting Price option from Sort By filter
    public void selectSortByPrice(String price1){
        pmSelectByVisibleTextFromDropDown(price, price1);
    }
    // Verifying product is sorted in Low to High
    public void verifyProductShouldBeInLowToHigh(){
        verifyProductsAreSortedByLowToHigh(productPrice);
    }
}
