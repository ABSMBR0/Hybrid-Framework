package sapiens.searches;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Searches_Mappings {

    public static void Searches_Factory(){

        Map<String, String> Searches_Objects = new HashMap<>();

        Searches_Objects.put("imgHome", "XPATH|//div[@class='homeImgDiv']");//Home Image
        Searches_Objects.put("labelSearch", "XPATH|//b[normalize-space()='Search']");//Search Label
        Searches_Objects.put("drpDwnFind", "XPATH|//select[@id='finderKeySelect']");//Find Dropdown
        Searches_Objects.put("btnShowAdditionalDetails", "XPATH|//div[@id='showHiedAllFieldsButton']");//Show Additional Details Button
        Searches_Objects.put("headerSearchByPolicy/ProposalDetails", "XPATH|//header[@title='Search by Policy/Proposal Details']");//Search by Policy/Proposal Details Button
        Searches_Objects.put("txtBoxPolicyNumber", "XPATH|//input[@id='IDITForm@policyNumber']");//Policy Number TextBox
        Searches_Objects.put("btnFind", "XPATH|//button[@id='homepageButtonsB_Search']");//Find Button

        Searches_Objects.put("labelProductName", "XPATH|//label[@id='additionalInfo(productId)']");//Product name
        Searches_Objects.put("labelPolicyStatus", "XPATH|//label[@id='IDITForm@policyStatusPresentation']");//Policy status
        Searches_Objects.put("labelInceptionDate", "XPATH|//label[@id='IDITForm@policyHeaderVO@sales1Date']");//Inception Date

        Searches_Objects.put("btnAction", "XPATH|//a[@id='ActionsLink']");//Action
        Searches_Objects.put("btnPolicyCancellation", "XPATH|//a[@id='createPolicyCancellation_Link']");//Policy Cancellation

        Searches_Objects.put("drpDwnCancelInitiator", "XPATH|//span[@id='select2-chosen-1']");//Cancel Initiator
        Searches_Objects.put("drpDwnCancellationType", "XPATH|//span[@id='select2-chosen-2']");//Cancellation type
        Searches_Objects.put("btnPlusEndorsementReason", "XPATH|//i[@class='fa fa-plus']");// Plus button
        Searches_Objects.put("drpDwnCategory", "XPATH|//span[@id='select2-chosen-3']");//Cancellation Category
        Searches_Objects.put("drpDwnReason", "XPATH|//span[@id='select2-chosen-4']");//Reason for Cancellation
        Searches_Objects.put("txtDescription", "XPATH|//textarea[@id='endorsmentReasonVORowVO@remarks']");//Text Description
        Searches_Objects.put("btnUpdate", "XPATH|//button[@id='endorsmentReasonVOTablePanelDivUpdateButton']");//Update button
        Searches_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next button
        Searches_Objects.put("btnFinish", "XPATH|//button[@id='Finish']");//Finish button
        Searches_Objects.put("dialogPolicyCancellation", "XPATH| //div[@class='ConfirmationPageMessageDiv']");//Dialog Policy cancellation
        Searches_Objects.put("btnOKPolicyCancel", "XPATH|//button[@id='Ok']");//OK Button on Policy Cancel Dialog Box

        Searches_Objects.put("btnRevive", "XPATH|//a[@id='PolicyRevival_Link']");//Revive button
        Searches_Objects.put("btnReopen", "XPATH|//a[@id='reopenCancelledPolicy_Link']");//Reopen button

        Searches_Objects.put("labelUnknownAddressee", "XPATH|//table[@id='idit-grid-table-flattendListdocumentsTreeList_pipe_']//span[contains(text(),'Unknown Addressee')]");//Maintain Event Heading
        Searches_Objects.put("btnDelete", "XPATH|//a[@id='flattendListdocumentsTreeList|Delete']/i");//Delete Button
        Searches_Objects.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        Searches_Objects.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button

        WebDr.page_Objects = Searches_Objects ;
    }
}
