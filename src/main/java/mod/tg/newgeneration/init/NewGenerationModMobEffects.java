
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mod.tg.newgeneration.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import mod.tg.newgeneration.potion.HopeDreamMobEffect;
import mod.tg.newgeneration.NewGenerationMod;

public class NewGenerationModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NewGenerationMod.MODID);
	public static final RegistryObject<MobEffect> HOPE_DREAM = REGISTRY.register("hope_dream", () -> new HopeDreamMobEffect());
}
