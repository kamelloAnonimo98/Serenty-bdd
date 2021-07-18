package com.udemy.automation.application.components.calculator.questions;


import com.udemy.automation.application.ActionsUser.UserActions;
import com.udemy.automation.application.components.calculator.ComponentCalculator;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.springframework.beans.factory.annotation.Autowired;

public class TitleCalculatorExist implements Question<Boolean> {

    @Autowired
    private ComponentCalculator component;

    @Override
    public Boolean answeredBy(Actor actor) {
        UserActions.isVisible(component.getTitleLabel());
        return UserActions.isPresent(component.getTitleLabel(),actor);
    }

}
