package net.chaotic.chaoticcreations.item;

import net.chaotic.chaoticcreations.ChaoticCreations;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_CHAOS = registerItem("raw_chaos",
            new Item(new FabricItemSettings().group(ModItemGroup.Chaotic)));

    public static final Item PURE_CHAOS = registerItem("pure_chaos",
            new Item(new FabricItemSettings().group(ModItemGroup.Chaotic)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ChaoticCreations.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ChaoticCreations.LOGGER.debug("Registering Mod Items for " + ChaoticCreations.MOD_ID);
    }
}
