import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SummerCollectionLink {


    public String getCurrentPage(WebDriver webDriver) {
        webDriver.findElement(By.cssSelector("#htmlcontent_top > ul > li.htmlcontent-item-2.col-xs-4 > a > img"));
        return webDriver.getCurrentUrl();
    }

    @FindBy(css = "#htmlcontent_top > ul > li.htmlcontent-item-2.col-xs-4 > a > img")
    private WebElement SummerCollectionLink;


    public void click(){
        SummerCollectionLink.click();

    }

}
