package com.Daejang.letsmodreboot.item;

import com.Daejang.letsmodreboot.reference.Names;

public class ItemMyLilFace extends ItemLMRB {

    public ItemMyLilFace() {

        super();
//        this.setMaxStackSize(64);
        this.setUnlocalizedName(Names.Items.LE_FACE);  //Make sure that the texture name matches so it can appear in-game
        this.setTextureName("leFace");      //Look for a way the assign a texture under a different name
//        this.setCreativeTab(CreativeTabLMRB.LMRB_TAB);
    }
}
