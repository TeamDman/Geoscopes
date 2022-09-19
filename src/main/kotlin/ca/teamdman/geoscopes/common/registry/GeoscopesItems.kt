package ca.teamdman.geoscopes.common.registry

import ca.teamdman.geoscopes.common.Geoscopes
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.block.Block
import net.minecraftforge.registries.DeferredRegister
import net.minecraftforge.registries.ForgeRegistries
import net.minecraftforge.registries.RegistryObject

@Suppress("MemberVisibilityCanBePrivate")
object GeoscopesItems {
    private val TAB = object : CreativeModeTab(Geoscopes.MOD_ID) {
        override fun makeIcon() = ItemStack(GeoscopesBlocks.SUBSTRATE_BLOCK.get())
    }

    val ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Geoscopes.MOD_ID)!!
    val SUBSTRATE_ITEM = register("substrate", GeoscopesBlocks.SUBSTRATE_BLOCK)

    private fun register(name: String, block: RegistryObject<out Block>): RegistryObject<Item> {
        return ITEMS.register(name) { BlockItem(block.get(), Item.Properties().tab(TAB)) }
    }

}