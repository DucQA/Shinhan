package stepdefinitions;

import io.cucumber.java.en.*;
import questions.Error;
import task.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static stepdefinitions.Hooks.*;

public class TransferStepDefinition {

    @When("I search for the receiving bank using the keyword {string}")
    public void search(String keyword) {
        user.attemptsTo(
                Search.withKeyword(keyword)
        );
    }

    @And("I select the bank from the search results")
    public void selectBank() {
    }

    @And("I enter the account number {string}")
    public void inputBankAccount(String bankAccount) {
        user.attemptsTo(
                InputBankAccount.with(bankAccount)
        );
    }

    @And("I enter the transfer amount {string}")
    public void inputTransferAmount(String amount) {
        user.attemptsTo(
                InputAmount.with(amount)
        );
    }

    @Then("I should see a message saying {string}")
    public void verifyErrorMessage(String errorMessage) {
        user.should(seeThat(Error.isPresent(errorMessage)));
        user.attemptsTo(ClosePopup.act());
        user.attemptsTo(ClearBankAccount.act());
    }
}