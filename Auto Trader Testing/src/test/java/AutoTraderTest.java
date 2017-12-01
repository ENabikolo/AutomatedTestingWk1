import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AutoTraderTest {

    private WebDriver webDriver;
    private static ExtentReports report;
   //private SpreadSheetReader spreadSheetReader;
    //private  ScreenShot screenShot;
    private List<String> urlList = new ArrayList<String>();



    @BeforeClass
    public static void init(){
            report = new ExtentReports();
            String fileName = "MyReport" + ".html";
            String filePath = System.getProperty("user.dir")
                    + File.separatorChar + fileName;
            report.attachReporter(new ExtentHtmlReporter(filePath));

        System.out.println("INIT");
}
    @Before
    public void setUp(){
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        //SpreadSheetReader reader = new SpreadSheetReader(System.getProperty("user.dir")+ File.separatorChar + "ShoppingWebsite.xlsx");

        urlList.add("https://www.autotrader.co.uk/");
        urlList.add("https://play.google.com/store/apps/details?id=uk.co.autotrader.androidconsumersearch&referrer=utm_source%3DMobile%2520Web%2520homepage");
        urlList.add("https://www.autotrader.co.uk/compare-car-insurance"); //Car Insurance Link
        urlList.add("https://www.autotrader.co.uk/car-finance"); //Car Finance Link
        urlList.add("https://www.autotrader.co.uk/vehiclecheck"); //Vehicle Check Link
        //urlList.add("");

        System.out.println("Set Up"); }


    @Test
    public void testGooglePlayLink() throws InterruptedException{
        webDriver.navigate().to(urlList.get(0));
        GooglePlayLink googlePlayLink = PageFactory.initElements(webDriver, GooglePlayLink.class);
        Thread.sleep(5000);
        googlePlayLink.click();
        Assert.assertEquals("Whats up with GooglePlay?!", urlList.get(1), webDriver.getCurrentUrl());

        System.out.println("Hello World"); }

    @Test
    public void testCarPurchaseForm() throws InterruptedException{
       webDriver.navigate().to(urlList.get(0));
       CarPurchaseForm carPurchaseForm = PageFactory.initElements(webDriver, CarPurchaseForm.class);
       carPurchaseForm.click();
       Thread.sleep(2000);

       carPurchaseForm.enterPostCode();
       carPurchaseForm.selectMileage();
       carPurchaseForm.selectVehicleUsage();
       carPurchaseForm.selectVehicleMake();
       carPurchaseForm.selectVehicleModel();
       carPurchaseForm.selectVehicleMinPrice();
       carPurchaseForm.selectVehicleMaxPrice();
       carPurchaseForm.clickSearchVehiclesButton();
       carPurchaseForm.selectMoreOptionsLink();

        }

    @Test
    public void testCarBuyingEssentials() throws InterruptedException {
        webDriver.navigate().to(urlList.get(0));
        CarBuyingEssentials carBuyingEssentials = PageFactory.initElements(webDriver, CarBuyingEssentials.class );
        Point location = carBuyingEssentials.getLocation();

        carBuyingEssentials.clickCarFinanceAndLoansLink();
        carBuyingEssentials.clickCarFinanceAndLoansLink();
        carBuyingEssentials.clickVehicleCheckLink();

        carBuyingEssentials.click();
        Assert.assertEquals("What you should know about Buying a Car.",urlList.get(2), carBuyingEssentials.getCurrentPage(webDriver));
        Thread.sleep(2000);
        carBuyingEssentials.click();
        Assert.assertEquals("What you should know about Buying a Car.",urlList.get(3), carBuyingEssentials.getCurrentPage(webDriver));

    }

    @After
    public void tearDown(){ System.out.println("Tear Down"); }

    @AfterClass
    public static void destroy(){ System.out.println("Destroy"); }
}


