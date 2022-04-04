package com.merlin_y.neutralization;

import com.merlin_y.neutralization.Block.NBlock;
import com.merlin_y.neutralization.Item.NItem;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(Utils.MOD_ID)
public class Neutralization {
    public Neutralization(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::Setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
        NItem.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        NBlock.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void Setup(final FMLCommonSetupEvent event){

    }

    private void ClientSetup(final FMLClientSetupEvent event){

    }

    private void OnServerStarting(FMLServerStartingEvent event){

    }
}
