package io.github.ittosanzzo.albinaprops.datagen;

import io.github.ittosanzzo.albinaprops.AlbinaProps;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AlbinaProps.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		var generator = event.getGenerator();
		var output = generator.getPackOutput();
		var helper = event.getExistingFileHelper();

		generator.addProvider(event.includeClient(), new ModLangProvider(output));
		generator.addProvider(event.includeClient(), new ModItemModelProvider(output, helper));
	}
}