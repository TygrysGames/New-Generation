
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.tg.newgeneration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import mod.tg.newgeneration.block.HopeOreBlock;
import mod.tg.newgeneration.block.HopeBlockBlock;
import mod.tg.newgeneration.NewGenerationMod;

public class NewGenerationModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NewGenerationMod.MODID);
	public static final RegistryObject<Block> HOPE_BLOCK = REGISTRY.register("hope_block", () -> new HopeBlockBlock());
	public static final RegistryObject<Block> HOPE_ORE = REGISTRY.register("hope_ore", () -> new HopeOreBlock());
}
