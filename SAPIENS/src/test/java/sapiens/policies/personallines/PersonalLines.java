package sapiens.policies.personallines;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import utility.WebDr;

import static org.slf4j.LoggerFactory.getLogger;

public class PersonalLines extends WebDr {

    private static final Logger logger = getLogger(PersonalLines.class);

    public PersonalLines(WebDriver wdriver, ExtentTest test) {
        this.wdriver = wdriver;
        this.test = test;
    }


    String productType = getValue("Product_Type");
    String policyType = getValue("Policy_Type");
    String branchCode = getValue("Branch_Code");
    String source = getValue("Source");
    String currentSalesChannel = getValue("CurrentSalesChannel");
    String question1 = getValue("Question_1");
    String question2 = getValue("Question_2");
    String question3 = getValue("Question_3");
    String question4 = getValue("Question_4");
    String question5 = getValue("Question_5");
    String lineOfBusiness = getValue("Line_Of_Business");
    String insuranceAmount = getValue("Insurance_Amount");
    String collectionMethod = getValue("Collection_Method");
    String paymentTerms = getValue("Payment_Terms");
    String preferredDueDay = getValue("Preferred_DueDay");
    String decision = getValue("Decision");
    String policyBankAccount = getValue("Policy_BankAccount");
    String buildingUsedFor = getValue("Building_UsedFor");
    String typeOfBuilding = getValue("Type_Of_Building");
    String typeOfArea = getValue("Type_Of_Area");
    String unOccupiedDays = getValue("Unoccupied_Days");
    String wallConstruction = getValue("Wall_Construction");
    String roofConstruction = getValue("Roof_Construction");
    String numberOfOutBuildings = getValue("NumberOfOutBuildings");
    String geysers = getValue("Geysers");
    String solarGeysers = getValue("Solar_Geysers");
    String bondApplicable = getValue("Bond_Applicable");
    String sumInsuredMainBuilding = getValue("SumInsuredMainBuilding");
    String sumInsuredOutBuilding = getValue("SumInsuredOutBuilding");
    String flat = getValue("Flat");
    String registeredOwner = getValue("Registered_Owner");
    String insure = getValue("Insure");
    String alarmInstalled = getValue("Alarm_Installed");
    String burglarBarsMainDwelling = getValue("BurglarBarsMainDwelling");
    String externalDoorMainDwelling = getValue("ExternalDoorMainDwelling");
    String burglarBarsOutbuilding = getValue("BurglarBarsOutbuilding");
    String externalDoorOutbuilding = getValue("ExternalDoorOutbuilding");
    String vehicleID = getValue("Vehicle_ID");
    String vehicleParkDuringDay = getValue("VehicleParkDuringDay");
    String dayTimeParkingCovered = getValue("DayTimeParkingCovered");
    String dayTimeParkingLocked = getValue("DayTimeParkingLocked");
    String vehicleParkDuringNight = getValue("VehicleParkDuringNight");
    String nightTimeParkingCovered = getValue("NightTimeParkingCovered");
    String nightTimeParkingLocked = getValue("NightTimeParkingLocked");
    String vehicleUsedFor = getValue("VehicleUsedFor");
    String make = getValue("Make");
    String modelVariant = getValue("Model_Variant");
    String yearOfManufacture = getValue("YearOfManufacture");
    String insuredForRetailOrCustom = getValue("InsuredForRetailOrCustom");
    String immobiliserMake = getValue("Immobiliser_Make");
    String regularDriver = getValue("Regular_Driver");
    String driverLicenseType = getValue("DriverLicenseType");
    String drivingCertificate = getValue("Driving_Certificate");
    String itemType = getValue("Item_Type");
    String address = getValue("Address");
    String specifiedAllRiskCover = getValue("SpecifiedAllRiskCover");
    String description = getValue("Description");
    String computerType = getValue("Computer_Type");
    String boatStoredWhenNotInUse = getValue("BoatStoredWhenNotInUse");
    String hullCode = getValue("Hull_Code");
    String boatSpeed = getValue("Boat_Speed");
    String inboardSumInsured = getValue("InboardSumInsured");
    String outboardSumInsured = getValue("OutboardSumInsured");



