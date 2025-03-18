import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {
    private Map<String, Pokemon> pokemonMap;
    private List<Pokemon> userCollection;

    public Manager(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
        this.userCollection = new ArrayList<>();
    }

    public void addPokemonToCollection(String name) {
        if (pokemonMap.containsKey(name)) {
            if (!userCollection.contains(pokemonMap.get(name))) {
                userCollection.add(pokemonMap.get(name));
                System.out.println(name + " added to your collection.");
            } else {
                System.out.println(name + " is already in your collection.");
            }
        } else {
            System.out.println("Error: " + name + " not found in the dataset.");
        }
    }

    public void showPokemonData(String name) {
        if (pokemonMap.containsKey(name)) {
            System.out.println(pokemonMap.get(name));
        } else {
            System.out.println("Error: " + name + " not found in the dataset.");
        }
    }

    public void showUserCollectionByType1() {
        userCollection.sort(Comparator.comparing(Pokemon::getType1));
        for (Pokemon pokemon : userCollection) {
            System.out.println(pokemon.getName() + " - " + pokemon.getType1());
        }
    }

    public void showAllPokemonByType1() {
        List<Pokemon> allPokemon = new ArrayList<>(pokemonMap.values());
        allPokemon.sort(Comparator.comparing(Pokemon::getType1));
        for (Pokemon pokemon : allPokemon) {
            System.out.println(pokemon.getName() + " - " + pokemon.getType1());
        }
    }

    public void showPokemonByAbility(String ability) {
        for (Pokemon pokemon : pokemonMap.values()) {
            if (pokemon.getAbility().equals(ability)) {
                System.out.println(pokemon.getName());
            }
        }
    }
}
