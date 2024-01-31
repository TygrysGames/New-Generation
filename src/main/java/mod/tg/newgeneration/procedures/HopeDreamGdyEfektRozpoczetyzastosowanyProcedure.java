package mod.tg.newgeneration.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import mod.tg.newgeneration.init.NewGenerationModMobEffects;
import mod.tg.newgeneration.NewGenerationMod;

public class HopeDreamGdyEfektRozpoczetyzastosowanyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double hope = 0;
		double baseRate = 0;
		double rateWithAmplifier = 0;
		NewGenerationMod.queueServerWork(20, () -> {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("new_generation:hope_death")))),
					entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(NewGenerationModMobEffects.HOPE_DREAM.get()) ? _livEnt.getEffect(NewGenerationModMobEffects.HOPE_DREAM.get()).getAmplifier() : 0);
		});
	}
}
