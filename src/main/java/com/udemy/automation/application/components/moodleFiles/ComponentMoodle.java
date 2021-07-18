package com.udemy.automation.application.components.moodleFiles;


import com.udemy.automation.application.framework.context.PrototypeScope;
import lombok.Getter;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.annotation.PostConstruct;

@PrototypeScope
public class ComponentMoodle {

    @Getter
    private Target imageIntro;

    @Getter
    private Target inputUser;

    @Getter
    private Target inputPassword;

    @Getter
    private Target buttonAcceder;

    @Getter
    private Target labelRemember;

    @Getter
    private  Target labelDashboard;

    @Getter
    private  Target labelSiteHome;

    @Getter
    private  Target labelCalendar;

    @Getter
    private  Target labelPrivateFile;

    @Getter
    private  Target labelMyCourse;


    public Performable enterUserValue(String value){
        return Enter.theValue(value).into(inputUser).thenHit(Keys.TAB);
    }

    public Performable enterPasswordValue(String value){
        return Enter.theValue(value).into(inputPassword).thenHit(Keys.TAB);
    }

    public Performable clickButtonLogin(){
        return Click.on(buttonAcceder);
    }

    public Performable clickButtonSiteHome(){
        return Click.on(labelSiteHome);
    }

    public Performable clickButtonCalendar(){
        return Click.on(labelCalendar);
    }

    public Performable clickButtonPrivateFiles(){
        return Click.on(labelPrivateFile);
    }

    public Performable clickButtonMyCourse(){
        return Click.on(labelMyCourse);
    }

    @PostConstruct
    void onPostConstruct() {
        imageIntro = Target.the(ConstantsMoodle.LOGO_MOODLE).located(By.cssSelector(ConstantsMoodle.LOGO_MOODLE));
        inputUser = Target.the(ConstantsMoodle.INPUT_USERNAME).located(By.id(ConstantsMoodle.INPUT_USERNAME));
        inputPassword = Target.the(ConstantsMoodle.INPUT_PASSWORD).located(By.id(ConstantsMoodle.INPUT_PASSWORD));
        buttonAcceder = Target.the(ConstantsMoodle.BUTTON_ACCEDER).located(By.id(ConstantsMoodle.BUTTON_ACCEDER));
        labelRemember = Target.the(ConstantsMoodle.LABEL_REMEMEBER).located(By.id(ConstantsMoodle.LABEL_REMEMEBER));
        labelDashboard = Target.the(ConstantsMoodle.LABEL_DASHBOARD).located(By.cssSelector(ConstantsMoodle.LABEL_DASHBOARD));
        labelCalendar = Target.the(ConstantsMoodle.LABEL_CALENDAR).located(By.cssSelector(ConstantsMoodle.LABEL_CALENDAR));
        labelMyCourse = Target.the(ConstantsMoodle.LABEL_MY_COURSE).located(By.cssSelector(ConstantsMoodle.LABEL_MY_COURSE));
        labelPrivateFile = Target.the(ConstantsMoodle.LABEL_PRIVATE_FILES).located(By.cssSelector(ConstantsMoodle.LABEL_PRIVATE_FILES));
        labelSiteHome = Target.the(ConstantsMoodle.LABEL_SITE_HOME).located(By.cssSelector(ConstantsMoodle.LABEL_SITE_HOME));

    }

}
