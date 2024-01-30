
package mod.tg.newgeneration.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class HopeDreamMobEffect extends MobEffect {
	public HopeDreamMobEffect() {
		super(MobEffectCategory.HARMFUL, -16751104);
	}

	@Override
	public String getDescriptionId() {
		return "effect.new_generation.hope_dream";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
