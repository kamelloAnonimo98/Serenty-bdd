package com.udemy.automation.application.components.pos;


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
public class ComponentPos {

    @Getter
    private Target headerTitle;

    @Getter
    private Target welcomeAppTitle;

    @Getter
    private  Target inputEmail;

    @Getter
    private  Target inputPassword;

    @Getter
    private  Target buttonSubmit;

    @Getter
    private  Target buttonLogin;

    @Getter
    private  Target titleWelcomeYes;

    @Getter
    private  Target itemProducto;

    @Getter
    private  Target nameProducto;

    @Getter
    private  Target buttonAddToCart;

    @Getter
    private  Target titleCartContents;

    @Getter
    private  Target buttonCheckOut;

    @Getter
    private  Target titleDeliveryInformation;

    @Getter
    private  Target buttonContinueDelivery;

    @Getter
    private  Target titlePaymentInformation;

    @Getter
    private  Target buttonContinuePayment;

    @Getter
    private  Target titleOrderConfirmation;

    @Getter
    private  Target buttonOrderConfirmation;

    @Getter
    private  Target titleThanksYou;

    @Getter
    private  Target buttonUpdateItem;

    @Getter
    private  Target buttonLogOut;

    @Getter
    private  Target labelLogOff;



    public  Performable clickButtonLogOut(){
        return  Click.on(buttonLogOut);
    }

    public  Performable clickButtonUpdate(){
        return  Click.on(buttonUpdateItem);
    }

    public  Performable clickButtonOrderConfirmation(){
        return  Click.on(buttonOrderConfirmation);
    }

    public  Performable clickButtonContinuePayment(){
        return  Click.on(buttonContinuePayment);
    }

    public  Performable clickButtonContinueDelivery(){
        return  Click.on(buttonContinueDelivery);
    }

    public  Performable clickButtonCheckOut(){
        return  Click.on(buttonCheckOut);
    }

    public  Performable clickItemProducto(){
        return Click.on(itemProducto);
    }

    public  Performable clickButtonAddToCart(){
        return Click.on(buttonAddToCart);
    }


    public Performable clickIconLogin(){
        return Click.on(buttonLogin);
    }

    public  Performable enterEmailInput(String email){
        return Enter.theValue(email).into(inputEmail).thenHit(Keys.TAB);
    }

    public  Performable enterPasswordInput(String password){
        return Enter.theValue(password).into(inputPassword).thenHit(Keys.TAB);
    }

    public Performable clickButtonSubmit(){
        return Click.on(buttonSubmit);
    }


    @PostConstruct
    void  onPostConstruct(){
        headerTitle = Target.the(ConstantsPos.TITLE_WELCOME).located(By.id(ConstantsPos.TITLE_WELCOME));
        welcomeAppTitle = Target.the(ConstantsPos.TITLE_WELCOME_APP).located(By.id(ConstantsPos.TITLE_WELCOME_APP));
        inputEmail = Target.the(ConstantsPos.INPUT_LOGIN_EMAIL).located(By.id(ConstantsPos.INPUT_LOGIN_EMAIL));
        inputPassword = Target.the(ConstantsPos.INPUT_LOGIN_PASSWORD).located(By.id(ConstantsPos.INPUT_LOGIN_PASSWORD));
        buttonSubmit = Target.the(ConstantsPos.BUTTON_SING_IN).located(By.xpath(ConstantsPos.BUTTON_SING_IN));
        buttonLogin  = Target.the(ConstantsPos.BUTTON_LOGIN).located(By.cssSelector(ConstantsPos.BUTTON_LOGIN));
        titleWelcomeYes = Target.the(ConstantsPos.TITLE_WELCOME_APP).located(By.id(ConstantsPos.TITLE_WELCOME_APP));
        itemProducto = Target.the(ConstantsPos.ITEM_PRODUCTO_APPLE).located(By.cssSelector(ConstantsPos.ITEM_PRODUCTO_APPLE));
        nameProducto  = Target.the(ConstantsPos.NAME_PRODUCT).located(By.id(ConstantsPos.NAME_PRODUCT));
        buttonAddToCart = Target.the(ConstantsPos.BUTTON_ADD_TO_CART).located(By.cssSelector(ConstantsPos.BUTTON_ADD_TO_CART));
        titleCartContents  = Target.the(ConstantsPos.CART_CONTENTS).located(By.id(ConstantsPos.CART_CONTENTS));
        buttonCheckOut  = Target.the(ConstantsPos.BUTTON_CHECKOUT).located(By.cssSelector(ConstantsPos.BUTTON_CHECKOUT));
        titleDeliveryInformation = Target.the(ConstantsPos.DELIVERY_INFORMATION).located(By.id(ConstantsPos.DELIVERY_INFORMATION));
        buttonContinueDelivery = Target.the(ConstantsPos.BUTTON_DELIVERY_INFORMATION).located(By.cssSelector(ConstantsPos.BUTTON_DELIVERY_INFORMATION));
        titlePaymentInformation = Target.the(ConstantsPos.PAYMENT_INFORMATION_LABEL).located(By.id(ConstantsPos.PAYMENT_INFORMATION_LABEL));
        buttonContinuePayment = Target.the(ConstantsPos.PAYMENT_INFORMATION_BUTTON).located(By.cssSelector(ConstantsPos.PAYMENT_INFORMATION_BUTTON));
        titleOrderConfirmation = Target.the(ConstantsPos.ORDER_CONFIRMATION_LABEL).located(By.id(ConstantsPos.ORDER_CONFIRMATION_LABEL));
        buttonOrderConfirmation = Target.the(ConstantsPos.ORDER_CONFIRMATION_BUTTON).located(By.cssSelector(ConstantsPos.ORDER_CONFIRMATION_BUTTON));
        titleThanksYou = Target.the(ConstantsPos.THANKS_YOU_LABEL).located(By.id(ConstantsPos.THANKS_YOU_LABEL));
        buttonUpdateItem = Target.the(ConstantsPos.THANKS_YOU_UPDATE_BUTTON).located(By.cssSelector(ConstantsPos.THANKS_YOU_UPDATE_BUTTON));
        buttonLogOut = Target.the(ConstantsPos.BUTTON_LOG_OUT).located(By.cssSelector(ConstantsPos.BUTTON_LOG_OUT));
        labelLogOff = Target.the(ConstantsPos.LOG_OFF).located(By.id(ConstantsPos.LOG_OFF));
    }

}
