package com.merlin_y.neutralization.Item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.SwordItem;

public class CommonSword extends SwordItem {

    public CommonSword(IItemTier Tier, int attackDamageIn, float attackSpeedIn, Properties BuilderIn) {
        super(Tier, attackDamageIn, attackSpeedIn, BuilderIn);
    }
}
