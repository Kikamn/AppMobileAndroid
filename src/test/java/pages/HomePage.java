package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class HomePage {

    AppiumDriver driver ;

    public HomePage(AppiumDriver driver){
        this.driver = driver;
    }

    By btnNext = By.id("com.socialnmobile.dictapps.notepad.color.note:id/step1_next");
    By btn_Permisson = By.id ("com.socialnmobile.dictapps.notepad.color.note:id/step3_next");
    By btn_Skip = By.className ("android.widget.Button");

    By buttonAdd = By.id("com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab");

    public void clickNext(){
        driver.findElement(btnNext).click();
    }

    public void clickPermisson(){
        driver.findElement(btn_Permisson).click();
    }

    public void clickSkip(){
        driver.findElement(btn_Skip).click();
    }

    public void clickPlush(){
        driver.findElement(buttonAdd).click();
    }
}
