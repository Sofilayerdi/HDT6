import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class ManagerTest {

    private Manager manager;
    private Map<String, Pokemon> pokemonMap;

    @BeforeEach
    public void setUp() {
        pokemonMap = new HashMap<>();
        pokemonMap.put("Pikachu", new Pokemon("Pikachu", 25, "Electric", "", "Mouse", 0.4, 6.0, "Static", 1, false));
        pokemonMap.put("Charmander", new Pokemon("Charmander", 4, "Fire", "", "Lizard", 0.6, 8.5, "Blaze", 1, false));
        pokemonMap.put("Bulbasaur", new Pokemon("Bulbasaur", 1, "Grass", "Poison", "Seed", 0.7, 6.9, "Overgrow", 1, false));

        manager = new Manager(pokemonMap);
    }

    @Test
    public void testAddPokemonToCollection() {
        manager.addPokemonToCollection("Pikachu");
        assertEquals(1, manager.getUserCollection().size()); 
        manager.addPokemonToCollection("Pikachu");
        assertEquals(1, manager.getUserCollection().size()); 
        manager.addPokemonToCollection("Squirtle");
        assertEquals(1, manager.getUserCollection().size()); 
    }

    @Test
    public void testShowPokemonData() {
        manager.showPokemonData("Pikachu"); 

        manager.showPokemonData("Squirtle"); 
    }

    @Test
    public void testShowUserCollectionByType1() {
        manager.addPokemonToCollection("Pikachu");
        manager.addPokemonToCollection("Charmander");
        manager.addPokemonToCollection("Bulbasaur");

        manager.showUserCollectionByType1(); 
    }

    @Test
    public void testShowAllPokemonByType1() {
        manager.showAllPokemonByType1(); 
    }

    @Test
    public void testShowPokemonByAbility() {
        manager.showPokemonByAbility("Static"); 
    }
}