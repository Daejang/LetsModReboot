package com.Daejang.letsmodreboot.init;

import com.Daejang.letsmodreboot.item.*;
import com.Daejang.letsmodreboot.reference.ModToolMaterial;
import com.Daejang.letsmodreboot.reference.Names;
import com.Daejang.letsmodreboot.reference.ModInfo;
import com.Daejang.letsmodreboot.tool.ItemPickaxeLMRB;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

//This is where you initialize your items and get them in the game
@GameRegistry.ObjectHolder(ModInfo.MOD_ID)  // This is for keeping our objects safe from tamper from other mods
public class ModItems {


    public static final ItemLMRB creativeLogo = new ItemCreativeLogo(); //The logo for the creative tab
    public static final ItemLMRB laFace = new ItemMyLilFace();
    public static final ItemLMRB wonderIngotItem = new ItemWonderIngot();
    public static final ItemLMRB basicParticleItem = new ItemMostBasicParticle();
    public static final Item laFaceEye = new ItemLMRB().setUnlocalizedName(Names.Items.LA_FACE_EYE);
    public static final Item laFaceMouth = new ItemLMRB().setUnlocalizedName(Names.Items.LA_FACE_MOUTH);
    public static final Item laFaceHead = new ItemLMRB().setUnlocalizedName(Names.Items.LA_FACE_HEAD);

//    public static final ItemTool pickaxeItem = new ItemPickaxeOne();  //Make ItemTool have a child called ItemToolMod
    public static final Item truePickaxe = new ItemPickaxeLMRB(Names.Tools.THEE_PICKAXE, ModToolMaterial.SPECIALSAUCE);

    public static void init() {
        //Goes into the game register
        GameRegistry.registerItem(creativeLogo, Names.Items.CREATIVE_LOGO);
        GameRegistry.registerItem(basicParticleItem, Names.Items.MOST_BASIC_PARTICLE);
        GameRegistry.registerItem(laFace, Names.Items.LA_FACE);
        GameRegistry.registerItem(laFaceEye, Names.Items.LA_FACE_EYE);
        GameRegistry.registerItem(laFaceMouth, Names.Items.LA_FACE_MOUTH);
        GameRegistry.registerItem(laFaceHead, Names.Items.LA_FACE_HEAD);

        //Ingots
        GameRegistry.registerItem(wonderIngotItem, Names.Items.WONDER_INGOT);

        //Tools
//        GameRegistry.registerItem(pickaxeItem, Names.Tools.THEE_PICKAXE);
        GameRegistry.registerItem(truePickaxe, Names.Tools.THEE_PICKAXE);
    }


    // Don't forget to set the name in the en_US.lang file
}
