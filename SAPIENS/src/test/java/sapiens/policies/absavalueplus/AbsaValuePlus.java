package sapiens.policies.absavalueplus;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import sapiens.policies.extendedcover.ExtendedCover_Mappings;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class AbsaValuePlus extends WebDr {

    private static final Logger logger = getLogger(AbsaValuePlus.class);

    public AbsaValuePlus(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }

    String productType = getValue("Product_Type");
    String policyType = getValue("Policy_Type");
    String branchCode = getValue("Branch_Code");
    String source = getValue("Source");
    String currentSalesChannel = getValue("CurrentSalesChannel");
    String question = getValue("Question");
    String productCode = getValue("Product_Code");
    String intermediaryName = getValue("Intermediary_Name");
    String preferredDueDay = getValue("Preferred_DueDay");
    String decision = getValue("Decision");
    String policyBankAccount = getValue("Policy_BankAccount");
    String vehicleID = getValue("Vehicle_ID");
    String mmCodeForVehicle = getValue("MMCodeForVehicle");
    String yearOfManufacture = getValue("YearOfManufacture");
    String loanAmount = getValue("LoanAmount");



    /**
     * Method to select recently created Contact
     */
    public void selectRecentContact() {

        AbsaValuePlus_Mappings.AbsaValuePlus_Factory();

        try {
            if (exists("imgHome", true, "Home Image Exists")) {
                click("linkRecentContacts", "Select Contact");
                if (exists("tabContactDashboard", true, "Contact Dashboard Exists")) {
                    logger.info("Contact Selected Successfully");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to capture General Details of Absa Value Plus Policy
     */
    public void generalDetails() {

        AbsaValuePlus_Mappings.AbsaValuePlus_Factory();

        try {
            if (exists("linkNewProposal", true, "New Proposal Link")) {
                click("linkNewProposal", "Click New Proposal Link");
                if (exists("labelGeneralDetails", true, "General Details")) {
                    //General Details
                    selectValueFromDropdown("drpDwnProductName", "text", productType, "Select Product Name");
                    selectValueFromDropdown("drpDwnPolicyType", "text", policyType, "Select Policy Type");
                    selectValueFromDropdown("drpDwnBranchCode", "text", branchCode, "Select Branch Code/Region");
                    selectValueFromDropdown("drpDwnSource", "text", source, "Select Source");
                    //Current Sales Channel
                    selectValueFromDropdown("drpDwnCurrentSalesChannel", "text", currentSalesChannel, "Select Current Sales Channel");
                    click("btnNext", "Click Next Button");
                    if (exists("labelMotorRiskObjectDetails", true, "Maintain Policy Lines of Business Page")) {
                        logger.info("Policy General Details Captured Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Absa Value Plus General Details is : " + e);
        }
    }

    /**
     * Method to capture MotorCar Details of Absa Value Plus Policy
     */
    public void motorcarDetails() {

        AbsaValuePlus_Mappings.AbsaValuePlus_Factory();

        try {
            //Vehicle Primary Details
            click("labelMMCodeForVehicle", "Click Mead & Mcgrouther Code Dropdown");
            setText("txtBoxMMCodeForVehicle", mmCodeForVehicle, "Enter Mead & Mcgrouther Code");
            if (exists("resultMMCodeForVehicle", true, "MM Code")){
                click("resultMMCodeForVehicle", "Click MM Code");
            } else {
                logger.error("MM Code Not Found");
            }
            selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year of Manufacture");
            setText("txtBoxOutstandingBalance", loanAmount, "Enter Outstanding Balance");
            click("btnNext", "Click Next Button");
            //Payments
            if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                click("btnEndCoversSelection", "Click End Covers Selection");
                logger.info("Motorcar Details Captured Successfully");
            }
        } catch (Exception e) {
            logger.info("Exception in Motorcar Details is : " + e);
        }
    }

    /**
     * Method to capture Payment Details of Absa Value Plus Policy
     */
    public String paymentsDetails() {

        AbsaValuePlus_Mappings.AbsaValuePlus_Factory();

        String[] policyNumber = new String[0];

        try {
            if (exists("labelPayments", true, "Payments Screen Exists")) {
                //Payments
                selectValueFromDropdown("drpDwnPreferredDueDay", "text", preferredDueDay, "Select Preferred Due Day");
                //Decision
                selectValueFromDropdown("drpDwnDecision", "text", decision, "Select Decision");
                click("btnNext", "Click Next");
                if (exists("drpDwnPolicyBankAccount", true, "Bank Account Details Exists")) {
                    //Bank Account Details for <Contact>
                    selectValueFromDropdown("drpDwnPolicyBankAccount", "text", policyBankAccount, "Select Bank Account Number");
                    click("btnFinish", "Click Finish Button");
                    if (exists("labelMaintainEvent", true, "Maintains Event Exists")) {
                        logger.info("Policy Payments Details Captured Successfully");
                        click("labelUnknownAddressee", "Click Unknown Addressee");
                        click("btnDelete", "Click Delete Button");
                        if (exists("dialogBasicNotification", true, "Basic Notification Dialog")) {
                            click("btnDialogOK", "Click OK Button");
                        }
                        click("btnFinish", "Click Finish Button");
                        if (exists("btnViewDocuments", true, "Policy Creation Dialog")) {
                            String str = getText("txtPolicyNumber", "Get Policy Number");
                            policyNumber = str.split("\\s+");
                            logger.info("Policy " + policyNumber[1] + " Created Successfully");
                            click("btnOK", "Click OK Button");
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy Payment Details is : " + e);
        }
        return policyNumber[1];
    }



}
