package com.Daejang.letsmodreboot.block;

import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLMRB extends Block {

    public BlockLMRB(Material material) {

        super(material);
    }

    public BlockLMRB() {

        this(Material.iron);  //Default material. Appears on the map as the material color.
    }

    @Override
    public String getUnlocalizedName() {
        //format for en_US.lang: tile.modid:blockname.name
        return String.format("tile.%s%s", ModInfo.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
