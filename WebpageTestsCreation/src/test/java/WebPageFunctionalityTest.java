import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//logic in here. Web driver in here.
public class WebPageFunctionalityTest {

    private WebDriver webDriver;

    @BeforeClass
    public static void init(){ System.out.println("INIT"); }

    @Before
    public void setUp(){
        webDriver = new ChromeDriver(); // create a new instance of the chrome driver
        webDriver.manage().window().maximize();
        String [] urlList = ("http://demoqa.com/draggable/","http://demoqa.com/selectable/","http://demoqa.com/sortable/","http://demoqa.com/tooltip/","http://demoqa.com/slider/","http://demoqa.com/datepicker/");  //launch the website
        }

    @Test
    public void testDraggable() {
        webDriver.navigate().to(urlList);
        Draggable draggable = PageFactory.initElements(webDriver, Draggable.class);
    }
    @Test
    public void testSelectable() {
        webDriver.navigate().to(urlList);
        Selectable selectable = PageFactory.initElements(webDriver, Selectable.class);
    }

    @Test
    public void testSortable() {
        webDriver.navigate().to(urlList);
        Sortable sortable = PageFactory.initElements(webDriver, Sortable.class);
    }

    @Test
    public void testToolTip() {
        webDriver.navigate().to(urlList);
        ToolTip toolTip = PageFactory.initElements(webDriver, ToolTip.class);
    }

    @Test
    public void testSlider() {
        webDriver.navigate().to(urlList);
        Slider slider = PageFactory.initElements(webDriver, Slider.class);
    }

    @Test
    public void testDatePicker() {
        webDriver.navigate().to(urlList);
        DatePicker datePicker = PageFactory.initElements(webDriver, DatePicker.class);
       }

//private void AssertTrue(Draggable draggable, String)
        @After
        public void tearDown(){
            try {
                webDriver.close();
            }catch (Exception ex){
                System.out.println(ex.toString());
            }
            webDriver.quit(); //close the driver
        }

        @AfterClass
        public static void destroy(){ System.out.println("Destroy"); }





    }





}
