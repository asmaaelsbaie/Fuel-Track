package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    public WebDriver driver;
    By CarNumberInput = By.cssSelector("input[type = 'text'][name= 'carNumber']");
    By FuelInLitersInput = By.cssSelector("input[type = 'text'][name= 'fuelInLiters']");
    By FuelCostInput = By.cssSelector("input[type = 'text'][name= 'fuelCost']");
    By FuelTypeInput = By.cssSelector("input[type = 'text'][name= 'fuelType']");
    By DateAndTimeInput = By.cssSelector("input[type='datetime-local'][name='dateAndTime']");
    By CompanyIdInput = By.cssSelector("input[type = 'text'][name= 'companyId']");
    By SubmitButton = By.cssSelector("button[type= 'submit']");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enter_CarNum(String carNum) {
        driver.findElement(CarNumberInput).sendKeys(carNum);
    }

    public void enter_FuelInLiters(String fuelInLiters) {
        driver.findElement(FuelInLitersInput).sendKeys(fuelInLiters);
    }

    public void enter_FuelCost(String fuelCost) {
        driver.findElement(FuelCostInput).sendKeys(fuelCost);
    }

    public void enter_FuelType(String fuelType) {
        driver.findElement(FuelTypeInput).sendKeys(fuelType);
    }

    public void enter_DateAndTime(String dateAndTime) {
        driver.findElement(DateAndTimeInput).sendKeys(dateAndTime);
    }

    public void enter_CompanyId(String companyId) {
        driver.findElement(CompanyIdInput).sendKeys(companyId);
    }

    public void Click_submit_button() {
        driver.findElement(SubmitButton).submit();


    }



}
