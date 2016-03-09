package com.Daejang.letsmodreboot.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {

        GameRegistry.addRecipe(new ItemStack(ModItems.wonderIngotItem), " i ", " d ", " g ", 'i', new ItemStack(Items.iron_ingot), 'd', new ItemStack(Items.diamond), 'g', new ItemStack(Items.gold_ingot));
        GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeItem), "www", " s ", " s ", 'w', new ItemStack(ModItems.wonderIngotItem), 's', new ItemStack(Items.stick));
    }
}
