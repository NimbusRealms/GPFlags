package me.ryanhamshire.GPFlags.hooks;

import dev.rosewood.rosestacker.api.RoseStackerAPI;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;

public class RoseStackerHook {
    public static RoseStackerAPI rsAPI;

    public static boolean isStackedMob(LivingEntity livingEntity) {
        if (rsAPI == null) return false;
        if(livingEntity == null) return false;

        return rsAPI.isEntityStacked(livingEntity);
    }
}
