package Testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactUs extends BasePage {

    @FindBy(id = "buttonAppbarToHome")
    private WebElement buttonAppbarToHome;

    public boolean verifybuttonAppbarToHome() {
        return Events.isVisibleWebElement(buttonAppbarToHome);
    }
    public Home clickbuttonAppbarToHome(){
        Events.click(buttonAppbarToHome);
        return new Home();
    }

    @FindBy(id = "parallaxContact")
    private WebElement parallaxContact;

    public boolean verifyparallaxContact() {
        return Events.isVisibleWebElement(parallaxContact);
    }

    @FindBy(id = "labelContactTitle")
    private WebElement labelContactTitle;

    public boolean verifylabelContactTitle() {
        return Events.isVisibleWebElement(labelContactTitle);
    }

    @FindBy(id = "labelContactOurOffices")
    private WebElement labelContactOurOffices;

    public boolean verifylabelContactOurOffices() {
        return Events.isVisibleWebElement(labelContactOurOffices);
    }

    @FindBy(id = "mapContact")
    private WebElement mapContact;

    public boolean verifymapContact() {
        return Events.isVisibleWebElement(mapContact);
    }

    @FindBy(id = "cardFormContact")
    private WebElement cardFormContact;

    public boolean verifycardFormContact() {
        return Events.isVisibleWebElement(cardFormContact);
    }

    @FindBy(id = "mainLabelFormContact")
    private WebElement mainLabelFormContact;

    public boolean verifymainLabelFormContact() {
        return Events.isVisibleWebElement(mainLabelFormContact);
    }

    @FindAll({
            @FindBy(css = "[id$=subtitleFormaContact")
    })
    private List<WebElement> subtitleFormaContacts ;
    private boolean allpresentsubtitleFormaContact =true;

    public boolean verifysubtitleFormaContact() {
        for (WebElement element : subtitleFormaContacts) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentsubtitleFormaContact=false;
            }
        }
        return allpresentsubtitleFormaContact;

    }

    @FindBy(id = "textfieldContactNamefield")
    private WebElement textfieldContactNamefield;

    public boolean verifytextfieldContactNamefield() {
        return Events.isVisibleWebElement(textfieldContactNamefield);
    }
    public void filltextfieldContactNamefield(String text){
        Events.sendKeys(textfieldContactNamefield,text);
    }

    @FindBy(id = "textfieldContactEmailfield")
    private WebElement textfieldContactEmailfield;

    public boolean verifytextfieldContactEmailfield() {
        return Events.isVisibleWebElement(textfieldContactEmailfield);
    }
    public void filltextfieldContactEmailfield(String text){
        Events.sendKeys(textfieldContactEmailfield,text);
    }

    @FindBy(id = "textfieldContactMessagefield")
    private WebElement textfieldContactMessagefield;

    public boolean verifytextfieldContactMessagefield() {
        return Events.isVisibleWebElement(textfieldContactMessagefield);
    }
    public void filltextfieldContactMessagefield(String text){
        Events.sendKeys(textfieldContactMessagefield,text);
    }

    @FindBy(id = "buttonFormContact")
    private WebElement buttonFormContact;

    public boolean verifybuttonFormContact() {
        return Events.isVisibleWebElement(buttonFormContact);
    }
    public void clickbuttonFormContact(){ Events.click(buttonFormContact);}
    public boolean isenabledbuttonFormContact(){return Events.isEnabled(buttonFormContact);}

    @FindBy(id = "snackbarFooterMessagge")
    private WebElement snackbarFooterMessagge;

    public boolean verifysnackbarFooterMessagge() {
        return Events.isVisibleWebElement(snackbarFooterMessagge);
    }


}
