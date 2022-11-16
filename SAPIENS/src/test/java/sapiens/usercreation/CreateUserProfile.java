package sapiens.usercreation;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import utility.WebDr;

import java.util.concurrent.ThreadLocalRandom;

import static org.slf4j.LoggerFactory.getLogger;

public class CreateUserProfile extends WebDr {

    private static final Logger logger = getLogger(CreateUserProfile.class);

    public int age = ThreadLocalRandom.current().nextInt(19, 100);
    public String gender = (ThreadLocalRandom.current().nextInt(1000, 9999) >= 5000 ? "Male" : "Female");
    String ID_Number = GenRSAID(age, gender);
    String legalType = getValue("Legal_Type");
//    String surName = getValue("Sur_Name");
//    String firstName = getValue("First_Name");
    String preferredCommunicationChannel = getValue("Preferred_Communication_Channel");
    String preferredDeliveryAddressType = getValue("Preferred_Delivery_Address_Type");
    String eMailAddress = getValue("EMail_Address");
    String userName = getValue("User_Name");
    String role = getValue("Role");


    public CreateUserProfile(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    String[] subStr = eMailAddress.split("[.@]");

    /**
     * Method a crate a Contact with MINIMUM inputs
     */
    public void createContact() {

        CreateUserProfile_Mappings.CreateUserProfile_Factory();



        try {
            Thread.sleep(2000);
            click("drpDwnNewMainMenu", "Click New Drop Down");
            click("linkNewContact", "Click New Contact");
//            selectValueFromDropdown("drpDwnIDType", "text", "ID Number", "Select ID Type");
//            setText("txtBoxIDNumber", ID_Number, "ID Number");
            selectValueFromDropdown("drpDwnLegalType", "text", legalType, "Select Legal Type");
            setText("txtBoxSurName", subStr[1], "Enter Sur Name");
            setText("txtBoxFirstName", subStr[0], "Enter First Name");
            selectValueFromDropdown("drpDwnPreferredCommunicationChannel", "text", preferredCommunicationChannel, "Select Preferred Communication Channel");
            click("btnSelectPreferredDeliveryAddress", "Click 3 dots to Select Preferred Delivery Address");
            click("btnAddDeliveryAddress", "Click Add Button");
            selectValueFromDropdown("drpDwnListEmailType", "text", preferredDeliveryAddressType, "Select Telephone Type");
            setText("txtBoxEmailAddress", eMailAddress, "Enter Email Address");
            click("btnSelectDeliveryAddress", "Click Select Button");
            click("btnFinish", "Click Finish Button");
//            if (existsNoReport("dialogBasicNotification", true, "GD1000079 Popup")) {
//                click("btnDialogOK", "Click OK Button");
//            }
            if (exists("dialogContactConfirmation", true, "Contact Creation Dialog Box")) {
                click("btnOKContactCreation", "Click OK Button on Contact Creation Dialog Box");
                if (exists("tabContactDashboard", true, "Contact Dashboard Exists")) {
                    logger.info("Contact " + subStr[0] + " " + subStr[1] + " Created Successfully");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Method a crate a User Profile
     */
    public void createProfile() {

        CreateUserProfile_Mappings.CreateUserProfile_Factory();

        try {
            if (exists("menuSettings", true, "Settings Menu Exists")) {
                click("menuSettings", "Click Settings");
                selectValueFromList("listSettings", "Setup", "Select value");
                selectValueFromList("listSetup", "Security Manager", "Click Security Manager");
                selectValueFromList("listUsers", "Calvin Test", "Select Calvin Test");
                setText("txtBoxPromotionPassword", "1234", "Enter Password");
                click("btnNext", "Click Next Button");
                selectValueFromList("listNavigation", "Organization Structure", "Select Organization Structure");
                click("linkAddEmployee", "Click Add Employee");
                click("btnSearchContact", "Click Search Contact Button");
                click("btnSelectUser", "Select User");
                click("btnOrganizationalUnit", "Click Organizational Unit");
                click("btnSearch", "Click Search Button");
                click("labelOrganization", "Select Organization");
                selectValueFromDropdown("drpDwnPosition", "text", "Staff", "Select Position");
                click("linkCreateUser", "Click Create User");
                click("tabRoles", "Click Roles TAB");
                click("tableUserRoles", "CLick ABSA");
                click("linkAddRole", "Click Add Role");
                setText("txtBoxRoleName", "Master Role", "Enter Role");
                click("btnSearchForRoles", "CliCK Search");
                click("chkBoxGranted", "Check Granted");
                click("chkBoxAllowToGrant", "Check AllowToGrant");
                click("btnOKRoles", "Click OK");
                click("linkAddRole", "Click Add Role");
                setText("txtBoxRoleName", "System Administrator", "Enter Role");
                click("btnSearchForRoles", "CliCK Search");
                click("chkBoxGranted", "Check Granted");
                click("chkBoxAllowToGrant", "Check AllowToGrant");
                click("btnOKRoles", "Click OK");
                click("tabEmployeeCard", "Click Employee Card TAB");
//                setText("txtBoxNameOfUser", userName, "Enter User Name");
                setText("txtBoxNameOfUser",  subStr[0] + "." + subStr[1], "Enter User Name");
                selectValueFromDropdown("drpDwnProfile", "text", "Company Employee not limited", "Select Profile");
                setText("txtBoxUserPassword", "1234", "Enter Password");
                setText("txtBoxConfirmUserPassword", "1234", "Confirm Password");
                click("btnOKEmployeeCard", "Click OK");
                if (exists("dialogContactConfirmation", true, "Contact Creation Dialog Box")) {
                    click("btnOKContactCreation", "Click OK Button on Contact Creation Dialog Box");
                    if (exists("pageMaintainCompanyOrganizationalStructure", true, "Contact Dashboard Exists")) {
                        setText("txtBoxUserNameToSearchUser",  subStr[0] + "." + subStr[1], "Enter User Profile");
//                        setText("txtBoxUserNameToSearchUser",  userName, "Enter User Profile");

                        click("btnFilter", "Click Organizational Unit");
                        if (getElements("btnSearchResultsCount").size() > 2) {
                            logger.info("User Profile " + subStr[0] + "." + subStr[1] + " Created Successfully");
//                            logger.info("User Profile " + userName + " Created Successfully");

                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in User Profile Creation is : " + e);
        }
    }
}
