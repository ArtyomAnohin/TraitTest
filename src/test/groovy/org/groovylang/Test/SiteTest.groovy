package org.groovylang.Test

import org.groovylang.Page.*
import org.groovylang.Page.Base.Pages
import org.junit.Test

import static com.codeborne.selenide.Condition.text
import static com.codeborne.selenide.Condition.visible
import static com.codeborne.selenide.Selenide.open

/**
 * Created by artyom on 18.06.17.
 */
class SiteTest {

    @Test
    void userCanNavigateTest() {
        MainPage mainPage = open("http://groovy-lang.org", MainPage.class)
        mainPage.mainPageSlogan().shouldHave(text("A multi-faceted language for the Java platform"))
        LearnPage learnPage = mainPage.navigateTo(Pages.Learn)
        learnPage.shouldHaveCaption("Learn")
        DocumentationPage documentationPage = learnPage.navigateTo(Pages.Documentation)
        documentationPage.shouldHaveCaption("Documentation")
        DownloadPage downloadPage = documentationPage.navigateTo(Pages.Download)
        documentationPage.shouldHaveCaption("Download")
        SupportPage supportPage = downloadPage.navigateTo(Pages.Support)
        supportPage.shouldHaveCaption("Support")
        ContributePage contributePage = supportPage.navigateTo(Pages.Contribute)
        contributePage.shouldHaveCaption("Getting Involved")
        EcosystemPage ecosystemPage = contributePage.navigateTo(Pages.Ecosystem)
        ecosystemPage.shouldHaveCaption("Ecosystem")
        SocializePage socializePage = ecosystemPage.navigateTo(Pages.Socialize)
        socializePage.socializeMenu().shouldBe(visible)
    }
}
