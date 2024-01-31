
package mod.tg.newgeneration.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import mod.tg.newgeneration.procedures.HopeDreamGdyEfektSieSkonczyProcedure;
import mod.tg.newgeneration.procedures.HopeDreamGdyEfektRozpoczetyzastosowanyProcedure;

public class HopeDreamMobEffect extends MobEffect {
	public HopeDreamMobEffect() {
		super(MobEffectCategory.HARMFUL, -16751104);
	}

	@Override
	public String getDescriptionId() {
		return "effect.new_generation.hope_dream";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		HopeDreamGdyEfektRozpoczetyzastosowanyProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		HopeDreamGdyEfektSieSkonczyProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
