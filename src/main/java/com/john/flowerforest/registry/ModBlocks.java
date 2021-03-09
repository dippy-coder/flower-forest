package com.john.flowerforest.registry;

import com.john.flowerforest.FlowerForest;
import com.john.flowerforest.registry.customblockclasses.HoneyCarpet;
import com.john.flowerforest.registry.customblockclasses.SlimeCarpet;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block HONEY_TRAP = new HoneyCarpet(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).breakByTool(FabricToolTags.SHOVELS).strength(1.5f,0f).sounds(BlockSoundGroup.HONEY).requiresTool().nonOpaque().jumpVelocityMultiplier(0.3f).velocityMultiplier(0.1f));
    public static final Block SLIME_TRAP = new SlimeCarpet(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).breakByTool(FabricToolTags.SHOVELS).strength(1.5f,0f).sounds(BlockSoundGroup.SLIME).requiresTool().nonOpaque());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(FlowerForest.MOD_ID, "honey_trap"), HONEY_TRAP);
        Registry.register(Registry.BLOCK, new Identifier(FlowerForest.MOD_ID, "slime_trap"), SLIME_TRAP);
    }
}
