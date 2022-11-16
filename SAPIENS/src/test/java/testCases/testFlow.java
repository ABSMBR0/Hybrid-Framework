package testCases;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.slf4j.Logger;
import sapiens.claims.Claims;
import sapiens.contact.Contact;
import sapiens.login.Login;
import sapiens.policies.absavalueplus.AbsaValuePlus;
import sapiens.policies.extendedcover.ExtendedCover;
import sapiens.policies.personallines.PersonalLines;
import sapiens.searches.Searches;
import sapiens.usercreation.CreateUserProfile;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class testFlow extends WebDr {

    private static final Logger logger = getLogger(testFlow.class);


    public testFlow(ExtentTest test, ExtentReports extent) {
        this.test = test;
        this.extent = extent;
    }

    public void executeTC(String flowName,String preferBrowser) throws Exception
    {
        try {
            switch (flowName) {
                case "flow_NewContactCreation":
                    logger.info("The current scenario is: " + flowName);
                    sapiens_NewContactCreation(preferBrowser);
                    break;
                case "flow_PersonalLines_PolicyCreation":
                    logger.info("The current scenario is: " + flowName);
                    personalLines_PolicyCreation(preferBrowser);
                    break;
                case "flow_ExtendedCover_PolicyCreation":
                    logger.info("The current scenario is: " + flowName);
                    extendedCover_PolicyCreation(preferBrowser);
                    break;
                case "flow_AbsaValuePlus_PolicyCreation":
                    logger.info("The current scenario is: " + flowName);
                    absaValuePlus_PolicyCreation(preferBrowser);
                    break;
                case "flow_UpdateContactDetails":
                    logger.info("The current scenario is: " + flowName);
                    updateContactDetails(preferBrowser);
                    break;
                case "flow_PolicyQuery":
                    logger.info("The current scenario is: " + flowName);
                    policyQuery(preferBrowser);
                    break;
                case "flow_PolicyCancelandRevive":
                    logger.info("The current scenario is: " + flowName);
                    policyCancel(preferBrowser);
                    break;
                case "flow_UpdateBankingDetails":
                    logger.info("The current scenario is: " + flowName);
                    updateBankDetails(preferBrowser);
                    break;
                case "flow_UserProfileCreation":
                    logger.info("The current scenario is: " + flowName);
                    sapiens_UserProfileCreation(preferBrowser);
                    break;
            }
        } catch (Exception e) {
            WriteStep(wdriver,flowName + " Status: ",flowName + " should be executed successfully",flowName + " didn't execute successfully","FAIL");
            wdriver.quit();
            logger.info(String.valueOf(e));
        }
    }

    /**
     * Flow for Creating a New Contact into Sapiens application
     * @param preferBrowser -   Chrome
     */
    public void sapiens_NewContactCreation(String preferBrowser) {
    	try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).generalDetails();
            new Contact(wdriver, test).addresses();
            new Contact(wdriver, test).additionalData();
            new Contact(wdriver, test).paymentMeans();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewContactCreation is : " + e);
    	}
    }

    /**
     * Flow for Creating a New AbsaPlus Policy into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void personalLines_PolicyCreation(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new PersonalLines(wdriver, test).selectRecentContact();
            new PersonalLines(wdriver, test).generalDetails();
            new PersonalLines(wdriver, test).linesOfBusiness();
            String policyNumber = new PersonalLines(wdriver, test).paymentsDetails();
            new Searches(wdriver, test).searchPolicy(policyNumber);
            new Claims(wdriver, test).claimThroughPolicy(policyNumber);
//            new AbsaPlus(wdriver, test).clientCodeValidation();
//            new Searches(wdriver, test).searchPolicy("PL-APL6527855845/00");
//            new Claims(wdriver, test).claimThroughPolicy("PPL-APL6527855845/00");


            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewPolicyCreation is : " + e);
        }
    }

    /**
     * Flow for Creating a New Extended Cover Policy into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void extendedCover_PolicyCreation(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new ExtendedCover(wdriver, test).selectRecentContact();
            new ExtendedCover(wdriver, test).generalDetails();
            new ExtendedCover(wdriver, test).motorcarDetails();
            String policyNumber = new ExtendedCover(wdriver, test).paymentsDetails();
            new Searches(wdriver, test).searchPolicy(policyNumber);
            new Claims(wdriver, test).claimThroughPolicy(policyNumber);
//            new AbsaPlus(wdriver, test).clientCodeValidation();

//            new Searches(wdriver, test).searchPolicy("PL-EXC6527834348/00");
//            new Claims(wdriver, test).claimThroughPolicy("PL-EXC6527834348/00");

            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewPolicyCreation is : " + e);
        }
    }

    /**
     * Flow for Creating a New Absa Value Plus Policy into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void absaValuePlus_PolicyCreation(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new AbsaValuePlus(wdriver, test).selectRecentContact();
            new AbsaValuePlus(wdriver, test).generalDetails();
            new AbsaValuePlus(wdriver, test).motorcarDetails();
            String policyNumber = new AbsaValuePlus(wdriver, test).paymentsDetails();
            new Searches(wdriver, test).searchPolicy(policyNumber);
            new Claims(wdriver, test).claimThroughPolicy(policyNumber);
//            new AbsaPlus(wdriver, test).clientCodeValidation();
//            new Searches(wdriver, test).searchPolicy("PL-1006527837029/00");
//            new Claims(wdriver, test).claimThroughPolicy("PL-1006527837029/00");

            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewPolicyCreation is : " + e);
        }
    }

    /**
     * Flow for Creating a New User Profile in Sapiens application
     * @param preferBrowser -   Chrome
     */
    public void sapiens_UserProfileCreation(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new CreateUserProfile(wdriver, test).createContact();
            new CreateUserProfile(wdriver, test).createProfile();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_UserProfileCreation is : " + e);
        }
    }

    /**
     * Flow for Updating the Contact Details into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void updateContactDetails(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).selectRecentContact();
            new Contact(wdriver, test).updateContact();

            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_NewPolicyCreation is : " + e);
        }
    }
    /**
     * Flow for Servicing Policy query into Sapiens application
     * @param preferBrowser : Chrome
     */
    public void policyQuery(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Searches(wdriver, test).policyQuery();
            new Searches(wdriver, test).verifyPolicyDisplayed();

            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_PolicyQuery is : " + e);
        }
    }

    public void policyCancel(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Searches(wdriver, test).policyQuery();
            new Searches(wdriver, test).cancelPolicy();
            new Searches(wdriver, test).revivePolicy();
            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_PolicyQuery is : " + e);
        }
    }
    public void updateBankDetails(String preferBrowser) {
        try{
            setup(preferBrowser);
            new Login(wdriver, test).applicationLogin();
            new Contact(wdriver, test).selectRecentContact();
            new Contact(wdriver, test).updateBankDetails();

            new Login(wdriver, test).applicationLogOut();
        }catch(Exception e){
            logger.info("Exception in sapiens_PolicyQuery is : " + e);
        }
    }


}
