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
                String[] data = line.split(",");
                String name = data[0];
                int number = Integer.parseInt(data[1]);
                String type1 = data[2];
                String type2 = data[3];
                String classification = data[4];
                double height = Double.parseDouble(data[5]);
                double weight = Double.parseDouble(data[6]);
                String ability = data[7];
                int generation = Integer.parseInt(data[8]);
                boolean isLegendary = Boolean.parseBoolean(data[9]);

                Pokemon pokemon = new Pokemon(name, number, type1, type2, classification, height, weight, ability, generation, isLegendary);
                pokemonMap.put(name, pokemon);
            }
        }

        return pokemonMap;
    }
}