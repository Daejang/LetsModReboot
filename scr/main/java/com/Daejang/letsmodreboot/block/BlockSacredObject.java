package com.Daejang.letsmodreboot.block;

import com.Daejang.letsmodreboot.reference.Names;

public class BlockSacredObject extends BlockLMRB {

    public BlockSacredObject() {

        super();
        this.setBlockName(Names.Blocks.SACRED_BLOCK);
        this.setBlockTextureName("sacredObject");


        this.setLightLevel(1F);
        this.setHardness(5F);

    }
}
