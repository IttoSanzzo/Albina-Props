package io.github.ittosanzzo.albinaprops.datagen;

import io.github.ittosanzzo.albinaprops.AlbinaProps;
import io.github.ittosanzzo.albinaprops.common.registry.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraft.server.packs.PackType;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper helper) {
		super(output, AlbinaProps.MODID, helper);
	}

	@Override
	protected void registerModels() {
		ModItems.PROP_LANG.keySet().forEach(item -> {
			String name = item.getId().getPath();

			ResourceLocation texture = existingFileHelper.exists(
				modLoc("textures/item/" + name + ".png"),
				PackType.CLIENT_RESOURCES
			) ? modLoc("item/" + name)
				: modLoc("item/placeholder");

			withExistingParent(name, mcLoc("item/generated"))
				.texture("layer0", texture);
			// getBuilder(name)
				// .parent(getExistingFile(mcLoc("item/generated")))
				// .texture("layer0", modLoc("item/" + name));
		});
	}
	// @Override
	// protected void registerModels() {
	// 	ModItems.PROP_LANG.keySet().forEach(item -> {
	// 		basicItem(item.get());
	// 	});
	// }
}
