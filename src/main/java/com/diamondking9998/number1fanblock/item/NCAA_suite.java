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
    //BIG 10 CONFERENCE
    public static final RegistryObject<Item> ILLINOIS_CORE = ITEMS.register("illinois_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INDIANA_CORE = ITEMS.register("indiana_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IOWA_CORE = ITEMS.register("iowa_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MARYLAND_CORE = ITEMS.register("maryland_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MICHIGAN_CORE = ITEMS.register("michigan_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MICHIGAN_STATE_CORE = ITEMS.register("michigan_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINNESOTA_CORE = ITEMS.register("minnesota_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEBRASKA_CORE = ITEMS.register("nebraska_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NORTHWESTERN_CORE = ITEMS.register("northwestern_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OHIO_STATE_CORE = ITEMS.register("ohio_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OREGON_CORE = ITEMS.register("oregon_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PENN_STATE_CORE = ITEMS.register("penn_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PURDUE_CORE = ITEMS.register("purdue_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUTGERS_CORE = ITEMS.register("rutgers_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UCLA_CORE = ITEMS.register("ucla_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> USC_CORE = ITEMS.register("usc_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WASHINGTON_CORE = ITEMS.register("washington_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WISCONSIN_CORE = ITEMS.register("wisconsin_core",
            () -> new Item(new Item.Properties()));
    //CONFERENCE USA
    public static final RegistryObject<Item> DELAWARE_CORE = ITEMS.register("delaware_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIU_CORE = ITEMS.register("fiu_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JAX_STATE_CORE = ITEMS.register("jax_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENNESAW_STATE_CORE = ITEMS.register("kennesaw_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIBERTY_CORE = ITEMS.register("liberty_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIDDLE_TENNESSEE_STATE_CORE = ITEMS.register("middle_tennessee_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MISSOURI_STATE_CORE = ITEMS.register("missouri_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEW_MEXICO_STATE_CORE = ITEMS.register("new_mexico_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAM_HOUSTON_STATE_CORE = ITEMS.register("sam_houston_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WESTERN_KENTUCKY_CORE = ITEMS.register("western_kentucky_core",
            () -> new Item(new Item.Properties()));
    //MID-AMERICAN CONFERENCE
    public static final RegistryObject<Item> AKRON_CORE = ITEMS.register("akron_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BALL_STATE_CORE = ITEMS.register("ball_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BOWLING_GREEN_CORE = ITEMS.register("bowling_green_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BUFFALO_CORE = ITEMS.register("buffalo_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CENTRAL_MICHIGAN_CORE = ITEMS.register("central_michigan_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EASTERN_MICHIGAN_CORE = ITEMS.register("eastern_michigan_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KENT_STATE_CORE = ITEMS.register("kent_state_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MIAMI_OH_CORE = ITEMS.register("miami_oh_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OHIO_CORE = ITEMS.register("ohio_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOLEDO_CORE = ITEMS.register("toledo_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UMASS_CORE = ITEMS.register("umass_core",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WESTERN_MICHIGAN_CORE = ITEMS.register("western_michigan_core",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
