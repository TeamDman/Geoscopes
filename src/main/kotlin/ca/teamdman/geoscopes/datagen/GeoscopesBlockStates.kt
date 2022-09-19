package ca.teamdman.geoscopes.datagen

import ca.teamdman.geoscopes.common.Geoscopes
import ca.teamdman.geoscopes.common.registry.GeoscopesBlocks
import net.minecraft.data.DataGenerator
import net.minecraftforge.client.model.generators.BlockStateProvider
import net.minecraftforge.common.data.ExistingFileHelper

class GeoscopesBlockStates(gen: DataGenerator, existingFileHelper: ExistingFileHelper) : BlockStateProvider(gen, Geoscopes.MOD_ID, existingFileHelper) {
    override fun registerStatesAndModels() {
        simpleBlock(GeoscopesBlocks.SUBSTRATE_BLOCK.get())
    }
}