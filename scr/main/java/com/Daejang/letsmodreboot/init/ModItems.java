package com.Daejang.letsmodreboot.init;

import com.Daejang.letsmodreboot.item.*;
import com.Daejang.letsmodreboot.reference.Names;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;

//This is where you initialize your items and get them in the game
@GameRegistry.ObjectHolder(ModInfo.MOD_ID)  // This is for keeping our objects safe from tamper from other mods
public class ModItems {


    public static final ItemLMRB creativeLogo = new ItemCreativeLogo(); //The logo for the creative tab
    public static final ItemLMRB logoItem = new ItemMyLilFace();
    public static final ItemLMRB pickaxeItem = new ItemPickaxeOne();
    public static final ItemLMRB wonderIngotItem = new ItemWonderIngot();

    public static void init() {
        //Goes into the game register
        GameRegistry.registerItem(creativeLogo, Names.Items.CREATIVE_LOGO);
        GameRegistry.registerItem(logoItem, Names.Items.LE_FACE);
        GameRegistry.registerItem(pickaxeItem, Names.Items.THEE_PICKAXE);
        GameRegistry.registerItem(wonderIngotItem, Names.Items.WONDER_INGOT);
    }

}
