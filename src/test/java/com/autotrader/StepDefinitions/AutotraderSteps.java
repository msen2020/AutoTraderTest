package com.autotrader.StepDefinitions;

import com.autotrader.Pages.AdvanceSearchPage;
import com.autotrader.Pages.AutotraderPage;
import com.autotrader.Utilities.MyDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class AutotraderSteps {

    //Burada objectleri olusturuyoruz

    AutotraderPage autotraderPage = new AutotraderPage();
    AdvanceSearchPage advanceSearchPage = new AdvanceSearchPage();


    @Given("User is in Landing page")
    public void user_is_in_Landing_page()  {

        System.out.println("Landing_page");
       String actualTitle = MyDriver.get().getTitle();
      String expectedTitle = "sasasasas";
//        //Burada assertion yapiyoruz
       Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println(actualTitle);
    }

    @Then("Verify that {string} are present")
    public void verify_that_are_present(String string) {

    }


    @Then("Verify that search button is present")
    public void verify_that_search_button_is_present() {

    }


    @Then("Verify that {string} and {string} is visible")
    public void verify_that_and_is_visible(String string, String string2) {

    }

    @Given("User click {string} on the homepage")
    public void user_click_on_the_homepage(String string) {

    }


    @Then("User enters {string} in the zip code textbox")
    public void user_enters_in_the_zip_code_textbox(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User select {string} checkbox under {string}")
    public void user_select_checkbox_under(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("Send User select convert {string} checkbox under {string}")
    public void send_User_select_convert_checkbox_under(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User update year {string} to {string}")
    public void user_update_year_to(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User select {string} car from Match, Model and Trim Section")
    public void user_select_car_from_Match_Model_and_Trim_Section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User clicks Search Button")
    public void user_clicks_Search_Button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User verifies that he is in the result page")
    public void user_verifies_that_he_is_in_the_result_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("User verifies that he sees only {string} cars in listing")
    public void user_verifies_that_he_sees_only_cars_in_listing(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("display in console, the number of cars listed in result page")
    public void display_in_console_the_number_of_cars_listed_in_result_page() {

    }

    @Given("choose make as {string}")
    public void choose_make_as(String string) {
    }
}


