package pages;
import static stepDev.Hooks.driver;
import org.openqa.selenium.By;


public class SearchPage {
    //SEARCH
    By searchIcon = By.id("com.socialnmobile.dictapps.notepad.color.note:id/page_search");
    By searchField = By.id("com.socialnmobile.dictapps.notepad.color.note:id/edit_search");
    By foundNote = By.xpath("(//*[@text='coba note'])[1]");
    By errMsg = By.id("com.socialnmobile.dictapps.notepad.color.note:id/emptyview");
    /// DETAIL NOTE
    By detailNote = By.id("com.socialnmobile.dictapps.notepad.color.note:id/view_note");
    By permanentBtn = By.id("com.socialnmobile.dictapps.notepad.color.note:id/text");
    By foundDelete = By.xpath("(//*[@text='coba note'])[3]");

    // SEARCH NOT FOUND
    public void iClickIconSearch() { driver.findElement(searchIcon).click();
    }
    public void iInput(String text) { driver.findElement(searchField).sendKeys(text);
    }
    public void willShow(String errorMsg) { driver.findElement(errMsg).isDisplayed();
    }
    //SEARCH FOUND
    public void willShowAllData() { driver.findElement(foundNote).isDisplayed();
    }
    public void iClickNote() { driver.findElement(foundNote).click();
    }
    public void willShowDetailNote() { driver.findElement(detailNote).isDisplayed();
    }
    // Delete Note
    public void iClickPermanatlyDelete() { driver.findElement(permanentBtn).click();
    }
    public void willShowAllDataInSearch() { driver.findElement(foundDelete).isDisplayed();
    }


}
