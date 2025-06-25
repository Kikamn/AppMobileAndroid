package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class NoteHome {

    AppiumDriver driver ;
    public NoteHome(AppiumDriver driver){
        this.driver = driver;
    }

    By addNote = By.xpath("//android.widget.ListView[@resource-id=\"com.socialnmobile.dictapps.notepad.color.note:id/select_dialog_listview\"]/android.widget.LinearLayout[1]");
    By titleNote = By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note");
    By ceklisButton = By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");

    public void noteAddbutton(){
        driver.findElement(addNote).click();
    }

    public void TitileNote(String title){
        driver.findElement(titleNote).sendKeys(title);
        driver.findElement(ceklisButton).click();
    }

    public boolean isDisplay(){
        return driver.findElement(titleNote).isDisplayed();
    }
}
