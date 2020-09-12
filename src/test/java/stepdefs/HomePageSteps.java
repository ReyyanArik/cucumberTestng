package stepdefs;

import ApplicationPages.Homepage;
import WebConnector.webconnector;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;

public class HomePageSteps extends webconnector {
    private Homepage homePage;
    private String scenDesc;

    public HomePageSteps() {
        this.homePage = new Homepage();
    }

    @Before
    public void before(Scenario scenario) {
        this.scenDesc = scenario.getName();
        setUpDriver();
    }

    @After
    public void after(Scenario scenario) {
        closeDriver(scenario);
    }

    @BeforeStep
    public void beforeStep() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Given("User navigates to url {string}")
    public void userNavigatesToUrl(String url) {
        this.homePage.goToHomePage(url);
    }
}
