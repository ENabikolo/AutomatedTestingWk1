import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class Draggable extends BaseHomePage {

    private WebDriver webDriver;
    String draggableBoxInitialLocation;
    int x;
    int y;

    public void boxIsDraggable(int xOffset, int yOffset, WebDriver webDriver) {
       Actions builder = new Actions(webDriver);
       webDriver.findElement(By.cssSelector("#ui-id-1"));
       builder.clickAndHold().moveByOffset(xOffset, yOffset).release().perform();
       //Point location = draggable.getLocation();
    }
    @FindBy(css ="#draggable")
     WebElement draggableBox;



    public Point getLocation(){
        return draggableBox.getLocation();
    }

    private Actions click() {
        return null;
    }

    //Constrain movement Vertically
    public void setConstrainMovementVertically(int xOffset, int yOffset,  WebDriver webDriver){
        Actions builder = new Actions(webDriver);
        webDriver.findElement(By.cssSelector("#ui-id-2"));
       builder.clickAndHold().moveByOffset(0, 120).release().perform();

    }
    @FindBy(css = "#draggabl > p")
    WebElement constrainMovementVertically;

    public String constrainMovementVertically(WebDriver webDriver) {

        return webDriver.getPageSource();
    }

    //Constrain movement Horizontally
    public void setConstrainMovementHorizontally(int xOffset, int yOffset,  WebDriver webDriver) {
        Actions builder = new Actions(webDriver);
        webDriver.findElement(By.cssSelector("#ui-id-2"));
        builder.clickAndHold().moveByOffset(120, 0).release().perform();

    }
    //Constrain movement Box Contained
    public void setConstrainMovementInBox(int xOffset, int yOffset,  WebDriver webDriver){
       // Dimension text1 =webDriver.findElement(By.cssSelector("#containment-wrapper")).getSize(); //Larger Box
        //Dimension text2 =webDriver.findElement(By.cssSelector("#draggabl3 > p")).getSize();//contained Box

        Actions builder = new Actions(webDriver);
        webDriver.findElement(By.cssSelector("#ui-id-2"));
        builder.clickAndHold().moveByOffset(0, 120).release().perform();

    }

    public void childBox(int xOffset, int yOffset,  WebDriver webDriver){
        Actions builder = new Actions(webDriver);
        webDriver.findElement(By.cssSelector("#ui-id-2"));
        builder.clickAndHold().moveByOffset(0, 120).release().perform();
    }



/*
    //Cursor Style
    @FindBy(css = "#ui-id-3")
    WebElement cursorStyle;

    //Events
    @FindBy(css = "#tabs > ul > li:nth-child(4)")
    WebElement events;

    //Draggable + Sortablw
    @FindBy(css = "#ui-id-5")
    WebElement draggableAndSortable;

*/
}