    /**
     * Method to select recently created Contact for a Policy
     */
    public void selectRecentContact() {

        PersonalLines_Mappings.PersonalLines_Factory();

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
     * Method to capture General Details of Personal Lines Policies
     */
    public void generalDetails() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (exists("linkNewProposal", true, "New Proposal Link")) {
                click("linkNewProposal", "Click New Proposal Link");
                if (exists("labelGeneralDetails", true, "General Details ")) {
                    //General Details
                    selectValueFromDropdown("drpDwnProductName", "text", productType, "Select Product Name");
                    selectValueFromDropdown("drpDwnPolicyType", "text", policyType, "Select Policy Type");
                    selectValueFromDropdown("drpDwnBranchCode", "text", branchCode, "Select Branch Code/Region");
                    selectValueFromDropdown("drpDwnSource", "text", source, "Select Source");
                    //Current Sales Channel
                    selectValueFromDropdown("drpDwnCurrentSalesChannel", "text", currentSalesChannel, "Select Current Sales Channel");
                    //Proposal Questionnaire
                    if (productType.equalsIgnoreCase("Absa Plus")) {
                        questionnaire_AbsaPlus();
                    } else if (productType.equalsIgnoreCase("Estate Late")){
                        questionnaire_EstateLate();
                    } else if (productType.equalsIgnoreCase("Private Insure")){
                        questionnaire_PrivateInsure();
                    }
                    click("btnNext", "Click Next Button");
                    if (exists("labelLineOfBusiness", true, "Maintain Policy Lines of Business Page")) {
                        logger.info("Policy General Details Captured Successfully");
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Policy General Details is : " + e);
        }
    }

    /**
     * Method to capture Maintain Policy Lines of Business of a Policy
     */
    public void linesOfBusiness() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (insure.equalsIgnoreCase("Motorcycle")
            || insure.equalsIgnoreCase("Caravan / Trailer")
            || lineOfBusiness.equalsIgnoreCase("All Risk")
            || lineOfBusiness.equalsIgnoreCase("Personal Computers")
            || lineOfBusiness.equalsIgnoreCase("Boats")
            || lineOfBusiness.equalsIgnoreCase("Personal Accident")){
                selectValueFromList("listLineOfBusiness", "Property", "Select Line of Business/Locations/Risk Object");
                click("btnUpdate", "Click Update");
                if (exists("labelClauses", true, "Clauses Screen")) {
                    click("btnNext", "Click Next");
                    if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number")) {
                        click("btnAddLocationsRiskObjects", "Click Add Button");
                        property();
                        click("btnEndCoversSelection", "Click End Covers Selection");
                        if (getElements("locationsRiskObjectsCount").size() > 2) {
                            click("btnNextCustomerRiskObjectNumber", "Click Next Button");
                        }
                    }
                }
            }
            selectValueFromList("listLineOfBusiness", lineOfBusiness, "Select Line of Business/Locations/Risk Object");
            click("btnUpdate", "Click Update");
            if (exists("labelClauses", true, "Clauses Screen Exists")) {
                click("btnNext", "Click Next");
                if (exists("labelCustomerRiskObjectNumber", true, "Search by Customer Risk Object Number Exists")) {
                    click("btnAddLocationsRiskObjects", "Click Add Button");
                    switch (lineOfBusiness) {
                        case "Property":
                            property();
                            break;
                        case "Motorcar":
                            motorcar();
                            break;
                        case "Personal Accident":
                            personalAccident();
                            break;
                        case "All Risk":
                            allRisk();
                            break;
                        case "Boats":
                            boats();
                            break;
                        case "Personal Computers":
                            personalComputers();
                            break;
                    }
                    click("btnEndCoversSelection", "Click End Covers Selection");
                    if (getElements("locationsRiskObjectsCount").size() > 2) {
                        click("btnNextCustomerRiskObjectNumber", "Click Next Button");
                        click("btnEndRiskDetails", "Click End Risk Details Button");
                        if (exists("labelPayments", true, "Payments Screen Exists")) {
                            logger.info("Policy Lines Of Business Details Captured Successfully");
                        }
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Maintain Policy Lines Of Business is : " + e);
        }
    }

    /**
     * Method to capture Payment Details of a Policy
     */
    public String paymentsDetails() {

        PersonalLines_Mappings.PersonalLines_Factory();

        String[] policyNumber = new String[0];

        try {
            if (exists("labelPayments", true, "Payments Screen Exists")) {
                //Payments
                String collectionMethodValue = getText("valueDrpDwnCollectionMethod", "Collection Method Default Value");
                if (!collectionMethodValue.equalsIgnoreCase(collectionMethod)) {
                    selectValueFromDropdown("drpDwnCollectionMethod", "text", collectionMethod, "Select Collection Method");
                }
                String paymentTermsValue = getText("valueDrpDwnPaymentTerms", "Payment Terms Default Value");
                if (!paymentTermsValue.equalsIgnoreCase(paymentTerms)) {
                    selectValueFromDropdown("drpDwnPaymentTerms", "text", paymentTerms, "Select Payment Terms");
                }
                selectValueFromDropdown("drpDwnPreferredDueDay", "text", preferredDueDay, "Select Preferred Due Day");
                //Decision
                selectValueFromDropdown("drpDwnDecision", "text", decision, "Select Decision");
                //Screening progress
                click("chkBoxSanctionScreen", "Click Sanction Screen Completed CheckBox");
                click("chkBoxRiskProfiling", "Click Risk Profiling Completed CheckBox");
                click("chkBoxDueDiligence", "Click Due Diligence Completed CheckBox");
                click("btnNext", "Click Next");
//                if (existsNoReport("dialogBasicNotification", true, "GD1000079 Popup")) {
//                    click("btnDialogOK", "Click OK Button");
//                    click("btnNext", "Click Next");
//                }
                if (exists("drpDwnPolicyBankAccount", true, "Bank Account Details Exists")) {
                    //Bank Account Details for <Contact>
                    selectValueFromDropdown("drpDwnPolicyBankAccount", "text", policyBankAccount, "Select Bank Account Number");
                    click("btnFinish", "Click Finish Button");
                    if (exists("labelMaintainEvent", true, "Maintains Event Exists")) {
                        logger.info("Policy Payments Details Captured Successfully");
                        click("labelUnknownAddressee", "Click Unknown Addressee");
                        click("btnDelete", "Click Delete Button");
                        if (!productType.equalsIgnoreCase("Estate Late")) {
                            click("dialogBasicNotification", "Basic Notification Dialog");
                            click("btnDialogOK", "Click OK Button");
                            click("labelWelcomeLetterPLSMS", "Click Welcome Letter PL SMS");
                            click("btnDelete", "Click Delete Button");
                        }
                        if (exists("dialogBasicNotification", true, "Basic Notification Dialog")) {
                            click("btnDialogOK", "Click OK Button");
                        }
                        click("btnFinish", "Click Finish Button");
                        if (exists("dialogPolicyCreation", true, "Policy Creation Dialog")) {
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

    /**
     * Method to capture Property Details
     */
    public void property() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            //Property Address
            if (exists("labelPropertyAddress", true, "Property Address Exists")) {
                click("chkBoxRiskAddressSame", "Click Risk Address Same CheckBox");
                //Property General Details
                if (insure.equalsIgnoreCase("Building")) {
                    click("chkBoxBuilding", "Click Building CheckBox");
                } else if (insure.equalsIgnoreCase("Contents")
                        || insure.equalsIgnoreCase("Motorcycle")
                        || insure.equalsIgnoreCase("Caravan / Trailer")
                        || lineOfBusiness.equalsIgnoreCase("All Risk")
                        || lineOfBusiness.equalsIgnoreCase("Personal Computers")
                        || lineOfBusiness.equalsIgnoreCase("Boats")
                        || lineOfBusiness.equalsIgnoreCase("Personal Accident")) {
                    click("chkBoxContents", "Click Contents CheckBox");
                }
                selectValueFromDropdown("drpDwnBuildingUsedFor", "text", buildingUsedFor, "Select Building Be Used For");
                selectValueFromDropdown("drpDwnTypeOfBuilding", "text", typeOfBuilding, "Select Type Of Building");
                selectValueFromDropdown("drpDwnTypeOfArea", "text", typeOfArea, "Select Type Of Area");
                click("chkBoxIsBuildingOccupied", "Click Is Building Occupied CheckBox");
                setText("txtBoxOccupiedSinceDate", getCurrentDate(), "Enter Occupied Since Date");
                setText("txtBoxUnoccupiedDays", unOccupiedDays, "Enter Number of Consecutive Unoccupied Days");
                selectValueFromDropdown("drpDwnWallConstruction", "text", wallConstruction, "Select Wall Construction");
                selectValueFromDropdown("drpDwnRoofConstruction", "text", roofConstruction, "Select Roof Construction");
                setText("txtBoxNumberOfOutBuildings", numberOfOutBuildings, "Enter How Many Out Buildings are there");
                if (insure.equalsIgnoreCase("Building")) {
                    //Building Details
                    setText("txtBoxNoOfGeysers", geysers, "Enter Number of Geysers");
                    setText("txtBoxNoOfSolarGeysers", solarGeysers, "Enter Number of Solar Geysers");
                    selectValueFromDropdown("drpDwnBondApplicable", "text", bondApplicable, "Select Bond Applicable");
                    setText("txtBoxSumInsuredMainBuilding", sumInsuredMainBuilding, "Enter Sum Insured of Main Building");
                    setText("txtBoxSumInsuredOutBuilding", sumInsuredOutBuilding, "Enter Sum Insured Out Buildings");
                    selectValueFromDropdown("drpDwnFlatBuilding", "text", flat, "Select Flat");
                    selectValueFromDropdown("drpDwnRegisteredOwnerBuilding", "text", registeredOwner, "Select Registered Owner");
                } else if (insure.equalsIgnoreCase("Contents")
                        || insure.equalsIgnoreCase("Motorcycle")
                        || insure.equalsIgnoreCase("Caravan / Trailer")
                        || lineOfBusiness.equalsIgnoreCase("All Risk")
                        || lineOfBusiness.equalsIgnoreCase("Personal Computers")
                        || lineOfBusiness.equalsIgnoreCase("Boats")
                        || lineOfBusiness.equalsIgnoreCase("Personal Accident")) {
                    if (productType.equalsIgnoreCase("Private Insure")){
                        click("chkBoxIsPropertyInHighSecurity", "Click Is Property In High Security CheckBox");
                        click("chkBoxAreThereHighWalls", "Click Are There High Walls CheckBox");
                        click("chkBoxRazorWirePerimeterWall", "Click Razor Wire Perimeter Wall CheckBox");
                        click("chkBoxOpenFieldsAroundProperty", "Click Open Fields Around Property CheckBox");
                        click("chkBoxElectronicFencing", "Click Electronic Fencing CheckBox");
                        click("chkBoxElectronicGate", "Click Electronic Gate CheckBox");
                        click("chkBoxSecurityOnGate", "Click Security On Gate CheckBox");
                        click("chkBoxSecurityGuardPatrol", "Click Security Guard Patrol CheckBox");
                    }
                    //House Content Details
                    selectValueFromDropdown("drpDwnAlarmInstalled", "text", alarmInstalled, "Select Alarm Installed");
                    click("chkBoxAlarmProfessionallyInstalled", "Click Alarm Professionally Installed CheckBox");
                    click("chkBoxAlarmInfraRedDetectors", "Click Alarm InfraRed Detectors CheckBox");
                    click("chkBoxAlarmWorkingOrder", "Click Alarm Working Order CheckBox");
                    selectValueFromDropdown("drpDwnBurglarBarsMainDwelling", "text", burglarBarsMainDwelling, "Select Burglar Bars Main Dwelling");
                    selectValueFromDropdown("drpDwnExternalDoorMainDwelling", "text", externalDoorMainDwelling, "Select External Door Main Dwelling");
                    selectValueFromDropdown("drpDwnBurglarBarsOutbuilding", "text", burglarBarsOutbuilding, "Select Burglar Bars Outbuilding");
                    selectValueFromDropdown("drpDwnExternalDoorOutbuilding", "text", externalDoorOutbuilding, "Select External Door Outbuilding");
//                    if (!productType.equalsIgnoreCase("Private Insure")){
//                        setText("txtBoxInventoryRequestedDate", getCurrentDate(), "Enter Inventory Requested Date");
//                        setText("txtBoxInventoryReceivedDate", getCurrentDate(), "Enter Inventory Received Date");
//                    }
                    setText("txtBoxMainDwellingSumInsured", sumInsuredMainBuilding, "Enter Main Dwelling Sum Insured");
                    setText("txtBoxOutbuildingSumInsured", sumInsuredOutBuilding, "Enter Outbuilding Sum Insured");
                    selectValueFromDropdown("drpDwnFlatContents", "text", flat, "Select Flat");
                    selectValueFromDropdown("drpDwnRegisteredOwnerContents", "text", registeredOwner, "Select Registered Owner");
                }
                click("btnNext", "Click Next Button");
//                if (exists("labelPropertyAdditionalDetails", true, "Property Additional Details")) {
//                    click("btnNext", "Click Next Button");
//                if (exists("labelPropertyTechnicalReport", true, "Property Technical Report")) {
//                    //Building
//                    setText("txtBoxYearBuilt", yearBuilt, "Enter Year Built");
//                    //First Aid Resources
//                    selectValueFromDropdown("drpDwnYearlyMaintenance", "text", yearlyMaintenance, "Select Yearly Maintenance");
//                    //Standards Match
//                    selectValueFromDropdown("drpDwnElectricalStandards", "text", electricalStandards, "Select Electrical Standards");
//                    selectValueFromDropdown("drpDwnHeatingStandards", "text", heatingStandards, "Select Heating Standards");
//                    selectValueFromDropdown("drpDwnInflammableStandards", "text", inflammableStandards, "Select Inflammable Standards");
//                    selectValueFromDropdown("drpDwnWoodPlasticStandards", "text", woodPlasticStandards, "Select Wood Plastic Standards");
//                    selectValueFromDropdown("drpDwnStorageStandards", "text", storageStandards, "Select Storage Standards");
//                    click("btnNext", "Click Next Button");
//                    if (exists("labelFireAllRiskSpecificData", true, "Fire All Risk Specific Data Exists")) {
//                        click("btnNext", "Click Next Button");
                    if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                        logger.info("Property " + insure + " Details Captured Successfully");
                    }
//                    }
//                }
//                }
            }
        } catch (Exception e) {
            logger.info("Exception in Property Details is : " + e);
        }
    }

    /**
     * Method to capture MotorCar details
     */
    public void motorcar() {

        try {
            if (exists("labelMotorRiskObjectDetails", true, "Insured General Details Exists")) {
                //Identifiers
                click("labelVehicleChassis", "Click Vehicle ID No/Chassis No");
                setText("txtBoxVehicleID", vehicleID, "Enter Vehicle ID No/Chassis No");
                click("btnIdentifierUpdate", "Click Update Button");
                //Risk Address
                click("chkBoxIsRiskAddSameAsPhysical", "Click Is Risk Address Same As Physical Address? CheckBox");
                click("chkBoxIsWorkAddSameAsRisk", "Click Is Work Address Same As Risk Address? CheckBox");
                selectValueFromDropdown("drpDwnWhatToInsure", "text", insure, "Select What Do You Want To Insure Dropdown");
                if (insure.equalsIgnoreCase("Vehicle") || insure.equalsIgnoreCase("Motorcycle")) {
                    //Vehicle General Details
                    selectValueFromDropdown("drpDwnVehicleParkDuringDay", "text", vehicleParkDuringDay, "Select Vehicle Park During Day ? Dropdown");
                    selectValueFromDropdown("drpDwnDayTimeParkingCovered", "text", dayTimeParkingCovered, "Select Day Time Parking Covered ? Dropdown");
                    selectValueFromDropdown("drpDwnDayTimeParkingLocked", "text", dayTimeParkingLocked, "Select Day Time Parking Locked ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
                    selectValueFromDropdown("drpDwnNightTimeParkingCovered", "text", nightTimeParkingCovered, "Select Night Time Parking Covered ? Dropdown");
                    selectValueFromDropdown("drpDwnNightTimeParkingLocked", "text", nightTimeParkingLocked, "Select Night Time Parking Locked ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
                    selectValueFromDropdown("drpDwnMake", "text", make, "Select Make Dropdown");
                    selectValueFromDropdown("drpDwnModelVariant", "text", modelVariant, "Select Model Variant Dropdown");
                    selectValueFromDropdown("drpDwnYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture Dropdown");
                    selectValueFromDropdown("drpDwnInsuredForRetailOrCustom", "text", insuredForRetailOrCustom, "Select Insured For Retail Or Custom ? Dropdown");
                    click("chkBoxImmobiliser", "Click Immobiliser CheckBox");
                    selectValueFromDropdown("drpDwnImmobiliserMake", "text", immobiliserMake, "Select Immobiliser Make Dropdown");
//                    setText("txtBoxInsuranceValue", insuranceAmount, "Enter Insurance Value");
                    //Registered Owner Details
                    selectValueFromDropdown("drpDwnRegisteredOwner", "text", registeredOwner, "Select Registered Owner");
                    //Driver Details
                    selectValueFromDropdown("drpDwnRegularDriver", "text", regularDriver, "Select Regular Driver");
                    selectValueFromDropdown("drpDwnDriverLicenseType", "text", driverLicenseType, "Select Regular Driver License Type Dropdown");
                    if (insure.equalsIgnoreCase("Motorcycle")) {
                        selectValueFromDropdown("drpDwnDrivingCertificate", "text", drivingCertificate, "Select Defensive Driving Certificate Dropdown");
                    }
                    click("chkBoxIsVehicleRegInSouthAfrica", "Click Is Vehicle Registered In South Africa ? CheckBox");
                } else if (insure.equalsIgnoreCase("Caravan / Trailer")) {
                    //Caravan/Trailer General Details
                    selectValueFromDropdown("drpDwnItemType", "text", itemType, "Select Item Type Dropdown");
                    selectValueFromDropdown("drpDwnVehicleParkDuringNight", "text", vehicleParkDuringNight, "Select Vehicle Park During Night ? Dropdown");
                    selectValueFromDropdown("drpDwnVehicleUsedFor", "text", vehicleUsedFor, "Select Vehicle Be Used For ? Dropdown");
                    click("chkBoxIsCarvanParkUnderNet", "Click Is Carvan Parked Under Hail");
                    setText("txtBoxMakeModelCaravan", make, "Enter Make/Model");
                    setText("txtBoxCaravanInsuredValue", insuranceAmount, "Enter Caravan Insured Value");
                    selectValueFromDropdown("drpDwnYearOfManufactureCaravan", "text", yearOfManufacture, "Select Caravan Year Of Manufacture Dropdown");
//                    click("chkBoxRequireCreditShortFall", "Click Require Credit ShortFall ?");
                }
                click("btnNext", "Click Next Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Motorcar - " + insure + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Motorcar Details is : " + e);
        }
    }

    /**
     * Method to capture All Risk details
     */
    public void allRisk() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (exists("labelAllRiskDetails", true, "All Risk Details")) {
                selectValueFromDropdown("drpDwnAddressList", "text", address, "Select Address");
                selectValueFromDropdown("drpDwnRiskToInsure", "text", insure, "Select Risk To Insure");
                if (insure.equalsIgnoreCase("Specified All Risk Cover")) {
                    selectValueFromDropdown("drpDwnSpecifiedAllRiskCover", "text", specifiedAllRiskCover, "Select Specified All Risk Cover");
                }
                setText("txtBoxDescription",description,"Enter Description");
                setText("txtBoxSumInsured", insuranceAmount, "Enter Sum Insured");
                click("btnFinish","Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("All Risk - " + insure + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in All Risk is : " + e);
        }
    }

    /**
     * Method to capture Personal Computers details
     */
    public void personalComputers() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (exists("labelPersonalComputer", true, "Personal Computer")) {
                selectValueFromDropdown("drpDwnAddressList", "text", address, "Select Address");
                selectValueFromDropdown("drpDwnComputerType", "text", computerType, "Select Type");
                setText("txtBoxMake",make,"Enter Make");
                setText("txtBoxPersonalComputerSumInsured", insuranceAmount, "Enter Personal Computer Sum Insured");
                click("btnFinish","Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Personal Computers Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Personal Computers is : " + e);
        }
    }

    /**
     * Method to capture Boats details
     */
    public void boats() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (exists("labelBoatDetails", true, "Boat Details")) {
                //Risk Address
                click("chkBoxRiskAddressSame", "Click Is Risk Address Same As Physical Address? CheckBox");
                //Boat Details
                selectValueFromDropdown("drpDwnBoatType", "text", itemType, "Select Item Type");
                selectValueFromDropdown("drpDwnBoatStoredWhenNotInUse", "text", boatStoredWhenNotInUse, "Select Boat Stored When Not In Use");
                selectValueFromDropdown("drpDwnBoatUsedFor", "text", vehicleUsedFor, "Select Boat Used For");
                selectValueFromDropdown("drpDwnBoatYearOfManufacture", "text", yearOfManufacture, "Select Year Of Manufacture");
                setText("txtBoxBoatMakeModel",make,"Enter Make Model");
                setText("txtBoxBoatDescription", description, "Enter Description");
                selectValueFromDropdown("drpDwnBoatHullCode", "text", hullCode, "Select Hull Code");
                selectValueFromDropdown("drpDwnBoatSpeed", "text", boatSpeed, "Select Boat Speed");
                setText("txtBoxHullSumInsured", insuranceAmount, "Enter Hull Sum Insured");
                setText("txtBoxInboardSumInsured", inboardSumInsured, "Enter Hull Sum Insured");
                setText("txtBoxOutboardSumInsured", outboardSumInsured, "Enter Hull Sum Insured");
                click("btnFinish","Click Finish Button");
                if (exists("labelCoverSelection", true, "Cover Selection Exists")) {
                    logger.info("Boats - " + itemType + " Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Boats is : " + e);
        }
    }

    /**
     * Method to capture Personal Accident details
     */
    public void personalAccident() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (exists("labelInsuredGeneralDetails", true, "Insured General Details")) {
                click("btnNext", "Click Next Button");
                if (exists("labelCoverSelection", true, "Cover Selection")) {
                    //Cover selection
                    selectValueFromDropdown("drpDwnListInsuranceAmount", "text", insuranceAmount, "Select Insurance Amount");
                    logger.info("Personal Accident Details Captured Successfully");
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Personal Accident is : " + e);
        }
    }


    public void clientCodeValidation(){

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            if (exists("labelContactDashboard", true, "Contact Dashboard")) {
                click("linkUpdateContact", "Click Update Contact");
                if (exists("labelPrimaryDetails", true, "Primary Details")) {
                    //Client Code Validation
                    String clientCode = getElement("txtBoxClientCode").getAttribute("value");
                    if (!clientCode.isEmpty()){
                        logger.info("Client Code Generated Successfully");
                        System.out.println("Client Code is : " + clientCode);
                    }
                }
            }
        } catch (Exception e) {
            logger.info("Exception in Client Code Validation is : " + e);
        }
    }

    public void questionnaire_AbsaPlus() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            selectValueFromDropdown("drpDwnQuestion1_AbsaPlus", "text", question1, "Select Answer of Question 1");
            selectValueFromDropdown("drpDwnQuestion2_AbsaPlus", "text", question2, "Select Answer of Question 2");
            selectValueFromDropdown("drpDwnQuestion3_AbsaPlus", "text", question3, "Select Answer of Question 3");
            selectValueFromDropdown("drpDwnQuestion4_AbsaPlus", "text", question4, "Select Answer of Question 4");
            selectValueFromDropdown("drpDwnQuestion5_AbsaPlus", "text", question5, "Select Answer of Question 5");
        } catch (Exception e) {
            logger.info("Exception in Absa Plus Questionnaire is : " + e);
        }
    }

    public void questionnaire_EstateLate() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            selectValueFromDropdown("drpDwnQuestion1_EstateLate", "text", question1, "Select Answer of Question 1");
            selectValueFromDropdown("drpDwnQuestion2_EstateLate", "text", question2, "Select Answer of Question 2");
            selectValueFromDropdown("drpDwnQuestion3_EstateLate", "text", question3, "Select Answer of Question 3");
            selectValueFromDropdown("drpDwnQuestion4_EstateLate", "text", question4, "Select Answer of Question 4");
            selectValueFromDropdown("drpDwnQuestion5_EstateLate", "text", question5, "Select Answer of Question 5");
        } catch (Exception e) {
            logger.info("Exception in Estate Late Questionnaire is : " + e);
        }
    }

    public void questionnaire_PrivateInsure() {

        PersonalLines_Mappings.PersonalLines_Factory();

        try {
            selectValueFromDropdown("drpDwnQuestion1_PrivateInsure", "text", question1, "Select Answer of Question 1");
            selectValueFromDropdown("drpDwnQuestion2_PrivateInsure", "text", question2, "Select Answer of Question 2");
            selectValueFromDropdown("drpDwnQuestion3_PrivateInsure", "text", question3, "Select Answer of Question 3");
            selectValueFromDropdown("drpDwnQuestion4_PrivateInsure", "text", question4, "Select Answer of Question 4");
            selectValueFromDropdown("drpDwnQuestion5_PrivateInsure", "text", question5, "Select Answer of Question 5");
        } catch (Exception e) {
            logger.info("Exception in Private Insure Questionnaire is : " + e);
        }
    }




}
