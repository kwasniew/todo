import org.openqa.selenium.htmlunit.HtmlUnitDriver

waiting {
    timeout = 2
}

environments {
    chrome {
        driver = { new HtmlUnitDriver() }
    }
}