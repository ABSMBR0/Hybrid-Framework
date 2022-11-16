package sapiens.policies.absavalueplus;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class AbsaValuePlus_Mappings {

    public static void AbsaValuePlus_Factory(){

        Map<String, String> AbsaValuePlus_Objects = new HashMap<>();

        AbsaValuePlus_Objects.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        AbsaValuePlus_Objects.put("linkRecentContacts", "XPATH|(//div[@id='userRecentContactsListAddInfo|']//li)[1]");//First Recent Contact Link
        AbsaValuePlus_Objects.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab

        //***********   GENERAL DETAILS   ***********

        //General Details
        AbsaValuePlus_Objects.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//New Proposal Link
        AbsaValuePlus_Objects.put("labelGeneralDetails", "XPATH|//div[contains(text(),'General Details')]");//General Details Heading
        AbsaValuePlus_Objects.put("drpDwnProductName", "XPATH|//select[@id='Product']");//Product Name Dropdown
        AbsaValuePlus_Objects.put("drpDwnProductCode", "XPATH|//select[@id='IDITForm@avafProdABSAJDOBean@id']");//AVAF Product Code Dropdown
        AbsaValuePlus_Objects.put("drpDwnMembership", "XPATH|//select[@id='IDITForm@affinityVO@id']");//Membership Dropdown
        AbsaValuePlus_Objects.put("drpDwnPolicyType", "XPATH|//select[@id='IDITForm@policyPeriodTypeABSAVO@id']");//Policy Type Dropdown
        AbsaValuePlus_Objects.put("txtBoxOldPolicyNumber", "XPATH|//input[@id='IDITForm@migratedPolicyNumber']");//Old Policy Number TextBox
        AbsaValuePlus_Objects.put("txtBoxExternalReferenceNumber", "XPATH|//input[@id='IDITForm@externalReferenceNumber']");//External Reference Number TextBox
        AbsaValuePlus_Objects.put("drpDwnSalesForceOpportunityID", "XPATH|//select[@id='IDITForm@salesForceOpportunity']");//SalesForce Opportunity ID Dropdown
        AbsaValuePlus_Objects.put("drpDwnBranchCode", "XPATH|//select[@id='branchCodeRegion']");//Branch Code Dropdown
        AbsaValuePlus_Objects.put("drpDwnSource", "XPATH|//select[@id='source']");//Source Dropdown
        AbsaValuePlus_Objects.put("drpDwnStaffIndicator", "XPATH|//select[@id='staffIndicator']");//Staff Indicator Dropdown

        //Intermediary
        AbsaValuePlus_Objects.put("drpDwnListIntermediaryName", "XPATH|//select[@id='agentsList|1@contactVO@id']");//Intermediary Name Dropdown

        //Sales Transaction Channel
        AbsaValuePlus_Objects.put("drpDwnCurrentSalesChannel", "XPATH|//select[@id='IDITForm@currentChannelVO@id']");//Current Sales Channel Dropdown

        //Proposal Questionnaire
        AbsaValuePlus_Objects.put("drpDwnQuestion", "XPATH|//select[@id='1000003@1000245']");//Are you a Staff member? Dropdown


        //***********   MAINTAIN  POLICY  LINE OF BUSINESS   ***********

        AbsaValuePlus_Objects.put("labelMotorRiskObjectDetails", "XPATH|//div[contains(text(),'Motor Risk Object Details')]");//Motor Risk Object Details Heading

        //Identifiers
        AbsaValuePlus_Objects.put("labelVehicleChassis", "XPATH|//td[@title='Vehicle ID No/Chassis No']");//Vehicle ID No/Chassis No Label
        AbsaValuePlus_Objects.put("txtBoxVehicleID", "XPATH|//input[@id='assetIdentifierValueId']");//VehicleID/Chassis No TextBox
        AbsaValuePlus_Objects.put("btnIdentifierUpdate", "XPATH|//button[@id='assetIdentifierVOListTablePanelDivUpdateButton']");//Update Button

        //Vehicle Primary Details
        AbsaValuePlus_Objects.put("drpDwnMMCodeForVehicle", "XPATH|//select[@id='mMCodeForVehicle']");//Mead & Mcgrouther Code Dropdown
        AbsaValuePlus_Objects.put("drpDwnYearOfManufacture", "XPATH|//select[@id='yearOfMan']");//Year of Manufacture Dropdown
        AbsaValuePlus_Objects.put("txtBoxLoanAmount", "XPATH|//input[@id='IDITForm@loanAmount']");//Loan Amount TextBox
        AbsaValuePlus_Objects.put("labelMMCodeForVehicle", "XPATH|//div[@id='s2id_mMCodeForVehicle']");//Loan Amount TextBox
        AbsaValuePlus_Objects.put("txtBoxMMCodeForVehicle", "XPATH|//input[@id='s2id_autogen5_search']");//Loan Amount TextBox
        AbsaValuePlus_Objects.put("resultMMCodeForVehicle", "XPATH|//div[@class='select2-result-label']");//Loan Amount TextBox
        AbsaValuePlus_Objects.put("labelCoverSelection", "XPATH|//div[@title='Cover selection']");//Cover Selection Heading
        AbsaValuePlus_Objects.put("btnEndCoversSelection", "XPATH|//button[@id='Finish' and @title='End covers selection']");//End Covers Selection Button
        AbsaValuePlus_Objects.put("txtBoxOutstandingBalance", "XPATH|//input[@id='outstandingBalance']");//Outstanding Balance TextBox


        //***********   PAYMENTS DETAILS   ***********

        AbsaValuePlus_Objects.put("labelPayments", "XPATH|//div[@title='Payments']");//Payments Heading
        AbsaValuePlus_Objects.put("drpDwnPreferredDueDay", "XPATH|//select[@id='installmentDueDay']");//Preferred Due Day Dropdown
        AbsaValuePlus_Objects.put("drpDwnDecision", "XPATH|//select[@id='Decision']");//Decision Dropdown
        AbsaValuePlus_Objects.put("drpDwnPolicyBankAccount", "XPATH|//select[@id='localPolicyVO@policyBankAccount']");//Policy Bank Account Dropdown
        AbsaValuePlus_Objects.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        AbsaValuePlus_Objects.put("dialogPolicyCreation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Policy Creation Dialog
        AbsaValuePlus_Objects.put("txtPolicyNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Policy Creation Dialog Text
        AbsaValuePlus_Objects.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        AbsaValuePlus_Objects.put("btnOK", "XPATH|//button[@id='Ok']");//OK Button
        AbsaValuePlus_Objects.put("dialogGD1000079", "XPATH|//div[@id='BasicNotificationDialog']");//GD1000079 dialog box
        AbsaValuePlus_Objects.put("labelUnknownAddressee", "XPATH|//table[@id='idit-grid-table-flattendListdocumentsTreeList_pipe_']//span[contains(text(),'Unknown Addressee')]");//Maintain Event Heading
        AbsaValuePlus_Objects.put("btnDelete", "XPATH|//a[@id='flattendListdocumentsTreeList|Delete']/i");//Delete Button
        AbsaValuePlus_Objects.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        AbsaValuePlus_Objects.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button


        AbsaValuePlus_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        AbsaValuePlus_Objects.put("btnFinish", "XPATH|//button[@id='Finish' and @title='Finish']");//Finish Button

        WebDr.page_Objects = AbsaValuePlus_Objects ;

    }
}
