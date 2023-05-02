package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class HomePage extends Utility {

    By women = By.xpath("//span[text()='Women']");
    By tops = By.cssSelector("a[id='ui-id-9'] span:nth-child(1)");
    By jackets = By.cssSelector("a[id='ui-id-11'] span:nth-child(1)");
    By men = By.xpath("//span[normalize-space()='Men']");
    By bottom = By.cssSelector("a[id='ui-id-18'] span:nth-child(1)");
    By pants = By.cssSelector("a[id='ui-id-23'] span:nth-child(1)");
    By gear = By.cssSelector("a[id='ui-id-6'] span:nth-child(2)");
    By bags = By.xpath("//span[text()='Bags']");


    // Mouse hover on Women's tab
    public void mouseHoverOnWomen() throws InterruptedException {
        Thread.sleep(1000);
        doMouseHoverNoClick(women);
    }
    // Mouse houve on Tops
    public void mouseHoverOnTops(){
        doMouseHoverNoClick(tops);
    }
    // Mouse hover on Jacket tab and Click
    public void mouseHoverOnJacketsAndClick(){
        doMouseHoverAndClick(jackets);
    }
    // Mouse hover on Men
    public void mouseHoverOnMen() throws InterruptedException {
        Thread.sleep(1000);
        doMouseHoverNoClick(men);
    }
    // Mouse hover on Bottom tab
    public void mouseHoverOnBottom(){
        doMouseHoverNoClick(bottom);
    }
    // Click on Pants
    public void clickOnPants(){
        pmClickOnElement(pants);
    }
    // Mouse hover on Gear
    public void mouseHoverOnGear(){
        doMouseHoverNoClick(gear);
    }
    // Click on Bags
    public void clickOnBags(){
        pmClickOnElement(bags);
    }
}
