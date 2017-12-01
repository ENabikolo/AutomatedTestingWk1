import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CarPurchaseForm {
    private WebDriver webDriver;
    String postcode = "M50 3TY";

    //String distance ="10000"; //Dropdown list
    String usage ="Nearly New" ;/*
    String make = "Bugatti";
    String model = "American Classic";
    String minPrice ="£400";
    String maxPrice ="£2000" ;*/

    @FindBy(css ="body > section > section")
    WebElement carPurchaseForm;

    @FindBy(css ="#postcode")
    WebElement postCode;

    @FindBy(css ="#radius") //Dropdown List
    WebElement mileage;


    @FindBy(css ="#searchVehicles > fieldset > fieldset > label:nth-child(2)")
    WebElement checkUsed;

    @FindBy(css ="#searchVehicles > fieldset > fieldset > label:nth-child(3)")
    WebElement checkNearlyNew;

    @FindBy(css ="#searchVehicles > fieldset > fieldset > label:nth-child(4)")
    WebElement checkNew;


    @FindBy(css ="#searchVehiclesMake")
    WebElement vehicleMake;

    @FindBy(css ="#searchVehiclesModel")
    WebElement vehicleModel;

    @FindBy(css ="#searchVehiclesPriceFrom")
    WebElement vehicleMinPrice;

    @FindBy(css ="#searchVehiclesPriceTo")
    WebElement vehicleMaxPrice;

    @FindBy(css ="#searchVehiclesCount")
    WebElement searchVehiclesButton;

    @FindBy(css ="#js-more-options")
    WebElement moreOptionsLink;

    public void fillInCarPurchaseForm(){ WebElement carPurchaseForm = webDriver.findElement(By.cssSelector("body > section > section"));
        carPurchaseForm.click();
    }
    public void enterPostCode(){ postCode.sendKeys(postcode); }

    public void selectMileage(){ //mileage.sendKeys(distance);
        Select mileage1 = new Select(mileage);
        mileage1.selectByVisibleText("Within 10 miles"); }

    public void selectVehicleUsage(){ checkNearlyNew.sendKeys(usage);
        checkNearlyNew.click();
    }
    public void selectVehicleMake(){ //vehicleMake.sendKeys(make);
        Select vehicleMake1 = new Select(vehicleMake);
        vehicleMake1.selectByVisibleText("Audi");
    }
    public void selectVehicleModel(){ //vehicleModel.sendKeys(model);
        Select vehicleModel1 = new Select(vehicleModel);
        vehicleModel1.selectByValue("Q2");
    }
    public void selectVehicleMinPrice(){ //vehicleMinPrice.sendKeys(minPrice);
        Select vehicleMinPrice1 = new Select(vehicleMinPrice);
        vehicleMinPrice1.selectByValue("£15,000");
    }
    public void selectVehicleMaxPrice(){ //vehicleMaxPrice.sendKeys(maxPrice);
        Select vehicleMaxPrice1 = new Select(vehicleMaxPrice);
        vehicleMaxPrice1.selectByValue("£25,000");
    }
    public void clickSearchVehiclesButton(){ searchVehiclesButton.sendKeys();
        searchVehiclesButton.click();
    }
    public void selectMoreOptionsLink(){ moreOptionsLink.sendKeys();
        moreOptionsLink.click();
    }

    public void click() {
    }
}


