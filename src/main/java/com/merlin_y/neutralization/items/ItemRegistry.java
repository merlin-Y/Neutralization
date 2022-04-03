package com.merlin_y.neutralization.items;

import com.merlin_y.neutralization.*;
import com.merlin_y.neutralization.moditemtier.ModItemTiers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    public static final RegistryObject<Item> ObsidianIngot = ITEMS.register("obsidian_ingot",ObsidianIngot::new);
    public static final RegistryObject<Item> ObsidianApple = ITEMS.register("obsidian_apple",()->new Item(new Item.Properties().food(Foods.ObsidianApple).tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> ObsidianSword = ITEMS.register("obsidian_sword",
            ()->new ObsidianSword(ModItemTiers.Obsidian,new Item.Properties().tab(ItemGroup.TAB_COMBAT)));
    public static final RegistryObject<Item> obsidianpickaxe = ITEMS.register("obsidian_pickaxe",
            ()->new ObsidianPickaxe(ModItemTiers.Obsidian,3,-3f,new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
}
