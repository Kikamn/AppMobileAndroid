package pages;
import static org.junit.Assert.assertTrue;
import static stepDev.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HomePage {
   // Home Note
    By noteDisplay = By.id("com.socialnmobile.dictapps.notepad.color.note:id/note_list");
    By buttonAdd = By.id("com.socialnmobile.dictapps.notepad.color.note:id/bottom_fab");
    By textBtn = By.xpath("//*[@text='Text']");
    By noteSave = By.id("com.socialnmobile.dictapps.notepad.color.note:id/title");
    // di dalam note
    By editNote = By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_note");
    By ceklisButton = By.id("com.socialnmobile.dictapps.notepad.color.note:id/back_btn");
    By moreBtn = By.id("com.socialnmobile.dictapps.notepad.color.note:id/menu_btn");
    By deleteBtn =By.xpath("//*[@text='Delete']");
    By okeDelete = By.id("android:id/button1");

    public void theColorIsOpened(){
        driver.findElement(noteDisplay).isDisplayed();
    }

    public void clickPlush(){
        driver.findElement(buttonAdd).click();
    }

    public void iClickText(){
        driver.findElement(textBtn).click();
    }

    public void TitileNote(String title){
        driver.findElement(editNote).sendKeys(title);
    }

    public void iClickCeklisButton(){
        driver.findElement(ceklisButton).click();
    }

    public void theTaskIsDisplayed(String tittleDisplay){
        WebElement title = driver.findElement(noteSave);
        assertTrue(title.isDisplayed());
    }
    //// DELETE
    public void iClickNoteWhichHasExisted(String note) {
        driver.findElement(noteSave).click();
    }

    public void iClickButtonMore() {
        driver.findElement(moreBtn).click();
    }

    public void iClickDelete() {
        driver.findElement(deleteBtn).click();
    }

    public void willShowDeleteConfirmasionOke() {
        driver.findElement(okeDelete).click();
    }

    public void willShowEmptyNote() {
        driver.findElement(noteDisplay).isDisplayed();
    }


}
