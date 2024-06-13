package Core;

import org.openqa.selenium.By;

public class Locators {
    public static String DEMO_QA_SECTION="//h5[text()='%ARG%']//parent::div";
    public static String SPAN_ELEMENT_BY_TEXT="//span[text()='%ARG%']";

    public static String ELEMENT_LIST_SHOW="//div[@class='element-list collapse show']";
    public static String INPUT_BY_ID = "//input[@id='%ARG%']";

    public static String HEADER_SAMPLE_PAGE ="//h1[@id='sampleHeading']";
    public static String NEW_TAB_BUTTON ="// button[@id='tabButton']";
    public static String NEW_WINDOW_BUTTON ="// button[@id='windowButton']";
    public static By brandSearchField = By.xpath("//div[@class='SumoSelect sumo_brand open']//input");
    public static By brandSearch = By.xpath("//div[@class='SumoSelect sumo_brand']");
    public static By setBrand(String brandName) {
        String brandSearchLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        return By.xpath(brandSearchLocator.replace("****", brandName));
    }
    public static By setModel(String modelName) {
        String modelSearchLocator = "//div[contains(@class, 'open')]//li[normalize-space(text()='****')][not(contains(@class,'hidden'))]";
        return By.xpath(modelSearchLocator.replace("****", modelName));
    }
    public static By modelSearchField = By.xpath("//div[@class='SumoSelect sumo_model open']//input");
    public static By modelSearch = By.xpath("//div[@class='SumoSelect sumo_model']");
    public static By yearFromMenu = By.xpath("//div[@class='SumoSelect sumo_year_from open']");
    public static By yearToMenu = By.xpath("//div[@class='SumoSelect sumo_year_to']");
    public static By selectYear = By.xpath("//div[contains(@class, 'open')]//li//label[text()='**** god.']");

    public static By setYearInLocator(String year) {
        String yearLocator = "//div[contains(@class, 'open')]//li//label[text()='**** god.']";
        return By.xpath(yearLocator.replace("****", year));
    }
        public static By fuelTypeMenu = By.xpath("//div[@class='SumoSelect sumo_fuel']");

    public static By fuelTypeDisel = By.xpath("//div[@class='SumoSelect sumo_fuel open']//li//label[text()='Dizel']");

    public static By setFuelType(String fuelType) {
        String fuelTypeLocator = "//div[@class='SumoSelect sumo_fuel open']//li//label[text()='****']";

  return  By.xpath(fuelTypeLocator.replace("****", fuelType));
    }
    public static By setRegion(String region) {
        String regionLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";

        return By.xpath(regionLocator.replace("****", region));
    }
    public static By regionMenu = By.xpath("//div[@class='SumoSelect sumo_region']");
    public static By searchButton = By.xpath("//button[@name='submit_1']");
    public static By searchSecondPage = By.xpath("//a[text()='2'])[1]");
    public static By sortOrderMeny = By.xpath("(//div[@class='SumoSelect sumo_sortOrder'])[1]");
    public static By priceDesendingSort = By.xpath("//div[contains(@class, 'open')]//li//label[text()='ceni silazno']");
    public static By secondSearchResult = By.xpath("(//article) [2]//a[@class = 'ga-title']");
    public static By getCarInformation = By.xpath("//div[text() ='Marka']//following-sibling::div");
    public static By setSortType(String sortType) {
        String sortTypeLocator = "//div[contains(@class, 'open')]//li//label[text()='****']";
        sortTypeLocator.replace("****", sortType);
        return  By.xpath(sortTypeLocator);
    }
public static By getCarInformation(String information){
        String carInformationLocator = "//div[text() ='Marka']//following-sibling::div";
    carInformationLocator.replace("****", information);
    return By.xpath(carInformationLocator);
}

}
