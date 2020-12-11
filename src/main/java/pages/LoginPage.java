package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class LoginPage extends BasePage {
// By iconAccount = By.xpath("//a[@title='My Account']"); //i[@class='fa fa-user']
//  By buttonRegister = By.xpath("//li[@class='dropdown open']//a[text()='Register']");
//  By buttonLogin = By.xpath("//li//a[text()='Login']");

    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement iconAccount;

    @FindBy(xpath = "//li[@class='dropdown open']//a[text()='Register']")
    private WebElement buttonRegister;

    @FindBy(xpath = "//li//a[text()='Login']")
    private WebElement buttonLogin;



    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement fieldEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement buttonSubmit;

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickButtonMyAccount(){
        log.info("Finding and clicking on element myAccountButton by locator{}",iconAccount);
        iconAccount.click();
    }
    public void clickButtonLogin(){
        log.info("Finding and clicking on element loginButton by locator{}",buttonLogin);
        buttonLogin.click();
    }

    public void setMyEmail(String myEmailForLogin) {
        log.info("Setting Email in field Email {}", fieldEmail);
        waitUntilVisible(fieldEmail, 5).sendKeys(myEmailForLogin);
    }

    public void setMyPassword(String myPasswordForLogin) {
        log.info("Setting password in field password {}", fieldPassword);
        waitUntilVisible(fieldPassword, 5).sendKeys(myPasswordForLogin);
    }

    public void clickSubmitButton () {
        log.info("Clicking SUBMIT LOGIN BUTTON by locator{}", buttonSubmit);
        buttonSubmit.click();
    }

}



/*
clickOnTheLoginButton
By fieldEmail = By.xpath("//input[@id='input-email']");
        By fieldPassword = By.xpath("//input[@id='input-password']");
        By buttonSubmit = By.xpath("//input[@class='btn btn-primary']");

        public LoginPage setMyEmail(String myEmailForLogin){
            find(fieldEmail).sendKeys(myEmailForLogin);
            return this;
        }

        public LoginPage setMyPassword(String myPasswordForLogin){
            find(fieldPassword).sendKeys(myPasswordForLogin);
            return this;
        }

        public MyAccountPage clickOnTheSubmitButton(){
            find(buttonSubmit).click();
            return new MyAccountPage();
        }*/