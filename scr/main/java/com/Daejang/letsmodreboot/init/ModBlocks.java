package com.Daejang.letsmodreboot.init;

import com.Daejang.letsmodreboot.block.BlockLMRB;
import com.Daejang.letsmodreboot.block.BlockSacredObject;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModInfo.MOD_ID)  // This is for keeping our objects safe from tamper from other mods
public class ModBlocks {

    public static final BlockLMRB sacredObject = new BlockSacredObject();

    public static void init() {
        GameRegistry.registerBlock(sacredObject, "sacredObject");  //Later change the name string to a constant
    }
}
