import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selectable extends BaseHomePage {



    @FindBy(css = "#ui-id-2")
    WebElement displayAsGrid;

    @FindBy(css = "#tabs > ul > li:nth-child(3)")
    WebElement serialize;

}
