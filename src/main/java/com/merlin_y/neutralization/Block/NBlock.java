package com.merlin_y.neutralization.Block;

import com.merlin_y.neutralization.Utils;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NBlock {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);

    public static final RegistryObject<Block> ObsidianBlock = BLOCKS.register("obsidian_block",
            ()->new CommonBlock(Block.Properties.of(Material.STONE).speedFactor(1500).strength(5,6).harvestLevel(3).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
    public static final RegistryObject<Block> ChangedBlock = BLOCKS.register("changed_block",
            ()->new ChangedBlock(Block.Properties.of(Material.STONE).speedFactor(1500).strength(5,6).harvestLevel(3).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));
}
