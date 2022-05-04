package co.com.choucair.certification.retoopencart.taks;

import co.com.choucair.certification.retoopencart.model.DataOpencart;
import co.com.choucair.certification.retoopencart.userinterface.FiltroOpencartPage;
import net.serenitybdd.core.photography.ScreenshotPhoto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.questions.SelectOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class FiltroOpencart implements Task {
    private DataOpencart dataOpencart;

    public FiltroOpencart(DataOpencart dataOpencart) {
        this.dataOpencart = dataOpencart;
    }

    public static FiltroOpencart the(DataOpencart dataOpencart) {
        return Tasks.instrumented(FiltroOpencart.class, dataOpencart);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataOpencart.getUsername()).into(FiltroOpencartPage.INPUT_USERNAME));
        actor.attemptsTo(Enter.theValue(dataOpencart.getPassword()).into(FiltroOpencartPage.INPUT_PASSWORD));
        actor.attemptsTo(Click.on(FiltroOpencartPage.PRESS_LOGIN_BUTTON));
        actor.attemptsTo(Click.on(FiltroOpencartPage.PRESS_MENU_SALE));
        if (dataOpencart.getOption_sales().equals("Orders")) {
            actor.attemptsTo(Click.on(FiltroOpencartPage.OPTION_ORDERS));
        }

        if (dataOpencart.getOption_sales().equals("Returns")) {
            actor.attemptsTo(Click.on(FiltroOpencartPage.OPTION_RETURNS));
        }

        if (dataOpencart.getOption_sales().equals("Gift Vouchers")) {
                    actor.attemptsTo(Click.on(FiltroOpencartPage.OPTION_GIFT_VOUCHERS));
            }


            //actor.attemptsTo(Click.on(FiltroOpencartPage.OPTION_RECURRING_PROFILES));
            //actor.attemptsTo(SelectFromOptions.byVisibleText(dataOpencart.getOption_sales()).from(FiltroOpencartPage.PRESS_OPTION_RETURNS));
            actor.attemptsTo(Enter.theValue(dataOpencart.getReturn_id()).into(FiltroOpencartPage.INPUT_RETURN_ID));
            actor.attemptsTo(Enter.theValue(dataOpencart.getOrder_id()).into(FiltroOpencartPage.INPUT_ORDER_ID));
            actor.attemptsTo(Enter.theValue(dataOpencart.getCustomer()).into(FiltroOpencartPage.INPUT_CUSTOMER));
            actor.attemptsTo(Enter.theValue(dataOpencart.getProduct()).into(FiltroOpencartPage.INPUT_PRODUCT));
            actor.attemptsTo(Enter.theValue(dataOpencart.getModel()).into(FiltroOpencartPage.INPUT_MODEL));
            actor.attemptsTo(Click.on(FiltroOpencartPage.SELECT_STATUS));
            actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FiltroOpencartPage.SELECT_STATUS));
            actor.attemptsTo(Hit.the(Keys.ENTER).into(FiltroOpencartPage.SELECT_STATUS));
            actor.attemptsTo(Click.on(FiltroOpencartPage.CLICK_BUTTON_FILTER));

            if (dataOpencart.getInfo_pages().equals("Showing 1 to 1 of 1 (1 Pages)")) {
                actor.attemptsTo(Click.on(FiltroOpencartPage.CLICK_INFO_PAGES));
            } else {
                actor.attemptsTo(Click.on(FiltroOpencartPage.CLICK_LAST_PAGE));
            }
        }
    }







