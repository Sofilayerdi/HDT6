import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = "data.csv"; 

        Map<String, Pokemon> pokemonMap;
        try {
            pokemonMap = CSVReader.readPokemonData(filePath);
        } catch (IOException e) {
            System.out.println("Error leyendo CSV: " + e.getMessage());
            return;
        }

        System.out.println("Selecciona una opcion:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        Map<String, Pokemon> selectedMap = PokemonFactory.createMap(choice);
        selectedMap.putAll(pokemonMap); 

        Manager manager = new Manager(selectedMap);

        while (true) {
            System.out.println("\nSelecciona una funcion:");
            System.out.println("1. Agregar Pokemon a la Coleccion");
            System.out.println("2. Mostrar datos de pokemon");
            System.out.println("3. Mostrar nombre por Type1");
            System.out.println("4. Mostrar todos los Type1 de los pokemones");
            System.out.println("5. Mostrar pokemon por habilidad");
            System.out.println("6. Salir");
            int operation = scanner.nextInt();
            scanner.nextLine(); 
            switch (operation) {
                case 1:
                    System.out.println("Ingresa el nombre del Pokemon:");
                    String name = scanner.nextLine();
                    manager.addPokemonToCollection(name);
                    break;
                case 2:
                    System.out.println("Ingresa el nombre del Pokemon:");
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
                    System.out.println("Ingresa la habilidad:");
                    String ability = scanner.nextLine();
                    manager.showPokemonByAbility(ability);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("ERROR: OPCION INVALIDA.");
            }
        }
    }
}