package nopcommerce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyStepdefs {

    HomePage home_page = new HomePage();
    AssertPage assertPage = new AssertPage();


    @Given("^user is on the homepage$")
    public void userIsOnTheHomepage() {
        home_page.openHomePage();
    }

    @When("^user click on Books from category list$")
    public void userClickOnBooksFromCategoryList() {
        home_page.clickOnBooks();
    }

    @Then("^user should be directed to Books page$")
    public void userShouldBeDirectedToBooksPage() {
        assertPage.booksPageSuccess();
    }

    @When("^user click on Apparel from category list$")
    public void userClickOnApparelFromCategoryList() {
        home_page.clickOnApparel();
    }

    @Then("^user should be directed to Apparel page$")
    public void userShouldBeDirectedToApparelPage() {
        assertPage.apparelPageSuccess();
    }

    @When("^user click on Computers from category list$")
    public void userClickOnComputersFromCategoryList() {
        home_page.clickOnComputers();
    }

    @Then("^user should be directed to Computers page$")
    public void userShouldBeDirectedToComputersPage() {
        assertPage.computersPageSuccess();
    }

    @When("^user click on Digital Download from category list$")
    public void userClickOnDigitalDownloadFromCategoryList() {
        home_page.clickOnDigitalDownload();
    }

    @Then("^user should be directed to Digital Download page$")
    public void userShouldBeDirectedToDigitalDownloadPage() {
        assertPage.digitalDownloadPageSuccess();
    }

    @When("^user click on Electronics from category list$")
    public void userClickOnElectronicsFromCategoryList() {
        home_page.clickOnElectronics();
    }

    @Then("^user should be directed to Electronics page$")
    public void userShouldBeDirectedToElectronicsPage() {
        assertPage.electronicsPageSuccess();
    }

    @When("^user click on Gift Cards from category list$")
    public void userClickOnGiftCardsFromCategoryList() {
        home_page.clickOnGiftCards();

    }

    @Then("^user should be directed to Gift Cards page$")
    public void userShouldBeDirectedToGiftCardsPage() {
        assertPage.giftCardsPageSuccess();
    }

    @When("^user click on Jewelry from category list$")
    public void userClickOnJewelryFromCategoryList() {
        home_page.clickOnJewelry();
    }

    @Then("^user should be directed to Jewelry page$")
    public void userShouldBeDirectedToJewelryPage() {

    }
}
