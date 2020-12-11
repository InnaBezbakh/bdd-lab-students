package pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class MainPage extends BasePage {

  public void openMainPage() {
    log.info("Opening main page of the web site");
    getDriver().get("https://demo.opencart.com/");
  }

}
