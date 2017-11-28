import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Draggable {

    private WebDriver webDriver;



    @FindBy(css ="#ui-id-2")
    WebElement constrainMovement;

    @FindBy(css ="#ui-id-3")
    WebElement cursorStyle;

    @FindBy(css ="#tabs > ul > li:nth-child(4)")
    WebElement events;


    @FindBy(css ="#ui-id-5")
    WebElement draggableAndSortable;

public void click(){
    Draggable.click();
    //Dragable.createAnotherMethod();
}

}




