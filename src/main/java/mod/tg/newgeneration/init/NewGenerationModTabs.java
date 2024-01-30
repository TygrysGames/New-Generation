
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.tg.newgeneration.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import mod.tg.newgeneration.NewGenerationMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewGenerationModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewGenerationMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(NewGenerationModBlocks.HOPE_BLOCK.get().asItem());
			tabData.accept(NewGenerationModBlocks.HOPE_ORE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(NewGenerationModItems.HOPE_SWORD.get());
			tabData.accept(NewGenerationModItems.HOPE_ARMOR_HELMET.get());
			tabData.accept(NewGenerationModItems.HOPE_ARMOR_CHESTPLATE.get());
			tabData.accept(NewGenerationModItems.HOPE_ARMOR_LEGGINGS.get());
			tabData.accept(NewGenerationModItems.HOPE_ARMOR_BOOTS.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(NewGenerationModItems.HOPE_DUST.get());
			tabData.accept(NewGenerationModItems.DUST_UPGRADE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NewGenerationModItems.HOPE_AXE.get());
			tabData.accept(NewGenerationModItems.HOPE_PICKAXE.get());
			tabData.accept(NewGenerationModItems.HOPE_SHOVEL.get());
			tabData.accept(NewGenerationModItems.HOPE_HOE.get());
		}
	}
}
