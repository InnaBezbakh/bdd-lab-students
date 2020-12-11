package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage
{

    @FindBy(xpath="//h2[text()='My Account']")
    private WebElement textMyAccount;


    public MyAccountPage() {
        PageFactory.initElements(getDriver(), this);
    }
    public String getSuccessfullLoginText(){
        return textMyAccount.getText();
    }
}

       /*
        By textMyAccount = By.xpath("//h2[text()='My Account']");
        public String getSuccessfullLoginText() {
            String actualResult1 = find(textMyAccount).getText();
            return actualResult1;
        }*/