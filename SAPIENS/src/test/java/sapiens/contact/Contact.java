package sapiens.contact;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import sapiens.searches.Searches_Mappings;
import utility.ConfigManager;
import utility.WebDr;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.slf4j.LoggerFactory.getLogger;

public class Contact extends WebDr {

    private static final Logger logger = getLogger(Contact.class);

    String IDType = getValue("ID_Type");
    public int age = ThreadLocalRandom.current().nextInt(18, 70);
    public String gender = (ThreadLocalRandom.current().nextInt(1000, 9999) >= 5000 ? "Male" : "Female");
    String ID_Number = GenRSAID(age, gender);
    String passportNumber = genPassportID(10);
    String legalType = getValue("Legal_Type");
    String surName = getValue("Sur_Name");
    String firstName = getValue("First_Name");
    String initials = getValue("Initials");
    String clientGroup = getValue("Client_Group");
    String clientType = getValue("Client_Type");
    String contactDOB = generateDOB(age);
    String title = getValue("Title");
    String addressTypePrimary = getValue("Address_Type_Primary");
    String addressLine1 = getValue("AddressLine_1");
    String addressLine2 = getValue("AddressLine_2");
    String suburb = getValue("Suburb/Foreign_Town");
    String cityTownForeignCountry = getValue("CityTownForeignCountry");
    String postCode = getValue("Post_Code");
    String telephoneType = getValue("Telephone_Type");
    String dialingCode = getValue("Dialing_Code");
    String number = getValue("Number");
    String preferredCommunicationChannel = getValue("Preferred_Communication_Channel");
    String preferredDeliveryAddressType = getValue("Preferred_Delivery_Address_Type");
    String eMailAddress = getValue("EMail_Address");
    String addressTypeSecondary = getValue("Address_Type_Secondary");
    String maritalStatus = getValue("Marital_Status");
    String occupationStatus = getValue("Occupation_Status");
    String occupationCode = getValue("Occupation_Code");
    String sourceOfIncome = getValue("Source_Of_Income");
    String education = getValue("Education");
    String SICCode = getValue("SIC_Code");
    String employersName = getValue("Employers_Name");
    String passportNationality = getValue("PassportNationality");
    String accountType = getValue("Account_Type");
    String bankName = getValue("Bank_Name");
    String bankAccountNumber = getValue("Bank_Account_Number");



