import PageMethods.Homepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PolovniAutomobiliTest extends Homepage {

public static final String CAR_MODEL = "X7";
    public static final String CAR_BRAND = "BMW";

    public static final String FUEL_TYPE = "B";

    public static final int YEAR_TO  = 2015;
    public static final int YEAR_FROM  = 2010;
    public static final String REGION  = "šumadijski";

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
                 .selectYearFrom(YEAR_FROM).selectYearTo(YEAR_TO).selectRegion(REGION).search();
    }

    @AfterEach
    public void close() {
        quitDriver();
    }

}
