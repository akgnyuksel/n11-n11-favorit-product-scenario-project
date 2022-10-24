package n11project.pages;

import n11project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='btnSignIn']")
    public WebElement loginSign;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//div[@id='loginButton']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@data-productid='454952234']")
    public WebElement addFavoriteSign;

    @FindBy(xpath = "//a[@title='Hesabım']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[@title='Favorilerim / Listelerim']")
    public WebElement myFavoriteList;

    @FindBy(xpath = "//h2[.='Favorilerim / Listelerim']")
    public WebElement myFavoriteListDisplay;

    @FindBy(xpath = "//h4[@class='listItemTitle']")
    public WebElement favoriteListDetails;

    @FindBy(xpath = "//h4[@class='listItemTitle']")
    public WebElement deleteProduct;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement deleteConfirmButton;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement exitAccount;

}
