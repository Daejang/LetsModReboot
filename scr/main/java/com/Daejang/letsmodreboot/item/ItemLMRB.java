package com.Daejang.letsmodreboot.item;

import com.Daejang.letsmodreboot.creativetab.CreativeTabLMRB;
import com.Daejang.letsmodreboot.reference.ModInfo;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

// Properties common to all items
public class ItemLMRB extends Item {

    public ItemLMRB() {

        super();
        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
//        this.setNoRepair();
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
