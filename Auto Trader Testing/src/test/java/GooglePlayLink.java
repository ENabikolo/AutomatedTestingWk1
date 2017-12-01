import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePlayLink {
    private WebDriver webDriver;


    @FindBy(css = "body > div.is-non-critical.o-clearfix.ov-pos-rel > footer > div > nav:nth-child(4) > section.footer__nav-native > a:nth-child(2) > svg > path:nth-child(1)")
    WebElement googlePlayLink;

    public void click() {
        googlePlayLink.click();
    }
}