    public Contact(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    /**
     * Method to capture General Details of a Contact
     */
    public void generalDetails() {

        Contact_Mappings.Contact_Factory();

        try {
            if (exists("drpDwnNewMainMenu", true, "New Drop Down Exists")) {
                click("drpDwnNewMainMenu", "Click New Drop Down");
                if (exists("linkNewContact", true, "New Contact Link Exists")) {
                    click("linkNewContact", "Click New Contact");
                    if (exists("linkGeneralDetails", true, "General Details Link Exists")) {
                        selectValueFromDropdown("drpDwnLegalType", "text", legalType, "Select Legal Type");
                        selectValueFromDropdown("drpDwnIDType", "text", IDType, "Select ID Type");
                        switch (IDType) {
                            case "ID Number":
                                setText("txtBoxIDNumber", ID_Number, "ID Number");
                                break;
                            case "Passport Number":
                                setText("txtBoxIDNumber", passportNumber, "Passport Number");
                                break;
                            case "Registration Number":
                                setText("txtBoxIDNumber", ID_Number, "Registration Number");
                                break;
                            case "STI PAS Migration":
                                setText("txtBoxIDNumber", ID_Number, "STI PAS Migration");
                                break;
                            case "Vendor ID":
                                setText("txtBoxIDNumber", ID_Number, "Vendor ID");
                                break;
                        }
                        setText("txtBoxSurName", surName, "Enter Sur/Organization Name");
                        setText("txtBoxFirstName", firstName, "Enter First Name");
                        setText("txtBoxInitials", initials, "Enter Initials");
                        selectValueFromDropdown("drpDwnClientGroup", "text", clientGroup, "Select Client Group");
                        selectValueFromDropdown("drpDwnClientType", "text", clientType, "Select Client Type");
                        setText("txtBoxDOB", contactDOB, "Enter Contact DOB");
                        selectValueFromDropdown("drpDwnTitle", "text", title, "Enter Title");
                        selectValueFromDropdown("drpDwnGender", "text", gender, "Select Gender");
                        String primaryAddressValue = getText("valueDrpDwnAddressType", "Address Type Default Value");
                        if (!addressTypePrimary.equalsIgnoreCase(primaryAddressValue)) {
                            selectValueFromDropdown("drpDwnAddressType", "text", addressTypePrimary, "Select Address Type");
                        }
                        setText("txtBoxAddressLine1", addressLine1, "Enter Address Line 1");
                        setText("txtBoxAddressLine2", addressLine2, "Enter Address Line 2");
                        selectValueFromAutoComplete("txtSuburbPrimary", suburb, "Enter Suburb");
                        selectValueFromDropdown("drpDwnCityTownForeignCountry", "text", cityTownForeignCountry, "Select City/Town/Foreign Country");
                        selectValueFromDropdown("drpDwnPostCode", "text", postCode, "Select Post Code");
                        selectValueFromDropdown("drpDwnTelephoneType", "text", telephoneType, "Select Telephone Type");
                        setText("txtBoxDialingCode", dialingCode, "Enter Dialing Code");
                        setText("txtBoxNumber", number, "Enter Number");
                        selectValueFromDropdown("drpDwnPreferredCommunicationChannel", "text", preferredCommunicationChannel, "Select Preferred Communication Channel");
                        click("btnSelectPreferredDeliveryAddress", "Click 3 dots to Select Preferred Delivery Address");
                        click("btnAddDeliveryAddress", "Click Add Button");
                        selectValueFromDropdown("drpDwnListEmailType", "text", preferredDeliveryAddressType, "Select Telephone Type");
                        setText("txtBoxEmailAddress", eMailAddress, "Enter Email Address");
                        click("btnSelectDeliveryAddress", "Click Select Button");
                        click("btnNext", "Click Next Button");
                        if (exists("tabPrimaryDetails", true, "Primary Details Tab Exists")) {
                            logger.info("General Details Captured Successfully");
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in General Details is : " + e);
        }
    }

    /**
     * Method to capture Addresses of a Contact
     */
    public void addresses() {

        Contact_Mappings.Contact_Factory();

        try {
            if (exists("tabAddresses", true, "Addresses Tab")) {
                click("tabAddresses", "Click Addresses Tab");
                if (exists("labelAddresses", true, "Addresses Section Exists")) {
                    click("btnAddAddresses", "Click Add New Address Button");
                    if (exists("dialogSapiensIDIT", true, "Sapiens IDIT Dialog Box")) {
                        if (!addressTypePrimary.equalsIgnoreCase(addressTypeSecondary)) {
                            selectValueFromDropdown("drpDwnAddressType", "text", addressTypeSecondary, "Select Address Type");
                            setText("txtBoxAddressLine1", addressLine1, "Enter Address Line 1");
                            setText("txtBoxAddressLine2", addressLine2, "Enter Address Line 2");
                            selectValueFromAutoComplete("txtSuburbSecondary", suburb, "Enter Suburb");
                            selectValueFromDropdown("drpDwnCityTownForeignCountry", "text", cityTownForeignCountry, "Select City/Town/Foreign Country");
                            selectValueFromDropdown("drpDwnPostCode", "text", postCode, "Select Post Code");
                            click("btnOKAddressContainer", "Click OK Button");
                            if (getElements("addressesTableCount").size() > 2) {
                                logger.info("Secondary Address Captured Successfully");
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Addresses is : " + e);
        }
    }

    /**
     * Method to capture Additional Data of a Contact
     */
    public void additionalData() {

        Contact_Mappings.Contact_Factory();

        try {
            if (exists("tabAdditionalData", true, "Additional Data Tab")) {
                click("tabAdditionalData", "Click Additional Data Tab");
                //Additional Details
                selectValueFromDropdown("drpDwnMaritalStatus", "text", maritalStatus, "Select Marital Status");
                selectValueFromDropdown("drpDwnOccupationStatus", "text", occupationStatus, "Select Occupation Status");
                selectValueFromDropdown("drpDwnOccupationCode", "text", occupationCode, "Select Occupation COde");
                selectValueFromDropdown("drpDwnSourceOfIncome", "text", sourceOfIncome, "Select Source Of Income");
                selectValueFromDropdown("drpDwnEducation", "text", education, "Select Education");
                selectValueFromDropdown("drpDwnSICCode", "text", SICCode, "Select SIC Code");
                //Employer Information
                setText("txtBoxEmployersName", employersName, "Enter Employers Name");
                setText("txtBoxEmployersAddressLine1", addressLine1, "Enter Employers Address Line 1");
                selectValueFromAutoComplete("txtBoxEmployersCityTownForeignCountry", suburb, "Enter Employers City/Town/Foreign Country");
                selectValueFromDropdown("drpDwnEmployersSuburbForeignTown", "text", cityTownForeignCountry, "Select Employers Suburb/Foreign Town");
                selectValueFromDropdown("drpDwnEmployersPostCode", "text", postCode, "Select Employers PostCode");
                //Identifiers
//                click("btnIdentifierNew","Click Add Identifier Button");
//                selectValueFromDropdown("drpDwnListIdentifierIDType", "text", IDType, "Select Identifier ID Type");
//                click("txtBoxIdentifierIDNumber","Click");
//                setText("txtBoxIdentifierIDNumber", ID_Number, "Enter Identifier ID Number");
                //Passport Additional Details
                setText("txtBoxDateIssued", getCurrentDate(), "Enter Passport Date Issued");
                selectValueFromDropdown("drpDwnPassportNationality", "text", passportNationality, "Select Passport Nationality");
                if (exists("tabPaymentMeans", true, "Payment Means Tab Exists")) {
                    click("tabPaymentMeans", "Click Payment Means Tab");
                    if (exists("labelPaymentMeansDetails", true, "Payment Means Details Exists"))
                        logger.info("Additional Data Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Additional Data is : " + e);
        }
    }

    /**
     * Method to capture Payment Means of a Contact
     */
    public void paymentMeans() {

        Contact_Mappings.Contact_Factory();

        try {
            if (exists("labelPaymentMeansDetails", true, "Payment Means Details Exists")) {
                click("btnAddNewPaymentChannel", "Click Add New Payment Channel Button");
                if (exists("bankAccountContainer", true, "Sapiens IDIT Dialog Box")) {
                    selectValueFromDropdown("drpDwnAccountType", "text", accountType, "Select Account Type");
                    setText("txtBoxAccountHolderSurname", surName, "Enter Account Holder Surname");
                    setText("txtBoxAccountHolderInitials", initials, "Enter Account Holder Initials");
                    selectValueFromDropdown("drpDwnBankName", "text", bankName, "Select Bank Name");
                    setText("txtBoxBankAccountNumber", bankAccountNumber, "Enter Bank Account Number");
//                    setText("txtBoxCompanyRegNo", "YTR665454", "Enter Bank Account Number");
                    click("btnValidate", "Click Validate Button");
                    Thread.sleep(5000);
                    String validationStatus = getText("drpDwnValueVerificationStatus", "Get Validation Status");
                    if (!(validationStatus.equalsIgnoreCase("Verified"))) {
                        selectValueFromDropdown("drpDwnVerificationStatus", "text", "Verified", "Select Validation Status");
                    }
                    getElement("txtAreaRemarks").clear();
                    click("btnOKBankAccountContainer", "Click OK Button");
                    if (getElements("paymentChannelTableCount").size() > 1) {
                            logger.info("Payment Details Captured Successfully");
                            click("btnFinish", "Click Finish Button");
                            if (exists("dialogContactConfirmation", true, "Contact Creation Dialog Box")) {
                                click("btnOKContactCreation", "Click OK Button on Contact Creation Dialog Box");
                                if (exists("tabContactDashboard", true, "Contact Dashboard Exists")) {
                                    logger.info("Contact " + firstName + " " + initials + " " + surName + " Created Successfully");
                                }
                            }
                        }
//                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Payment Means is : " + e);
        }
    }

    /**
     * Method to update Existing Contact Info
     **/
    public void updateContact() {

        Contact_Mappings.Contact_Factory();

        try {
            String contactName = getText("labelContactName", "Contact Name").trim();
            if (contactName.contains(firstName + " " + initials + " " + surName)) {
                String oldContactNumber = getText("labelContactNumber", "Contact Number").trim();
                click("btnUpdateContact", "Click Update Contact");
                if (exists("tabPrimaryDetails", true, "Primary Details Tab Exists")) {
                    click("tabAddresses", "Click Addresses Tab");
                    click("labelPhoneNumber", "Click Active Phone Number");
                    click("btnUpdatePhoneNumber", "Click Update Phone Number");
                    if (exists("dialogSapiensIDIT", true, "Sapiens IDIT Dialog Box")) {
                        Random rnd = new Random();
                        int number = 1000000 + rnd.nextInt(9000000);
                        String newNumber = "065" + number;
                        setText("txtBoxContactNumber", newNumber, "Enter Contact Number");
                        click("btnOKcontactPhoneContainer", "Click OK");
                        click("btnFinish", "Click Finish");
                        if (exists("labelMaintainEvent", true, "Maintain Event Heading")){
                            click("btnFinish", "Click Finish");
                            if (exists("dialogContactConfirmation", true, "Contact Creation Dialog Box")) {
                                click("btnOKContactCreation", "Click OK Button on Contact Creation Dialog Box");
                                String updatedContactNumber = getText("labelContactNumber", "Contact Number").trim();
                                if (updatedContactNumber.equals("027 - " + newNumber)){
                                    logger.info("Contact Updated Successfully");
                                }

                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.error("Exception in Update Contact is : " + e);
        }

    }

    /**
     * Method to select recently created Contact for a Policy
     */
    public void selectRecentContact() {

        Contact_Mappings.Contact_Factory();

        try {
            if (exists("imgHome", true, "Home Image Exists")) {
                click("linkRecentContacts", "Select Contact");
                if (exists("tabContactDashboard", true, "Contact Dashboard Exists")) {
                    logger.info("Contact Selected Successfully");
                }
            }
        } catch (Exception e) {
            logger.error("Exception in Select Recent Contact is : " + e);
        }
    }

    public void updateBankDetails() {

        Searches_Mappings.Searches_Factory();

        try {
            click("btnAction", "Click on Actions");
            click("btnUpdatePaymentMeans","Click on Update Bank account details");
            Thread.sleep(5000);
            click("labelExistingBankAccount","Click on Existing bank account");
            click("btnPlus","Click on plus to edit Existing bank account");
            if (exists("bankAccountContainer", true, "Sapiens IDIT Dialog Box")) {
                selectValueFromDropdown("drpDwnAccountType", "text", accountType, "Select Account Type");
                setText("txtBoxAccountHolderSurname", surName, "Enter Account Holder Surname");
                setText("txtBoxAccountHolderInitials", initials, "Enter Account Holder Initials");
                selectValueFromDropdown("drpDwnBankName", "text", bankName, "Select Bank Name");
                setText("txtBoxBankAccountNumber", bankAccountNumber, "Enter Bank Account Number");
                click("btnValidate", "Click Validate Button");
                Thread.sleep(5000);
                String validationStatus = getText("drpDwnValueVerificationStatus", "Get Validation Status");
                if (!(validationStatus.equalsIgnoreCase("Verified"))) {
                    selectValueFromDropdown("drpDwnVerificationStatus", "text", "Verified", "Select Validation Status");
                }
                getElement("txtAreaRemarks").clear();
                click("btnOKBankAccountContainer", "Click OK Button");
                if (getElements("paymentChannelTableCount").size() > 1) {
                    logger.info("Payment Details Updated Successfully");
                    click("btnFinish", "Click Finish Button");
                }
            }

        } catch (Exception e) {
            logger.info("Exception in Update bank account details is : " + e);
        }
    }
}
