package com.Daejang.letsmodreboot.block.worldgen;

import com.Daejang.letsmodreboot.block.BlockLMRB;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockItemOre extends BlockLMRB{

    protected Random random = new Random();

    public BlockItemOre(String name) {

        super(Material.iron);
        this.setBlockName(name);
//        this.setBlockTextureName(name);
        this.setHardness(2.5F);
        this.setResistance(10.0F);
//        this.setHarvestLevel();
    }

    @Override
    public int quantityDroppedWithBonus(int quantity, Random rand) {

        if (quantity > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, rand, quantity)) {
            int j = rand.nextInt(quantity + 2) - 1;
            if (j < 0) {
                j = 0;
            }
            return this.quantityDropped(rand) * (j + 1);
        } else {
            return this.quantityDropped(rand);
        }
    }

}
