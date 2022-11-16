package sapiens.contact;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Contact_Mappings {

    public static void Contact_Factory()
    {
        Map<String, String> Contact_Objects = new HashMap<>();

        Contact_Objects.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        Contact_Objects.put("linkRecentContacts", "XPATH|(//div[@id='userRecentContactsListAddInfo|']//li)[1]");//First Recent Contact Link
        Contact_Objects.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab

        //***********   GENERAL DETAILS   ***********

        Contact_Objects.put("drpDwnNewMainMenu", "XPATH|//a[@id='NewMainMenu']");//New Dropdown
        Contact_Objects.put("linkNewContact", "XPATH|//a[@id='NewContactNewGenFromMenu_Link']");//New Contact Link
        Contact_Objects.put("linkMaintainDetails", "XPATH|//a[@id='Root']");//Maintain Details Link
        Contact_Objects.put("linkGeneralDetails", "XPATH|//a[@id='General Details']");//General Details Link
        Contact_Objects.put("drpDwnIDType", "XPATH|//select[@id='primaryIdentifierType']");//ID Type Dropdown
        Contact_Objects.put("txtBoxIDNumber", "XPATH|//input[@id='primaryIdentifier' and @idit-label='ID Number']");//ID Number TextBox
        Contact_Objects.put("drpDwnLegalType", "XPATH|//select[@id='entityTypeVO' and @title ='Legal Type']");//Legal Type Dropdown
        Contact_Objects.put("txtBoxSurName", "XPATH|//input[@idit-label='Surname/ Organization Name']");//SurName TextBox
        Contact_Objects.put("txtBoxFirstName", "XPATH|//input[@idit-label='First Name']");//FirstName TextBox
        Contact_Objects.put("txtBoxInitials", "XPATH|//input[@idit-label='Initials']");//Initials TextBox
        Contact_Objects.put("drpDwnClientGroup", "XPATH|//select[@id='clientGrpABSAJDOBean' and @title ='Client Group']");//Client Group Dropdown
        Contact_Objects.put("drpDwnClientType", "XPATH|//select[@id='clientTypeABSAJDOBean@id' and @title ='Client Type']");//Client Type Dropdown
        Contact_Objects.put("txtBoxClientCode", "XPATH|//input[@idit-label='Client Code']");//Client Code TextBox
        Contact_Objects.put("drpDwnCorrespondenceLanguage", "XPATH|//select[@idit-label='Correspondence Language']");//Correspondence Language Dropdown
        Contact_Objects.put("drpDwnIntermediary", "XPATH|//select[@idit-label='Intermediary']");//Intermediary Dropdown
        Contact_Objects.put("txtBoxDOB", "XPATH|//input[@id='dateOfBirth' and @idit-label='Date of Birth']");//DOB TextBox
        Contact_Objects.put("arrowTitle", "XPATH|//div[@id='s2id_Title']/a/span[@class='select2-arrow']");//Title Dropdown Arrow
        Contact_Objects.put("drpDwnTitle", "XPATH|//select[@id='Title']");//Title Dropdown
        Contact_Objects.put("drpDwnGender", "XPATH|//select[@idit-label='Gender' and @id='Gender']");//Gender Dropdown

        //Address
        Contact_Objects.put("valueDrpDwnAddressType", "XPATH|//div[@id='s2id_IDITForm@primaryAddressForDisplay@addressTypeVO@id']//span");//Address Type Dropdown
        Contact_Objects.put("drpDwnAddressType", "XPATH|//select[@idit-label='Address Type' and @title='Address Type']");//Address Type Dropdown
        Contact_Objects.put("txtBoxAddressLine1", "XPATH|//label[@title='Address Line 1']/following-sibling::input");//AddressLine1 TextBox
        Contact_Objects.put("txtBoxAddressLine2", "XPATH|//label[@title='Address Line 2']/following-sibling::input");//AddressLine2 TextBox
        Contact_Objects.put ("txtSuburbPrimary", "XPATH|//input[@name='additionalInfo(IDITForm@primaryAddressForDisplay@SO003@addressVO@cityId_autocompleteSelectInputId)']");// Suburb Autocomplete Box
        Contact_Objects.put("drpDwnCityTownForeignCountry", "XPATH|//select[@idit-label='City/Town/Foreign Country' and @title='City/Town/Foreign Country']");//Address Type Dropdown
        Contact_Objects.put("drpDwnPostCode", "XPATH|//select[@idit-label='Post Code' and @title='Post Code']");//PostCode Dropdown

        //Phone Number Details
        Contact_Objects.put("drpDwnTelephoneType", "XPATH|//select[@id='IDITForm@primaryTelephoneForDisplaytelephoneTypeId' and @idit-label='Telephone Type']");//TelephoneType Dropdown
        Contact_Objects.put("txtBoxDialingCode", "XPATH|//input[@idit-label='Dialing Code']");//Dialing Code TextBox
        Contact_Objects.put("txtBoxNumber", "XPATH|//input[@idit-label='Number']");//Number TextBox
        Contact_Objects.put("txtBoxRemarks", "XPATH|//input[@idit-label='Remarks']");//Remarks TextBox

        //Preferred Communication Channel
        Contact_Objects.put("drpDwnPreferredCommunicationChannel", "XPATH|//select[@id='deliveryTypeStyleId' and @idit-label='Preferred Communication Channel']");//Preferred Communication Channel Dropdown
        Contact_Objects.put("btnSelectPreferredDeliveryAddress", "XPATH|//span[@id='deliveryAddressStyleIdGoButtonGo']");//Preferred Delivery Address 3 Dots
        Contact_Objects.put("btnAddDeliveryAddress", "XPATH|//i[@class='fa fa-plus']");//Plus Sign
        Contact_Objects.put("drpDwnListEmailType", "XPATH|//select[@id='IDITForm@contactEmail|1@emailTypeVO@id']");//Email Type Dropdown
        Contact_Objects.put("txtBoxEmailAddress", "XPATH|//input[@title='E-mail Address']");//Email Address TextBox
        Contact_Objects.put("btnSelectDeliveryAddress", "XPATH|//button[@id='backFromDeliveryAddress']");//Delivery Address Select Button



        //***********   ADDRESSES  TAB   ***********

        Contact_Objects.put("tabAddresses", "XPATH|//li[@title='Addresses' and @aria-controls='AddressesTabContent']");//Addresses Tab
        Contact_Objects.put("labelAddresses", "XPATH|//div[@listname='IDITForm@contactAddress']//div[contains(text(),'Addresses')]");//Addresses Tab
        Contact_Objects.put("btnAddAddresses", "XPATH|(//i[@class='fa fa-plus'])[1]");//Add Addresses Plus Sign
        Contact_Objects.put("btnAddPhoneNumbers", "XPATH|(//i[@class='fa fa-plus'])[2]");//Add Phone Numbers Plus Sign
        Contact_Objects.put("btnAddContactEmail", "XPATH|(//i[@class='fa fa-plus'])[3]");//Add Contact Email Plus Sign
        Contact_Objects.put("dialogSapiensIDIT", "XPATH|//div[@class='ui-dialog ui-corner-all ui-widget ui-widget-content ui-front idit-target-floating-container ui-resizable']");//Sapiens IDIT DialogBox
        Contact_Objects.put ("txtSuburbSecondary", "XPATH|//input[@name='additionalInfo(contactAddressVO@SO003@addressVO@cityId_autocompleteSelectInputId)']");// Suburb Autocomplete Box
        Contact_Objects.put("btnOKAddressContainer", "XPATH|//button[@id='OKcontactAddressContainer']");//Address Container OK Button
        Contact_Objects.put("addressesTableCount", "XPATH|//table[@id='idit-grid-table-IDITForm_at_contactAddress_pipe_']//tr");//Addresses Table

        //***********   ADDITIONAL DATA  TAB   ***********

        //Additional Details
        Contact_Objects.put("tabAdditionalData", "XPATH|//li[@title='Additional data']");//Additional Data Tab
        Contact_Objects.put("drpDwnMaritalStatus", "XPATH|//select[@id='IDITForm@familyStatusVO@id']");//Marital Status Dropdown
        Contact_Objects.put("drpDwnOccupationStatus", "XPATH|//select[@id='IDITForm@occupationStatusABSAVO@id']");//Occupation Status Dropdown
        Contact_Objects.put("drpDwnOccupationCode", "XPATH|//select[@id='IDITForm@occupationCodeABSAVO@id']");//Occupation Code Dropdown
        Contact_Objects.put("drpDwnSourceOfIncome", "XPATH|//select[@id='IDITForm@incomeSourceABSAVO@id']");//Source Of Income Dropdown
        Contact_Objects.put("drpDwnEducation", "XPATH|//select[@id='IDITForm@educationVO@id']");//Education Dropdown
        Contact_Objects.put("drpDwnSICCode", "XPATH|//select[@id='IDITForm@sicCodeABSAVO@id']");//SIC Code Dropdown

        //Employer Information
        Contact_Objects.put("txtBoxEmployersName", "XPATH|//input[@id='IDITForm@employersName']");//Employers Name TextBox
        Contact_Objects.put("txtBoxEmployersAddressLine1", "XPATH|//input[@id='IDITForm@employersAddressLine']");//Employers Address Line 1 TextBox
        Contact_Objects.put("txtBoxEmployersCityTownForeignCountry", "XPATH|//input[@id='additionalInfo(employersCity_autocompleteSelectInputId)']");//Employers City/Town/Foreign Country Autocomplete Box
        Contact_Objects.put("drpDwnEmployersSuburbForeignTown", "XPATH|//select[@id='employerDistrict']");//Employers Suburb/Foreign Town Dropdown
        Contact_Objects.put("drpDwnEmployersPostCode", "XPATH|//select[@id='employersPostcode@id']");//Employers PostCode Dropdown

        //Identifiers
        Contact_Objects.put("btnIdentifierNew", "XPATH|//a[@id='IDITForm@contactIdentifier|New']//i[@class='fa fa-plus']");//New Identifier Button
        Contact_Objects.put("drpDwnListIdentifierIDType", "XPATH|//select[@id='IDITForm@contactIdentifier|1@idType@id']");//ID Type Dropdown
        Contact_Objects.put("txtBoxIdentifierIDNumber", "XPATH|//input[@id='IDITForm@contactIdentifier|1@idValue']");//ID Number TextBox

        //Passport Additional Details
        Contact_Objects.put("txtBoxDateIssued", "XPATH|//input[@id='IDITForm@dateIssued']");//Date Issued TextBox
        Contact_Objects.put("drpDwnPassportNationality", "XPATH|//select[@id='IDITForm@passportNationality@id']");//Passport Nationality Dropdown


        //***********   PAYMENT MEANS     ***********
        Contact_Objects.put("tabPaymentMeans", "XPATH|//li[@title='Payment Means']");//Payment Means Tab
        Contact_Objects.put("labelPaymentMeansDetails", "XPATH|//div[@title='Payment Means Details']");//Payment Means Details Label
        Contact_Objects.put("btnAddNewPaymentChannel", "XPATH|//a[@id='paymentChannelList|New']//i[@class='fa fa-plus']");//Add New Payment Channel
        Contact_Objects.put("bankAccountContainer", "XPATH|//div[@aria-describedby='bankAccountContainerFloatingDivDiv']");//Bank Account Container
        Contact_Objects.put("drpDwnAccountType", "XPATH|//select[@id='bankAccountPopUpVO@bankAccount@bankAccountTypeABSAVO']");//Account Type Dropdown
        Contact_Objects.put("txtBoxAccountHolderSurname", "XPATH|//input[@id='bankAccountPopUpVO@bankAccount@accountHolderSurname']");//Account Holder Surname TextBox
        Contact_Objects.put("txtBoxAccountHolderInitials", "XPATH|//input[@id='bankAccountPopUpVO@bankAccount@accountHolderInitials']");//Account Holder Initials TextBox
        Contact_Objects.put("drpDwnBankName", "XPATH|//select[@id='bankAccountPopUpVO@bankAccount@bankNameABSAVO']");//Bank Name Dropdown
        Contact_Objects.put("txtBoxBankAccountNumber", "XPATH|//input[@id='bankAccountPopUpVO@bankAccount@accountNr']");//Bank Account Number TextBox
        Contact_Objects.put("btnValidate", "XPATH|//button[@id='bankAccountPopUpVO@bankAccount@validate']");//Validate Button
        Contact_Objects.put("drpDwnValueVerificationStatus", "XPATH|//div[@id='s2id_bankAccountPopUpVO@bankAccountVerificationStatusVO@id']//span[@class='select2-chosen']");//Verification Status Dropdown Selected Value
        Contact_Objects.put("paymentChannelTableCount", "XPATH|//table[@id='idit-grid-table-paymentChannelList_pipe_']//tr");//Payment Channel Table
        Contact_Objects.put("txtAreaRemarks", "XPATH|//div[@class='field-container col1 row2 col2 row1 nbColumn4']//textarea[@id='bankAccountPopUpVO@bankAccount@remarks']");//Remarks Text Area
        Contact_Objects.put("btnOKBankAccountContainer", "XPATH|//button[@id='OKbankAccountContainer']");//Bank Account Container OK Button
        Contact_Objects.put("drpDwnVerificationStatus", "XPATH|//select[@id='bankAccountPopUpVO@bankAccountVerificationStatusVO@id']");//Verification Status Dropdown Selected Value
        Contact_Objects.put("txtBoxCompanyRegNo", "XPATH|//input[@id='bankAccountPopUpVO@bankAccount@idCompanyRegNo']");//ID Company Reg No TextBox

//***********   UPDATE CONTACT     ***********


        Contact_Objects.put("labelContactName", "XPATH|//div[@class='idit-dashboard-panels-row']/div[@class='idit-title SectionTitle ']");//Contact Name Label
        Contact_Objects.put("labelContactNumber", "XPATH|//label[@id='IDITForm@primaryTelephone@formattedPhoneNumer']");//Contact Number Label
        Contact_Objects.put("btnUpdateContact", "XPATH|//a[@id='UpdateContactNewGen_Link']");//Update Contact Button
        Contact_Objects.put("btnUpdatePhoneNumber", "XPATH|//a[@id='IDITForm@contactTelephone|Update']");//Update Update Phone Number Button
        Contact_Objects.put("labelPhoneNumber", "XPATH|//div[@listname='IDITForm@contactTelephone']//tr[@class='jqgrow ui-row-ltr ui-widget-content']");//Phone Number Row
        Contact_Objects.put("txtBoxContactNumber", "XPATH|//input[@id='contactTelephoneVOtelephoneNumberId']");//Contact Number TextBox
        Contact_Objects.put("btnOKcontactPhoneContainer", "XPATH|//button[@id='OKcontactPhoneContainer']");//OK Button
        Contact_Objects.put("labelMaintainEvent", "XPATH|//form[@id='IDITFormId']/div[contains(text(),'Maintain Event')]");//Maintain Event Label


        Contact_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        Contact_Objects.put("tabPrimaryDetails", "XPATH|//li[@title='Primary details' and @aria-controls='GeneralDetailsContent']");//Primary Details Tab
        Contact_Objects.put("btnFinish", "XPATH|//button[@id='Finish']");//Finish Button
        Contact_Objects.put("dialogContactConfirmation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Contact Creation Dialog Box
        Contact_Objects.put("btnOKContactCreation", "XPATH|//button[@id='Ok']");//OK Button on Contact Creation Dialog Box

        //**** Update Bank Details ******//
        Contact_Objects.put("btnAction", "XPATH|//a[@id='ActionsLink']");//Action
        Contact_Objects.put("btnUpdatePaymentMeans", "XPATH|//a[@id='childUpdateBankAccounts_Link']");//Update Bank account Details
        Contact_Objects.put("labelExistingBankAccount", "XPATH|//td[@aria-describedby='idit-grid-table-paymentChannelList_pipe__isActive']");//click on Existing bank account
        Contact_Objects.put("btnPlus", "XPATH|//i[@class='fa fa-plus']");//Plus button

        WebDr.page_Objects = Contact_Objects ;
    }
}
