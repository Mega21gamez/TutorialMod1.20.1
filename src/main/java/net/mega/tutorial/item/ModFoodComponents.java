package net.mega.tutorial.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 200), 0.15f).build();
            //Duration of the status effect is in ticks. Minecraft ideally runs at about 20 ticks per second (tps)
}
