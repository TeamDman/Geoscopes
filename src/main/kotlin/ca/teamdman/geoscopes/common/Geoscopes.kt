package ca.teamdman.geoscopes.common

import ca.teamdman.geoscopes.common.registry.GeoscopesBlocks
import ca.teamdman.geoscopes.common.registry.GeoscopesItems
import com.mojang.logging.LogUtils
import net.minecraftforge.fml.common.Mod
import org.slf4j.Logger

@Mod(Geoscopes.MOD_ID)
object Geoscopes {
    const val MOD_ID = "geoscopes"
    val LOGGER: Logger = LogUtils.getLogger()

    init {
        val bus = thedarkcolour.kotlinforforge.forge.MOD_CONTEXT.getKEventBus()
        GeoscopesItems.ITEMS.register(bus)
        GeoscopesBlocks.BLOCKS.register(bus)
        // we don't actually need the config yet lol
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GeoscopesConfig.COMMON_SPEC)
    }
}