package com.udemy.automation.test;

import com.udemy.automation.application.components.browser.OpenBrowserMoodle;
import com.udemy.automation.application.components.moodleFiles.ConstantsMoodle;
import com.udemy.automation.application.components.moodleFiles.questions.*;
import com.udemy.automation.application.components.moodleFiles.tasks.*;
import com.udemy.automation.application.config.ApplicationConfig;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.PrimitiveIterator;

import static net.serenitybdd.screenplay.GivenWhenThen.*;


/**
 * @author Henry J. Calani A.
 */
@WithTag("MOODLE")
public class OpenMoodleProyectTest extends AbstractTest {

    @Autowired
    private ApplicationConfig config;
    private Actor actor = Actor.named("henry");
    private OpenBrowserMoodle openBrowser;
    private LabelRememberExists labelRememberExists;
    private InputUserNameExists inputUserNameExists;
    private ButtonAccederExists buttonAccederExists;
    private ImageLogoMoodleExists imageLogoMoodleExists;
    private InputPasswordExists inputPasswordExists;
    private InsertCredentialsMoodle insertCredentialsMoodle;
    private LabelDashboardExists labelDashboardExists;
    private LabelSiteHomeExists labelSiteHomeExists;
    private LabelCalendarExists labelCalendarExists;
    private LabelMyCourseExists labelMyCourseExists;
    private LabelPrivateFilesExists labelPrivateFilesExists;
    private OpenCalendarMoodle openCalendarMoodle;
    private OpenSiteHomeMoodle openSiteHomeMoodle;
    private OpenMyCourseMoodle openMyCourseMoodle;
    private OpenPrivateFileseMoodle openPrivateFileseMoodle;


    @Before
    public void setup() {
        initializeActor(actor);
        openBrowser = taskInstance(OpenBrowserMoodle.class);

        insertCredentialsMoodle = taskInstance(InsertCredentialsMoodle.class);
        insertCredentialsMoodle.setUserName(config.getUserNameMoodle());
        insertCredentialsMoodle.setPassword(config.getPasswordMoodle());
        openCalendarMoodle = taskInstance(OpenCalendarMoodle.class);
        openSiteHomeMoodle = taskInstance(OpenSiteHomeMoodle.class);
        openPrivateFileseMoodle = taskInstance(OpenPrivateFileseMoodle.class);
        openMyCourseMoodle = taskInstance(OpenMyCourseMoodle.class);

        labelRememberExists = questionInstance(LabelRememberExists.class);
        inputUserNameExists = questionInstance(InputUserNameExists.class);
        buttonAccederExists = questionInstance(ButtonAccederExists.class);
        imageLogoMoodleExists = questionInstance(ImageLogoMoodleExists.class);
        inputPasswordExists = questionInstance(InputPasswordExists.class);
        labelDashboardExists = questionInstance(LabelDashboardExists.class);
        labelSiteHomeExists = questionInstance(LabelSiteHomeExists.class);
        labelCalendarExists = questionInstance(LabelCalendarExists.class);
        labelMyCourseExists = questionInstance(LabelMyCourseExists.class);
        labelPrivateFilesExists = questionInstance(LabelPrivateFilesExists.class);
    }

    @WithTag
    @Test
    public void openMoodleProyectTest() {
        givenThat(actor)
                .attemptsTo(openBrowser);
        then(actor).should(
                seeThat(labelRememberExists)
        );
        then(actor).should(
                seeThat(ConstantsMoodle.LABEL_REMEMBER_CHECKBOX, labelRememberExists)
        );
        then(actor).should(
                seeThat(inputUserNameExists)
        );
        then(actor).should(
                seeThat(ConstantsMoodle.LABEL_BUTTON_ACCEDER, buttonAccederExists)
        );
        then(actor).should(
                seeThat(imageLogoMoodleExists)
        );
        then(actor).should(
                seeThat(inputPasswordExists)
        );
        when(actor).attemptsTo(insertCredentialsMoodle);

        then(actor).should(
                seeThat(ConstantsMoodle.DASHBOARD,labelDashboardExists)
        );
        then(actor).should(
                seeThat(ConstantsMoodle.LABEL_CALENDAR,labelCalendarExists)
        );

        then(actor).should(
                seeThat(ConstantsMoodle.SITE_HOME,labelSiteHomeExists)
        );
        then(actor).should(
                seeThat(ConstantsMoodle.MY_COURSE,labelMyCourseExists)
        );
        then(actor).should(
                seeThat(ConstantsMoodle.PRIVATE_FILES,labelPrivateFilesExists)
        );
        when(actor).attemptsTo(openSiteHomeMoodle);
        when(actor).attemptsTo(openCalendarMoodle);
        when(actor).attemptsTo(openPrivateFileseMoodle);
        when(actor).attemptsTo(openMyCourseMoodle);
    }

}
