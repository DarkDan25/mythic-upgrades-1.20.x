package net.trique.mythicupgrades.attributes;

import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;

public class Support {

    public static float getExperienceMod(PlayerEntity player) {
        if(player == null) {
            return 1.0F;
        }
        EntityAttributeInstance attributeInstance = player.getAttributeInstance(MUAttributes.DROPPED_EXPERIENCE);
        if (attributeInstance == null) {
            return 1.0F;
        }
        return (float) attributeInstance.getValue();
    }

}
