import PageMethods.Homepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PolovniAutomobiliTest extends Homepage {

public static final String CAR_MODEL = "Grande Punto";
    public static final String CAR_BRAND = "Fiat";

    public static final String FUEL_TYPE = "Dizel";

    public static final int YEAR_TO  = 2023;
    public static final int YEAR_FROM  = 2005;
    public static final String REGION  = "Centralna Srbija";
    public static final String SEARCH  = "ceni silazno";

    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().navigate().to("https://www.polovniautomobili.com/");
    }


    @Test
public void test() {
        Homepage homepage = new Homepage();
        homepage.openBrandMenu().selectBrand(CAR_BRAND).openModelMenu().
                selectModel(CAR_MODEL).SelectFuelType(FUEL_TYPE)
                .selectYearFrom(YEAR_FROM).selectYearTo(YEAR_TO).selectRegion(REGION).search().sortSearch(SEARCH).selectSecondSearch()
                .selectSearchResult()
                .verifyBrand(CAR_BRAND)
                .verifyModel(CAR_MODEL)
                .verifyFuelType(FUEL_TYPE)
                .verifyProductionYear(YEAR_FROM, YEAR_TO);
    }


    @AfterEach
    public void close() {
        quitDriver();
    }

}
