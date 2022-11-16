package sapiens.login;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import utility.ConfigManager;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;


public class Login extends WebDr {

    private static final Logger logger = getLogger(Login.class);

    public Login(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    /**
     * Method for Login to Sapiens application
     */
    public void applicationLogin() throws Exception {

        Login_Mappings.Login_Factory();

        try {

            String userName = ConfigManager.getConfigManagerInstance().getKeyValue("username");
            String password = ConfigManager.getConfigManagerInstance().getKeyValue("password");

            if (exists("btnLogin", true, "Login Page")) {
                setText("txtBoxUserName", userName, "Enter User Name");
                setText("txtBoxPassword", password, "Enter User Password");
                click("btnLogin", "Click Login button");
                if (exists("imgHome",true,"Home Image Exists")) {
                    String expectedUser = getText("expectedUserName", "Get the Logged in User Name");
                    validateString(expectedUser,userName,"Logged In With Correct User");
                    String oldSessionCount = getText("labelSessionCount", "Old Session Count");
                    if (Integer.parseInt(oldSessionCount) > 1){
                        click("linkSessionMainMenu", "Click Session Menu");
                        click("labelCloseAll", "Click Close All");
                        if (exists("dialogBasicNotification", true, "Basic Notification Dialog")) {
                            click("btnDialogOK","Click OK Button");
                            String newSessionCount = getText("labelSessionCount", "Old Session Count");
                            if (Integer.parseInt(newSessionCount) == 1){
                                logger.info("All Active Sessions Closed Successfully");
                                logger.info("User Login Successful");
                            }
                        }
                    }
                } else if (exists("txtLoginError",true,"Login Error")){
                    String errorText = getText("txtLoginError", "Login Error Text");
                    validateString("The username/password provided is invalid.",errorText,"Unable to Login");
                    logger.info("User Login NOT Successful");
                } else {
                    logger.info("Application down. Please try again later...");
                }
            }} catch(Exception e){
                logger.info("Login Failed " + e);
            }
    }

    /**
     * Method to Log Out from Sapiens application
     */
    public void applicationLogOut() {

        Login_Mappings.Login_Factory();

        try {
            if (exists("imgHome", true, "Home Image Exists")) {
                click("btnUserMenu", "Click on User Menu Dropdown");
                click("elmntLogOff", "Click LogOff Element");
                if (exists("dialogLogOff", true, "Confirm Logoff Dialog Box")) {
                    click("btnOK", "Click OK Button");
                    Thread.sleep(5000);
                    if (exists("linkChangePassword", true, "Login Page")) {
                        logger.info("User LogOut Successful");
                        wdriver.quit();
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Unable to LogOut" + e);
        }
    }



}