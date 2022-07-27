(ns net.fettlol.coloredslime.util
  "Colored slime helpers"
  (:import 
    [net.fettlol.coloredslime.blocks ColoredHoneyBlock ColoredSlimeBlock]
    [net.minecraft.block Block]
    [net.minecraft.util DyeColor]
    [java.util Collections EnumMap Map] 
   )
)
(defn isColoredSlime [block] (instance? ColoredSlimeBlock block)) 
(defn isColoredHoney [block] (instance? ColoredHoneyBlock block)) 
(defn generateSlimeBlocks [] (do 
    (let [slimeBlocks (new EnumMap DyeColor/class)] 
      (doseq [color (DyeColor/values)] (.put slimeBlocks color (new ColoredSlimeBlock color))) 
      (Collections/unmodifiableMap slimeBlocks)
    )))
(defn generateHoneyBlocks [] (do 
    (let [honeyBlocks (new EnumMap DyeColor/class)] 
      (doseq [color (DyeColor/values)] (.put honeyBlocks color (new ColoredHoneyBlock color))) 
      (Collections/unmodifiableMap honeyBlocks)
    )))
