package co.com.choucair.certification.retoopencart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FiltroProductReturnsPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Enter username")
            .located(By.id("input-username"));
    public static final Target INPUT_PASSWORD = Target.the("Enter password")
            .located(By.id("input-password"));
    public static final Target PRESS_LOGIN_BUTTON = Target.the("Press login button")
            .located(By.xpath("//button[text()=' Login']"));
    public static final Target PRESS_MENU_SALE = Target.the("Press menu sale")
            .located(By.id("menu-sale"));
    public static final Target OPTION_ORDERS = Target.the("Press option orders")
            .located(By.xpath("//a[text()='Orders']"));
    public static final Target OPTION_RECURRING_PROFILES = Target.the("Press option returns")
            .located(By.id("collapse26"));
    public static final Target OPTION_RETURNS = Target.the("Press option returns")
            .located(By.xpath("//a[text()='Returns']"));
    public static final Target OPTION_GIFT_VOUCHERS = Target.the("Press option returns")
            .located(By.xpath("//a[text()='Gift Vouchers']"));
    public static final Target INPUT_RETURN_ID = Target.the("Input returns ID")
            .located(By.id("input-return-id"));
    public static final Target INPUT_ORDER_ID = Target.the("Input Order ID")
            .located(By.id("input-order-id"));
    public static final Target INPUT_CUSTOMER = Target.the("Input Customer")
            .located(By.id("input-customer"));
    public static final Target INPUT_PRODUCT = Target.the("Input Product")
            .located(By.id("input-product"));
    public static final Target INPUT_MODEL = Target.the("Input Model")
            .located(By.id("input-model"));
    public static final Target CLICK = Target.the("Click")
            .located(By.id("filter-return"));
    public static final Target SELECT_STATUS = Target.the("Input Model")
            .located(By.xpath("//select[@id='input-return-status']"));
    public static final Target CLICK_BUTTON_FILTER = Target.the("Input Model")
            .located(By.id("button-filter"));
    public static final Target CLICK_INFO_PAGES = Target.the("Input Model")
            .located(By.xpath("//div[@class='col-sm-6 text-right']"));
    public static final Target CLICK_LAST_PAGE = Target.the("click last page")
            .located(By.xpath("//a[text()='>|']"));

}

