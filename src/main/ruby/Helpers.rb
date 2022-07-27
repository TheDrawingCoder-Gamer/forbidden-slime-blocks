require 'java' 

coloredSlimeBlock = net.fettlol.coloredslime.blocks.ColoredSlimeBlock 
coloredHoneyBlock = net.fettlol.coloredslime.blocks.ColoredHoneyBlock
dyeColor = bts  
module Helpers 
  def generateSlimeBlocks() 
    slimeBlocks = java.util.EnumMap.new(dyeColor.class)
    dyeColor.values().forEach (x -> { slimeBlocks.put(x, coloredSlimeBlock.new(x)) })
    java.util.Collections.unmodifiableMap(slimeBlocks)
  end 
  def generateHoneyBlocks() 
    honeyBlocks = java.util.EnumMap.new(dyeColor.class)
    dyeColor.values().forEach (x -> { slimeBlocks.put(x, coloredHoneyBlock.new(x)) })
    java.util.Collections.unmodifiableMap(honeyBlocks)
  end 
end 
