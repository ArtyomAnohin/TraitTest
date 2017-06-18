package org.groovylang.Page.Base

import com.codeborne.selenide.SelenideElement
import static com.codeborne.selenide.Condition.text
import static com.codeborne.selenide.Selenide.$

/**
 * Created by artyom on 18.06.17.
 */
trait PageMarkup {
    SelenideElement pageCaption() {
        $("div.col-lg-8 > h1")
    }

    def shouldHaveCaption(String caption) {
        pageCaption().shouldHave(text(caption))
    }
}
