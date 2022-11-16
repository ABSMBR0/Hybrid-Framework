package sapiens.login;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Login_Mappings {

    public static void Login_Factory()
    {
        Map<String, String> Login_Objects = new HashMap<>();

        Login_Objects.put("txtBoxUserName", "XPATH|//input[@id='UserName']");//TextBox of User Name
        Login_Objects.put("txtBoxPassword", "XPATH|//input[@id='Password']");//TextBox of Password
        Login_Objects.put("btnLogin", "XPATH|//button[@class='login-button idit-btn']");//Login Button
        Login_Objects.put("linkChangePassword", "XPATH|//div[@class='loginChangeForget']");//Change Password Link
        Login_Objects.put("expectedUserName", "XPATH|//button[@id='userMenuButton']/span[@class='buttonLabel']");//Logged in User Name
        Login_Objects.put("btnLogOff", "XPATH|//div[@id='mainTopBarRightUserDiv']/ul/li/a[@id='LogOff']");//LogOff Button
        Login_Objects.put("txtLoginError", "XPATH|//div[@id='login_error']/span[@id='login_error_span']");//Login Error Text
        Login_Objects.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        Login_Objects.put("btnUserMenu", "XPATH|//button[@id='userMenuButton']");//User Menu Button on Top Right Corner
        Login_Objects.put("elmntLogOff", "XPATH|//a[@id='LogOff']");//User Menu Button on Top Right Corner
        Login_Objects.put("dialogLogOff", "XPATH|//div[@id='BasicNotificationDialog']");//Confirm Logoff dialog box
        Login_Objects.put("btnOK", "XPATH|//button[@id='DialogOK']");//OK button on Confirm Logoff Dialog Box
        Login_Objects.put("btnCancel", "XPATH|//button[@id='DialogCancel']");//Cancel button on Confirm Logoff Dialog Box
        Login_Objects.put("labelSessionCount", "XPATH|//span[@class='pagesRectangleText']");//Session Count
        Login_Objects.put("linkSessionMainMenu", "XPATH|//a[@id='SessionsMainMenu']");//Sessions Main Menu
        Login_Objects.put("labelCloseAll", "XPATH|//a[@id='pagesCloseAllMainMenu']");//Close All
        Login_Objects.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        Login_Objects.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button


        WebDr.page_Objects = Login_Objects ;
    }


}
