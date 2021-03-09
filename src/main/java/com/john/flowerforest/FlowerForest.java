package com.john.flowerforest;

import com.john.flowerforest.registry.ModBlocks;
import com.john.flowerforest.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class FlowerForest implements ModInitializer {

    public static final String MOD_ID = "ffe";

    @Override

    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
