package com.keith.uncraftable.item;

import com.keith.uncraftable.UNCraftable;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UNCraftable.MODID);
    public static final RegistryObject<Item> TREE_BARK = ITEMS.register("tree_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> TANNIN = ITEMS.register("tannin",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> ACACIA_BARK = ITEMS.register("acacia_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> DARK_OAK_BARK = ITEMS.register("dark_oak_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> BIRCH_BARK = ITEMS.register("birch_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> CRIMSON_BARK = ITEMS.register("crimson_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> MANGROVE_BARK = ITEMS.register("mangrove_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> JUNGLE_BARK = ITEMS.register("jungle_bark",()->new Item( new Item.Properties()));

    public static final RegistryObject<Item> SPRUCE_BARK = ITEMS.register("spruce_bark",()->new Item( new Item.Properties()));
    public static final RegistryObject<Item> WARPED_BARK = ITEMS.register("warped_bark",()->new Item( new Item.Properties()));






    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}
