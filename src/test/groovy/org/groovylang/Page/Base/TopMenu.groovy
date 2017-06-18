package org.groovylang.Page.Base

import org.groovylang.Page.*
import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.page

/**
 * Created by artyom on 18.06.17.
 */

enum Pages {
    MainPage,
    Learn,
    Documentation,
    Download,
    Support,
    Contribute,
    Ecosystem,
    Socialize
}

trait TopMenu {
    def navigateTo(Pages pages) {
        switch (pages) {
            case Pages.MainPage:
                $(".navbar-brand").click()
                return page(MainPage.class)
            case Pages.Learn:
                $(".navbar-collapse li:nth-child(1) > a").click()
                return page(LearnPage.class)
            case Pages.Documentation:
                $(".navbar-collapse li:nth-child(2) > a").click()
                return page(DocumentationPage.class)
            case Pages.Download:
                $(".navbar-collapse li:nth-child(3) > a").click()
                return page(DownloadPage.class)
            case Pages.Support:
                $(".navbar-collapse li:nth-child(4) > a").click()
                return page(SupportPage.class)
            case Pages.Contribute:
                $(".navbar-collapse li:nth-child(5) > a").click()
                return page(ContributePage.class)
            case Pages.Ecosystem:
                $(".navbar-collapse li:nth-child(6) > a").click()
                return page(EcosystemPage.class)
            case Pages.Socialize:
                $(".navbar-collapse li:nth-child(7) > a").click()
                return page(SocializePage.class)
        }
    }
}