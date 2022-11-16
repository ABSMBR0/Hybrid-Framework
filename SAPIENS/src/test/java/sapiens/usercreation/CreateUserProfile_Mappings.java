package sapiens.usercreation;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class CreateUserProfile_Mappings {

    public static void CreateUserProfile_Factory()
    {
        Map<String, String> userProfile_Objects = new HashMap<>();

        //***********   CONTACT CREATION  ***********

        userProfile_Objects.put("linkChangePassword", "XPATH|//div[@class='loginChangeForget']");//Change Password Link
        userProfile_Objects.put("txtBoxUserName", "XPATH|//input[@id='UserName']");//TextBox of User Name
        userProfile_Objects.put("txtBoxPassword", "XPATH|//input[@id='Password']");//TextBox of Password
        userProfile_Objects.put("btnLogin", "XPATH|//button[@class='login-button idit-btn']");//Login Button
        userProfile_Objects.put("drpDwnNewMainMenu", "XPATH|//a[@id='NewMainMenu']");//New Dropdown
        userProfile_Objects.put("linkNewContact", "XPATH|//a[@id='NewContactNewGenFromMenu_Link']");//New Contact Link
        userProfile_Objects.put("linkMaintainDetails", "XPATH|//a[@id='Root']");//Maintain Details Link
        userProfile_Objects.put("linkGeneralDetails", "XPATH|//a[@id='General Details']");//General Details Link
        userProfile_Objects.put("drpDwnIDType", "XPATH|//select[@id='primaryIdentifierType']");//ID Type Dropdown
        userProfile_Objects.put("txtBoxIDNumber", "XPATH|//input[@id='primaryIdentifier' and @idit-label='ID Number']");//ID Number TextBox
        userProfile_Objects.put("drpDwnLegalType", "XPATH|//select[@id='entityTypeVO' and @title ='Legal Type']");//Legal Type Dropdown
        userProfile_Objects.put("txtBoxSurName", "XPATH|//input[@idit-label='Surname/ Organization Name']");//SurName TextBox
        userProfile_Objects.put("txtBoxFirstName", "XPATH|//input[@idit-label='First Name']");//FirstName TextBox
        userProfile_Objects.put("drpDwnPreferredCommunicationChannel", "XPATH|//select[@id='deliveryTypeStyleId' and @idit-label='Preferred Communication Channel']");//Preferred Communication Channel Dropdown
        userProfile_Objects.put("btnSelectPreferredDeliveryAddress", "XPATH|//span[@id='deliveryAddressStyleIdGoButtonGo']");//Preferred Delivery Address 3 Dots
        userProfile_Objects.put("btnAddDeliveryAddress", "XPATH|//i[@class='fa fa-plus']");//Plus Sign
        userProfile_Objects.put("drpDwnListEmailType", "XPATH|//select[@id='IDITForm@contactEmail|1@emailTypeVO@id']");//Email Type Dropdown
        userProfile_Objects.put("txtBoxEmailAddress", "XPATH|//input[@title='E-mail Address']");//Email Address TextBox
        userProfile_Objects.put("btnSelectDeliveryAddress", "XPATH|//button[@id='backFromDeliveryAddress']");//Delivery Address Select Button
        userProfile_Objects.put("btnFinish", "XPATH|//button[@id='Finish']");//Finish Button
        userProfile_Objects.put("dialogContactConfirmation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Contact Creation Dialog Box
        userProfile_Objects.put("btnOKContactCreation", "XPATH|//button[@id='Ok']");//OK Button on Contact Creation Dialog Box
        userProfile_Objects.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab
        userProfile_Objects.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        userProfile_Objects.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button

        //***********   USER PROFILE CREATION  ***********

        userProfile_Objects.put("menuSettings", "XPATH|//a[@id='SettingsMainMenu']//i[@class='mainMenuItemArrow fa fa-caret-down']");//Settings Main Menu
        userProfile_Objects.put("listSettings", "XPATH|//div[@class='dropdown-menu dropdown-menu-container SettingsMenu']/ul/li");//Settings List Items
        userProfile_Objects.put("listSetup", "XPATH|//a[@id='16158']//parent::li/ul/li");//Setup List Items
        userProfile_Objects.put("pageSetupPromotion", "XPATH|//form[@id='IDITFormId']");//Setup Promotion Page
        userProfile_Objects.put("listUsers", "XPATH|//tr[@class='jqgrow ui-row-ltr ui-widget-content']/td");//Users List
        userProfile_Objects.put("txtBoxPromotionPassword", "XPATH|//input[@id='promotionPassword']");//Promotion Password Text Box
        userProfile_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        userProfile_Objects.put("pageSecurityParameters", "XPATH|//form[@id='IDITFormId']");//Security Parameters Page
        userProfile_Objects.put("listNavigation", "XPATH|//div[@class='idit-navigation-tree pane ui-layout-west ui-layout-pane ui-layout-pane-west']/ul/li");//Navigation List Items
        userProfile_Objects.put("pageMaintainCompanyOrganizationalStructure", "XPATH|//div[@class='FormTitle noDashboard noMargin FormTitle noDashboard noMargin']");//Maintain Company's Organizational Structure Page
        userProfile_Objects.put("linkAddEmployee", "XPATH|//a[@id='flattendListfilterOrganizationVOList|addEmployee']");//Add Employee Link
        userProfile_Objects.put("pageEmployeeCard", "XPATH|//form[@id='IDITFormId']");//Employee Card Page
        userProfile_Objects.put("btnSearchContact", "XPATH|//button[@id='findContact']");//Search Contact Button
        userProfile_Objects.put("recentContacts", "XPATH|//div[@id='userRecentContactsList']");//Recent Contacts
        userProfile_Objects.put("listRecentContacts", "XPATH|//div[@id='userRecentContactsListAddInfo|']//div[@class='listWidgetBody']/ul/li");//Recent Contacts List
        userProfile_Objects.put("btnSelectUser", "XPATH|(//div[@class='listWidgetCell homePageRecentList']//span[@title='Select'])[1]");//Select User Button
        userProfile_Objects.put("btnOrganizationalUnit", "XPATH|//i[@class='fa fa-stack-1x fa-ellipsis-h']");//Select User Button
        userProfile_Objects.put("btnSearch", "XPATH|//button[@id='searchOnOrgUnitTree']");//Select User Button
        userProfile_Objects.put("labelOrganization", "XPATH|//span[@class='cell-wrapperleaf']");//Select User Button
        userProfile_Objects.put("drpDwnPosition", "XPATH|//select[@id='IDITForm@contactRoleId']");//Address Type Dropdown
        userProfile_Objects.put("linkCreateUser", "XPATH|//a[@id='newPerformSubAction_createUserSubAction__Link']");//Add Employee Link
        userProfile_Objects.put("txtBoxNameOfUser", "XPATH|//input[@id='IDITForm@userVO@nameOfUser']");//Add Employee Link
        userProfile_Objects.put("drpDwnProfile", "XPATH|//select[@id='IDITForm@profileVO@id']");//Address Type Dropdown
        userProfile_Objects.put("txtBoxUserPassword", "XPATH|//input[@id='IDITForm@userVO@userAdditionalDataVO@userPassword']");//Add Employee Link
        userProfile_Objects.put("txtBoxConfirmUserPassword", "XPATH|//input[@id='additionalInfo(confirmPassword)']");//Add Employee Link
        userProfile_Objects.put("btnOK", "XPATH|//button[@id='Ok']");//OK Button on Contact Creation Dialog Box
        userProfile_Objects.put("txtBoxUserNameToSearchUser", "XPATH|//input[@id='IDITForm@userName']");//Add Employee Link
        userProfile_Objects.put("btnFilter", "XPATH|//button[@id='searchForOrganizations']");//Select User Button
        userProfile_Objects.put("btnSearchResultsCount", "XPATH|//table[@id='idit-grid-table-flattendListfilterOrganizationVOList_pipe_']//tr");//Select User Button
        userProfile_Objects.put("tabRoles", "XPATH|//li[@title='Roles']");//Select User Button
        userProfile_Objects.put("tableUserRoles", "XPATH|(//table[@id='idit-grid-table-flattendListuserRolesList_pipe_']//tr)[2]");//Select User Button
        userProfile_Objects.put("linkAddRole", "XPATH|//a[@id='flattendListuserRolesList|addRoleToUserRolesTable']");//Select User Button
        userProfile_Objects.put("txtBoxRoleName", "XPATH|//input[@id='additionalInfo(addNewUserRoleFilter)']");//Select User Button
        userProfile_Objects.put("btnSearchForRoles", "XPATH|//button[@id='searchForRoles']");//Select User Button
        userProfile_Objects.put("chkBoxGranted", "XPATH|//label[@id='currentUserRolesPVOListToAdd|1@isGrantedLabel']");//Select User Button
        userProfile_Objects.put("chkBoxAllowToGrant", "XPATH|//label[@id='currentUserRolesPVOListToAdd|1@allowToGrantLabel']");//Select User Button
        userProfile_Objects.put("btnOKRoles", "XPATH|//button[@id='OK']");//OK Button on Contact Creation Dialog Box
        userProfile_Objects.put("tabEmployeeCard", "XPATH|//li[@title='Employee Card']");//Select User Button
        userProfile_Objects.put("btnOKEmployeeCard", "XPATH|//button[@id='OK']");//OK Button on Contact Creation Dialog Box


        WebDr.page_Objects = userProfile_Objects ;
    }
}
