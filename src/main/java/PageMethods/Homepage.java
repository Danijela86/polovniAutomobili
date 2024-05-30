package PageMethods;

import Core.BasePage;
import Core.Locators;



public class Homepage extends BasePage {


    public Homepage openBrandMenu() {
        clickOneElement(Locators.brandSearchField);
        return this;
    }

public Homepage selectBrand(String brandName) {
        typeText(brandName, Locators.brandSearchField);
        clickOneElement(Locators.setBrand(brandName));
    return this;
}
    public Homepage selectModel(String modelName) {
        typeText(modelName, Locators.modelSearchField);
        clickOneElement(Locators.setModel(modelName));
        return this;
    }
    public Homepage selectYearFrom(int yearFrom) {
        clickOneElement(Locators.yearFromMenu);
        clickOneElement(Locators.setYearInLocator(Integer.toString(yearFrom)));
        return this;
    }
    public Homepage selectYearTo(int yearTo) {
        clickOneElement(Locators.yearToMenu);
        clickOneElement(Locators.setYearInLocator(Integer.toString(yearTo)));
        return this;
    }
}
