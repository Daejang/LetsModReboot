package com.Daejang.letsmodreboot.init;

import com.Daejang.letsmodreboot.block.BlockLMRB;
import com.Daejang.letsmodreboot.block.BlockSacredObject;
import com.Daejang.letsmodreboot.block.worldgen.BlockParticleOre;
import com.Daejang.letsmodreboot.reference.Names;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(ModInfo.MOD_ID)  // This is for keeping our objects safe from tamper from other mods
public class ModBlocks {

    public static final BlockLMRB sacredObjectBlock = new BlockSacredObject();
    public static final BlockLMRB basicParticleOreBlock = new BlockParticleOre();

    public static void init() {
        GameRegistry.registerBlock(sacredObjectBlock, Names.Blocks.SACRED_BLOCK);
        GameRegistry.registerBlock(basicParticleOreBlock, Names.Blocks.MOST_BASIC_PARTICLE_ORE);
    }
}
