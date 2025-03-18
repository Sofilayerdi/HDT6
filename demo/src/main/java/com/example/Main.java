import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = "Pokemon.csv"; 

        Map<String, Pokemon> pokemonMap;
        try {
            pokemonMap = CSVReader.readPokemonData(filePath);
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
            return;
        }

        System.out.println("Select Map implementation:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        Map<String, Pokemon> selectedMap = PokemonFactory.createMap(choice);
        selectedMap.putAll(pokemonMap); 

        PokemonManager manager = new PokemonManager(selectedMap);

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add Pokemon to collection");
            System.out.println("2. Show Pokemon data");
            System.out.println("3. Show user collection by Type1");
            System.out.println("4. Show all Pokemon by Type1");
            System.out.println("5. Show Pokemon by ability");
            System.out.println("6. Exit");
            int operation = scanner.nextInt();
            scanner.nextLine(); 
            switch (operation) {
                case 1:
                    System.out.println("Enter Pokemon name:");
                    String name = scanner.nextLine();
                    manager.addPokemonToCollection(name);
                    break;
                case 2:
                    System.out.println("Enter Pokemon name:");
                    name = scanner.nextLine();
                    manager.showPokemonData(name);
                    break;
                case 3:
                    manager.showUserCollectionByType1();
                    break;
                case 4:
                    manager.showAllPokemonByType1();
                    break;
                case 5:
                    System.out.println("Enter ability:");
                    String ability = scanner.nextLine();
                    manager.showPokemonByAbility(ability);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid operation.");
            }
        }
    }
}