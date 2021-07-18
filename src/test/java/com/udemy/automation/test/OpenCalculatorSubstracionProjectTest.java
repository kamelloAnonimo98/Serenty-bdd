package com.udemy.automation.test;

import com.udemy.automation.application.ActionsUser.UserActions;
import com.udemy.automation.application.components.browser.OpenBrowserCalculator;
import com.udemy.automation.application.components.calculator.ConstantsCalculator;
import com.udemy.automation.application.components.calculator.questions.ResultValueExist;
import com.udemy.automation.application.components.calculator.questions.TitleCalculatorExist;
import com.udemy.automation.application.components.calculator.questions.TitleHistoryExist;
import com.udemy.automation.application.components.calculator.questions.TitleTimeExist;
import com.udemy.automation.application.components.calculator.tasks.MultiplicationsValues;
import com.udemy.automation.application.components.calculator.tasks.SubstraccionValues;
import com.udemy.automation.application.config.ApplicationConfig;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.is;


/**
 * @author Henry J. Calani A.
 */
@WithTag("CALCULATOR")
public class OpenCalculatorSubstracionProjectTest extends AbstractTest {

    @Autowired
    private ApplicationConfig config;
    private Actor actor = Actor.named("henry");
    private OpenBrowserCalculator openBrowser;
    private TitleCalculatorExist titleCalculatorExist;
    private TitleHistoryExist titleHistoryExist;
    private TitleTimeExist titleTimeExist;
    private SubstraccionValues substraccionValues;
    private ResultValueExist resultValueExist;


    @Before
    public void setup() {
        initializeActor(actor);
        openBrowser = taskInstance(OpenBrowserCalculator.class);
        substraccionValues = taskInstance(SubstraccionValues.class);
        substraccionValues.setFirstValue(config.getFirstValue());
        substraccionValues.setSecondValue(config.getSecondValue());

        titleCalculatorExist = questionInstance(TitleCalculatorExist.class);
        titleHistoryExist = questionInstance(TitleHistoryExist.class);
        titleTimeExist = questionInstance(TitleTimeExist.class);
        resultValueExist = questionInstance(ResultValueExist.class);
    }

    @WithTag
    @Test
    public void openCalculatorProjectTest() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        then(actor).should(
                seeThat(titleCalculatorExist)
        );
        then(actor).should(
                seeThat(titleHistoryExist)
        );
        then(actor).should(
                seeThat(titleTimeExist)
        );

        if(titleCalculatorExist.answeredBy(actor)){
            then(actor).attemptsTo(substraccionValues);
        }
        UserActions.sleep();
        then(actor).should(
              seeThat(resultValueExist,is(ConstantsCalculator.RESULT_SUBSTRACCION))
        );

    }

}
