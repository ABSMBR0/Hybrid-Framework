package sapiens.claims;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class Claims_Mappings {


    public static void Claims_Factory(){

        Map<String, String> Claims_Objects = new HashMap<>();

        Claims_Objects.put("labelContactDashboard", "XPATH|//li[@title='Contact Dashboard']");//Contact Dashboard Label
        Claims_Objects.put("listPolicies", "XPATH|//a[@title='Policies']//parent::li//child::li");//Policies List
        Claims_Objects.put("listActions", "XPATH|//ul[@class='ActionMenu dropdown-menu']//li/a[@class='linkTag']");//Actions List
        Claims_Objects.put("labelLossEventGeneralDetails", "XPATH|//div[contains(text(),'Loss Event General Details')]");//Loss Event General Details Label

        //Loss Event General Details
        Claims_Objects.put("txtBoxEventDate", "XPATH|//input[@id='claimEventDateField']");//Event Date TextBox
        Claims_Objects.put("drpDwnCauseOfLoss", "XPATH|//select[@id='claimCauseOfLossVOListFromPol']");//Primary Cause Of Loss Dropdown
        Claims_Objects.put("txtBoxEventDescription", "XPATH|//textarea[@id='IDITForm@claimEventDescription']");//Event Description TextBox
        Claims_Objects.put("drpDwnInsuredObject", "XPATH|//select[@id='insuredObjectId']");//Insured Object Dropdown
        Claims_Objects.put("drpDwnClaimLocationType", "XPATH|//select[@id='claimLocationTypeId']");//Event Location Type Dropdown
        Claims_Objects.put("btnNextCreateClaim", "XPATH|//button[@id='createClaimNext']");//Next Button

        //Address For AVAF
        Claims_Objects.put("txtBoxAddressLine1", "XPATH|//input[@id='IDITForm@SO003@streetId']");//AddressLine1 TextBox
        Claims_Objects.put("txtBoxAddressLine2", "XPATH|//input[@id='IDITForm@SO003@houseNr']");//AddressLine2 TextBox
        Claims_Objects.put ("txtSuburbPrimary", "XPATH|//input[@id='additionalInfo(IDITForm@SO003@addressVO@cityId_autocompleteSelectInputId)']");// Suburb Autocomplete Box
        Claims_Objects.put("drpDwnCityTownForeignCountry", "XPATH|//select[@id='IDITForm@SO003@addressVO@districtId']");//Address Type Dropdown
        Claims_Objects.put("drpDwnPostCode", "XPATH|//select[@id='IDITForm@SO003@addressVO@zipCode']");//PostCode Dropdown

        //Driver Details For AVAF
        Claims_Objects.put("labelDriverDetails", "XPATH|//div[contains(text(),'Driver Details')]");//Driver Details Heading


        //Matching Catastrophe Dialog
        Claims_Objects.put("dialogMatchingCatastrophe", "XPATH|//div[@id='suggestCatastropheDivDiv']");//Matching Catastrophe Dialog
        Claims_Objects.put("dialogAssociatedLossEvents", "XPATH|//div[@title='Associated Loss Events']");//Associated Loss Events Dialog
        Claims_Objects.put("btnProceed", "XPATH|//button[@id='Proceed']");//Proceed Button

        //Damage Code Tree
        Claims_Objects.put("labelDamageCodeTree", "XPATH|//div[contains(text(),'Damage Code Tree')]");//Damage Code Tree Heading
        Claims_Objects.put("chkBoxDamageCode", "XPATH|//table[@id='idit-grid-table-flattendListdamageTreeList_pipe_']//tr//td[contains(text(),'Covered')]//parent::tr//label");//Damage Code Tree Heading
        Claims_Objects.put("btnOK", "XPATH|//button[@id='OK']");//OK Button
        Claims_Objects.put("labelDamagesAndRelatedContacts", "XPATH|//div[@title='Damages and Related Contacts']");//Damages and Related Contacts Heading
        Claims_Objects.put("labelQuestionnaires", "XPATH|//li[@title='Questionnaires']");//Questionnaires TAB


        //Damaged Object Questionnaire
        Claims_Objects.put("labelDamagedObjectQuestionnaire", "XPATH|//div[@title='Damaged Object Questionnaire']");//Damaged Object Questionnaire Heading
        Claims_Objects.put("drpDwnDamageBeenAttended", "XPATH|//select[@id='1000016@1000357']");//Has the damage been attended to? Dropdown

        // ***  Accident Circumstances Questionnaires   ***

        //Property
        Claims_Objects.put("txtBoxRelationshipOfPersonReportingClaim", "XPATH|//input[@id='1000008@1000463']");//Relationship of the person reporting the claim TextBox
        Claims_Objects.put("txtBoxWhyReportingClaim", "XPATH|//input[@id='1000008@1000067']");//Why are they reporting the claim TextBox
        Claims_Objects.put("drpDwnInsuranceBeforeTakingPolicy", "XPATH|//select[@id='1000008@1000480']");//Did you have insurance before taking out this policy? Dropdown

        //Motorcar
        Claims_Objects.put("labelAccidentCircumstancesQuestionnaires", "XPATH|//div[@title='Accident Circumstances Questionnaires']");//Accident Circumstances Questionnaires Heading
        Claims_Objects.put("txtBoxDriverRelationshipToPolicyHolder", "XPATH|//input[@id='1000009@1000131']");//Accident driver relationship to policy holder TextBox
        Claims_Objects.put("txtBoxDriverComingFrom", "XPATH|//input[@id='1000009@1000136']");//Where were you coming from when the incident happened? TextBox
        Claims_Objects.put("txtBoxDriverGoingTo", "XPATH|//input[@id='1000009@1000138']");//Where were you going to? TextBox
        Claims_Objects.put("drpDwnAlcoholBeforeIncident", "XPATH|//select[@id='1000009@1000140']");//Did you have any alcohol / medication before the incident Dropdown
        Claims_Objects.put("drpDwnDriverInjuries", "XPATH|//select[@id='1000009@1000373']");//Driver Injuries Dropdown
        Claims_Objects.put("drpDwnInsuranceBeforeTakingPolicy2", "XPATH|//select[@id='1000007@1000048']");//Did you have insurance before taking out this policy? Dropdown
        Claims_Objects.put("drpDwnIncidentReportedToPolice", "XPATH|//select[@id='1000008@1000382' or @id='1000009@1000376']");//Was the incident reported to the police? Dropdown
        Claims_Objects.put("drpDwnWhoWasAccidentDriver", "XPATH|//select[@id='1000007@1000562' or @id='1000009@1000564']");//Who was the accident driver Dropdown
        Claims_Objects.put("drpDwnDamagesOnVehicle", "XPATH|//select[@id='1000007@1000038']");//Where are the damages on your vehicle Dropdown
        Claims_Objects.put("drpDwnYouHaveInsuranceBeforeTakingPolicy", "XPATH|//select[@id='1000007@1000048' or @id='1000009@1000176']");//Did you have insurance before taking out this policy? Dropdown
        Claims_Objects.put("drpDwnWhereAreDamagesOnVehicle", "XPATH|//select[@id='1000007@1000383']");//Where are the damages on your vehicle? Dropdown

        Claims_Objects.put("btnNextFromClaimantAssetTabsScreen", "XPATH|//button[@id='nextFromClaimantAssetTabsScreen']");//Next Button


        //Dependencies
        Claims_Objects.put("labelDependencies", "XPATH|//div[@title='Dependencies']");//Dependencies Heading
        Claims_Objects.put("btnFinish", "XPATH|//button[@id='Finish']");//Finish Button

        //Maintain Event
        Claims_Objects.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        Claims_Objects.put("dialogContactConfirmation", "XPATH|//div[@class='ConfirmationPageMessageDiv']//h2[contains(text(),'Loss Event')]");//Contact Creation Dialog Box


        Claims_Objects.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        Claims_Objects.put("txtClaimNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Claim Creation Dialog Text
        Claims_Objects.put("btnOk", "XPATH|//button[@id='Ok']");//Ok Button
        Claims_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button


        Claims_Objects.put("listDamageNodes", "XPATH|//input[@id='1000008@1000067']PATH|//td[@aria-describedby='idit-grid-table-flattendListdamageTreeList_pipe__innerVO@presentationValue']");//Ok Button
        Claims_Objects.put("listCoverageNodes", "XPATH|//td[@aria-describedby='idit-grid-table-flattendListdamageTreeList_pipe__innerVO@damageCoverStatusVO']");//Ok Button





        WebDr.page_Objects = Claims_Objects ;

    }
}
