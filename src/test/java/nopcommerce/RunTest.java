package nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "@books, @apparel, @computers, @digitaldownload,  @electronics, @giftcards,   @jewelry")

public class RunTest {

}
