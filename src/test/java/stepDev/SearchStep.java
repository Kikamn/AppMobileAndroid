package stepDev;

import io.cucumber.java.en.*;
import pages.SearchPage;

public class SearchStep {
    SearchPage searchPage;
    public SearchStep(){
        this.searchPage = new SearchPage();
    }

    @When("I click icon search")
    public void iClickIconSearch() { searchPage.iClickIconSearch();
    }

    @And("I input {string}")
    public void iInput(String text) { searchPage.iInput(text);
    }

    @Then("Will show {string}")
    public void willShow(String errorMsg) { searchPage.willShow(errorMsg);
    }

    @Then("Will show all data")
    public void willShowAllData() { searchPage.willShowAllData();
    }

    @And("I Click Note")
    public void iClickNote() { searchPage.iClickNote();
    }

    @Then("Will show detail note")
    public void willShowDetailNote() { searchPage.willShowDetailNote();
    }

    @And("I Click Permanatly delete")
    public void iClickPermanatlyDelete() { searchPage.iClickPermanatlyDelete();
    }

    @Then("Will show all data in search")
    public void willShowAllDataInSearch() { searchPage.willShowAllDataInSearch();
    }
}
