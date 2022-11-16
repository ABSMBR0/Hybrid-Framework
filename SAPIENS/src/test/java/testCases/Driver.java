package testCases;

import org.slf4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.Constant;
import utility.Launcher;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static utility.Constant.*;
import static org.slf4j.LoggerFactory.getLogger;

public class Driver extends Thread{

    private static final Logger logger = getLogger(Driver.class);

    public static String userDir, file_TestData;
    public static Map<String, String> dictionary = new HashMap<>();
    Launcher objLauncher = new Launcher();

    public static void main (String[] args) {
        Driver ob=new Driver();
        ob.mainDriver("Chrome");
    }

    @Test
    @Parameters("Browser")
    public void mainDriver(String testngBrowser) {
        try{
            userDir = System.getProperty("user.dir");
            file_TestData= "SAPIENS_Servicing_MasterData.xlsx";
            //file_TestData= "SAPIENS_MasterData.xlsx";
//            file_TestData= "SAPIENS_UserCreationData.xlsx";

            objLauncher.InvokeLauncher(testngBrowser);
        }
        catch (Exception e){
            logger.info("Exception in Driver.mainDriver" + e.toString());
        }
    }


}
