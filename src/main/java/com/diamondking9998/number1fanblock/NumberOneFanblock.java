package com.diamondking9998.number1fanblock;

import com.diamondking9998.number1fanblock.item.NCAA_suite;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// Client-only imports for model registration
import net.minecraft.resources.ResourceLocation;

// New imports for the helper
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NumberOneFanblock.MOD_ID)
public class NumberOneFanblock {
    public static final String MOD_ID = "number1fanblock";
    public static final Logger LOGGER = LogUtils.getLogger();

    public NumberOneFanblock() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register deferred registries
        com.diamondking9998.number1fanblock.item.NCAA_suite.register(modEventBus);
        com.diamondking9998.number1fanblock.item.ModCreativeTabs.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the items to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(NCAA_suite.NCAA_CORE);

            event.accept(NCAA_suite.NCAA_D1_CORE);

            event.accept(NCAA_suite.FBS_CORE);
            event.accept(NCAA_suite.FCS_CORE);
            event.accept(NCAA_suite.NON_FOOTBALL_D1_CORE);

            event.accept(NCAA_suite.AMERICAN_CORE);
            event.accept(NCAA_suite.ATLANTIC_COAST_CORE);
            event.accept(NCAA_suite.BIG_10_CORE);
            event.accept(NCAA_suite.BIG_XII_CORE);
            event.accept(NCAA_suite.CONF_USA_CORE);
            event.accept(NCAA_suite.FBS_INDEPENDENTS_CORE);
            event.accept(NCAA_suite.MAC_CORE);
            event.accept(NCAA_suite.MOUNTAIN_WEST_CORE);
            event.accept(NCAA_suite.PAC_12_CORE);
            event.accept(NCAA_suite.SOUTHEASTERN_CORE);
            event.accept(NCAA_suite.SUN_BELT_CORE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
