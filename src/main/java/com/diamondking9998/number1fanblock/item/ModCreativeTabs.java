package com.diamondking9998.number1fanblock.item;

import com.diamondking9998.number1fanblock.NumberOneFanblock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NumberOneFanblock.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NCAA_CREATIVETAB = CREATIVE_MODE_TABS.register("ncaa_creativetab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NCAA_suite.NCAA_CORE.get()))
                    .title(Component.translatable("creativetab.ncaa_creativetab"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(NCAA_suite.NCAA_CORE.get());

                        pOutput.accept(NCAA_suite.NCAA_D1_CORE.get());

                        pOutput.accept(NCAA_suite.FBS_CORE.get());
                        pOutput.accept(NCAA_suite.FCS_CORE.get());
                        pOutput.accept(NCAA_suite.NON_FOOTBALL_D1_CORE.get());

                        pOutput.accept(NCAA_suite.AMERICAN_CORE.get());
                        pOutput.accept(NCAA_suite.ATLANTIC_COAST_CORE.get());
                        pOutput.accept(NCAA_suite.BIG_10_CORE.get());
                        pOutput.accept(NCAA_suite.BIG_XII_CORE.get());
                        pOutput.accept(NCAA_suite.CONF_USA_CORE.get());
                        pOutput.accept(NCAA_suite.FBS_INDEPENDENTS_CORE.get());
                        pOutput.accept(NCAA_suite.MAC_CORE.get());
                        pOutput.accept(NCAA_suite.MOUNTAIN_WEST_CORE.get());
                        pOutput.accept(NCAA_suite.PAC_12_CORE.get());
                        pOutput.accept(NCAA_suite.SOUTHEASTERN_CORE.get());
                        pOutput.accept(NCAA_suite.SUN_BELT_CORE.get());

                        // THE AMERICAN CONFERENCE
                        pOutput.accept(NCAA_suite.WICHITA_STATE_CORE.get());
                        // CONFERENCE USA
                        pOutput.accept(NCAA_suite.LIBERTY_CORE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }
}
