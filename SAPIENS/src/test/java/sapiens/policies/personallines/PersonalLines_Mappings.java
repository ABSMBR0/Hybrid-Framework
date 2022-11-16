package sapiens.policies.personallines;

import utility.WebDr;

import java.util.HashMap;
import java.util.Map;

public class PersonalLines_Mappings {

    public static void PersonalLines_Factory()
    {
        Map<String, String> PersonalLines_Objects = new HashMap<>();

        PersonalLines_Objects.put("imgHome", "XPATH|//a[@id='MainMenuFind_ImgLink']/div[@class='homeImgDiv']");//Home Image
        PersonalLines_Objects.put("linkRecentContacts", "XPATH|(//div[@id='userRecentContactsListAddInfo|']//li)[1]");//First Recent Contact Link
        PersonalLines_Objects.put("tabContactDashboard", "XPATH|//li[@title='Contact Dashboard' and @aria-controls='DashboardTabContent']");//Contact Dashboard Tab

        //***********   GENERAL DETAILS   ***********

        //General Details
        PersonalLines_Objects.put("linkNewProposal", "XPATH|//a[@id='MainMenuPolicy_Link']");//New Proposal Link
        PersonalLines_Objects.put("labelGeneralDetails", "XPATH|//div[contains(text(),'General Details')]");//General Details Heading
        PersonalLines_Objects.put("drpDwnProductName", "XPATH|//select[@id='Product']");//Product Name Dropdown
        PersonalLines_Objects.put("drpDwnMembership", "XPATH|//select[@id='IDITForm@affinityVO@id']");//Membership Dropdown
        PersonalLines_Objects.put("drpDwnPolicyType", "XPATH|//select[@id='IDITForm@policyPeriodTypeABSAVO@id']");//Policy Type Dropdown
        PersonalLines_Objects.put("txtBoxOldPolicyNumber", "XPATH|//input[@id='IDITForm@migratedPolicyNumber']");//Old Policy Number TextBox
        PersonalLines_Objects.put("txtBoxExternalReferenceNumber", "XPATH|//input[@id='IDITForm@externalReferenceNumber']");//External Reference Number TextBox
        PersonalLines_Objects.put("drpDwnSalesForceOpportunityID", "XPATH|//select[@id='IDITForm@salesForceOpportunity']");//SalesForce Opportunity ID Dropdown
        PersonalLines_Objects.put("drpDwnBranchCode", "XPATH|//select[@id='branchCodeRegion']");//Branch Code Dropdown
        PersonalLines_Objects.put("drpDwnSource", "XPATH|//select[@id='source']");//Source Dropdown
        PersonalLines_Objects.put("drpDwnStaffIndicator", "XPATH|//select[@id='staffIndicator']");//Staff Indicator Dropdown

        //Sales Transaction Channel
        PersonalLines_Objects.put("drpDwnCurrentSalesChannel", "XPATH|//select[@id='IDITForm@currentChannelVO@id']");//Current Sales Channel Dropdown


        //Proposal Questionnaire

        //Absa Plus
        PersonalLines_Objects.put("drpDwnQuestion1_AbsaPlus", "XPATH|//select[@id='1000004@1000008']");//Question1 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion2_AbsaPlus", "XPATH|//select[@id='1000004@1000010']");//Question2 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion3_AbsaPlus", "XPATH|//select[@id='1000004@1000011']");//Question3 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion4_AbsaPlus", "XPATH|//select[@id='1000004@1000013']");//Question4 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion5_AbsaPlus", "XPATH|//select[@id='1000004@1000014']");//Question5 Dropdown

        //Estate Late
        PersonalLines_Objects.put("drpDwnQuestion1_EstateLate", "XPATH|//select[@id='1000018@1000412']");//Question1 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion2_EstateLate", "XPATH|//select[@id='1000018@1000414']");//Question2 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion3_EstateLate", "XPATH|//select[@id='1000018@1000415']");//Question3 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion4_EstateLate", "XPATH|//select[@id='1000018@1000417']");//Question4 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion5_EstateLate", "XPATH|//select[@id='1000018@1000418']");//Question5 Dropdown

        //Private Insure
        PersonalLines_Objects.put("drpDwnQuestion1_PrivateInsure", "XPATH|//select[@id='1000017@1000401']");//Question1 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion2_PrivateInsure", "XPATH|//select[@id='1000017@1000403']");//Question2 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion3_PrivateInsure", "XPATH|//select[@id='1000017@1000404']");//Question3 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion4_PrivateInsure", "XPATH|//select[@id='1000017@1000406']");//Question4 Dropdown
        PersonalLines_Objects.put("drpDwnQuestion5_PrivateInsure", "XPATH|//select[@id='1000017@1000407']");//Question5 Dropdown

        //Client Code Validation
        PersonalLines_Objects.put("labelContactDashboard", "XPATH|//li[@title='Contact Dashboard']");//Contact Dashboard Label
        PersonalLines_Objects.put("linkUpdateContact", "XPATH|//a[@id='UpdateContactNewGen_Link']");//Update Contact Link
        PersonalLines_Objects.put("labelPrimaryDetails", "XPATH|//li[@title='Primary details']");//Primary Details Label
        PersonalLines_Objects.put("txtBoxClientCode", "XPATH|//input[@id='clientCode']");//Client Code TextBox


        //***********   Line of Business/Locations/Risk Object   ***********

        PersonalLines_Objects.put("labelLineOfBusiness", "XPATH|//div[@title='Line of Business/Locations/Risk Object']");//Line of Business/Locations/Risk Object Label
        PersonalLines_Objects.put("listLineOfBusiness", "XPATH|//table[@id='idit-grid-table-flattendListflattenedPolicyItems_pipe_']//tbody//child::span");//Dialing Code TextBox
        PersonalLines_Objects.put("btnUpdate", "XPATH|//a[@title='Update']/i");//Update Button
        PersonalLines_Objects.put("labelClauses", "XPATH|//div[@class='Title' and contains(text(),'Clauses')]");//Clauses Heading
        PersonalLines_Objects.put("labelCustomerRiskObjectNumber", "XPATH|//div[contains(text(),'Search by Customer Risk Object Number')]");//Search by Customer Risk Object Number Heading
        PersonalLines_Objects.put("btnAddLocationsRiskObjects", "XPATH|//a[@id='flattendListflattenedPolicyItems|New']/i");//Add Locations/Risk Objects Button
        PersonalLines_Objects.put("labelInsuredGeneralDetails", "XPATH|//div[contains(text(),'Insured general details')]");//Insured general details Heading
        PersonalLines_Objects.put("labelCoverSelection", "XPATH|//div[@title='Cover selection']");//Cover Selection Heading
        PersonalLines_Objects.put("btnEndCoversSelection", "XPATH|//button[@id='Finish' and @title='End covers selection']");//End Covers Selection Button
        PersonalLines_Objects.put("locationsRiskObjectsCount", "XPATH|//table[@id='idit-grid-table-flattendListflattenedPolicyItems_pipe_']//tr");//Locations Risk/Objects Count
        PersonalLines_Objects.put("btnNextCustomerRiskObjectNumber", "XPATH|//button[@id='Finish' and @title='Next']");//Next Button On Customer Risk Object Number Screen
        PersonalLines_Objects.put("btnEndRiskDetails", "XPATH|//button[@id='next' and @title='End risk details']");//End Risk Details Button
        PersonalLines_Objects.put("labelPayments", "XPATH|//div[@title='Payments']");//Payments Heading


        //*** PROPERTY  LOB  *****

        //Property Address
        PersonalLines_Objects.put("labelPropertyAddress", "XPATH|//div[@title='Property Address']");//Property Address Heading
        PersonalLines_Objects.put("chkBoxRiskAddressSame", "XPATH|//label[@id='IDITForm@riskAddressSameAsContactLabel']");//Is the Risk Address Same as the Contact Physical Address? Checkbox
        //Property General Details
        PersonalLines_Objects.put("chkBoxBuilding", "XPATH|//label[@id='buildingLabel']");//Building Checkbox
        PersonalLines_Objects.put("chkBoxContents", "XPATH|//label[@id='contentsLabel']");//Contents Checkbox
        PersonalLines_Objects.put("drpDwnBuildingUsedFor", "XPATH|//select[@id='buildingUseVO']");//What will the building be used for? Dropdown
        PersonalLines_Objects.put("drpDwnTypeOfBuilding", "XPATH|//select[@id='buildingTypeVO']");//What type of building is it? Dropdown
        PersonalLines_Objects.put("drpDwnTypeOfArea", "XPATH|//select[@id='areaABSAVO']");//What type of area is the building located in? Dropdown
        PersonalLines_Objects.put("chkBoxIsBuildingOccupied", "XPATH|//label[@id='isBuildingOccupiedLabel']");//Is the building occupied? Checkbox
        PersonalLines_Objects.put("txtBoxOccupiedSinceDate", "XPATH|//input[@id='occupiedSinceDate']");//Occupied Since Date TextBox
        PersonalLines_Objects.put("txtBoxUnoccupiedDays", "XPATH|//input[@id='noOfConsUnoccupiedDays']");//Number of consecutive unoccupied days TextBox
        PersonalLines_Objects.put("drpDwnWallConstruction", "XPATH|//select[@id='constructionTypeVO']");//Wall construction Dropdown
        PersonalLines_Objects.put("drpDwnRoofConstruction", "XPATH|//select[@id='roofMaterialVO']");//Roof construction Dropdown
        PersonalLines_Objects.put("txtBoxNumberOfOutBuildings", "XPATH|//textarea[@id='numberOfOutBuildings']");//How Many Out Buildings are there TextBox
        //Building Details
        PersonalLines_Objects.put("txtBoxNoOfGeysers", "XPATH|//input[@id='noOfGeysers']");//Number of geysers in building and out building TextBox
        PersonalLines_Objects.put("txtBoxNoOfSolarGeysers", "XPATH|//input[@id='noOfSolarGeysers']");//How many are solar geysers TextBox
        PersonalLines_Objects.put("drpDwnBondApplicable", "XPATH|//select[@id='bondApplied']");//Is or was there a bond applicable to this house? Dropdown
        PersonalLines_Objects.put("txtBoxSumInsuredMainBuilding", "XPATH|//input[@id='sumInsuredMainBuilding']");//Sum insured of main building TextBox
        PersonalLines_Objects.put("txtBoxSumInsuredOutBuilding", "XPATH|//input[@id='sumInsuredOutBuilding']");//Sum Insured of Outbuildings TextBox
        PersonalLines_Objects.put("drpDwnFlatBuilding", "XPATH|//select[@id='flatBuilding']");//Flat Dropdown
        PersonalLines_Objects.put("drpDwnRegisteredOwnerBuilding", "XPATH|//select[@id='regOwner']");//Registered Owner Dropdown
        PersonalLines_Objects.put("labelPropertyAdditionalDetails", "XPATH|//div[contains(text(),'Property Additional Details')]  ");//Property Additional Details Heading
        PersonalLines_Objects.put("labelPropertyTechnicalReport", "XPATH|//div[contains(text(),'Property Technical Report')]");//Property Technical Details Heading
        //House Content Details
        PersonalLines_Objects.put("drpDwnAlarmInstalled", "XPATH|//select[@id='alarmInstalledVO']");//Do you have an alarm installed? Dropdown
        PersonalLines_Objects.put("chkBoxAlarmProfessionallyInstalled", "XPATH|//label[@id='alarmProfessionallyInstalledLabel']");//Was the alarm professionally installed? Checkbox
        PersonalLines_Objects.put("chkBoxAlarmInfraRedDetectors", "XPATH|//label[@id='alarmInfraRedDetectorsLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxAlarmWorkingOrder", "XPATH|//label[@id='alarmWorkingOrderLabel']");//Is the alarm in working order? Checkbox
        PersonalLines_Objects.put("drpDwnBurglarBarsMainDwelling", "XPATH|//select[@id='burglarBarsVO']");//Are there burglar bars installed to the main dwelling? Dropdown
        PersonalLines_Objects.put("drpDwnExternalDoorMainDwelling", "XPATH|//select[@id='externalDoorSecurityMainDwellingVO']");//Are there external door security gates to the main dwelling? Dropdown
        PersonalLines_Objects.put("drpDwnBurglarBarsOutbuilding", "XPATH|//select[@id='IDITForm@burglarbarsOutbuildingCon']");//Are there burglar bars installed to outbuilding ? Dropdown
        PersonalLines_Objects.put("drpDwnExternalDoorOutbuilding", "XPATH|//select[@id='IDITForm@externaldoorsecurOutbuilding']");//Are there external door security gates to the outbuilding ? Dropdown
        PersonalLines_Objects.put("txtBoxInventoryRequestedDate", "XPATH|//input[@id='inventoryRequestedDate']");//Inventory Requested Date TextBox
        PersonalLines_Objects.put("txtBoxInventoryReceivedDate", "XPATH|//input[@id='inventoryReceivedDate']");//Inventory Received Date TextBox
        PersonalLines_Objects.put("txtBoxMainDwellingSumInsured", "XPATH|//input[@id='mainDwelContentSumInsuredId']");//Main Dwelling Contents sum insured TextBox
        PersonalLines_Objects.put("txtBoxOutbuildingSumInsured", "XPATH|//input[@id='outBuildSumInsuredContentId']");//Outbuilding sum insured TextBox
        PersonalLines_Objects.put("drpDwnFlatContents", "XPATH|//select[@id='flatContent']");//Flat Dropdown
        PersonalLines_Objects.put("drpDwnRegisteredOwnerContents", "XPATH|//select[@id='registeredOwnerContent']");//Registered Owner Dropdown

        PersonalLines_Objects.put("chkBoxIsPropertyInHighSecurity", "XPATH|//label[@id='isPropertyInHighSecurityLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxAreThereHighWalls", "XPATH|//label[@id='areThereHighWallsLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxRazorWirePerimeterWall", "XPATH|//label[@id='razorWirePerimeterWallLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxOpenFieldsAroundProperty", "XPATH|//label[@id='openFieldsAroundPropertyLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxElectronicFencing", "XPATH|//label[@id='electronicFencingLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxElectronicGate", "XPATH|//label[@id='electronicGateLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxSecurityOnGate", "XPATH|//label[@id='securityOnGateLabel']");//Does the alarm have infra-red detectors? Checkbox
        PersonalLines_Objects.put("chkBoxSecurityGuardPatrol", "XPATH|//label[@id='securityGuardPatrolLabel']");//Does the alarm have infra-red detectors? Checkbox

        //Building
        PersonalLines_Objects.put("txtBoxYearBuilt", "XPATH|//input[@id='IDITForm@buildingYear']");//Year built TextBox
        //First Aid Resources
        PersonalLines_Objects.put("drpDwnYearlyMaintenance", "XPATH|//select[@id='IDITForm@fireExtingMaintenanceVO@id']");//With yearly maintenance Dropdown
        //Standards Match
        PersonalLines_Objects.put("drpDwnElectricalStandards", "XPATH|//select[@id='IDITForm@electricalStandardsFlagVO@id']");//Electrical fixtures meet all standards Dropdown
        PersonalLines_Objects.put("drpDwnHeatingStandards", "XPATH|//select[@id='IDITForm@heatingStandardsFlagVO@id']");//Heating meets all standards Dropdown
        PersonalLines_Objects.put("drpDwnInflammableStandards", "XPATH|//select[@id='IDITForm@inflammableStandardsFlagVO@id']");//Inflammable liquids meet all standards Dropdown
        PersonalLines_Objects.put("drpDwnWoodPlasticStandards", "XPATH|//select[@id='IDITForm@woodPlasticStandardsFlagVO@id']");//Wood or plastic activities meet all standards Dropdown
        PersonalLines_Objects.put("drpDwnStorageStandards", "XPATH|//select[@id='IDITForm@storageStandardsFlagVO@id']");//Storage rooms meet prevention standards Dropdown
        PersonalLines_Objects.put("labelFireAllRiskSpecificData", "XPATH|//div[contains(text(),'Fire all risk specific data')]");//Fire all risk specific data Heading

        //*** MOTORCAR  LOB   *****

        PersonalLines_Objects.put("labelMotorRiskObjectDetails", "XPATH|//div[contains(text(),'Motor Risk Object Details')]");//Motor Risk Object Details Heading
        //Identifiers
        PersonalLines_Objects.put("labelVehicleChassis", "XPATH|//td[@title='Vehicle ID No/Chassis No']");//Vehicle ID No/Chassis No Label
        PersonalLines_Objects.put("txtBoxVehicleID", "XPATH|//input[@id='assetIdentifierValueId']");//VehicleID/Chassis No TextBox
        PersonalLines_Objects.put("btnIdentifierUpdate", "XPATH|//button[@id='assetIdentifierVOListTablePanelDivUpdateButton']");//Update Button
        //Risk Address
        PersonalLines_Objects.put("chkBoxIsRiskAddSameAsPhysical", "XPATH|//label[@id='isRiskAddSameAsPhysicalLabel']");//Is the Risk Address Same as the insured Physical Address? Checkbox
        //Work Address
        PersonalLines_Objects.put("chkBoxIsWorkAddSameAsRisk", "XPATH|//label[@id='isWorkAddSameAsRiskLabel']");// Is your work address the same as Risk Address? Checkbox
        PersonalLines_Objects.put("drpDwnWhatToInsure", "XPATH|//select[@id='whatDoYouWantToInsure']");//What do you want to Insure? Dropdown
        //Vehicle General Details
        PersonalLines_Objects.put("drpDwnVehicleParkDuringDay", "XPATH|//select[@id='motorParkABSAVO']");//Where is the vehicle parked during the day? Dropdown
        PersonalLines_Objects.put("drpDwnDayTimeParkingCovered", "XPATH|//select[@id='isTheDayTimeParkingCovered']");//Is the daytime parking covered? Dropdown
        PersonalLines_Objects.put("drpDwnDayTimeParkingLocked", "XPATH|//select[@id='isTheDayTimeParkingLocked']");//Is the daytime parking locked or access controlled? Dropdown
        PersonalLines_Objects.put("drpDwnVehicleParkDuringNight", "XPATH|//select[@id='motorParkNightABSAVO']");//Where is the vehicle parked during the night? Dropdown
        PersonalLines_Objects.put("drpDwnNightTimeParkingCovered", "XPATH|//select[@id='isTheNightTimeParkingCovered']");//Is the night-time parking covered? Dropdown
        PersonalLines_Objects.put("drpDwnNightTimeParkingLocked", "XPATH|//select[@id='isTheNightTimeParkingLocked']");//Is the night-time parking locked or access controlled? Dropdown
        PersonalLines_Objects.put("drpDwnVehicleUsedFor", "XPATH|//select[@id='vehicleUsageVO']");//What will the vehicle be used for? Dropdown
        PersonalLines_Objects.put("drpDwnMake", "XPATH|//select[@id='manufactureVO']");//Make Dropdown
        PersonalLines_Objects.put("drpDwnModelVariant", "XPATH|//select[@id='modelVO']");//Model Variant Dropdown
        PersonalLines_Objects.put("drpDwnYearOfManufacture", "XPATH|//select[@id='yearOfMan']");//Year of Manufacture Dropdown
        PersonalLines_Objects.put("drpDwnInsuredForRetailOrCustom", "XPATH|//select[@id='insuredForRetailOrCustomValue']");//Do you want to be insured for the retail or custom value of the vehicle? Dropdown
        PersonalLines_Objects.put("chkBoxImmobiliser", "XPATH|//label[@id='immobiliserLabel']");//Immobiliser Checkbox
        PersonalLines_Objects.put("drpDwnImmobiliserMake", "XPATH|//select[@id='immobiliserMake']");//Immobiliser Make Dropdown
        PersonalLines_Objects.put("txtBoxInsuranceValue", "XPATH|//input[@id='insuranceValue']");//Insurance Value TextBox

        //Registered Owner Details
        PersonalLines_Objects.put("drpDwnRegisteredOwner", "XPATH|//select[@id='IDITForm@regOwner@id']");//Registered Owner Dropdown
        //Driver Details
        PersonalLines_Objects.put("drpDwnRegularDriver", "XPATH|//select[@id='IDITForm@regDriverABSAVO@id']");//Who is the regular driver? Dropdown
        PersonalLines_Objects.put("drpDwnDriverLicenseType", "XPATH|//select[@id='motorLicense']");//Regular Driver License Type Dropdown
        PersonalLines_Objects.put("drpDwnDrivingCertificate", "XPATH|//select[@id='IDITForm@driveCert@id']");//Defensive driving certificate Dropdown
        //Additional Details
        PersonalLines_Objects.put("chkBoxIsVehicleRegInSouthAfrica", "XPATH|//label[@id='IDITForm@isVehicleRegInSouthAfricaLabel']");//Is the vehicle registered in South Africa? Checkbox

        //Caravan/Trailer General Details
        PersonalLines_Objects.put("drpDwnItemType", "XPATH|//select[@id='itemType']");//Item Type Dropdown
        PersonalLines_Objects.put("chkBoxIsCarvanParkUnderNet", "XPATH|//label[@id='isCarvanParkUnderNetLabel']");//Is the caravan/trailer parked under a hail net or roof when not in use? Checkbox
        PersonalLines_Objects.put("txtBoxMakeModelCaravan", "XPATH|//input[@id='makeModelCaravan']");//Make/Model TextBox
        PersonalLines_Objects.put("txtBoxCaravanInsuredValue", "XPATH|//input[@id='caravanInsuredValue']");//Caravan Insured Value TextBox
        PersonalLines_Objects.put("drpDwnYearOfManufactureCaravan", "XPATH|//select[@id='yearOfManufactureCarvan']");//Caravan Year of Manufacture Dropdown
        PersonalLines_Objects.put("chkBoxRequireCreditShortFall", "XPATH|//label[@id='requireCreditShortFallLabel']");// Do you Require Credit shortfall? Checkbox


        //*** ALL RISK  LOB  *****

        PersonalLines_Objects.put("labelAllRiskDetails", "XPATH|//div[@title='All Risk Details']");//All Risk Details Heading
        PersonalLines_Objects.put("drpDwnAddressList", "XPATH|//select[@id='addressList']");//Address Dropdown
        PersonalLines_Objects.put("drpDwnRiskToInsure", "XPATH|//select[@id='allRiskType']");//Which Risk do you want to Insure? Dropdown
        PersonalLines_Objects.put("drpDwnSpecifiedAllRiskCover", "XPATH|//select[@id='specAllRiskType']");//Specified All Risk Cover Dropdown
        PersonalLines_Objects.put("txtBoxDescription", "XPATH|//input[@id='description']");//Description TextBox
        PersonalLines_Objects.put("txtBoxSumInsured", "XPATH|//input[@id='sumInsured']");//Sum Insured TextBox


        //*** PERSONAL COMPUTERS  LOB  *****

        PersonalLines_Objects.put("labelPersonalComputer", "XPATH|//div[@title='Personal Computers' or @title='Personal Computer']");//Personal Computer Heading
        PersonalLines_Objects.put("drpDwnComputerType", "XPATH|//select[@id='compTypeABSAVO']");//Type Dropdown
        PersonalLines_Objects.put("txtBoxMake", "XPATH|//input[@id='make']");//Make TextBox
        PersonalLines_Objects.put("txtBoxPersonalComputerSumInsured", "XPATH|//input[@id='personalComputerSumInsured']");//Personal Computer Sum Insured TextBox


        //***   BOATS  LOB  *****

        //BoatDetails
        PersonalLines_Objects.put("labelBoatDetails", "XPATH|//div[@id='TitleAgentBoatDetailsPanelABSA']");//BoatDetails Heading
        PersonalLines_Objects.put("drpDwnBoatType", "XPATH|//select[@id='IDITForm@boatTypeVO@id']");//Item Type Dropdown
        PersonalLines_Objects.put("drpDwnBoatStoredWhenNotInUse", "XPATH|//select[@id='IDITForm@boatStoredABSAVO@id']");//Where is the watercraft stored when not in use? Dropdown
        PersonalLines_Objects.put("drpDwnBoatUsedFor", "XPATH|//select[@id='IDITForm@boatStoredUseVO@id']");//What will the watercraft be used for? Dropdown
        PersonalLines_Objects.put("drpDwnBoatYearOfManufacture", "XPATH|//select[@id='IDITForm@yearCarvanVO@id']");//Year of Manufacture Dropdown
        PersonalLines_Objects.put("txtBoxBoatMakeModel", "XPATH|//input[@id='IDITForm@makeModel']");//Make/Model TextBox
        PersonalLines_Objects.put("txtBoxBoatDescription", "XPATH|//input[@id='IDITForm@description']");//Description TextBox
        PersonalLines_Objects.put("drpDwnBoatHullCode", "XPATH|//select[@id='IDITForm@hullCodeVO@id']");//Hull Code Dropdown
        PersonalLines_Objects.put("drpDwnBoatSpeed", "XPATH|//select[@id='IDITForm@boatSpeedVO@id']");//Watercraft speed (km/h) Dropdown
        PersonalLines_Objects.put("txtBoxHullSumInsured", "XPATH|//input[@id='hullSumInsured']");//Hull Sum Insured TextBox
        PersonalLines_Objects.put("txtBoxInboardSumInsured", "XPATH|//input[@id='inboardSumInsured']");//Inboard Sum Insured TextBox
        PersonalLines_Objects.put("txtBoxOutboardSumInsured", "XPATH|//input[@id='outboardSumInsured']");//Outboard Sum Insured TextBox



        //*** PERSONAL ACCIDENT  LOB  *****

        PersonalLines_Objects.put("drpDwnListInsuranceAmount", "XPATH|//select[@id='flattendListflattenedPolicyItems|1@innerVO@insuranceAmountLevelVO@id']");//Insurance Amount Dropdown



        //***********   PAYMENTS DETAILS   ***********

        PersonalLines_Objects.put("drpDwnCollectionMethod", "XPATH|//select[@id='CollectionMethodId']");//Collection Method Dropdown
        PersonalLines_Objects.put("valueDrpDwnCollectionMethod", "XPATH|//div[@id='s2id_CollectionMethodId']/a/span[@id='select2-chosen-2']");//Collection Method Dropdown Value

        PersonalLines_Objects.put("drpDwnPaymentTerms", "XPATH|//select[@id='paymentTermId']");//Payment Terms Dropdown
        PersonalLines_Objects.put("valueDrpDwnPaymentTerms", "XPATH|//div[@id='s2id_paymentTermId']/a/span[@id='select2-chosen-3']");//Payment Terms Dropdown Value

        PersonalLines_Objects.put("drpDwnPreferredDueDay", "XPATH|//select[@id='installmentDueDay']");//Preferred Due Day Dropdown
        PersonalLines_Objects.put("drpDwnDecision", "XPATH|//select[@id='Decision']");//Decision Dropdown
        PersonalLines_Objects.put("chkBoxSanctionScreen", "XPATH|//label[@id='isSanctionScreenCompletedLabel']");//Sanction Screen Checkbox
        PersonalLines_Objects.put("chkBoxRiskProfiling", "XPATH|//label[@id='isRiskProfilingCompletedLabel']");//Risk Profiling Checkbox
        PersonalLines_Objects.put("chkBoxDueDiligence", "XPATH|//label[@id='isDueDiligenceCompletedLabel']");//Due Diligence Checkbox
        PersonalLines_Objects.put("drpDwnPolicyBankAccount", "XPATH|//select[@id='localPolicyVO@policyBankAccount']");//Policy Bank Account Dropdown
        PersonalLines_Objects.put("labelMaintainEvent", "XPATH|//div[contains(text(),'Maintain Event')]");//Maintain Event Heading
        PersonalLines_Objects.put("labelUnknownAddressee", "XPATH|//table[@id='idit-grid-table-flattendListdocumentsTreeList_pipe_']//span[contains(text(),'Unknown Addressee')]");//Maintain Event Heading
        PersonalLines_Objects.put("btnDelete", "XPATH|//a[@id='flattendListdocumentsTreeList|Delete']/i");//Delete Button
        PersonalLines_Objects.put("dialogBasicNotification", "XPATH|//div[@id='BasicNotificationDialog']");//Basic Notification Dialog
        PersonalLines_Objects.put("btnDialogOK", "XPATH|//button[@id='DialogOK']");//DialogOK Button
        PersonalLines_Objects.put("dialogPolicyCreation", "XPATH|//div[@class='ConfirmationPageMessageDiv']");//Policy Creation Dialog
        PersonalLines_Objects.put("txtPolicyNumber", "XPATH|//div[@class='ConfirmationPageMessageDiv']/span/h2");//Policy Creation Dialog Text
        PersonalLines_Objects.put("btnViewDocuments", "XPATH|//button[@title='View documents']");//View Documents Button
        PersonalLines_Objects.put("btnOK", "XPATH|//button[@id='Ok']");//OK Button
        PersonalLines_Objects.put("dialogGD1000079", "XPATH|//div[@id='BasicNotificationDialog']");//GD1000079 dialog box

        PersonalLines_Objects.put("labelWelcomeLetterPLSMS", "XPATH|//span[normalize-space()='Welcome Letter PL SMS']");//Maintain Event Heading


        PersonalLines_Objects.put("btnNext", "XPATH|//button[@id='Next']");//Next Button
        PersonalLines_Objects.put("btnFinish", "XPATH|//button[@id='Finish' and @title='Finish']");//Finish Button





        WebDr.page_Objects = PersonalLines_Objects ;
    }
}
