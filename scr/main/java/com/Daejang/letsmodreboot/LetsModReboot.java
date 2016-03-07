package com.Daejang.letsmodreboot;

import com.Daejang.letsmodreboot.proxy.IProxy;
import com.Daejang.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    //For loading mod config, items, blocks
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    //For registering GUI, tile entities, crafting recipes
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    //For running things after init is done
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
