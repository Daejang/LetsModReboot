package com.Daejang.letsmodreboot.client.gui;

import com.Daejang.letsmodreboot.handler.ConfigurationHandler;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

public class ModGuiConfig extends GuiConfig {

        //This needs questioning
//    public ModGuiConfig(GuiScreen parentScreen, List<IConfigElement> configElements, String modID, boolean allRequireWorldRestart, boolean allRequireMcRestart, String title) {
//        super(parentScreen, configElements, modID, allRequireWorldRestart, allRequireMcRestart, title);
//    }

    public ModGuiConfig (GuiScreen parentScreen) {
        super(parentScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ModInfo.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
