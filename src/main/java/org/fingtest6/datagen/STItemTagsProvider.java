package org.fingtest6.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.fingtest6.Tags;
import org.fingtest6.fingstzritems;
import org.jetbrains.annotations.Nullable;
import org.fingtest6.item.items;
import top.theillusivec4.curios.api.CuriosTags;

import java.util.concurrent.CompletableFuture;

public class STItemTagsProvider extends ItemTagsProvider {
    public STItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, fingstzritems.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(Tags.SHUILI)
                .add(items.SHUILI.get())
                .add(items.COOKED_SHUILI.get());
        tag(CuriosTags.CHARM)
                .add(items.SHUILI.get());
    }
}
