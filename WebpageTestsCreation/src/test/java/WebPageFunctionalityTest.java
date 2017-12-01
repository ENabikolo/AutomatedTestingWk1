import org.junit.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;


//logic in here. Web driver in here.
public class WebPageFunctionalityTest {

    private WebDriver webDriver;
    private List<String> urlList = new ArrayList<>();
    String draggableBoxInitialLocation;
    String constrainMovementVerticallyLoc;

    @BeforeClass
    public static void init() {
        System.out.println("INIT");
    }

    @Before
    public void setUp() {
        webDriver = new ChromeDriver(); // create a new instance of the chrome driver
        webDriver.manage().window().maximize();
        urlList.add("http://demoqa.com/draggable/");
        urlList.add("http://demoqa.com/selectable/");
        urlList.add("http://demoqa.com/sortable/");
        urlList.add("http://demoqa.com/tooltip/");
        urlList.add("http://demoqa.com/slider/");
        urlList.add("http://demoqa.com/datepicker/");
    }

    @Test
    public void testDraggable() {
        webDriver.navigate().to(urlList.get(0));
        Draggable draggable = PageFactory.initElements(webDriver, Draggable.class);
        assertEquals("Does it work?", urlList.get(0), draggable.getCurrentPage(webDriver));
        draggable.boxIsDraggable(500, 100, webDriver);
        Assert.assertNotEquals("Not here!!", draggable.draggableBoxInitialLocation, draggable.draggableBox.getLocation());

    }

    @Test
    public void testVerticalMovement(){
        Draggable draggable = PageFactory.initElements(webDriver, Draggable.class);
        Point location = draggable.getLocation();
        webDriver.navigate().to(urlList.get(0));
        Draggable verticalBox = draggable.verticalBox.getLocation().getY();
                PageFactory.initElements(webDriver, Draggable.class);
        assertEquals("Does it work?", urlList.get(0), draggable.getCurrentPage(webDriver));
        verticalBox.setConstrainMovementVertically(0, 120, webDriver);
        //assertEquals("Aint moving Nowhere Boo!", verticalBox.setConstrainMovement(location.x, location.y, webDriver), verticalBox.constrainMovementVertically(webDriver));
        Assert.assertNotEquals("Moving Vertically Baby!", verticalBox.constrainMovementVertically, verticalBox.constrainMovementVertically.getLocation());
        }

        //verticalmovement
        //Draggable verticalMove =
       /* draggable.setConstrainMovement(webDriver);
       ;*/


    @Test
     public void testSelectable () {
            webDriver.navigate().to(urlList.get(1));
            Selectable selectable = PageFactory.initElements(webDriver, Selectable.class);
            assertEquals("You selecting?", urlList.get(1), selectable.getCurrentPage(webDriver));
        }

        @Test
        public void testSortable () {
            webDriver.navigate().to(urlList.get(2));
            Sortable sortable = PageFactory.initElements(webDriver, Sortable.class);
            assertEquals("Sort it!", urlList.get(2), sortable.getCurrentPage(webDriver));

        }

        @Test
        public void testToolTip () {
            webDriver.navigate().to(urlList.get(3));
            ToolTip toolTip = PageFactory.initElements(webDriver, ToolTip.class);
            assertEquals("Whats your Tool Tip?", urlList.get(3), toolTip.getCurrentPage(webDriver));

        }

        @Test
        public void testSlider () {
            webDriver.navigate().to(urlList.get(4));
            Slider slider = PageFactory.initElements(webDriver, Slider.class);
            //Point sliderLocation = getCenter(slider);
            //webDriver.swipe(sliderLocation.getX(), sliderLocation.getY(), sliderLocation.getX()-100, sliderLocation.getY(), 1000);
            assertEquals("Slide to the left!!", urlList.get(4), slider.getCurrentPage(webDriver));

        }

        @Test
        public void testDatePicker () {
            webDriver.navigate().to(urlList.get(5));
            DatePicker datePicker = PageFactory.initElements(webDriver, DatePicker.class);
            assertEquals("What's the date?", urlList.get(5), datePicker.getCurrentPage(webDriver));

        }
        @After
        public void tearDown () {
            try {
                webDriver.close();
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
            webDriver.quit(); //close the driver
        }

        @AfterClass
        public static void destroy () {
            System.out.println("Destroy");
        }
    }








