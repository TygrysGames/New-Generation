package mod.tg.newgeneration.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import mod.tg.newgeneration.init.NewGenerationModMobEffects;

public class HopeSwordPoKliknieciuPPMProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(NewGenerationModMobEffects.HOPE_DREAM.get(), 200, 1));
	}
}
