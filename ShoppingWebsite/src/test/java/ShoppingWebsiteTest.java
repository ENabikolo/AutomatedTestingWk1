import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ShoppingWebsiteTest {
    private WebDriver webDriver;
    private static ExtentReports report;
    private SpreadSheetReader spreadSheetReader;
    private  ScreenShot screenShot;
    private List<String> urlList = new ArrayList<String>();

    @BeforeClass
    public static void init(){
        //Report
        report = new ExtentReports();
        String fileName = "MyReport" + ".html";
        String filePath = System.getProperty("user.dir")
                + File.separatorChar + fileName;
        report.attachReporter(new ExtentHtmlReporter(filePath));
        System.out.println("INIT");
}
    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        SpreadSheetReader reader = new SpreadSheetReader(System.getProperty("user.dir")+ File.separatorChar + "ShoppingWebsite.xlsx");

        //add a note to the test
        /*spreadsheet

         */
        //Screenshot screenShot = new screenShot();

        urlList.add("http://automationpractice.com/index.php");
        urlList.add("https://www.facebook.com/prestashop/");
        urlList.add("https://www.prestashop.com/en");
        urlList.add("http://automationpractice.com/index.php?controller=contact");
        }


    @Test
    public void FacebookPageLink() {
        webDriver.navigate().to(urlList.get(0));
        FacebookPageLink facebookPageLink = PageFactory.initElements(webDriver, FacebookPageLink.class);
        facebookPageLink.click();
        Assert.assertEquals("T'sup Facebook??!!", urlList.get(1), webDriver.getCurrentUrl());
    }


    @Test //works!!!!Yaaaaaaaaaaaaaaaayyyyyyy!!!!!!!
    public void testSummerCollectionLink() {
        webDriver.navigate().to(urlList.get(0));
        SummerCollectionLink summerCollectionLink = PageFactory.initElements(webDriver, SummerCollectionLink.class);
        summerCollectionLink.click();
        Assert.assertEquals("Lets go to the Summer Sale!", urlList.get(2), webDriver.getCurrentUrl());
        }

    @Test
    public void testContactUsForm() throws InterruptedException {
        webDriver.navigate().to(urlList.get(0));
        ContactUsForm contactUsForm = PageFactory.initElements(webDriver, ContactUsForm.class);
        contactUsForm.click();
        Assert.assertEquals("Please Contact Us with any Issues!", urlList.get(3), webDriver.getCurrentUrl());
        Thread.sleep(5000);

        contactUsForm.setSubjectHeading();
        contactUsForm.setEmailAddress();
        contactUsForm.setOrderReference();
        contactUsForm.setUploadFileAttachment();
        contactUsForm.setFileUploadButton();
        contactUsForm.setEnterMessage();
        Thread.sleep(4000);
        contactUsForm.setSendButton();
        //sendButton.click();

        /*
        ContactUsForm sendButton = PageFactory.initElements(webDriver, ContactUsForm.class);
           */
    }
       //ContactUsForm.click();
        //Assert.assertEquals("Lets go to the Summer Sale!", urlList.get(2), contactUsForm.getCurrentPage(webDriver));



    @After
    public void tearDown(){
        try {
            webDriver.close();
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        webDriver.quit();

        System.out.println("Tear Down"); }

    @AfterClass
    public static void destroy(){

        System.out.println("Destroy"); }
}
