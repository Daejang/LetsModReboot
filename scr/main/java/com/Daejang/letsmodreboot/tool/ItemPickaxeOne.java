package com.Daejang.letsmodreboot.tool;

import com.Daejang.letsmodreboot.reference.ModToolMaterial;
import com.Daejang.letsmodreboot.reference.Names;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;


import java.util.Set;

public class ItemPickaxeOne extends ItemPickaxeLMRB{

//    private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[]{Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone, Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block, Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore, Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail, Blocks.golden_rail, Blocks.activator_rail});

    public ItemPickaxeOne() {

        //Extra DamageVsEntity, tool material, what blocks it's good against
        super(Names.Tools.THEE_PICKAXE, ModToolMaterial.SPECIALSAUCE);
//        this.setUnlocalizedName();
//        this.setMaxStackSize(1);

    }
}
