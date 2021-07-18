package com.udemy.automation.test;

import com.udemy.automation.application.components.browser.OpenBrowserPos;
import com.udemy.automation.application.components.pos.questions.*;
import com.udemy.automation.application.components.pos.tasks.*;
import com.udemy.automation.application.config.ApplicationConfig;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.GivenWhenThen.*;


/**
 * @author Henry J. Calani A.
 */
@WithTag("POS")
public class OpenPosApplicationTest extends AbstractTest {

    @Autowired
    private ApplicationConfig config;
    private Actor actor = Actor.named("henry");
    private OpenBrowserPos openBrowser;
    private HeaderWelcomeAppTitleExist headerWelcomeAppTitleExist;
    private InsertCredentialsPos insertCredentialsPos;
    private HeaderWelcomeTestingYesTitleExist headerWelcomeTestingYesTitleExist;
    private ChooseItemProducto chooseItemProducto;
    private HeaderNameProductExist headerNameProductExist;
    private AddToCart addToCart;
    private HeaderCartContentsExist headerCartContentsExist;
    private CheckOut checkOut;
    private HeaderTitleDeliveryInformationExist headerTitleDeliveryInformationExist;
    private ContinueDelivery continueDelivery;
    private HeaderTitlePaymentInformationExist headerTitlePaymentInformationExist;
    private ContinuePayment continuePayment;
    private HeaderTitleOrderConfirmationExist headerTitleOrderConfirmationExist;
    private ContinueOrderConfirmation continueOrderConfirmation;
    private HeaderThankYouBussinesExist headerThankYouBussinesExist;
    private UpdateItemSelected updateItemSelected;
    private LogOut logOut;
    private HeaderLogOffTitleExist headerLogOffTitleExist;


    @Before
    public void setup() {
        initializeActor(actor);
        openBrowser = taskInstance(OpenBrowserPos.class);
        insertCredentialsPos = taskInstance(InsertCredentialsPos.class);
        insertCredentialsPos.setEmail(config.getUserPos());
        insertCredentialsPos.setPassword(config.getPasswordPos());
        chooseItemProducto = taskInstance(ChooseItemProducto.class);
        addToCart = taskInstance(AddToCart.class);
        checkOut = taskInstance(CheckOut.class);
        continueDelivery = taskInstance(ContinueDelivery.class);
        continuePayment = taskInstance(ContinuePayment.class);
        continueOrderConfirmation = taskInstance(ContinueOrderConfirmation.class);
        updateItemSelected = taskInstance(UpdateItemSelected.class);
        logOut = taskInstance(LogOut.class);

        headerWelcomeAppTitleExist = questionInstance(HeaderWelcomeAppTitleExist.class);
        headerWelcomeTestingYesTitleExist = questionInstance(HeaderWelcomeTestingYesTitleExist.class);
        headerNameProductExist = questionInstance(HeaderNameProductExist.class);
        headerCartContentsExist = questionInstance(HeaderCartContentsExist.class);
        headerTitleDeliveryInformationExist = questionInstance(HeaderTitleDeliveryInformationExist.class);
        headerTitlePaymentInformationExist = questionInstance(HeaderTitlePaymentInformationExist.class);
        headerTitleOrderConfirmationExist = questionInstance(HeaderTitleOrderConfirmationExist.class);
        headerThankYouBussinesExist = questionInstance(HeaderThankYouBussinesExist.class);
        headerLogOffTitleExist = questionInstance(HeaderLogOffTitleExist.class);

    }

    @WithTag
    @Test
    public void openPosApplications() {
        givenThat(actor)
                .attemptsTo(openBrowser);

        then(actor).should(
                seeThat(headerWelcomeAppTitleExist)
        );

        when(actor).attemptsTo(insertCredentialsPos);

        then(actor).should(
                seeThat(headerWelcomeTestingYesTitleExist)
        );
        when(actor).attemptsTo(chooseItemProducto);

        then(actor).should(
                seeThat(headerNameProductExist)
        );

        when(actor).attemptsTo(addToCart);

        then(actor).should(
                seeThat(headerCartContentsExist)
        );

        when(actor).attemptsTo(checkOut);

        then(actor).should(
                seeThat(headerTitleDeliveryInformationExist)
        );

        when(actor).attemptsTo(continueDelivery);

        then(actor).should(
                seeThat(headerTitlePaymentInformationExist)
        );

        when(actor).attemptsTo(continuePayment);

        then(actor).should(
                seeThat(headerTitleOrderConfirmationExist)
        );

        when(actor).attemptsTo(continueOrderConfirmation);

        then(actor).should(
                seeThat(headerThankYouBussinesExist)
        );

        when(actor).attemptsTo(updateItemSelected);

        when(actor).attemptsTo(logOut);

        then(actor).should(
                seeThat(headerLogOffTitleExist)
        );


    }

}
