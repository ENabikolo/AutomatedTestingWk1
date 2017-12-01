import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsForm {
    private WebDriver webDriver;
    String email = "jhgj@live.co.uk";
    String reference ="LD-73958";
    String attachment ="C:\\Users\\Admin\\Downloads\\QAC_Java_SE_Exercise_Book.pdf" ;
    String message = "This dress is a mess and looks nothing like the photo. Please Refund!!!";


    public  void click() {
      contactUsForm.click();
      //fileUploadButton.click();
      sendButton.click();
    }

    @FindBy(css ="#contact-link > a")
    private WebElement contactUsForm;

    @FindBy(css = "#id_contact")
    private WebElement subjectHeading;

    @FindBy(css = "#email")
    private WebElement emailAddress;

    @FindBy(css = "#id_order")
    private WebElement orderReference;

    @FindBy(css = "#fileUpload")
    private WebElement fileUploadButton;

    @FindBy(css = "#message")
    private WebElement messageBox;

    @FindBy(css = "#submitMessage > span")
    private WebElement sendButton;

    @FindBy(css = "#fileUpload")
    private WebElement fileAttachment;

public void fillInContactUsForm(){ WebElement contactUsForm = webDriver.findElement(By.cssSelector("#contact-link > a"));
    contactUsForm.click();
}
public void setSubjectHeading(){
    //subjectHeading.sendKeys("Customer service");
    Select subjectHeading1 = new Select(subjectHeading);
    subjectHeading1.selectByVisibleText("Customer service");
}
public void setEmailAddress(){
    emailAddress.sendKeys(email);
}
public void setOrderReference(){
    orderReference.sendKeys(reference);
}
public void setUploadFileAttachment() {
    fileAttachment.sendKeys(attachment);
}
public void setFileUploadButton() {
    fileUploadButton.sendKeys();
    fileUploadButton.click();
}
public void setEnterMessage() {
        messageBox.sendKeys(message);
}
public void setSendButton() {
      sendButton.sendKeys();
      sendButton.click();
  }
}
