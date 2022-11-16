package utility;

import org.slf4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.slf4j.LoggerFactory.getLogger;


public class ConfigManager {

    private static ConfigManager configManager = null;
    public static Properties prop = new Properties();
    private static final Logger logger = getLogger(ConfigManager.class);


    /**
     * Private Constructor to only get the single object of that class
     */
    private ConfigManager(){
        try {
            logger.info("Loading Properties File");
            String fileName = Constant.Path_Config;
            logger.info("File Name : " + fileName);
            prop.load(new FileInputStream(fileName));
            logger.info("Properties File Loaded Successfully");
        } catch (IOException e) {
            logger.error(e.toString());
        }
    }

    /**
     * synchronized used to make it thread safe
     * @return  -   configManager
     */
    public static synchronized ConfigManager getConfigManagerInstance(){
        logger.info("Executing ConfigManager Instance");
        if (configManager == null){
            synchronized (ConfigManager.class){
                configManager = new ConfigManager();
            }
        }
        return configManager;
    }

    /**
     * Get value from the properties file
     * @param key   -   field in properties file
     * @return      -   value of key
     */
    public String getKeyValue(String key){
        logger.info("Returning value from key [" + key + "] :" + System.getProperty(key, prop.getProperty(key)));
        return System.getProperty(key, prop.getProperty(key));
    }

}
