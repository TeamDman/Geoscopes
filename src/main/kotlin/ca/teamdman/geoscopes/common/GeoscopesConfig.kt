package ca.teamdman.geoscopes.common

import net.minecraftforge.common.ForgeConfigSpec

object GeoscopesConfig {
    val COMMON_CONFIG: CommonConfig
    val COMMON_SPEC: ForgeConfigSpec
    init {
        val builder = ForgeConfigSpec.Builder().configure(GeoscopesConfig::CommonConfig);
        COMMON_CONFIG = builder.left
        COMMON_SPEC = builder.right
    }

    class CommonConfig(builder: ForgeConfigSpec.Builder) {
        val ores: ForgeConfigSpec.ConfigValue<List<String>>
        init {
            builder.push("general")
            ores = builder.define("ores", listOf("minecraft:coal_ore"))
            builder.pop()
        }
    }
}