package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@Getter
public abstract class BasePage {

  private static final ThreadLocal<WebDriver> DRIVER_THREAD_LOCAL = new ThreadLocal<WebDriver>();

  //protected static WebDriver driver;


  //public static ThreadLocal<WebDriver> getDriverThreadLocal() {
  //  return DRIVER_THREAD_LOCAL;
 // }

  public static void setDriverThreadLocal(WebDriver webDriver) {
    DRIVER_THREAD_LOCAL.set(webDriver);
    //driver = webDriver;
  }

  public static WebDriver getDriver() {
  return DRIVER_THREAD_LOCAL.get();
    //return driver;
  }

  public WebElement waitUntilVisible(WebElement element, int time) {
    return new WebDriverWait(getDriver(), time)
        .until(ExpectedConditions.visibilityOf(element));
  }

  public WebElement waitUntilClickable(WebElement element, int time) {
    return new WebDriverWait(getDriver(), time)
        .until(ExpectedConditions.elementToBeClickable(element));
  }

}
