import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CSVReader {
    public static Map<String, Pokemon> readPokemonData(String filePath) throws IOException {
        Map<String, Pokemon> pokemonMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                line = line.trim(); 
                if (line.isEmpty()) {
                    continue; 
                }

                String[] data = line.split(","); 
                String name = data[0].trim();
                int number = Integer.parseInt(data[1].trim()); 
                String type1 = data[2].trim();
                String type2 = data[3].trim();
                String classification = data[4].trim();
                double height = Double.parseDouble(data[5].trim()); 
                double weight = Double.parseDouble(data[6].trim()); 
                String abilities = data[7].trim();
                int generation = Integer.parseInt(data[8].trim()); 
                boolean isLegendary = Boolean.parseBoolean(data[9].trim());

                Pokemon pokemon = new Pokemon(name, number, type1, type2, classification, height, weight, abilities, generation, isLegendary);
                pokemonMap.put(name, pokemon);
            }
        }

        return pokemonMap;
    }
}