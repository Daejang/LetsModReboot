package com.Daejang.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes {

    //Minecraft things
    private static ItemStack gold = new ItemStack(Items.gold_ingot);
    private static ItemStack goldBlock = new ItemStack(Blocks.gold_block);
    private static ItemStack diamond = new ItemStack(Items.diamond);
    private static ItemStack obsidian = new ItemStack(Blocks.obsidian);

    //Mod things
    private static ItemStack basicParticle = new ItemStack(ModItems.basicParticleItem);
    private static ItemStack wonderIngot = new ItemStack(ModItems.wonderIngotItem);
    private static ItemStack pickaxeOfChipping = new ItemStack(ModItems.truePickaxe);
    private static ItemStack laFace =  new ItemStack(ModItems.laFace);
    private static ItemStack laFaceEye =  new ItemStack(ModItems.laFaceEye);
    private static ItemStack laFaceMouth = new ItemStack(ModItems.laFaceMouth);
    private static ItemStack laFaceHead = new ItemStack(ModItems.laFaceHead);
    private static ItemStack sacredBlock = new ItemStack(ModBlocks.sacredBlock);

    public static void init() {

        GameRegistry.addRecipe(new ShapedOreRecipe(wonderIngot, "bdb", "cgp", "bob", 'b', basicParticle, 'g', gold, 'd', diamond, 'o', obsidian, 'c', "dyeCyan", 'p', "dyePurple"));
        GameRegistry.addRecipe(pickaxeOfChipping, "www", " s ", " s ", 'w', wonderIngot, 's', new ItemStack(Items.stick));

        GameRegistry.addRecipe(laFaceEye, " b ", "b b", " b ", 'b', basicParticle);
        GameRegistry.addRecipe(laFaceMouth, "   ", "b b", "bbb", 'b', basicParticle);
        GameRegistry.addRecipe(laFaceHead, "bbb", "b b", "bbb", 'b', basicParticle);
        GameRegistry.addRecipe(laFace, "   ", "ehe", " m ", 'e', laFaceEye, 'm', laFaceMouth, 'h', laFaceHead);
        GameRegistry.addRecipe(sacredBlock, " f ", "fgf", " f ", 'f', laFace, 'g', goldBlock);


    }
}
