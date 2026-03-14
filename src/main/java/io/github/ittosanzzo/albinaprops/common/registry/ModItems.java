package io.github.ittosanzzo.albinaprops.common.registry;

import java.util.LinkedHashMap;
import java.util.Map;

import io.github.ittosanzzo.albinaprops.AlbinaProps;
import io.github.ittosanzzo.albinaprops.common.item.PropItem;
import io.github.ittosanzzo.albinaprops.common.utils.StringUtils;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AlbinaProps.MODID);
	public static final Map<RegistryObject<Item>, String> PROP_LANG = new LinkedHashMap<>();
	private static RegistryObject<Item> registerPropPng(String id) {
		RegistryObject<Item> item = ITEMS.register(id, PropItem::new);
		PROP_LANG.put(item, StringUtils.humanizeId(id));
		return item;
	}
	public static void register(FMLJavaModLoadingContext context) {
		ITEMS.register(context.getModEventBus());
	}

	public static final RegistryObject<Item> CARMEN_AB_INITIO = registerPropPng("carmen_ab_initio");
	// public static final RegistryObject<Item> KUREHIME = registerPropPng("kurehime");
	public static final RegistryObject<Item> HOROLOGIUN_LAUFORD = registerPropPng("horologiun_lauford");
	public static final RegistryObject<Item> CHAINED_HOROLOGIUN_LAUFORD = registerPropPng("chained_horologiun_lauford");
	public static final RegistryObject<Item> GOLDEN_HOROLOGIUN_LAUFORD = registerPropPng("golden_horologiun_lauford");
	public static final RegistryObject<Item> CHAINER_GOLDEN_HOROLOGIUN_LAUFORD = registerPropPng("chained_golden_horologiun_lauford");
	public static final RegistryObject<Item> VIOLITCH = registerPropPng("violitch");
	public static final RegistryObject<Item> OPEN_VIOLITCH = registerPropPng("open_violitch");
	public static final RegistryObject<Item> TEA = registerPropPng("tea");
	public static final RegistryObject<Item> TEA_POT = registerPropPng("tea_pot");
}
