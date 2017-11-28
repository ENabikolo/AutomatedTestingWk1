import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaseHomePage {


    @FindBy(css ="#content")
    WebElement baseHomePage;

    @FindBy(css ="#ui-id-1")
    WebElement defaultFunctionality;


}
