import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class Test {

    @Test
    void testAddPokemonToCollection() {
        Map<String, Pokemon> pokemonMap = new HashMap<>();
        pokemonMap.put("Pikachu", new Pokemon("Pikachu", "Electric", "", "Static"));
        PokemonManager manager = new PokemonManager(pokemonMap);

        manager.addPokemonToCollection("Pikachu");
        manager.addPokemonToCollection("Pikachu"); // Should not add again
        assertEquals(1, manager.getUserCollection().size());
    }

    @Test
    void testShowPokemonData() {
        Map<String, Pokemon> pokemonMap = new HashMap<>();
        pokemonMap.put("Pikachu", new Pokemon("Pikachu", "Electric", "", "Static"));
        PokemonManager manager = new PokemonManager(pokemonMap);

        manager.showPokemonData("Pikachu"); // Should print Pikachu's data
    }
}