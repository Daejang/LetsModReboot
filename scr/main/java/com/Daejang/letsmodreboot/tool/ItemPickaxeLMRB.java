package com.Daejang.letsmodreboot.tool;

import com.Daejang.letsmodreboot.creativetab.CreativeTabLMRB;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemPickaxeLMRB extends ItemPickaxe {

    public ItemPickaxeLMRB(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
        this.maxStackSize = 1;
    }

    @Override
    public String getUnlocalizedName() {
        // format: item.modid:itemname.name
        return String.format("item.%s%s", ModInfo.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()) );
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        // format: item.modid:itemname.name
        return String.format("item.%s%s", ModInfo.LOWERCASE_MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
