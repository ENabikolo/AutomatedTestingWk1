import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Slider extends BaseHomePage {
    private WebDriver webDriver;

public void setRangeSlider(){
    Actions builder = new Actions(webDriver);
    WebElement slider = webDriver.findElement(By.cssSelector("#slider-range-max > span"));
    //builder.clickAndHold().moveByOffset().release().perform();
}
    //rangeSlider
    @FindBy(css ="#slider-range-max > span")
    WebElement rangeSlider;


}
