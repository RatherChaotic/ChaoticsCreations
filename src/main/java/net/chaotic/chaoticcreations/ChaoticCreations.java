package net.chaotic.chaoticcreations;

import net.chaotic.chaoticcreations.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChaoticCreations implements ModInitializer {
	public static final String MOD_ID = "chaoticcreations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
