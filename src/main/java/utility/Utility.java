package utility;

import browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.*;


public class Utility extends ManageBrowser {

    /**
     * This method will click on element
     *
     * @ param by
     */
    public void pmClickOnElement(By by) {
        WebElement link = driver.findElement(by);
        link.click();
    }

    /**
     * This method will get text from element
     */
    public String doGetTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    /**
     * This method will find the element and clear all the data from it
     *
     * @param by
     */
    public void doFindElementAndClearText(By by) {
        WebElement elementToClear = driver.findElement(by);
        elementToClear.clear();
    }

    /**
     * This method will extract the value of a particular attribute from an element
     *
     * @param by
     * @param attribute
     * @return
     */
    public String doGetAttributeFromElement(By by, String attribute) {
        return driver.findElement(by).getAttribute(attribute);
    }


  public void selectMenu(By by, String menu) {
        List<WebElement> names = driver.findElements(by);
        for (WebElement name : names) {
//            Thread.sleep(1000);
            if (name.getText().equalsIgnoreCase(menu)) {
//                Thread.sleep(1000);
                name.click();
                break;
            }
        }
    }

    /**
     * This Method will verify text using Assert
     */
    public void verifyText(String expectedMessage, By by, String displayMessage) {
        String actualMessage = doGetTextFromElement(by);
        Assert.assertEquals(actualMessage, expectedMessage, displayMessage);
    }

    //*************************** Select Class Methods ***************************************//

    /**
     * This method will select the option by visible text
     */
    public void pmSelectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    /**
     * This method will select the option by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        new Select(driver.findElement(by)).selectByValue(value);
    }

    /**
     * This method will select the option by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    /**
     * This method will select the option by contains text
     */
    public void pmSelectByContainsTextFromDropDown(By by, String text) {
        List<WebElement> allOptions = new Select(driver.findElement(by)).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }

//*************************** Action Methods ***************************************//


    // This method will mouse hover on element
    public void mouseHoverToElement(By by) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mouseHoover = driver.findElement(by);
//        Thread.sleep(3000);
//        waitUnitVisibilityOfElementLocated(by,2000);
        actions.moveToElement(mouseHoover).build().perform();
    }

    /**
     * This method will use to hover mouse on element
     */
    public void doMouseHoverNoClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
    }

    /**
     * This method will mouse hover and Click on element
     */
    public void doMouseHoverAndClick(By by) {
        Actions hover = new Actions(driver);
        WebElement a = driver.findElement(by);
        hover.moveToElement(a).click().build().perform();
    }

    /**
     * This method will Mouse hover on First element then Second element but will not click
     */
    public void doMouseHoverOnFirstThenSecondElement(By by1, By by2) {
        Actions hover = new Actions(driver);
        WebElement destination1 = driver.findElement(by1);
        WebElement destination2 = driver.findElement(by2);
        hover.moveToElement(destination1).moveToElement(destination2).build().perform();
    }

    /**
     * This Method will hover mouse on one element, then on second element
     * and click the second element
     */
    public void doMouseHoverOnFirstThenSecondAndClick(By by1, By by2) {
        Actions hover = new Actions(driver);
        WebElement destination1 = driver.findElement(by1);
        WebElement destination2 = driver.findElement(by2);
        hover.moveToElement(destination1).moveToElement(destination2).click().build().perform();
    }

    // Generate Random email
    public String randomEmailGenerator(){
        String chars = "abcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder email = new StringBuilder();
        Random randomEmail= new Random();
        while (email.length()<10) {
            int index = (int) (randomEmail.nextFloat() * chars.length());
            email.append(chars.charAt(index));
        }
        String saltStr = (email.toString()+"@gmail.com");
        return saltStr;
    }


    // This method will select options from the list
    public void selectMyAccountOptions(By by, String option) {
        List<WebElement> topOptionNames = driver.findElements(by);
        for (WebElement names : topOptionNames) {
            if (names.getText().equalsIgnoreCase(option)) {
                names.click();
                break;


            }
        }
    }

    /**
     * This Method will Sort product by Name A - Z
     */
//    By productTitle = By.cssSelector(".products .product-item-info .product-item-name");
    public void verifyProductAreInAscendingOrder(By by) {
        List<WebElement> originalList = driver.findElements(by);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList);

        List<WebElement> afterSortingList = driver.findElements(by);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList, afterSortingProductName,"Product not found" );
    }

    //******************* Sort products by Price Low To High ***********************

    By productPrice = By.cssSelector(".products .product-item-info .price");
    public void verifyProductsAreSortedByLowToHigh(By by) {
        List<WebElement> originalList = driver.findElements(by);
        List<Double> originalProductPriceList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductPriceList.add(Double.valueOf(product.getText().replace("$", "")));
        }
        System.out.println("Before Sorting: " + originalProductPriceList);

        List<WebElement> afterSortingList = driver.findElements(by);
        List<Double> afterSortingProductPrice = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductPrice.add(Double.valueOf(product.getText().replace("$", "")));
        }
        Collections.sort(originalProductPriceList);
        System.out.println("After Sorting: " + afterSortingProductPrice);
        Assert.assertEquals(originalProductPriceList, afterSortingProductPrice);
    }

}
