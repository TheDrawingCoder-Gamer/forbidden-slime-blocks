package net.fettlol.coloredslime.blocks 

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.SlimeBlock
import net.minecraft.util.DyeColor

import net.minecraft.block.Blocks 

class ColoredHoneyBlock(color: DyeColor) extends SlimeBlock(FabricBlockSettings.copyOf(Blocks.HONEY_BLOCK).mapColor(color).nonOpaque())
