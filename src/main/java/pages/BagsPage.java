package pages;

import org.openqa.selenium.By;
import utility.Utility;

public class BagsPage extends Utility {

    By overnightDuffle = By.xpath("//a[contains(text(),'Overnight Duffle ')]");

    // Click on Overnight Duffle bag
    public void clickOnOvernightDuffle(){
        pmClickOnElement(overnightDuffle);
    }
}
