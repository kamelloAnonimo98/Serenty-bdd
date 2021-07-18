package com.udemy.automation.application.components.calculator.questions;

import com.udemy.automation.application.ActionsUser.UserActions;
import com.udemy.automation.application.components.calculator.ComponentCalculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.springframework.beans.factory.annotation.Autowired;

public class ResultValueExist implements Question<String> {

    @Autowired
    private ComponentCalculator component;

    @Override
    public String answeredBy(Actor actor) {
        UserActions.isVisible(component.getResultValue());
        return UserActions.isTextPresent(component.getResultValue(),actor);
    }

}
