package net.shyler.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import net.shyler.tutorialmod.Block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.shyler.tutorialmod.Item.ModItems;

public class TemplateMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
