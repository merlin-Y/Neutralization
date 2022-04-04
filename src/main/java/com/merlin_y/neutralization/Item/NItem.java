package com.merlin_y.neutralization.Item;

import com.merlin_y.neutralization.Block.NBlock;
import com.merlin_y.neutralization.Utils;
import com.merlin_y.neutralization.enums.NItemTier;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class NItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> ObsidianIngot = ITEMS.register("obsidian_ingot",
            ()->new Item(new Item.Properties().tab(ItemGroup.TAB_MATERIALS)));

    public static final RegistryObject<Item> ObsidianApple = ITEMS.register("obsidian_apple",
            ()->new Item(new Item.Properties().food(new Food.Builder().nutrition(4).saturationMod(10).build()).tab(ItemGroup.TAB_FOOD)));

    public static final RegistryObject<Item> ObsidianSword = ITEMS.register("obsidian_sword",
            ()->new CommonSword(NItemTier.OBSIDIAN,3,-2.4f,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static final RegistryObject<Item> ObsidianPickaxe = ITEMS.register("obsidian_pickaxe",
            ()->new CommonPickaxe(NItemTier.OBSIDIAN,3,-2.4f,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<BlockItem> ObsidianBlock = ITEMS.register("obsidian_block",()->new BlockItem(NBlock.ObsidianBlock.get(),new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<BlockItem> ChangedBlock = ITEMS.register("changed_block",()->new BlockItem(NBlock.ChangedBlock.get(),new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

}
