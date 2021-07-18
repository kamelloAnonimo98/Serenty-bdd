package com.udemy.automation.application.components.pos.questions;

import com.udemy.automation.application.ActionsUser.UserActions;
import com.udemy.automation.application.components.pos.ComponentPos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.springframework.beans.factory.annotation.Autowired;

public class HeaderWelcomeAppTitleExist implements Question<Boolean> {

    @Autowired
    private ComponentPos component;


    @Override
    public  Boolean answeredBy(Actor actor){
        return UserActions.isPresent(component.getWelcomeAppTitle(),actor);
    }


}
