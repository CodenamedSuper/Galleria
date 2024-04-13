package codenamed.galleria;

import codenamed.galleria.registry.GalleriaPaintings;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Galleria implements ModInitializer {

	public  static  final String MOD_ID = "galleria";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		GalleriaPaintings.registerPaintings();

		LOGGER.info("Hello Fabric world!");

	}
}