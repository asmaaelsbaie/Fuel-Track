package Step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class Validation {
    @Given("^enter car_Num \"(.*)\"$")
    public void enter_car_Num(String CarNum) {
        Hook.homePage.enter_CarNum(CarNum);
    }

    @And("^enter fuel_in_liters \"(.*)\"$")
    public void enter_fuel_in_liters(String FuelInLiter) {
        Hook.homePage.enter_FuelInLiters(FuelInLiter);
    }

    @And("^enter Fuel_cost \"(.*)\"$")
    public void enter_Fuel_cost(String FuelCost) {
        Hook.homePage.enter_FuelCost(FuelCost);
    }

    @And("^enter Fuel_type \"(.*)\"$")
    public void enter_Fuel_type(String FuelType) {
        Hook.homePage.enter_FuelType(FuelType);
    }

    @And("^enter Date and time \"(.*)\"$")
    public void enter_DateAndTime(String DateAndTime) {
        Hook.homePage.enter_DateAndTime(DateAndTime);
    }

    @And("^enter Customer_ID \"(.*)\"$")
    public void enter_Customer_ID(String CustomerID) {
        Hook.homePage.enter_CompanyId(CustomerID);
    }

    @Then("Click edit")
    public void Click_edit() {

        Hook.homePage.Click_submit_button();
    }

}
