import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FacebookPageLink {

    public String getCurrentPage(WebDriver webDriver) {
        webDriver.findElement(By.className("#facebook_block > div"));
        return webDriver.getCurrentUrl();
    }

    @FindBy(css ="#facebook_block > div")
    private WebElement facebookPageLink;


    public void click() {
        facebookPageLink.click();
    }
}
