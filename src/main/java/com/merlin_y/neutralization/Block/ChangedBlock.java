package com.merlin_y.neutralization.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;

public class ChangedBlock extends Block {
    private static final IntegerProperty STATE = IntegerProperty.create("face",0,1);

    ChangedBlock(Properties BuilderIn){
        super(BuilderIn);
        this.registerDefaultState(this.getStateDefinition().any().setValue(STATE,0));
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> Builder) {
        Builder.add(STATE);
        super.createBlockStateDefinition(Builder);
    }

}
