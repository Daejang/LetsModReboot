package com.Daejang.letsmodreboot.block.worldgen;

import com.Daejang.letsmodreboot.init.ModItems;
import com.Daejang.letsmodreboot.reference.Names;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockParticleOre extends BlockItemOre {

    public BlockParticleOre() {
        super(Names.Blocks.MOST_BASIC_PARTICLE_ORE);
    }

    @Override
    public int getExpDrop(IBlockAccess par1, int par2, int par3) {
        Random rand = new Random();
        return MathHelper.getRandomIntegerInRange(rand, 3, 7);
    }

    @Override
    public Item getItemDropped(int par1, Random par2, int par3) {

        return ModItems.basicParticleItem;
    }
}
