package com.merlin_y.neutralization.enums;

import com.merlin_y.neutralization.Item.NItem;
import com.sun.istack.internal.NotNull;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum NItemTier implements IItemTier{
    OBSIDIAN(4, 2500, 6.0F, 4.0F, 14, () -> {
        return Ingredient.of(NItem.ObsidianIngot.get());
    })
    ;

    private final int harvestLevel;
    private final float efficiency;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    private final int maxUses;
    private final float attackDamage;

    NItemTier(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = damage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @NotNull
    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
