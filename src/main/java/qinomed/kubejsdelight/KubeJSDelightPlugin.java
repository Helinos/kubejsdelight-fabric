package qinomed.kubejsdelight;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.recipe.schema.RegisterRecipeSchemasEvent;
import net.minecraft.util.Identifier;
import qinomed.kubejsdelight.recipe.CookingRecipeJS;
import qinomed.kubejsdelight.recipe.CuttingRecipeJS;

public class KubeJSDelightPlugin extends KubeJSPlugin {
    @Override
    public void registerRecipeSchemas(RegisterRecipeSchemasEvent event) {
        event.register(new Identifier("farmersdelight:cutting"), CuttingRecipeJS.SCHEMA);
        event.register(new Identifier("farmersdelight:cooking"), CookingRecipeJS.SCHEMA);
    }
}
