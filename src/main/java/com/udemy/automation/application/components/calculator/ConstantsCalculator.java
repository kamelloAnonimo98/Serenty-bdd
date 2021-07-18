package com.udemy.automation.application.components.calculator;

public class ConstantsCalculator {
    public static final String TITLE_LABEL="/html//div[@class='container ng-scope']//h3[.='Super Calculator']";
    public static final String HISTORY_LABEL="/html//h4[.='History']";
    public static final String TIME_LABEL="/html//div[@class='container ng-scope']/table[@class='table']//th[.='Time']";
    public static final String EXPRESION_LABEL="/html//div[@class='container ng-scope']/table[@class='table']//th[.='Expression']";
    public static final String RESULT_LABEL="/html//div[@class='container ng-scope']/table[@class='table']//th[.='Expression']";
    public static final String FIRST_VALUE = "/html/body/div/div/form/input[1]";
    public static final String SECOND_VALUE = "/html/body/div/div/form/input[2]";
    public static final String BUTTON_SUBMIT = "gobutton";
    public static final String OPERATOR_ADD = "body > div > div > form > select > option:nth-child(1)";
    public static final String OPERATOR_DIVITION = "body > div > div > form > select > option:nth-child(2)";
    public static final String OPERATOR_SUBSTRACCION = "body > div > div > form > select > option:nth-child(5)";
    public static final String OPERATOR_MULTIPLICATION = "body > div > div > form > select > option:nth-child(4)";
    public static final String OPERATOR_MODULO = "body > div > div > form > select > option:nth-child(3)";
    public static final String RESULT_OPERATIONS = "h2";
    public static final String RESULT_ADD = "15";
    public static final String RESULT_DIVITIONS = "2";
    public static final String RESULT_MULTIPLICATIONS = "50";
    public static final String RESULT_SUBSTRACCION= "5";
    public static final String RESULT_MODULE= "0";
}
