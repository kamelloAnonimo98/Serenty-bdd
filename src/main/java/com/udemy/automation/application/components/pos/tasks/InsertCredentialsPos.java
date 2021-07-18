package com.udemy.automation.application.components.pos.tasks;

import com.udemy.automation.application.components.pos.ComponentPos;
import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.springframework.beans.factory.annotation.Autowired;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InsertCredentialsPos implements Task {

    @Autowired
    private ComponentPos component;

    @Setter
    private String email;

    @Setter
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(component.getWelcomeAppTitle(), isVisible()).forNoMoreThan(30).seconds(),
                component.clickIconLogin() ,
                WaitUntil.the(component.getHeaderTitle(),isVisible()).forNoMoreThan(30).seconds(),
                component.enterEmailInput(email),
                component.enterPasswordInput(password),
                component.clickButtonSubmit()
        );
    }
}
