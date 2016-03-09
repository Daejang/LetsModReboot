package com.Daejang.letsmodreboot.creativetab;

import com.Daejang.letsmodreboot.init.ModItems;
import com.Daejang.letsmodreboot.reference.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMRB {

    public static final CreativeTabs LMRB_TAB = new CreativeTabs(ModInfo.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ModItems.creativeItem;
        }
    };
}
