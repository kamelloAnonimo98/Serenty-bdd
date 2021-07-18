package com.udemy.automation.application.components.pos.tasks;

import com.udemy.automation.application.components.pos.ComponentPos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ContinuePayment implements Task {

    @Autowired
    private ComponentPos component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(component.getTitlePaymentInformation(), isVisible()).forNoMoreThan(30).seconds(),
                component.clickButtonContinuePayment()
        );
    }
}
