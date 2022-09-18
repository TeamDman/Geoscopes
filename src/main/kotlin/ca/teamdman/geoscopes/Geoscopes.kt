package ca.teamdman.geoscopes

import com.mojang.logging.LogUtils
import net.minecraftforge.fml.common.Mod
import org.slf4j.Logger

@Mod(Geoscopes.MOD_ID)
object Geoscopes {
    const val MOD_ID = "geoscopes"
    val LOGGER: Logger = LogUtils.getLogger()

    init {
        LOGGER.info("idek")
    }
}