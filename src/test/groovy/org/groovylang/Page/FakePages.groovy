package org.groovylang.Page

import com.codeborne.selenide.SelenideElement
import org.groovylang.Page.Base.PageMarkup
import org.groovylang.Page.Base.TopMenu
import static com.codeborne.selenide.Selenide.$

/**
 * Created by artyom on 18.06.17.
 */

class MainPage implements PageMarkup, TopMenu {
    SelenideElement mainPageSlogan() {
        $(".row.colset-2-its > h1")
    }
}

class LearnPage implements PageMarkup, TopMenu {}

class DocumentationPage implements PageMarkup, TopMenu {}

class DownloadPage implements PageMarkup, TopMenu {}

class SupportPage implements PageMarkup, TopMenu {}

class ContributePage implements PageMarkup, TopMenu {}

class EcosystemPage implements PageMarkup, TopMenu {}

class SocializePage implements PageMarkup, TopMenu {
    SelenideElement socializeMenu() {
        $(".st-menu")
    }
}
