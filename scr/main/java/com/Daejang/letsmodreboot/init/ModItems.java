package com.Daejang.letsmodreboot.init;

import com.Daejang.letsmodreboot.item.*;
import com.Daejang.letsmodreboot.reference.ModToolMaterial;
import com.Daejang.letsmodreboot.reference.Names;
import com.Daejang.letsmodreboot.reference.ModInfo;
import com.Daejang.letsmodreboot.tool.ItemPickaxeLMRB;
import com.Daejang.letsmodreboot.tool.ItemPickaxeOne;
import com.sun.tools.javac.jvm.ClassFile;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

//This is where you initialize your items and get them in the game
@GameRegistry.ObjectHolder(ModInfo.MOD_ID)  // This is for keeping our objects safe from tamper from other mods
public class ModItems {


    public static final ItemLMRB creativeLogo = new ItemCreativeLogo(); //The logo for the creative tab
    public static final ItemLMRB logoItem = new ItemMyLilFace();
    public static final ItemLMRB wonderIngotItem = new ItemWonderIngot();
    public static final ItemLMRB basicParticleItem = new ItemMostBasicParticle();

//    public static final ItemTool pickaxeItem = new ItemPickaxeOne();  //Make ItemTool have a child called ItemToolMod
    public static final Item truePickaxe = new ItemPickaxeLMRB(Names.Tools.THEE_PICKAXE, ModToolMaterial.SPECIALSAUCE);

    public static void init() {
        //Goes into the game register
        GameRegistry.registerItem(creativeLogo, Names.Items.CREATIVE_LOGO);
        GameRegistry.registerItem(logoItem, Names.Items.LE_FACE);
        GameRegistry.registerItem(basicParticleItem, Names.Items.MOST_BASIC_PARTICLE);

        //Ingots
        GameRegistry.registerItem(wonderIngotItem, Names.Items.WONDER_INGOT);

        //Tools
//        GameRegistry.registerItem(pickaxeItem, Names.Tools.THEE_PICKAXE);
        GameRegistry.registerItem(truePickaxe, Names.Tools.THEE_PICKAXE);
    }


    // Don't forget to set the name in the en_US.lang file
}
