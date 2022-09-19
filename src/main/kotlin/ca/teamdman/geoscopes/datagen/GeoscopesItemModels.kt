package ca.teamdman.geoscopes.datagen

import ca.teamdman.geoscopes.common.Geoscopes
import ca.teamdman.geoscopes.common.registry.GeoscopesBlocks
import ca.teamdman.geoscopes.common.registry.GeoscopesItems
import net.minecraft.data.DataGenerator
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import net.minecraftforge.client.model.generators.ItemModelProvider
import net.minecraftforge.common.data.ExistingFileHelper
import net.minecraftforge.registries.RegistryObject

class GeoscopesItemModels(gen: DataGenerator, existingFileHelper: ExistingFileHelper): ItemModelProvider(gen, Geoscopes.MOD_ID, existingFileHelper) {
    override fun registerModels() {
        justParent(GeoscopesItems.SUBSTRATE_ITEM, GeoscopesBlocks.SUBSTRATE_BLOCK)
    }


    private fun justParent(
        item: RegistryObject<out Item>,
        block: RegistryObject<out Block>,
    ) {
        justParent(item, block, "")
    }

    private fun justParent(
        item: RegistryObject<out Item>,
        block: RegistryObject<out Block>,
        extra: String,
    ) {
        withExistingParent(
            block
                .id
                .path,
            Geoscopes.MOD_ID + ":block/" + item
                .id
                .path + extra
        )
    }

    private fun basicItem(
        item: RegistryObject<out Item>,
    ) {
        withExistingParent(
            item
                .id
                .path,
            mcLoc("item/generated")
        ).texture(
            "layer0",
            modLoc(
                "item/" + item
                    .id
                    .path
            )
        )
    }
}