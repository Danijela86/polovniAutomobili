package PageMethods;

import Core.BasePage;
import Core.Locators;



 public class Homepage extends BasePage {


    public Homepage openBrandMenu() {
        clickOneElement(Locators.brandSearch);
        return this;
    }
    public Homepage openModelMenu() {
        clickOneElement(Locators.modelSearchField);
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
    public Homepage openYearFromMenu(int yearFrom) {
        clickOneElement(Locators.yearFromMenu);

        return this;
    }

    public Homepage openYearToMenu(int yearFrom) {
        clickOneElement(Locators.yearToMenu);

        return this;
    }
    public Homepage selectYearTo(int yearTo) {
        clickOneElement(Locators.yearToMenu);
        clickOneElement(Locators.setYearInLocator(Integer.toString(yearTo)));
        return this;
    }
    public Homepage SelectFuelType(String fuelType){
        clickOneElement(Locators.fuelTypeMenu);
        clickOneElement(Locators.setFuelType(fuelType));
        return this;
    }
    public Homepage OpenFuelType(String fuelType){
        clickOneElement(Locators.fuelTypeMenu);
        clickOneElement(Locators.setFuelType(fuelType));
        return this;
    }
    public Homepage selectRegion (String region){
        clickOneElement(Locators.regionMenu);
        clickOneElement(Locators.setRegion(region));
                return this;
    }
    public Homepage openRegionMenu (){
        clickOneElement(Locators.regionMenu);
        return this;
    }
    public SearchResults search(){
        clickOneElement(Locators.searchButton);
        return  new SearchResults();
    }

}
