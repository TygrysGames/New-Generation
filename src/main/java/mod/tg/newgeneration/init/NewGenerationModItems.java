
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.tg.newgeneration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import mod.tg.newgeneration.item.HopeSwordItem;
import mod.tg.newgeneration.item.HopeShovelItem;
import mod.tg.newgeneration.item.HopePickaxeItem;
import mod.tg.newgeneration.item.HopeHoeItem;
import mod.tg.newgeneration.item.HopeDustItem;
import mod.tg.newgeneration.item.HopeAxeItem;
import mod.tg.newgeneration.item.HopeArmorItem;
import mod.tg.newgeneration.item.DustUpgradeItem;
import mod.tg.newgeneration.NewGenerationMod;

public class NewGenerationModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NewGenerationMod.MODID);
	public static final RegistryObject<Item> HOPE_BLOCK = block(NewGenerationModBlocks.HOPE_BLOCK);
	public static final RegistryObject<Item> HOPE_ORE = block(NewGenerationModBlocks.HOPE_ORE);
	public static final RegistryObject<Item> HOPE_AXE = REGISTRY.register("hope_axe", () -> new HopeAxeItem());
	public static final RegistryObject<Item> HOPE_PICKAXE = REGISTRY.register("hope_pickaxe", () -> new HopePickaxeItem());
	public static final RegistryObject<Item> HOPE_SWORD = REGISTRY.register("hope_sword", () -> new HopeSwordItem());
	public static final RegistryObject<Item> HOPE_SHOVEL = REGISTRY.register("hope_shovel", () -> new HopeShovelItem());
	public static final RegistryObject<Item> HOPE_HOE = REGISTRY.register("hope_hoe", () -> new HopeHoeItem());
	public static final RegistryObject<Item> HOPE_DUST = REGISTRY.register("hope_dust", () -> new HopeDustItem());
	public static final RegistryObject<Item> HOPE_ARMOR_HELMET = REGISTRY.register("hope_armor_helmet", () -> new HopeArmorItem.Helmet());
	public static final RegistryObject<Item> HOPE_ARMOR_CHESTPLATE = REGISTRY.register("hope_armor_chestplate", () -> new HopeArmorItem.Chestplate());
	public static final RegistryObject<Item> HOPE_ARMOR_LEGGINGS = REGISTRY.register("hope_armor_leggings", () -> new HopeArmorItem.Leggings());
	public static final RegistryObject<Item> HOPE_ARMOR_BOOTS = REGISTRY.register("hope_armor_boots", () -> new HopeArmorItem.Boots());
	public static final RegistryObject<Item> DUST_UPGRADE = REGISTRY.register("dust_upgrade", () -> new DustUpgradeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
