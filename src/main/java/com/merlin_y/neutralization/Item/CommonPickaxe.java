package com.merlin_y.neutralization.Item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class CommonPickaxe extends PickaxeItem {
    public CommonPickaxe(IItemTier Tier, int attackDamageIn, float attackSpeedIn, Properties BuilderIn) {
        super(Tier, attackDamageIn, attackSpeedIn, BuilderIn);
    }
}
