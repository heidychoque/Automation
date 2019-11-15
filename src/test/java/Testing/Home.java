package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Home extends BasePage {

    @FindBy(id = "labelAppbarTitle")
    private WebElement labelAppbarTitle;

    public boolean verifylabelAppbarTitle() {
        return Events.isVisibleWebElement(labelAppbarTitle);

    }

    public boolean verifyContentlabelAppbarTitle() {
        return Events.getContent(labelAppbarTitle).contains("Women In Tech");
    }

    @FindBy(id = "buttonAppbarToHome")
    private WebElement buttonAppbarToHome;

    public boolean verifybuttonAppbarToHome() {
        return Events.isVisibleWebElement(buttonAppbarToHome);
    }
    public Home clickbuttonAppbarToHome(){
        Events.click(buttonAppbarToHome);
        return  new Home();
    }



    @FindBy(id = "buttonAppbarOurTeam")
    private WebElement buttonAppbarOurTeam;

    public boolean verifyButtonAppbarOurTeam() {
        return Events.isVisibleWebElement(buttonAppbarOurTeam);
    }
    public AboutUs clickButtonAppbarOurTeam(){
        Events.click(buttonAppbarOurTeam);
        return new AboutUs();
    }


    @FindBy(id = "buttonAppbarContactUs")
    private WebElement buttonAppbarContactUs;

    public boolean verifyButtonAppbarContactUs() {
        return Events.isVisibleWebElement(buttonAppbarContactUs);
    }
    public ContactUs clickbuttonAppbarContactUs(){
        Events.click(buttonAppbarContactUs);
        return new ContactUs();
    }

    @FindBy(id = "buttonAppbarActivities")
    private WebElement buttonAppbarActivities;

    public boolean verifyButtonAppbarActivities() {
        return Events.isVisibleWebElement(buttonAppbarActivities);
    }
    public Activities clickbuttonAppbarActivities(){
        Events.click(buttonAppbarActivities);
        return new Activities();
    }

    @FindBy(id = "labelMetrics")
    private WebElement labelMetrics;

    public boolean verifylabelMetrics() {
        return Events.isVisibleWebElement(labelMetrics);
    }

    public String verifyAlignmentlabelMetrics() {
        return Events.getAttribute(labelMetrics, "align");
    }

    @FindBy(id = "labelMetricsDiversity")
    private WebElement labelMetricsDiversity;

    public boolean verifylabelMetricsDiversity() {
        return Events.isVisibleWebElement(labelMetricsDiversity);
    }

    public String verifyAlignmentlabelMetricsDiversity() {
        return Events.getAttribute(labelMetricsDiversity, "align");
    }

    @FindBy(id = "imageMetricsDiversity")
    private WebElement imageMetricsDiversity;

    public boolean verifyimageMetricsDiversity() {
        return Events.isVisibleWebElement(imageMetricsDiversity);
    }

    @FindBy(id = "descriptionMetricsDiversity")
    private WebElement descriptionMetricsDiversity;

    public boolean verifydescriptionMetricsDiversity() {
        return Events.isVisibleWebElement(descriptionMetricsDiversity);
    }


    @FindBy(id = "labelMetricsCommunity")
    private WebElement labelMetricsCommunity;

    public boolean verifylabelMetricsCommunity() {
        return Events.isVisibleWebElement(labelMetricsCommunity);
    }

    public String verifyAlignmentlabelMetricsCommunity() {
        return Events.getAttribute(labelMetricsCommunity, "align");
    }

    @FindBy(id = "imageMetricsCommunity")
    private WebElement imageMetricsCommunity;

    public boolean verifyimageMetricsCommunity() {
        return Events.isVisibleWebElement(imageMetricsCommunity);
    }

    @FindBy(id = "descriptionMetricsCommunity")
    private WebElement descriptionMetricsCommunity;

    public boolean verifydescriptionMetricsCommunity() {
        return Events.isVisibleWebElement(descriptionMetricsCommunity);
    }


    @FindBy(id = "labelMetricsWomenWork")
    private WebElement labelMetricsWomenWork;

    public boolean verifylabelMetricsWomenWork() {
        return Events.isVisibleWebElement(labelMetricsWomenWork);
    }

    public String verifyAlignmentlabelMetricsWomenWork() {
        return Events.getAttribute(labelMetricsWomenWork, "align");
    }

    @FindBy(id = "imageMetricsWomenWork")
    private WebElement imageMetricsWomenWork;

    public boolean verifyimageMetricsWomenWork() {
        return Events.isVisibleWebElement(imageMetricsWomenWork);
    }

    @FindBy(id = "descriptionMetricsWomenWork")
    private WebElement descriptionMetricsWomenWork;

    public boolean verifydescriptionMetricsWomenWork() {
        return Events.isVisibleWebElement(descriptionMetricsWomenWork);
    }


    @FindBy(id = "parallaxHome")
    private WebElement parallaxHome;

    public boolean verifyparallaxHome() {
        return Events.isVisibleWebElement(parallaxHome);
    }

    @FindBy(id = "ButtonParallaxHome")
    private WebElement ButtonparallaxHome;

    public boolean verifyButtonParallaxHome() {
        return Events.isVisibleWebElement(ButtonparallaxHome);
    }
    public AboutUs clickButtonparallaxHome(){
        Events.click(ButtonparallaxHome);
        return new AboutUs();
    }

    @FindBy(id = "labelTestimonialsTitle")
    private WebElement labelTestimonialsTitle;

    public boolean verifylabelTestimonialsTitle() {
        return Events.isVisibleWebElement(labelTestimonialsTitle);
    }

    public String verifyAlignmentlabelTestimonialsTitle() {
        return Events.getAttribute(labelTestimonialsTitle, "align");
    }

    @FindBy(id = "labelTestimonialsDescription")
    private WebElement labelTestimonialsDescription;

    public boolean verifylabelTestimonialsDescription() {
        return Events.isVisibleWebElement(labelTestimonialsDescription);
    }

    @FindAll({
            @FindBy(css = "[id$=cardTestimonyMember")
    })
    private List<WebElement> allElementsInList ;
    private boolean allpresent =true;

    public boolean verifycardTestimonyMembers() {
        for (WebElement element : allElementsInList) {
            if( !Events.isVisibleWebElement(element)) {
                allpresent=false;
            }
        }
        return allpresent;

    }


    @FindBy(id = "footer")
    private WebElement footer;

    public boolean verifyfooter(){
        return Events.isVisibleWebElement(footer);}


    @FindBy(id = "labelFooterMenu")
    private WebElement labelFooterMenu;

    public boolean verifylabelFooterMenu(){ return Events.isVisibleWebElement(labelFooterMenu);}

    @FindBy(id = "buttonFooterAboutus")
    private WebElement buttonFooterAboutus;

    public boolean verifybuttonFooterAboutus(){ return Events.isVisibleWebElement(buttonFooterAboutus);}

    @FindBy(id = "buttonFooterActivities")
    private WebElement buttonFooterActivities;

    public boolean verifybuttonFooterActivities(){ return Events.isVisibleWebElement(buttonFooterActivities);}

    @FindBy(id = "buttonFooterContact")
    private WebElement buttonFooterContact;

    public boolean verifybuttonFooterContact(){ return Events.isVisibleWebElement(buttonFooterContact);}

    @FindBy(id = "labelFooterWIT")
    private WebElement labelFooterWIT;

    public boolean verifylabelFooterWIT(){ return Events.isVisibleWebElement(labelFooterWIT);}

    @FindBy(id = "labelFooterAddress")
    private WebElement labelFooterAddress;

    public boolean verifylabelFooterAddress(){ return Events.isVisibleWebElement(labelFooterAddress);}

    @FindBy(id = "labelFooterPhone")
    private WebElement labelFooterPhone;

    public boolean verifylabelFooterPhone(){ return Events.isVisibleWebElement(labelFooterPhone);}

    @FindBy(id = "labelFooterEmail")
    private WebElement labelFooterEmail;

    public boolean verifylabelFooterEmail(){ return Events.isVisibleWebElement(labelFooterEmail);}

    @FindBy(id = "buttonFooterFacebook")
    private WebElement buttonFooterFacebook;
    private boolean urlbuttonFooterFacebook=true;

    public boolean verifybuttonFooterFacebook(){ return Events.isVisibleWebElement(buttonFooterFacebook);}
    public boolean clickbuttonFooterFacebook(){
        Events.click(buttonFooterFacebook);
      /*  if(!DriverManager.getInstance().getWebDriver().getCurrentUrl().equals("https://www.facebook.com/NICEinContact/")){
            urlbuttonFooterFacebook=false;
        }
        return urlbuttonFooterFacebook;*/
        return Events.compareURLs("https://www.facebook.com/NICEinContact/");
    }

    @FindBy(id = "buttonFooterTwitter")
    private WebElement buttonFooterTwitter;

    public boolean verifybuttonFooterTwitter(){ return Events.isVisibleWebElement(buttonFooterTwitter);}
    public boolean clickbuttonFooterTwitter(){
        Events.click(buttonFooterTwitter);
        LoadHome.waitTime();
        return Events.compareURLs("https://twitter.com/incontact?lang=es");
    }


    @FindBy(id = "buttonFooterInstagram")
    private WebElement buttonFooterInstagram;

    public boolean verifybuttonFooterInstagram(){ return Events.isVisibleWebElement(buttonFooterInstagram);}
    public boolean clickbuttonFooterInstagram(){
        Events.click(buttonFooterInstagram);
        LoadHome.waitTime();
        return Events.compareURLs("https://www.instagram.com/weareniceincontact/");
    }

    @FindBy(id = "buttonFooterLinkedin")
    private WebElement buttonFooterLinkedin;

    public boolean verifybuttonFooterLinkedin(){ return Events.isVisibleWebElement(buttonFooterLinkedin);}
    public boolean clickbuttonFooterLinkedin(){
        Events.click(buttonFooterLinkedin);
        LoadHome.waitTime();
        return Events.compareURLs("https://www.linkedin.com/company/niceincontact");
    }

    @FindBy(id = "buttonFooterYoutube")
    private WebElement buttonFooterYoutube;

    public boolean verifybuttonFooterYoutube(){ return Events.isVisibleWebElement(buttonFooterYoutube);}
    public boolean clickbuttonFooterYoutube(){
        Events.click(buttonFooterYoutube);
        LoadHome.waitTime();
        return Events.compareURLs("https://www.youtube.com/c/niceincontact");
    }

    @FindBy(id = "labelFooterSignin")
    private WebElement labelFooterSignin;

    public boolean verifylabelFooterSignin(){ return Events.isVisibleWebElement(labelFooterSignin);}

    @FindBy(id = "textfieldFooterEmail")
    private WebElement textfieldFooterEmail;

    public boolean verifytextfieldFooterEmail(){ return Events.isVisibleWebElement(textfieldFooterEmail);}
    public void filltextfieldFooterEmail(String text){
        Events.sendKeys(textfieldFooterEmail,text);
    }

    @FindBy(id = "buttonFooterSignin")
    private WebElement buttonFooterSignin;

    public boolean verifybuttonFooterSignup(){ return Events.isVisibleWebElement(buttonFooterSignin);}
    public void clickbuttonFooterSignup(){
        Events.click(buttonFooterSignin);
    }

    @FindBy(id = "dialogSignin")
    private WebElement dialogSignin;

    public boolean verifydialogSignin(){
        LoadHome.waitTime();
        return Events.isVisibleWebElement(dialogSignin);}

    @FindBy(id = "labelCardInterests")
    private WebElement labelCardInterests;

    public boolean verifylabelCardInterests(){ return Events.isVisibleWebElement(labelCardInterests);}

    @FindBy(id = "checkboxCardActivities")
    private WebElement checkboxCardActivities;

    public boolean verifycheckboxCardActivities(){
        return Events.isVisibleWebElement(checkboxCardActivities);}
    public void clickcheckboxCardActivities(){ Events.click(checkboxCardActivities);}

    @FindBy(id = "checkboxCardNews")
    private WebElement checkboxCardNews;

    public boolean verifycheckboxCardNews(){ return webDriver.findElement(By.id("checkboxCardNews")).isDisplayed();}
    public void clickcheckboxCardNews(){ Events.click(checkboxCardNews);}

    @FindBy(id = "checkboxCardContests")
    private WebElement checkboxCardContests;

    public boolean verifycheckboxCardContests(){ return Events.isVisibleWebElement(checkboxCardContests);}
    public void clickcheckboxCardContests(){ Events.click(checkboxCardContests);}

    @FindBy(id = "checkboxCardCuriosities")
    private WebElement checkboxCardCuriosities;

    public boolean verifycheckboxCardCuriosities(){ return Events.isVisibleWebElement(checkboxCardCuriosities);}
    public void clickcheckboxCardCuriosities(){ Events.click(checkboxCardCuriosities);}

    @FindBy(id = "buttonCardClose")
    private WebElement buttonCardClose;

    public boolean verifybuttonCardClose(){ return Events.isVisibleWebElement(buttonCardClose);}
    public void clickbuttonCardClose(){ Events.click(buttonCardClose);}

    @FindBy(id = "buttonCardSend")
    private WebElement buttonCardSend;

    public boolean verifybuttonCardSend(){ return Events.isVisibleWebElement(buttonCardSend);}
    public void clickbuttonCardSend(){ Events.click(buttonCardSend);}

    @FindBy(id = "labelWarncardWarning")
    private WebElement labelWarncardWarning;

    public boolean verifylabelWarncardWarning(){ return Events.isVisibleWebElement(labelWarncardWarning);}

    @FindBy(id = "buttonWarncardClose")
    private WebElement buttonWarncardClose;

    public boolean verifybuttonWarncardClose(){ return Events.isVisibleWebElement(buttonWarncardClose);}
    public void clickbuttonWarncardClose(){ Events.click(buttonWarncardClose);}




}






