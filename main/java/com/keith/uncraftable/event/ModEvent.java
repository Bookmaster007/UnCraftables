package com.keith.uncraftable.event;

import com.keith.uncraftable.UNCraftable;
import com.keith.uncraftable.item.ModItems;

import com.keith.uncraftable.util.ModTags;
import net.minecraft.client.renderer.entity.ItemEntityRenderer;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.AxeItem;
import java.util.List;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static net.minecraftforge.common.ToolActions.AXE_STRIP;

public class ModEvent {
    @Mod.EventBusSubscriber(modid = UNCraftable.MODID)
    public class ForgeEvent{
        @SubscribeEvent
        public static void onlogstrip( BlockEvent.BlockToolModificationEvent event){
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.OAK_LOG || event.getState().getBlock() == Blocks.OAK_WOOD)){
                event.getPlayer().addItem(ModItems.TREE_BARK.get().getDefaultInstance());
            }
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.ACACIA_LOG || event.getState().getBlock() == Blocks.ACACIA_WOOD)){
                event.getPlayer().addItem(ModItems.ACACIA_BARK.get().getDefaultInstance());
            }
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.DARK_OAK_LOG || event.getState().getBlock() == Blocks.DARK_OAK_WOOD)){
                event.getPlayer().addItem(ModItems.DARK_OAK_BARK.get().getDefaultInstance());
            }
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.BIRCH_LOG || event.getState().getBlock() == Blocks.BIRCH_WOOD)){
                event.getPlayer().addItem(ModItems.BIRCH_BARK.get().getDefaultInstance());
            }            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.CRIMSON_STEM || event.getState().getBlock() == Blocks.CRIMSON_HYPHAE)){
                event.getPlayer().addItem(ModItems.CRIMSON_BARK.get().getDefaultInstance());
            }
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.JUNGLE_LOG || event.getState().getBlock() == Blocks.JUNGLE_WOOD)){
                event.getPlayer().addItem(ModItems.JUNGLE_BARK.get().getDefaultInstance());
            }
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.MANGROVE_LOG || event.getState().getBlock() == Blocks.MANGROVE_WOOD)){
                event.getPlayer().addItem(ModItems.MANGROVE_BARK.get().getDefaultInstance());
            }
            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.SPRUCE_LOG || event.getState().getBlock() == Blocks.SPRUCE_WOOD)){
                event.getPlayer().addItem(ModItems.SPRUCE_BARK.get().getDefaultInstance());
            }            if(event.getToolAction() == AXE_STRIP && (event.getState().getBlock() == Blocks.WARPED_STEM || event.getState().getBlock() == Blocks.WARPED_HYPHAE)){
                event.getPlayer().addItem(ModItems.WARPED_BARK.get().getDefaultInstance());
            }
        }
    }
}
