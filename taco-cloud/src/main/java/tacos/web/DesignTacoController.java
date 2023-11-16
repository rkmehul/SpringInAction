package tacos.web;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import tacos.Taco;
import sia.tacocloud.Ingredient;
import sia.tacocloud.Ingredient.Type;
@Slf4j
@Controller
public class DesignTacoController {

@GetMapping("/design")
public String showDesignForm(Model model) {
List<sia.tacocloud.Ingredient> ingredients = Arrays.asList(
new sia.tacocloud.Ingredient("FLTO", "Flour Tortilla", sia.tacocloud.Ingredient.Type.WRAP),
new sia.tacocloud.Ingredient("COTO", "Corn Tortilla", Type.WRAP),
new Ingredient("GRBF", "Ground Beef", Type.PROTEIN),
new Ingredient("CARN", "Carnitas", Type.PROTEIN),
new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES),
new Ingredient("LETC", "Lettuce", Type.VEGGIES),
new Ingredient("CHED", "Cheddar", Type.CHEESE),
new Ingredient("JACK", "Monterrey Jack", Type.CHEESE),
new Ingredient("SLSA", "Salsa", Type.SAUCE),
new Ingredient("SRCR", "Sour Cream", Type.SAUCE)
);
Type[] types = sia.tacocloud.Ingredient.Type.values();
for (Type type : types) {
model.addAttribute(type.toString().toLowerCase(),
filterByType(ingredients, type));
}
model.addAttribute("design", new Taco());
return "design";
}

private List<Ingredient> filterByType(List<Ingredient> ingredients, Type type) {
    List<Ingredient> returnIngredients = new ArrayList<Ingredient>();
    for(Ingredient ingredient : ingredients){
        if (ingredient.getType().equals(type)) {
            returnIngredients.add(ingredient);
            
        }
        
    }
    return returnIngredients;
}
}
