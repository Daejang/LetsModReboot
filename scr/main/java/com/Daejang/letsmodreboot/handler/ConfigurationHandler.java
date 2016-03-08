package com.Daejang.letsmodreboot.handler;

import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        // Create the configuration object from the given configuration file
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }

//        boolean configValue = false;
//
//        try {
//            // Load the configuration file
//            configuration.load();
//
//            // Read in properties from configuration file.
//            // Gets from the config file.  File name, config value name, value, description.
//            // Best store the config values into the reference folder for the rest of the project to use.
//            configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config value").getBoolean(true);
//        }
//        catch (Exception e){
//            // Log the exception
//        }
//        finally {
//            // Save the configuration file
//            if (configuration.hasChanged()) {
//                configuration.save();
//            }
//
//        }
//
//         For test purposes only
//        System.out.println("Configuration Test " + configValue);
    }

    @SubscribeEvent
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event) {

        if (event.modID.equalsIgnoreCase(ModInfo.MOD_ID)) {
            //Resync configs below
            loadConfiguration();

        }
    }

    public void loadConfiguration () {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an 2nd example config value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }
}


