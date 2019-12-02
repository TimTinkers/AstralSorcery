package hellfirepvp.astralsorcery.common.crafting.nojson;

import hellfirepvp.astralsorcery.common.crafting.nojson.attunement.AttunePlayerRecipe;
import hellfirepvp.astralsorcery.common.crafting.nojson.attunement.AttunementRecipe;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: AttunementCraftingRegistry
 * Created by HellFirePvP
 * Date: 18.11.2019 / 19:00
 */
public class AttunementCraftingRegistry extends CustomRecipeRegistry<AttunementRecipe> {

    public static final AttunementCraftingRegistry INSTANCE = new AttunementCraftingRegistry();

    @Override
    public void init() {
        this.register(new AttunePlayerRecipe());
    }
}
