package io.github.ittosanzzo.albinaprops;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import io.github.ittosanzzo.albinaprops.common.registry.ModCreativeTabs;
import io.github.ittosanzzo.albinaprops.common.registry.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AlbinaProps.MODID)
public class AlbinaProps {
	public static final String MODID = "albinaprops";
	public static final Logger LOGGER = LogUtils.getLogger();

	public AlbinaProps(FMLJavaModLoadingContext context) {
		ModItems.register(context);
		ModCreativeTabs.register(context);
	}

	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {

		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}
