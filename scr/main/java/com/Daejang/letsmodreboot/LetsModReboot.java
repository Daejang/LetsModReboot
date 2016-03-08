package com.Daejang.letsmodreboot;

import com.Daejang.letsmodreboot.handler.ConfigurationHandler;
import com.Daejang.letsmodreboot.init.ModBlocks;
import com.Daejang.letsmodreboot.init.ModItems;
import com.Daejang.letsmodreboot.proxy.IProxy;
import com.Daejang.letsmodreboot.reference.ModInfo;
import com.Daejang.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION, guiFactory = ModInfo.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(ModInfo.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY_CLASS, serverSide = ModInfo.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //For loading mod config, items, blocks
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        ModItems.init();  //Getting the items in the game
        ModBlocks.init(); //Getting the blocks in the game


        LogHelper.info("Pre Initialization Complete!");

    }

    //For registering GUI, tile entities, crafting recipes
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        LogHelper.info("Initialization Complete!");
    }

    //For running things after init is done
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post Initialization Complete!");
    }
}
