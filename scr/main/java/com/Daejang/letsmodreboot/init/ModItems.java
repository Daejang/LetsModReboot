package com.Daejang.letsmodreboot.init;

import com.Daejang.letsmodreboot.item.ItemCreativeLogo;
import com.Daejang.letsmodreboot.item.ItemLMRB;
import com.Daejang.letsmodreboot.item.ItemMyLilFace;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;

//This is where you initialize your items and get them in the game
@GameRegistry.ObjectHolder(ModInfo.MOD_ID)  // This is for keeping our objects safe from tamper from other mods
public class ModItems {

    public static final ItemLMRB creativeItem = new ItemCreativeLogo();
    public static final ItemLMRB logoItem = new ItemMyLilFace();

    public static void init() {
        GameRegistry.registerItem(creativeItem, "creativeLogo");
        GameRegistry.registerItem(logoItem, "leFace");
    }

}
