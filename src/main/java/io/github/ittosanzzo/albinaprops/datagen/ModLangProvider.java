package io.github.ittosanzzo.albinaprops.datagen;

import io.github.ittosanzzo.albinaprops.AlbinaProps;

import io.github.ittosanzzo.albinaprops.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLangProvider extends LanguageProvider {
	public ModLangProvider(PackOutput output) {
		super(output, AlbinaProps.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		ModItems.PROP_LANG.forEach((item, name) -> {
			add(item.get(), name);
		});
	}
}
