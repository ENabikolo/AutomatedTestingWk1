import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sortable extends BaseHomePage {


    @FindBy(css = "#ui-id-2")
    WebElement connectLists;

    @FindBy(css = "#ui-id-3")
    WebElement displayAsGrid;

    @FindBy(css = "#ui-id-4")
    WebElement portlets;



}
