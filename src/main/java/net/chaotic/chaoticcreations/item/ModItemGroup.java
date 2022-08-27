package net.chaotic.chaoticcreations.item;

import net.chaotic.chaoticcreations.ChaoticCreations;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Chaotic = FabricItemGroupBuilder.build(
            new Identifier(ChaoticCreations.MOD_ID, "chaoticcreations"), () -> new ItemStack(ModItems.PURE_CHAOS));
}
