import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Selectable extends BaseHomePage {
    private WebDriver webDriver;


    public void Selectable() {
        Actions builder = new Actions(webDriver);
        webDriver.findElement(By.cssSelector("#ui-id-1"));
        builder.clickAndHold().moveByOffset(100, 50).release().perform();
        //Point location = draggable.getLocation()
    }
    /*

    @FindBy(css = "#ui-id-2")
    WebElement displayAsGrid;

    //serialize
    @FindBy(css = "#tabs > ul > li:nth-child(3)")
    WebElement serialize;
*/
}
