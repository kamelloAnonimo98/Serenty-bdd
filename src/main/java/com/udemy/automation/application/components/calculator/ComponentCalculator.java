package com.udemy.automation.application.components.calculator;

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
public class ComponentCalculator {

    @Getter
    private Target titleLabel;

    @Getter
    private Target historyLabel;

    @Getter
    private Target timeLabel;

    @Getter
    private Target expresionLabel;

    @Getter
    private Target resultLabel;

    @Getter
    private Target firstValueInput;

    @Getter
    private Target secondValueInput;

    @Getter
    private Target operatorMultiplication;

    @Getter
    private Target operatorAdd;

    @Getter
    private Target operatorResta;

    @Getter
    private Target operatorDivision;

    @Getter
    private Target operatorModulo;

    @Getter
    private Target buttonSubmit;

    @Getter
    private Target resultValue;

    public Performable putFirstValue(String firstValue){
        return Enter.theValue(firstValue).into(firstValueInput).thenHit(Keys.TAB);
    }

    public Performable putSecondValue(String secondValue){
        return Enter.theValue(secondValue).into(secondValueInput).thenHit(Keys.TAB);
    }

    public  Performable selectAddition(){
        return Click.on(operatorAdd);
    }
    public  Performable selectMultiplication(){
        return Click.on(operatorMultiplication);
    }
    public  Performable selectDivition(){
        return Click.on(operatorDivision);
    }
    public  Performable selectModulo(){
        return Click.on(operatorModulo);
    }
    public  Performable selectsubstraccion(){
        return Click.on(operatorResta);
    }

     public Performable pushButtonSubmit(){
        return Click.on(buttonSubmit);
     }


    @PostConstruct
    void onPostConstruct() {
        titleLabel = Target.the(ConstantsCalculator.TITLE_LABEL).located(By.xpath(ConstantsCalculator.TITLE_LABEL));
        historyLabel = Target.the(ConstantsCalculator.HISTORY_LABEL).located(By.xpath(ConstantsCalculator.HISTORY_LABEL));
        timeLabel = Target.the(ConstantsCalculator.TIME_LABEL).located(By.xpath(ConstantsCalculator.TIME_LABEL));
        expresionLabel = Target.the(ConstantsCalculator.EXPRESION_LABEL).located(By.cssSelector(ConstantsCalculator.EXPRESION_LABEL));
        resultLabel = Target.the(ConstantsCalculator.RESULT_LABEL).located(By.cssSelector(ConstantsCalculator.RESULT_LABEL));
        firstValueInput  = Target.the(ConstantsCalculator.FIRST_VALUE).located(By.xpath(ConstantsCalculator.FIRST_VALUE));
        secondValueInput  = Target.the(ConstantsCalculator.SECOND_VALUE).located(By.xpath(ConstantsCalculator.SECOND_VALUE));
        buttonSubmit  = Target.the(ConstantsCalculator.BUTTON_SUBMIT).located(By.id(ConstantsCalculator.BUTTON_SUBMIT));
        operatorMultiplication  = Target.the(ConstantsCalculator.OPERATOR_MULTIPLICATION).located(By.cssSelector(ConstantsCalculator.OPERATOR_MULTIPLICATION));
        operatorAdd  = Target.the(ConstantsCalculator.OPERATOR_ADD).located(By.cssSelector(ConstantsCalculator.OPERATOR_ADD));
        operatorResta  = Target.the(ConstantsCalculator.OPERATOR_SUBSTRACCION).located(By.cssSelector(ConstantsCalculator.OPERATOR_SUBSTRACCION));
        operatorDivision  = Target.the(ConstantsCalculator.OPERATOR_DIVITION).located(By.cssSelector(ConstantsCalculator.OPERATOR_DIVITION));
        operatorModulo   = Target.the(ConstantsCalculator.OPERATOR_MODULO).located(By.cssSelector(ConstantsCalculator.OPERATOR_MODULO));
        resultValue  = Target.the(ConstantsCalculator.RESULT_OPERATIONS).located(By.cssSelector(ConstantsCalculator.RESULT_OPERATIONS));
    }

}
