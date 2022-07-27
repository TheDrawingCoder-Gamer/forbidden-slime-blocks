package net.fettlol.coloredslime.blocks


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings
import net.minecraft.block.SlimeBlock
import net.minecraft.util.DyeColor

import net.minecraft.block.Blocks
import groovy.transform.CompileStatic 

@CompileStatic
class ColoredSlimeBlock extends SlimeBlock {
	@CompileStatic 
	ColoredSlimeBlock(DyeColor color) {
		super(FabricBlockSettings.copyOf(Blocks.SLIME_BLOCK).mapColor(color).nonOpaque())
	}
}
