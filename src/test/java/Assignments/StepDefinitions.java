package Assignments;
//import google.Results;
//import google.Search;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.List;






    public class StepDefinitions {
        WebDriver driver;



        @Given("user goes to the {string}")
        public void usergoto(String url) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
        }

        @Then("user waits for {int} seconds")
        public void userWait(int seconds) {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
        }

        @And("verifies that the page title contains the word {string}")
        public void verifiesContainsWord(String expectedTitle) {
            String actualTitle = driver.getTitle();
            Assertions.assertTrue(actualTitle.contains(expectedTitle));
        }

        @And("closes the page")
        public void closesPage() {
            driver.quit();
        }

    }