package Testing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Activities extends BasePage {

    @FindBy(id = "buttonAppbarToHome")
    private WebElement buttonAppbarToHome;

    public boolean verifybuttonAppbarToHome() {
        return Events.isVisibleWebElement(buttonAppbarToHome);
    }
    public Home clickbuttonAppbarToHome(){
        Events.click(buttonAppbarToHome);
        return new Home();
    }

    @FindBy(id = "parallaxActivities")
    private WebElement parallaxActivities;

    public boolean verifyparallaxActivities() { return Events.isVisibleWebElement(parallaxActivities);}

    @FindBy(id = "labelActivitiesTitle")
    private WebElement labelActivitiesTitle;

    public boolean verifylabelActivitiesTitle() { return Events.isVisibleWebElement(labelActivitiesTitle);}

    @FindBy(id = "labelActivitiesDescription")
    private WebElement labelActivitiesDescription;

    public boolean verifylabelActivitiesDescription() { return Events.isVisibleWebElement(labelActivitiesDescription);}

    @FindAll({
            @FindBy(css = "[id$=imageActivity")
    })
    private List<WebElement> imageActivities ;
    private boolean allpresentimageActivity =true;

    public boolean verifyimageActivity() {
        for (WebElement element : imageActivities) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentimageActivity=false;
            }
        }
        return allpresentimageActivity;

    }

    @FindAll({
            @FindBy(css = "[id$=labelActivityTitle")
    })
    private List<WebElement> labelActivityTitles ;
    private boolean allpresentlabelActivityTitle =true;

    public boolean verifylabelActivityTitle() {
        for (WebElement element : labelActivityTitles) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentlabelActivityTitle=false;
            }
        }
        return allpresentlabelActivityTitle;

    }

    @FindAll({
            @FindBy(css = "[id$=labelActivityDescription")
    })
    private List<WebElement> labelActivityDescriptions ;
    private boolean allpresentlabelActivityDescription =true;

    public boolean verifylabelActivityDescription() {
        for (WebElement element : labelActivityDescriptions) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentlabelActivityDescription=false;
            }
        }
        return allpresentlabelActivityDescription;

    }

    @FindAll({
            @FindBy(css = "[id$=buttonActivity")
    })
    private List<WebElement> buttonActivities ;
    private boolean allpresentbuttonActivity =true;

    public boolean verifybuttonActivity() {
        for (WebElement element : buttonActivities) {
            if( !Events.isVisibleWebElement(element)) {
                allpresentbuttonActivity=false;
            }
        }
        return allpresentbuttonActivity;

    }
}
