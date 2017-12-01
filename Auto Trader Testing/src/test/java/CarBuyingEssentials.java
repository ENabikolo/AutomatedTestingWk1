import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarBuyingEssentials {
    @FindBy(css ="body > main > div > section.is-non-critical > section.products__nav.cars")
    private WebElement carBuyingEssentialsForm;

    @FindBy(css ="body > main > div > section.is-non-critical > section.products__nav.cars > a:nth-child(2) > figure > div > img")
    private WebElement carInsuranceLink;

    @FindBy(css ="body > main > div > section.is-non-critical > section.products__nav.cars > a:nth-child(3) > figure > div > img")
    private WebElement carFinanceAndLoansLink;

    @FindBy(css ="body > main > div > section.is-non-critical > section.products__nav.cars > a:nth-child(4) > figure > div > img")
    private WebElement vehicleCheckLink;

    public void findCarBuyingEssentialsForm(){
    }

    public void clickCarInsuranceLink(){ carInsuranceLink.click(); }

    public void clickCarFinanceAndLoansLink(){carFinanceAndLoansLink.click(); }

    public void clickVehicleCheckLink(){ vehicleCheckLink.click(); }


    public String getCurrentPage(WebDriver webDriver) {
   return webDriver.getCurrentUrl();

    }

    public void click() {
        carBuyingEssentialsForm.click();

    }

    public Point getLocation() {
        return carBuyingEssentialsForm.getLocation();
    }

}
