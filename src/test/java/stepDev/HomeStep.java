package stepDev;

import io.cucumber.java.en.*;
import pages.HomePage;


public class HomeStep {

    HomePage homePage;
    public HomeStep(){
        this.homePage = new HomePage();
    }

    @Given("The color is opened")
    public void theColorIsOpened() {
        homePage.theColorIsOpened();
    }

    @When("I Click add buttton")
    public void iClickAddButtton() {
        homePage.clickPlush();
    }
    @And("I click Text")
    public void iClickText() {
        homePage.iClickText();
    }
    @And("I add task {string}")
    public void iAddTask(String tittle) {
        homePage.TitileNote(tittle);
    }
    @And("I click ceklis button")
    public void iClickCeklisButton() {
        homePage.iClickCeklisButton();

    }
    @And("I Click back button")
    public void iClickBackButton() {
        homePage.iClickCeklisButton();
    }
    @Then("The task {string} is displayed")
    public void theTaskIsDisplayed(String tittleDisplay) {
        homePage.theTaskIsDisplayed(tittleDisplay);
    }
    /// delete note
    @When("I Click Note which has existed {string}")
    public void iClickNoteWhichHasExisted(String note) {
        homePage.iClickNoteWhichHasExisted(note);
    }

    @And("I Click Button More")
    public void iClickButtonMore() {
        homePage.iClickButtonMore();
    }

    @And("I Click Delete")
    public void iClickDelete() {
        homePage.iClickDelete();
    }

    @And("Will Show delete confirmasion oke")
    public void willShowDeleteConfirmasionOke() {
        homePage.willShowDeleteConfirmasionOke();
    }

    @Then("Will show empty note")
    public void willShowEmptyNote() {
        homePage.willShowEmptyNote();
    }
}
