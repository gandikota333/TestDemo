import com.amazon.qa.HomePage;
import com.amazon.qa.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginSuccessful(){
        homePageObj.clickSignIn();
        Assert.assertTrue(loginPageObj.isPhoneEmailInputBox());
        loginPageObj.enterEmail("7386850641");
        loginPageObj.clickContinueBtn();
        loginPageObj.enterPassword("Sai7386babu");
        loginPageObj.clickSignInBtn();
//        Assert.assertTrue(homePageObj.isDeliverTOText());
        //OTP ASSERTION

    }

}
