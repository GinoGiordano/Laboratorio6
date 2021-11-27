import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginForm extends PageObject {

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";
    private final String WRONG_PASSWORD = "contraseñaIncorrecta";


    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement login_button;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement incorrectserrorMessagge;


    public LoginForm(WebDriver driver) {
        super(driver);
    }

    public void enterUserName() {
        this.userName.sendKeys(USERNAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void pressLoginButton(){
        this.login_button.click();
    }

    public void enterWrongPassword(){ this.password.sendKeys(WRONG_PASSWORD);}

    public String getIncorrectInputsMessage(){return this.incorrectserrorMessagge.getText();}

    public String getMessaggeLoginBtn(){return this.login_button.getAttribute("value");}
}
