package com.udemy.automation.application.components.moodleFiles.tasks;

import com.udemy.automation.application.components.moodleFiles.ComponentMoodle;
import lombok.Setter;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import org.springframework.beans.factory.annotation.Autowired;

public class OpenSiteHomeMoodle implements Task {

    @Autowired
    private ComponentMoodle component;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
         component.clickButtonSiteHome()
        );
    }

}