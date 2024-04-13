package codenamed.galleria.registry;

import codenamed.galleria.Galleria;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GalleriaPaintings {
    public static final PaintingVariant GENESIS = registerPainting("genesis", new PaintingVariant(32, 32));
    public static final PaintingVariant LUNAR = registerPainting("lunar", new PaintingVariant(16, 32));
    public static final PaintingVariant CASTLE = registerPainting("castle", new PaintingVariant(48, 32));
    public static final PaintingVariant HATCH = registerPainting("hatch", new PaintingVariant(16, 16));
    public static final PaintingVariant SHIP = registerPainting("ship", new PaintingVariant(32, 16));
    public static final PaintingVariant ENDERMAN = registerPainting("enderman", new PaintingVariant(16, 48));

    public static final PaintingVariant TENTACLES = registerPainting("tentacles", new PaintingVariant(16, 32));









    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(Galleria.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Galleria.LOGGER.debug("Registering Paintings for " + Galleria.MOD_ID);
    }
}