package com.john.flowerforest.registry;

import com.john.flowerforest.FlowerForest;
import com.john.flowerforest.registry.armor.BerryCrown;
import com.john.flowerforest.registry.armor.FlowerCrown;
import com.john.flowerforest.registry.armor.FlowerCrownBluePurple;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Armor
    public static final ArmorMaterial flowerMAT1 = new FlowerCrown();
    public static final ArmorMaterial flowerMAT2 = new FlowerCrownBluePurple();
    public static final ArmorMaterial berryMAT = new BerryCrown();
    public static final Item FLOWER_CROWN_2 = new ArmorItem(flowerMAT2, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item FLOWER_CROWN = new ArmorItem(flowerMAT1, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BERRY_CROWN = new ArmorItem(berryMAT, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));

    //Items
    public static final Item HONEY_BALL = new Item(new Item.Settings().group(ItemGroup.MISC));

    //Blocks
    public static final BlockItem HONEY_TRAP = new BlockItem(ModBlocks.HONEY_TRAP, new Item.Settings().group(ItemGroup.DECORATIONS));
    public static final BlockItem SLIME_TRAP = new BlockItem(ModBlocks.SLIME_TRAP, new Item.Settings().group(ItemGroup.DECORATIONS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(FlowerForest.MOD_ID, "flower_crown_2"), FLOWER_CROWN_2);
        Registry.register(Registry.ITEM, new Identifier(FlowerForest.MOD_ID, "flower_crown"), FLOWER_CROWN);
        Registry.register(Registry.ITEM, new Identifier(FlowerForest.MOD_ID, "berry_crown"), BERRY_CROWN);
        Registry.register(Registry.ITEM, new Identifier(FlowerForest.MOD_ID, "honey_ball"), HONEY_BALL);
        Registry.register(Registry.ITEM, new Identifier(FlowerForest.MOD_ID, "honey_trap"), HONEY_TRAP);
        Registry.register(Registry.ITEM, new Identifier(FlowerForest.MOD_ID, "slime_trap"), SLIME_TRAP);

    }
}

