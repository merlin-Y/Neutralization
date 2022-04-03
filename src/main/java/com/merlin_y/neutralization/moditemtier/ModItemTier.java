package com.merlin_y.neutralization.moditemtier;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public class ModItemTier implements IItemTier {

    private final int harvestLevel;
    private final float speed;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    private int maxUses;
    private float baseDamage;
    private String name;

    ModItemTier(String name,int maxuses,int harvestLevel,int enchantability,float speed,float baseDamage,Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxUses = maxuses;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.speed = speed;
        this.baseDamage = baseDamage;
        this.repairMaterial = repairMaterial;
    }
    ModItemTier(String name, ItemTiers ItemTier, Supplier<Ingredient> repairMaterial){
        this(name,ItemTier.getUses(),ItemTier.getLevel(),ItemTier.getEnchantmentValue(),ItemTier.getSpeed(),ItemTier.getAttackDamageBonus(),repairMaterial);
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return baseDamage;
    }

    @Override
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }
}
