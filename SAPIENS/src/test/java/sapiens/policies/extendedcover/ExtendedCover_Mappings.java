package sapiens.policies.extendedcover;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class ExtendedCover_Mappings {

    public static void ExtendedCover_Factory(){

        Map<String, String> ExtendedCover_Objects = new HashMap<>();

        ExtendedCover_Objects.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        ExtendedCover_Objects.put("linkRecentContacts", "XPATH|(//div[@id='userRecentContactsListAddInfo|']//li)[1]");//First Recent Contact Link
        ExtendedCover_Objects.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab

        //***********   GENERAL DETAILS   ***********

        //General Details
        ExtendedCover_Objects.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//New Proposal Link
        ExtendedCover_Objects.put("labelGeneralDetails", "XPATH|//div[contains(text(),'General Details')]");//General Details Heading
        ExtendedCover_Objects.put("drpDwnProductName", "XPATH|//select[@id='Product']");//Product Name Dropdown
        ExtendedCover_Objects.put("drpDwnProductCode", "XPATH|//select[@id='IDITForm@avafProdABSAJDOBean@id']");//AVAF Product Code Dropdown
        ExtendedCover_Objects.put("drpDwnMembership", "XPATH|//select[@id='IDITForm@affinityVO@id']");//Membership Dropdown
        ExtendedCover_Objects.put("drpDwnPolicyType", "XPATH|//select[@id='IDITForm@policyPeriodTypeABSAVO@id']");//Policy Type Dropdown
        ExtendedCover_Objects.put("txtBoxOldPolicyNumber", "XPATH|//input[@id='IDITForm@migratedPolicyNumber']");//Old Policy Number TextBox
        ExtendedCover_Objects.put("txtBoxExternalReferenceNumber", "XPATH|//input[@id='IDITForm@externalReferenceNumber']");//External Reference Number TextBox
        ExtendedCover_Objects.put("drpDwnSalesForceOpportunityID", "XPATH|//select[@id='IDITForm@salesForceOpportunity']");//SalesForce Opportunity ID Dropdown
        ExtendedCover_Objects.put("drpDwnBranchCode", "XPATH|//select[@id='branchCodeRegion']");//Branch Code Dropdown
        ExtendedCover_Objects.put("drpDwnSource", "XPATH|//select[@id='source']");//Source Dropdown
        ExtendedCover_Objects.put("drpDwnStaffIndicator", "XPATH|//select[@id='staffIndicator']");//Staff Indicator Dropdown

        //Intermediary
        ExtendedCover_Objects.put("drpDwnListIntermediaryName", "XPATH|//select[@id='agentsList|1@contactVO@id']");//Intermediary Name Dropdown

        //Sales Transaction Channel
        ExtendedCover_Objects.put("drpDwnCurrentSalesChannel", "XPATH|//select[@id='IDITForm@currentChannelVO@id']");//Current Sales Channel Dropdown

        //Proposal Questionnaire
        ExtendedCover_Objects.put("drpDwnQuestion", "XPATH|//select[@id='1000003@1000245']");//Are you a Staff member? Dropdown


        //***********   MAINTAIN  POLICY  LINE OF BUSINESS   ***********

        ExtendedCover_Objects.put("labelMotorRiskObjectDetails", "XPATH|//div[contains(text(),'Motor Risk Object Details')]");//Motor Risk Object Details Heading

        //Identifiers
        ExtendedCover_Objects.put("labelVehicleChassis", "XPATH|//td[@title='Vehicle ID No/Chassis No']");//Vehicle ID No/Chassis No Label
        ExtendedCover_Objects.put("txtBoxVehicleID", "XPATH|//input[@id='assetIdentifierValueId']");//VehicleID/Chassis No TextBox
        ExtendedCover_Objects.put("btnIdentifierUpdate", "XPATH|//button[@id='assetIdentifierVOListTablePanelDivUpdateButton']");//Update Button

        //Vehicle Primary Details
        ExtendedCover_Objects.put("drpDwnMMCodeForVehicle", "XPATH|//select[@id='mMCodeForVehicle']");//Mead & Mcgrouther Code Dropdown
        ExtendedCover_Objects.put("drpDwnYearOfManufacture", "XPATH|//select[@id='yearOfMan']");//Year of Manufacture Dropdown
        ExtendedCover_Objects.put("txtBoxLoanAmount", "XPATH|//input[@id='IDITForm@loanAmount']");//Loan Amount TextBox
        ExtendedCover_Objects.put("labelMMCodeForVehicle", "XPATH|//div[@id='s2id_mMCodeForVehicle']");//Loan Amount TextBox
        ExtendedCover_Objects.put("txtBoxMMCodeForVehicle", "XPATH|//input[@id='s2id_autogen5_search']");//Loan Amount TextBox
        ExtendedCover_Objects.put("resultMMCodeForVehicle", "XPATH|//div[@class='select2-result-label']");//Loan Amount TextBox
        ExtendedCover_Objects.put("labelCoverSelection", "XPATH|//div[@title='Cover selection']");//Cover Selection Heading
        ExtendedCover_Objects.put("btnEndCoversSelection", "XPATH|//button[@id='Finish' and @title='End covers selection']");//End Covers Selection Button
        ExtendedCover_Objects.put("txtBoxOutstandingBalance", "XPATH|//input[@id='outstandingBalance']");//Outstanding Balance TextBox


        //***********   PAYMENTS DETAILS   ***********

        ExtendedCover_Objects.put("labelPayments", "XPATH|//div[@title='Payments']");//Payments Heading
        ExtendedCover_Objects.put("drpDwnPreferredDueDay", "XPATH|//select[@id='installmentDueDay']");//Preferred Due Day Dropdown
        ExtendedCover_Objects.put("drpDwnDecision", "XPATH|//select[@id='Decision']");//Decision Dropdown
        ExtendedCover_Objects.put("drpDwnPolicyBankAccount", "XPATH|//select[@id='localPolicyVO@policyBankAccount']");//Policy Bank Account Dropdown
        ExtendedCover_Objects.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        ExtendedCover_Objects.put("dialogPolicyCreation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Policy Creation Dialog
        ExtendedCover_Objects.put("txtPolicyNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Policy Creation Dialog Text
        ExtendedCover_Objects.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        ExtendedCover_Objects.put("btnOK", "XPATH|//button[@id='Ok']");//OK Button
        ExtendedCover_Objects.put("dialogGD1000079", "XPATH|//div[@id='BasicNotificationDialog']");//GD1000079 dialog box
        ExtendedCover_Objects.put("labelUnknownAddressee", "XPATH|//table[@id='idit-grid-table-flattendListdocumentsTreeList_pipe_']//span[contains(text(),'Unknown Addressee')]");//Maintain Event Heading
        ExtendedCover_Objects.put("btnDelete", "XPATH|//a[@id='flattendListdocumentsTreeList|Delete']/i");//Delete Button
        ExtendedCover_Objects.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        ExtendedCover_Objects.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button


        ExtendedCover_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        ExtendedCover_Objects.put("btnFinish", "XPATH|//button[@id='Finish' and @title='Finish']");//Finish Button

        WebDr.page_Objects = ExtendedCover_Objects ;

    }
}
