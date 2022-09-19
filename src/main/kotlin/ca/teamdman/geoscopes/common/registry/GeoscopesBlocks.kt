package ca.teamdman.geoscopes.common.registry

import ca.teamdman.geoscopes.common.Geoscopes
import ca.teamdman.geoscopes.common.blocks.SubstrateBlock
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries

object GeoscopesBlocks {
    val BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Geoscopes.MOD_ID)
    val SUBSTRATE_BLOCK = BLOCKS.register("substrate", ::SubstrateBlock)
}