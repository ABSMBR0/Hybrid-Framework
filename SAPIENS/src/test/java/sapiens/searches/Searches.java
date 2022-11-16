package sapiens.searches;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import sapiens.policies.extendedcover.ExtendedCover;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class Searches extends WebDr {

    private static final Logger logger = getLogger(Searches.class);

    String searchPolicyNumber = getValue("Policy_Number");
    String productName = getValue("Product_Name");
    String policyStatus = getValue("Policy_Status");
    String inceptionDate = getValue("Inception_Date");

    String cancelInitiator = getValue("Cancel_Initiator");
    String cancellationType = getValue("Cancellation_Type");
    String category = getValue("Category");
    String reason = getValue("Reason");
    String description = getValue("Description");

    public Searches(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

//    String valueToSearch = getValue("ValueToSearch");

    public void searchPolicy(String policyNumber){

        Searches_Mappings.Searches_Factory();

        try {
            if (exists("imgHome", true, "Home Image")){
                click("imgHome","Click Home Image");
                if (exists("labelSearch",true, "Search Label")){
                    selectValueFromDropdown("drpDwnFind", "text", "Policy", "Find Dropdown");
                    click("btnShowAdditionalDetails", "Click Show Additional Details");
                    click("headerSearchByPolicy/ProposalDetails","Click Search By Policy/Proposal Details");
                    setText("txtBoxPolicyNumber", policyNumber, "Enter Policy Number");
                    click("btnFind","Click Find Button");
                    WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + policyNumber + "')]"));
                    if (headingPolicyNumber.isDisplayed()) {
                        logger.info("Policy " + policyNumber + " Queried Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Search is : " + e);
        }

    }


    public void policyQuery(){

        Searches_Mappings.Searches_Factory();

        try {
            if (exists("imgHome", true, "Home Image")){
                click("imgHome","Click Home Image");
                if (exists("labelSearch",true, "Search Label")){
                    selectValueFromDropdown("drpDwnFind", "text", "Policy", "Find Dropdown");
                    click("btnShowAdditionalDetails", "Click Show Additional Details");
                    click("headerSearchByPolicy/ProposalDetails","Click Search By Policy/Proposal Details");
                    setText("txtBoxPolicyNumber", searchPolicyNumber, "Enter Policy Number");
                    click("btnFind","Click Find Button");
                    WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + searchPolicyNumber + "')]"));
                    if (headingPolicyNumber.isDisplayed()) {
                        logger.info("Policy " + searchPolicyNumber + " Queried Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Search is : " + e);
        }

    }

    public void verifyPolicyDisplayed(){

        Searches_Mappings.Searches_Factory();

        try {
                    WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + searchPolicyNumber + "')]"));
                    if (headingPolicyNumber.isDisplayed()) {
                        logger.info("Policy " + searchPolicyNumber + " Policy Displayed");
                        String expProductName = getText("labelProductName", "Get the Product Name");
                        validateString(expProductName,productName,"Verifying Product name");
                        String expPolicyStatus = getText("labelPolicyStatus", "Get the Policy status");
                        validateString(expPolicyStatus,policyStatus,"Verifying Policy Status");
                        String expInceptionDate = getText("labelInceptionDate", "Get the Policy Inception Date");
                        validateString(expInceptionDate,inceptionDate,"Verifying Inception date");
                    }

        } catch (Exception e) {
            logger.info("Exception in Policy Displayed is : " + e);
        }

    }

    public void cancelPolicy() {

        Searches_Mappings.Searches_Factory();

        try {
            WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + searchPolicyNumber + "')]"));
            if (headingPolicyNumber.isDisplayed()) {
                logger.info("Policy " + searchPolicyNumber + " Policy Displayed");
                click("btnAction", "Click on Actions");
                click("btnPolicyCancellation","Click on Policy Cancellation");
                Thread.sleep(5000);
                selectValueFromDropdown("drpDwnCancelInitiator", "text", cancelInitiator, "Cancel Initator Dropdown");
                selectValueFromDropdown("drpDwnCancellationType", "text",cancellationType, "Cancellation type Dropdown");
                click("btnPlusEndorsementReason", "Click on Plus Endorsement");
                Thread.sleep(5000);
                selectValueFromDropdown("drpDwnCategory", "text", category, "Category Dropdown");
                selectValueFromDropdown("drpDwnReason", "text", reason, "Reason Dropdown");
                setText("txtDescription", description, "Enter Description");
                click("btnUpdate", "Click on Update button");
                Thread.sleep(5000);
                click("btnNext", "Click on Next button");
                Thread.sleep(5000);
                click("labelUnknownAddressee", "Click Unknown Addressee");
                click("btnDelete", "Click Delete Button");
                if (exists("dialogBasicNotification", true, "Basic Notification Dialog")) {
                    click("btnDialogOK", "Click OK Button");
                }
                click("btnFinish", "Click on Finish button");
                Thread.sleep(5000);
                if (exists("dialogPolicyCancellation", true, "Policy Cancel  Dialog Box")) {
                    click("btnOKPolicyCancel", "Click OK Button on Policy cancel Dialog Box");
                    String latestPolicyStatus = getText("labelPolicyStatus", "Policy Status");
                    if (latestPolicyStatus.equals("Cancelled Policy")){
                        logger.info("Policy Cancelled  Successfully");
                    }

                }
            }

        } catch (Exception e) {
            logger.info("Exception in Policy Cancel is : " + e);
        }
    }

    public void revivePolicy() {

        Searches_Mappings.Searches_Factory();

        try {
            WebElement headingPolicyNumber = wdriver.findElement(By.xpath("//ul[@class='idit-breadcrumbs']//b[contains(text(),'" + searchPolicyNumber + "')]"));
            if (headingPolicyNumber.isDisplayed()) {
                logger.info("Policy " + searchPolicyNumber + " Policy Displayed");
                click("btnRevive", "Click on Revive");
                Thread.sleep(5000);
                click("btnPlusEndorsementReason", "Click on Plus Endorsement");
                click("btnUpdate", "Click on Update button");
                click("btnFinish","Click on finish ");
                Thread.sleep(5000);
                click("btnFinish","Click on finish ");
                if (exists("dialogPolicyCancellation", true, "Policy Revive  Dialog Box")) {
                    click("btnOKPolicyCancel", "Click OK Button on Policy Revive Dialog Box");
                    String latestPolicyStatus = getText("labelPolicyStatus", "Policy Status");
                    if (latestPolicyStatus.equals(" Policy")){
                        logger.info("Policy Revive Successful");
                    }

                }
            }

        } catch (Exception e) {
            logger.info("Exception in Policy Revive is : " + e);
        }
    }




}
