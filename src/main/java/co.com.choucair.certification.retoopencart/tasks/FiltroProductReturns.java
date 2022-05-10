package co.com.choucair.certification.retoopencart.tasks;

import co.com.choucair.certification.retoopencart.model.DataOpencart;
import co.com.choucair.certification.retoopencart.userinterface.FiltroProductReturnsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class FiltroProductReturns implements Task {
    private DataOpencart dataOpencart;

    public FiltroProductReturns(DataOpencart dataOpencart) {
        this.dataOpencart = dataOpencart;
    }

    public static FiltroProductReturns the(DataOpencart dataOpencart) {
        return Tasks.instrumented(FiltroProductReturns.class, dataOpencart);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataOpencart.getUsername()).into(FiltroProductReturnsPage.INPUT_USERNAME),
                Enter.theValue(dataOpencart.getPassword()).into(FiltroProductReturnsPage.INPUT_PASSWORD),
                Click.on(FiltroProductReturnsPage.PRESS_LOGIN_BUTTON),
                Click.on(FiltroProductReturnsPage.PRESS_MENU_SALE),
                OptionsSales(actor),

        actor.attemptsTo(
                Enter.theValue(dataOpencart.getReturn_id()).into(FiltroProductReturnsPage.INPUT_RETURN_ID),
                Enter.theValue(dataOpencart.getOrder_id()).into(FiltroProductReturnsPage.INPUT_ORDER_ID),
                Enter.theValue(dataOpencart.getCustomer()).into(FiltroProductReturnsPage.INPUT_CUSTOMER),
                Enter.theValue(dataOpencart.getProduct()).into(FiltroProductReturnsPage.INPUT_PRODUCT),
                Enter.theValue(dataOpencart.getModel()).into(FiltroProductReturnsPage.INPUT_MODEL),
                Click.on(FiltroProductReturnsPage.CLICK),
                Click.on(FiltroProductReturnsPage.SELECT_STATUS),
            actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(FiltroProductReturnsPage.SELECT_STATUS));
            actor.attemptsTo(Hit.the(Keys.ENTER).into(FiltroProductReturnsPage.SELECT_STATUS));
            actor.attemptsTo(Click.on(FiltroProductReturnsPage.CLICK_BUTTON_FILTER));

            if (dataOpencart.getInfo_pages().equals("Showing 1 to 1 of 1 (1 Pages)")) {
                actor.attemptsTo(Click.on(FiltroProductReturnsPage.CLICK_INFO_PAGES));
            } else {
                actor.attemptsTo(Click.on(FiltroProductReturnsPage.CLICK_LAST_PAGE));
            }
        }
        private <T extends Actor> void OptionsSales(T actor) {

        if (dataOpencart.getOption_sales().equals("Orders")) {
            actor.attemptsTo(Click.on(FiltroProductReturnsPage.OPTION_ORDERS));
        }

        if (dataOpencart.getOption_sales().equals("Returns")) {
            actor.attemptsTo(Click.on(FiltroProductReturnsPage.OPTION_RETURNS));
        }

        if (dataOpencart.getOption_sales().equals("Gift Vouchers")) {
                    actor.attemptsTo(Click.on(FiltroProductReturnsPage.OPTION_GIFT_VOUCHERS));
            }
    }
}







