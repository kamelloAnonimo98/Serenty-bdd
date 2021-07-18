package com.udemy.automation.application.components.moodleFiles.questions;

import com.udemy.automation.application.ActionsUser.UserActions;
import com.udemy.automation.application.components.moodleFiles.ComponentMoodle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.springframework.beans.factory.annotation.Autowired;

public class LabelPrivateFilesExists implements Question<String> {

    @Autowired
    private ComponentMoodle component;

    @Override
    public String answeredBy(Actor actor) {
        UserActions.isVisible(component.getLabelPrivateFile());
        return UserActions.isTextPresent(component.getLabelPrivateFile(), actor);
    }
}