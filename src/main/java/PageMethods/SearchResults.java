package PageMethods;

import Core.BasePage;
import Core.Locators;

public class SearchResults extends BasePage {
    public SearchResults sortSearch(String sortType){
        clickOneElement(Locators.sortOrderMeny);
        clickOneElement(Locators.setSortType(sortType));
        return  this;
    }
    public SearchResults selectSecondSearch(){
    clickOneElement(Locators.searchSecondPage);
    return this;
    }
    public CarinformationPage selectSearchResult(){
        clickOneElement(Locators.secondSearchResult);
        return new CarinformationPage();
    }
}
