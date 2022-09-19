package ca.teamdman.geoscopes.datagen

import ca.teamdman.geoscopes.common.Geoscopes
import net.minecraftforge.data.event.GatherDataEvent
import net.minecraftforge.data.loading.DatagenModLoader
import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod

@Mod.EventBusSubscriber(modid = Geoscopes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
object GeoscopesDatagen {
    @SubscribeEvent
    fun onGather(event: GatherDataEvent) {
        if (!DatagenModLoader.isRunningDataGen()) return
        val gen = event.generator
        if (event.includeServer()) {
            gen.addProvider(event.includeClient(), GeoscopesBlockStates(gen, event.existingFileHelper))
            gen.addProvider(event.includeClient(), GeoscopesItemModels(gen, event.existingFileHelper))
        }
    }
}