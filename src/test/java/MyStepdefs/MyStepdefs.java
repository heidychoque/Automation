package MyStepdefs;

import Testing.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyStepdefs {

    private Home home;
    private AboutUs aboutus;
    private Activities activities;
    private ContactUs contactus;
    private Navbar navbar;
    private Footer footer;


    @Given("^Load home page$")
    public void loadHomePage() {
        home = LoadHome.loadHome();
    }

    @And("^window is maximized$")
    public void windowIsMaximized() {
        LoadHome.maximizeWindow();
    }

    @Then("^Search label Women In Technology$")
    public void searchLabelWomenInTechnology() { Assert.assertTrue(home.verifylabelAppbarTitle()); }

    @And("^Verify content$")
    public void verifyContent() {
        Assert.assertTrue(home.verifyContentlabelAppbarTitle());
    }

    @Then("^Verify existence of Our Team button$")
    public void verifyExistenceOfOurTeamButton() {
        Assert.assertTrue(home.verifyButtonAppbarOurTeam());
    }

    @And("^Verify existence of Contact Us button$")
    public void verifyExistenceOfContactUsButton() {
        Assert.assertTrue(home.verifyButtonAppbarContactUs());
    }

    @And("^Verify existence of Activities button$")
    public void verifyExistenceOfActivitiesButton() {
        Assert.assertTrue(home.verifyButtonAppbarActivities());
    }


    @When("^Verify existence of label Metrics$")
    public void verifyExistenceOfLabelMetrics() {
        Assert.assertTrue(home.verifylabelMetrics());

    }

    @Then("^Verify alignment of label Metrics$")
    public void verifyAligmentOfLabelMetrics() {
        Assert.assertEquals(home.verifyAlignmentlabelMetrics(),"center");
    }


    @When("^Verify existence of label Diversity$")
    public void verifyExistenceOfLabelDiversity() {
        Assert.assertTrue(home.verifylabelMetricsDiversity());

    }

    @Then("^Verify alignment of label Diversity$")
    public void verifyAlignmentOfLabelDiversity() {
        Assert.assertEquals(home.verifyAlignmentlabelMetricsDiversity(),"center");
    }

    @And("^Verify existence of image Diversity$")
    public void verifyExistenceOfImageDiversity() {
        Assert.assertTrue(home.verifyimageMetricsDiversity());
    }

    @And("^Verify existence of description of Diversity$")
    public void verifyExistenceOfDescriptionOfDiversity() {
        Assert.assertTrue(home.verifydescriptionMetricsDiversity());
    }

    @When("^Verify existence of label Community$")
    public void verifyExistenceOfLabelCommunity() {
        Assert.assertTrue(home.verifylabelMetricsCommunity());
    }

    @Then("^Verify alignment of label Community$")
    public void verifyAlignmentOfLabelCommunity() {
        Assert.assertEquals(home.verifyAlignmentlabelMetricsCommunity(),"center");
    }

    @And("^Verify existence of image Community$")
    public void verifyExistenceOfImageCommunity() {
        Assert.assertTrue(home.verifyimageMetricsCommunity());
    }

    @And("^Verify existence of description of Community$")
    public void verifyExistenceOfDescriptionOfCommunity() {
        Assert.assertTrue(home.verifydescriptionMetricsCommunity());
    }

    @When("^Verify existence of label Women working$")
    public void verifyExistenceOfLabelWomenWorking() {
        Assert.assertTrue(home.verifylabelMetricsWomenWork());
    }

    @Then("^Verify alignment of label Women working$")
    public void verifyAlignmentOfLabelWomenWorking() {
        Assert.assertEquals(home.verifyAlignmentlabelMetricsWomenWork(),"center");
    }

    @And("^Verify existence of image Women working$")
    public void verifyExistenceOfImageWomenWorking() {
        Assert.assertTrue(home.verifyimageMetricsWomenWork());
    }

    @And("^Verify existence of description of Women working$")
    public void verifyExistenceOfDescriptionOfWomenWorking() {
        Assert.assertTrue(home.verifydescriptionMetricsWomenWork());
    }

    @Then("^Verify existence of Parallax$")
    public void verifyExistenceOfParallax() {
        Assert.assertTrue(home.verifyparallaxHome());
    }

    @And("^Verify existence of Parallax button$")
    public void verifyExistenceOfParallaxButton() {
        Assert.assertTrue(home.verifyButtonParallaxHome());
    }


    @When("^Verify existence of label Testimonies$")
    public void verifyExistenceOfLabelTestimonies() {
        Assert.assertTrue(home.verifylabelTestimonialsTitle());
    }


    @Then("^Verify alignment of label Testimonies$")
    public void verifyAlignmentOfLabelTestimonies() {
        Assert.assertEquals(home.verifyAlignmentlabelTestimonialsTitle(),"center");
    }

    @And("^Verify existence of description of Section Testimonies$")
    public void verifyExistenceOfDescriptionOfSectionTestimonies() {
        Assert.assertTrue(home.verifylabelTestimonialsDescription());
    }


    @And("^Verify images section$")
    public void verifyImagesSection() {
        Assert.assertTrue(home.verifycardTestimonyMembers());
    }

    @When("^Verify existence of footer$")
    public void verifyExistenceOfFooter() {
        Assert.assertTrue(home.verifyfooter());
    }

    @Then("^Verify  existence of label Menu$")
    public void verifyExistenceOfLabelMenu() {
        Assert.assertTrue(home.verifylabelFooterMenu());
    }


    @And("^Verify existence of Contact button$")
    public void verifyExistenceOfContactButton() {
        Assert.assertTrue(home.verifybuttonFooterContact());
    }

    @When("^Verify existence of label WIT$")
    public void verifyExistenceOfLabelWIT() {
        Assert.assertTrue(home.verifylabelFooterWIT());
    }

    @Then("^Verify existence of Address label$")
    public void verifyExistenceOfAddressLabel() {
        Assert.assertTrue(home.verifylabelFooterAddress());
    }

    @And("^Verify existence of Phone label$")
    public void verifyExistenceOfPhoneLabel() {
        Assert.assertTrue(home.verifylabelFooterPhone());
    }

    @And("^Verify existence of email label$")
    public void verifyExistenceOfEmailLabel() {
        Assert.assertTrue(home.verifylabelFooterEmail());
    }

    @And("^Verify existence of Facebook button$")
    public void verifyExistenceOfFacebookButton() {
        Assert.assertTrue(home.verifybuttonFooterFacebook());
    }

    @And("^Verify existence of Twitter button$")
    public void verifyExistenceOfTwitterButton() {
        Assert.assertTrue(home.verifybuttonFooterTwitter());
    }

    @And("^Verify existence of Instagram button$")
    public void verifyExistenceOfInstagramButton() {
        Assert.assertTrue(home.verifybuttonFooterInstagram());
    }

    @And("^Verify existence of Linkedin button$")
    public void verifyExistenceOfLinkedinButton() {
        Assert.assertTrue(home.verifybuttonFooterLinkedin());
    }

    @And("^Verify existence of Youtube button$")
    public void verifyExistenceOfYoutubeButton() {
        Assert.assertTrue(home.verifybuttonFooterYoutube());
    }

    @And("^Verify alignment of label title of Sign in section$")
    public void verifyAlignmentOfLabelTitleOfSignInSection() {
        Assert.assertTrue(home.verifylabelFooterSignin());
    }

    @And("^Verify existence of text field$")
    public void verifyExistenceOfTextField() {
        Assert.assertTrue(home.verifytextfieldFooterEmail());
    }

    @And("^Verify existence of Sign Up button$")
    public void verifyExistenceOfSignUpButton() {
        Assert.assertTrue(home.verifybuttonFooterSignup());
    }

    @Then("^Close Windows$")
    public void closeWindows() {
        LoadHome.closeWindow();
    }

    @And("^Click About Us button on navbar$")
    public void clickAboutUsButtonOnNavbar() {
        aboutus = home.clickButtonAppbarOurTeam();
    }

    @When("^Verify existence of Parallax on About us$")
    public void verifyExistenceOfParallaxOnAboutUs() {
        Assert.assertTrue(aboutus.verifyparallaxAboutUs());
    }

    @Then("^Verify existence of About Us label on parallax$")
    public void verifyExistenceOfAboutUsLabelOnParallax() {
        Assert.assertTrue(aboutus.verifylabelAboutUsTitle());
    }


    @And("^Verify existence of description of About Us on parallax$")
    public void verifyExistenceOfDescriptionOfAboutUsOnParallax() { Assert.assertTrue(aboutus.verifylabelAboutUsDescription());}

    @And("^Verify existence of Contact us button on parallax$")
    public void verifyExistenceOfContactUsButtonOnParallax() { Assert.assertTrue(aboutus.verifybuttonAboutusContact());}

    @Then("^Verify existence of Members label$")
    public void verifyExistenceOfMembersLabel() { Assert.assertTrue(aboutus.verifylabelMembersTitle());}

    @And("^Verify alignment of Members label$")
    public void verifyAlignmentOfMembersLabel() {
        Assert.assertEquals(aboutus.verifyAlignmentlabelMembersTitle(),"center");
    }

    @And("^Verify existence of description of Members$")
    public void verifyExistenceOfDescriptionOfMembers() {
        Assert.assertTrue(aboutus.verifylabelMembersDescription());
    }

    @And("^Verify alignment of description of Members$")
    public void verifyAlignmentOfDescriptionOfMembers() {
        Assert.assertEquals(aboutus.verifyAlignmentlabelMembersDescription(),"center");
    }

    @And("^Verify existence of cards of Members$")
    public void verifyExistenceOfCardsOfMembers() {
        Assert.assertTrue(aboutus.verifycardMember());
    }

    @And("^Verify existence of images members$")
    public void verifyExistenceOfImagesMembers() {
        Assert.assertTrue(aboutus.verifyimageCardMember());
    }

    @And("^Verify existence of name label$")
    public void verifyExistenceOfNameLabel() {
        Assert.assertTrue(aboutus.verifynameMember());
    }


    @And("^Verify existence of member Linkedin social button$")
    public void verifyExistenceOfMemberLinkedinSocialButton() {
        Assert.assertTrue(aboutus.verifybuttonMemberLinkedin());
    }

    @And("^Verify existence of member Twitter social button$")
    public void verifyExistenceOfMemberTwitterSocialButton() {
        Assert.assertTrue(aboutus.verifybuttonMemberTwitter());
    }

    @And("^Verify existence of member Facebook social button$")
    public void verifyExistenceOfMemberFacebookSocialButton() {
        Assert.assertTrue(aboutus.verifybuttonMemberFacebook());
    }

    @Then("^Verify existence of other communities label$")
    public void verifyExistenceOfOtherCommunitiesLabel() {
        Assert.assertTrue(aboutus.verifylabelCommunitiesTitle());
    }

    @And("^Verify alignment of other communities label$")
    public void verifyAlignmentOfOtherCommunitiesLabel() {
        Assert.assertEquals(aboutus.verifyAlignmentlabelCommunitiesTitle(),"center");
    }

    @And("^Verify existence of other communities logos$")
    public void verifyExistenceOfOtherCommunitiesLogos() {
        Assert.assertTrue(aboutus.verifyimageCommunity());
    }


    @Then("^Click WIT button on navbar from About Us$")
    public void clickWITButtonOnNavbar(){
        home= aboutus.clickbuttonAppbarToHome();
    }

    @When("^Click Activities button on navbar$")
    public void clickActivitiesButtonOnNavbar() {
        activities= home.clickbuttonAppbarActivities();
    }

    @Then("^Click WIT button on navbar fron Activities$")
    public void clickWITButtonOnNavbarFronActivities() {
        home= activities.clickbuttonAppbarToHome();
    }

    @When("^Click ContactUs button on navbar$")
    public void clickContactUsButtonOnNavbar() {
        contactus= home.clickbuttonAppbarContactUs();
    }

    @Then("^Click WIT button on navbar from Contact Us$")
    public void clickWITButtonOnNavbarFromContactUs() {
        home=contactus.clickbuttonAppbarToHome();
    }

    @When("^Click Know Our Team button on parallax$")
    public void clickKnowOurTeamButtonOnParallax() {
        aboutus=home.clickButtonparallaxHome();
    }

    @And("^Wait implicit time$")
    public void waitImplicitTime() {
        LoadHome.waitTime();
    }

    @Then("^Click Facebook button$")
    public void clickFacebookButton() {
        Assert.assertTrue(home.clickbuttonFooterFacebook());
    }


    @Then("^Click Twitter button$")
    public void clickTwitterButton() {
        Assert.assertTrue(home.clickbuttonFooterTwitter());
    }

    @Then("^Click Instagram button$")
    public void clickInstagramButton() {
        Assert.assertTrue(home.clickbuttonFooterInstagram());
    }

    @Then("^Click Linkedin button$")
    public void clickLinkedinButton() {
        Assert.assertTrue(home.clickbuttonFooterLinkedin());
    }

    @Then("^Click Youtube button$")
    public void clickYoutubeButton() {
        Assert.assertTrue(home.clickbuttonFooterYoutube());
    }

    @When("^Send Correct email to text field Sign up$")
    public void sendCorrectEmailToTextFieldSignUp() {
        home.filltextfieldFooterEmail("heidy@hotmail.com");
    }

    @And("^Click Sign Up button$")
    public void clickSignUpButton() {
        home.clickbuttonFooterSignup();
    }

    @Then("^Dialog of interest options must be showed$")
    public void dialogOfInterestOptionsMustBeShowed() {
        Assert.assertTrue(home.verifydialogSignin());
    }

    @And("^Click Activities checkbox$")
    public void clickActivitiesCheckbox() {
        home.clickcheckboxCardActivities();
    }

    @And("^Click News checkbox$")
    public void clickNewsCheckbox() {
        home.clickcheckboxCardNews();
    }

    @And("^Click Contests checkbox$")
    public void clickContestsCheckbox() {
        home.clickcheckboxCardContests();
    }

    @And("^Click Curiosities checkbox$")
    public void clickCuriositiesCheckbox() {
        home.clickcheckboxCardCuriosities();
    }

    @And("^Verify existence of close button on dialog of interest$")
    public void verifyExistenceOfCloseButtonOnDialogOfInterest() {
        Assert.assertTrue(home.verifybuttonCardClose());
    }

    @And("^Click Close button on dialog of interest$")
    public void clickCloseButton() {
        home.clickbuttonCardClose();
    }

    @When("^Send Incorrect email to text field Sign up$")
    public void sendIncorrectEmailToTextFieldSignUp() {
        home.filltextfieldFooterEmail("h@.com");
    }

    @Then("^Dialog of error must be showed$")
    public void dialogOfErrorMustBeShowed() {
        Assert.assertTrue(home.verifylabelWarncardWarning());
    }

    @And("^Click Close button on dialog of error$")
    public void clickCloseButtonOnDialogOfError() {
        home.clickbuttonWarncardClose();
    }


    @And("^Verify existence of Activities checkbox$")
    public void verifyExistenceOfActivitiesCheckbox() {
        Assert.assertTrue(home.verifycheckboxCardActivities());
    }

    @And("^Verify existence of News checkbox$")
    public void verifyExistenceOfNewsCheckbox() {
        Assert.assertTrue(home.verifycheckboxCardNews());
    }

    @And("^Verify existence of Contests checkbox$")
    public void verifyExistenceOfContestsCheckbox() {
        Assert.assertTrue(home.verifycheckboxCardContests());
    }

    @And("^Verify existence of Curiosities checkbox$")
    public void verifyExistenceOfCuriositiesCheckbox() {
        Assert.assertTrue(home.verifycheckboxCardCuriosities());
    }


    @Then("^Verify existence of Parallax on Activities page$")
    public void verifyExistenceOfParallaxOnActivitiesPage() {
        Assert.assertTrue(activities.verifyparallaxActivities());

    }

    @And("^Verify existence of label Title on Activity parallax$")
    public void verifyExistenceOfLabelTitleOnActivityParallax() {
        Assert.assertTrue(activities.verifylabelActivitiesTitle());

    }

    @And("^Verify existence of description on Activity parallax$")
    public void verifyExistenceOfDescriptionOnActivityParallax() {
        Assert.assertTrue(activities.verifylabelActivitiesDescription());
    }

    @Then("^Verify existence of image of each Activities section$")
    public void verifyExistenceOfImageOfEachActivitiesSection() {
        Assert.assertTrue(activities.verifyimageActivity());
    }

    @And("^Verify existence of title of each Activities section$")
    public void verifyExistenceOfTitleOfEachActivitiesSection() {
        Assert.assertTrue(activities.verifylabelActivityTitle());
    }

    @And("^Verify existence of description of each Activities section$")
    public void verifyExistenceOfDescriptionOfEachActivitiesSection() {
        Assert.assertTrue(activities.verifylabelActivityDescription());
    }

    @And("^Verify existence of button of each Activities section$")
    public void verifyExistenceOfButtonOfEachActivitiesSection() {
        Assert.assertTrue(activities.verifybuttonActivity());
    }

    @Given("^Load home page for footer$")
    public void loadHomePageForFooter() {
        home= LoadHome.loadHome();
        footer=new Footer();
    }

    @Given("^Load home page for navbar$")
    public void loadHomePageForNavbar() {
        home= LoadHome.loadHome();
        navbar=new Navbar();
    }

    @Then("^Verify existence of Parallax on Contact Us page$")
    public void verifyExistenceOfParallaxOnContactUsPage() {
        Assert.assertTrue(contactus.verifyparallaxContact());
    }

    @And("^Verify existence of label Title on Contact Us parallax$")
    public void verifyExistenceOfLabelTitleOnContactUsParallax() {
        Assert.assertTrue(contactus.verifylabelContactTitle());
    }

    @When("^Verify existence of label Our Offices$")
    public void verifyExistenceOfLabelOurOffices() {
        Assert.assertTrue(contactus.verifylabelContactOurOffices());
    }

    @Then("^Verify existence of Map section$")
    public void verifyExistenceOfMapSection() {
        Assert.assertTrue(contactus.verifymapContact());
    }

    @And("^Verify existence of Contact section$")
    public void verifyExistenceOfContactSection() {
        Assert.assertTrue(contactus.verifycardFormContact());
    }

    @Then("^Verify existence of label Contact Us title$")
    public void verifyExistenceOfLabelContactUsTitle() {
        Assert.assertTrue(contactus.verifymainLabelFormContact());
    }

    @And("^Verify existence of description labels$")
    public void verifyExistenceOfDescriptionLabels() {
        Assert.assertTrue(contactus.verifysubtitleFormaContact());
    }

    @And("^Verify existence of text field Name$")
    public void verifyExistenceOfTextFieldName() {
        Assert.assertTrue(contactus.verifytextfieldContactNamefield());
    }

    @And("^Verify existence of text field Email$")
    public void verifyExistenceOfTextFieldEmail() {
        Assert.assertTrue(contactus.verifytextfieldContactEmailfield());
    }

    @And("^Verify existence of text field Message$")
    public void verifyExistenceOfTextFieldMessage() {
        Assert.assertTrue(contactus.verifytextfieldContactMessagefield());
    }

    @And("^Verify existence of button Send$")
    public void verifyExistenceOfButtonSend() {
        Assert.assertTrue(contactus.verifybuttonFormContact());
    }

    @And("^Send correct text to text field Name$")
    public void sendCorrectTextToTextFieldName() {
        contactus.filltextfieldContactNamefield("Nuevo usuario");
    }

    @And("^Send correct email to text field Email$")
    public void sendCorrectEmailToTextFieldEmail() {
        contactus.filltextfieldContactEmailfield("nuevousuario@gmail.com");
    }

    @And("^Send correct message to text field Message$")
    public void sendCorrectMessageToTextFieldMessage() {
        contactus.filltextfieldContactMessagefield("hola");
    }

    @And("^Verify if Send button esta habilitado$")
    public void verifyIfSendButtonEstaHabilitado() {
        Assert.assertTrue(contactus.isenabledbuttonFormContact());
    }

    @And("^Click Send button$")
    public void clickSendButton() {
        contactus.clickbuttonFormContact();
    }

    @And("^Verify success snackbar$")
    public void verifySuccessSnackbar() {
        Assert.assertTrue(contactus.verifysnackbarFooterMessagge());
    }

    @And("^Send incorrect email to text field Email$")
    public void sendIncorrectEmailToTextFieldEmail() {
        contactus.filltextfieldContactEmailfield("nuevousuario@.com");
    }

    @And("^Verify if Send button is disabled$")
    public void verifyIfSendButtonIsDisabled() {
        Assert.assertFalse(contactus.isenabledbuttonFormContact());
    }


    @And("^Send incorrect text to text field Name$")
    public void sendIncorrectTextToTextFieldName() {
        contactus.filltextfieldContactNamefield(" ");
    }

    @And("^Send incorrect message to text field Message$")
    public void sendIncorrectMessageToTextFieldMessage() {
        contactus.filltextfieldContactMessagefield(" ");
    }

    @And("^Verify existence of About Us button on footer$")
    public void verifyExistenceOfAboutUsButtonOnFooter() {
        Assert.assertTrue(home.verifybuttonFooterAboutus());
    }

    @And("^Verify existence of Activities button on footer$")
    public void verifyExistenceOfActivitiesButtonOnFooter() {
        Assert.assertTrue(home.verifybuttonFooterActivities());
    }

    @And("^Verify existence of Contact us button on footer$")
    public void verifyExistenceOfContactUsButtonOnFooter() {
        Assert.assertTrue(home.verifybuttonFooterContact());
    }
}
