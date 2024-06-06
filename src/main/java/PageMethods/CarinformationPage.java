package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class CarinformationPage extends BasePage {
    public CarinformationPage verifyBrand(String brand) {
        String realCarBrand = getElementText(Locators.getCarInformation("Marka"));
        Assertions.assertEquals(brand, realCarBrand, "Car brand is not as expected");

        return this;
    }

    public CarinformationPage verifyFuelType(String fuelType) {
        String realFuelType = getElementText(Locators.getCarInformation("Gorivo"));
        Assertions.assertEquals(fuelType, realFuelType, "fuel type is not as expected");

        return this;
    }

    public CarinformationPage verifyModel(String model) {
        String realModel = getElementText(Locators.getCarInformation("Model"));
        Assertions.assertEquals(model, realModel, "Model type is not as expected");

        return this;
    }

    public CarinformationPage verifyProductionYear(int yearFrom, int yearTo) {
        String realProductionYear = getElementText(Locators.getCarInformation("Godište"));
        realProductionYear.replace(".", "");
        boolean isYearValid;
        int prodactionYear = Integer.parseInt(realProductionYear, 10);
        if (prodactionYear >= yearFrom && prodactionYear <= yearTo) {
            isYearValid = true;
        } else {
            isYearValid = false;
        }
        Assertions.assertTrue(isYearValid, "Year is not as expected");
        return this;


    }
}
