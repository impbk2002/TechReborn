package techreborn.blocks.generator;

import net.minecraft.block.material.Material;
import reborncore.common.blocks.BlockMachineBase;
import reborncore.common.blocks.IAdvancedRotationTexture;
import techreborn.client.TechRebornCreativeTab;

public class BlockLightningRod extends BlockMachineBase implements IAdvancedRotationTexture {


    public BlockLightningRod(Material material) {
        super();
        setUnlocalizedName("techreborn.lightningrod");
        setCreativeTab(TechRebornCreativeTab.instance);
    }

    private final String prefix = "techreborn:blocks/machine/generators/";

    @Override
    public String getFront(boolean isActive) {
        return prefix + "lightning_rod_side";
    }

    @Override
    public String getSide(boolean isActive) {
        return prefix + "lightning_rod_side" ;
    }

    @Override
    public String getTop(boolean isActive) {
        return prefix + "lightning_rod_top";
    }

    @Override
    public String getBottom(boolean isActive) {
        return prefix + "lightning_rod_bottom";
    }

}
