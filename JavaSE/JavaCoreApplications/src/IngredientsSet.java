
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class IngredientsSet {
    public static void main(String[] args) {
		
		Set<String> ingredients = new HashSet<>();
		ingredients.add("sugar");
		ingredients.add("chocolate");
		ingredients.add("butter");
		ingredients.add("vanilla");
		
        //TODO add another ingredient to the set
        		ingredients.add("another ingredient: salt");

        //TODO now remove vanilla from the set
        		ingredients.remove("vanilla");

        //Print the resuting set
	    System.out.println("Here is our ingredients list");
            ingredients.stream().forEach((ingredient) -> {
                System.out.println(ingredient);
        });
	}
}
