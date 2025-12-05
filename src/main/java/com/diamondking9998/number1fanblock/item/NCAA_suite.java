package com.diamondking9998.number1fanblock.item;

import com.diamondking9998.number1fanblock.NumberOneFanblock;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NCAA_suite {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NumberOneFanblock.MOD_ID);

    //NCAA CORE
    public static final RegistryObject<Item> NCAA_CORE = ITEMS.register("ncaa_core",
            () -> new Item(new Item.Properties()));

    //D1 CORE
    public static final RegistryObject<Item> NCAA_D1_CORE = ITEMS.register("ncaa_d1_core",
            () -> new Item(new Item.Properties()));

    //D1 DIVISIONS
    public static final RegistryObject<Item> FBS_CORE = ITEMS.register("fbs_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FCS_CORE = ITEMS.register("fcs_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NON_FOOTBALL_D1_CORE = ITEMS.register("non_football_d1_core",
            () -> new Item(new Item.Properties()));

    //FBS CONFERENCES (AND INDEPENDENTS)
    public static final RegistryObject<Item> AMERICAN_CORE = ITEMS.register("american_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ATLANTIC_COAST_CORE = ITEMS.register("atlantic_coast_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_10_CORE = ITEMS.register("big_10_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BIG_XII_CORE = ITEMS.register("big_xii_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CONF_USA_CORE = ITEMS.register("conf_usa_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FBS_INDEPENDENTS_CORE = ITEMS.register("fbs_independents_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAC_CORE = ITEMS.register("mac_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOUNTAIN_WEST_CORE = ITEMS.register("mountain_west_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAC_12_CORE = ITEMS.register("pac_12_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUTHEASTERN_CORE = ITEMS.register("southeastern_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUN_BELT_CORE = ITEMS.register("sun_belt_core",
            () -> new Item(new Item.Properties()));

    //THE AMERICAN CONFERENCE
    public static final RegistryObject<Item> WICHITA_STATE_CORE = ITEMS.register("wichita_state_core",
            () -> new Item(new Item.Properties()));
    //CONFERENCE USA
    public static final RegistryObject<Item> LIBERTY_CORE = ITEMS.register("liberty_core",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
