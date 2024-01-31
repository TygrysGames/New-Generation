package mod.tg.newgeneration.procedures;

import net.minecraft.world.entity.Entity;

public class HopeDreamGdyEfektSieSkonczyProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
	}
}
