package io.github.ittosanzzo.albinaprops.common.registry;

import io.github.ittosanzzo.albinaprops.AlbinaProps;
import static net.minecraft.core.registries.Registries.CREATIVE_MODE_TAB;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(CREATIVE_MODE_TAB, AlbinaProps.MODID);
	public static void register(FMLJavaModLoadingContext context) {
		TABS.register(context.getModEventBus());
	}

	public static final RegistryObject<CreativeModeTab> ALBINA_PROPS = TABS.register(
		AlbinaProps.MODID,
		() -> CreativeModeTab.builder()
			.title(Component.translatable("itemGroup."+ AlbinaProps.MODID + "." + AlbinaProps.MODID))
			.icon(() -> new ItemStack(ModItems.CARMEN_AB_INITIO.get()))
			.displayItems((params, output) -> {
				ModItems.ITEMS.getEntries().forEach(item -> {
					output.accept(item.get());
				});
			})
			.build()
	);
}
