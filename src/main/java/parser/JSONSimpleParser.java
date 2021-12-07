package parser;

import java.io.FileReader;
import java.util.ArrayList;

import Constants.Constants;
import helpers.Animals;
import helpers.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class JSONSimpleParser {
    public helpers.Root parse(){
        JSONParser jsonParser = new JSONParser();
        Root root = new Root();

        try {
            FileReader fileReader = new FileReader("animals.json");
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

            String name = (String) jsonObject.get(Constants.ANIMAL_NAME);
            JSONArray jsonArrayAnimals = (JSONArray) jsonObject.get(Constants.JSON_ANIMALS);

            List<Animals> animalsList = new ArrayList<>();
            for(Object item : jsonArrayAnimals){

                JSONObject animalsJsonObject = (JSONObject) item;

                String animalName = (String) animalsJsonObject.get(Constants.ANIMAL_NAME);
                String animalSpeaking = (String) animalsJsonObject.get(Constants.ANIMAL_SPEAKING);
                long animalAge = (long) animalsJsonObject.get(Constants.ANIMAL_AGE);
                String animalColour = (String) animalsJsonObject.get(Constants.ANIMAL_COLOUR);

                Animals animals = new Animals(animalName, animalSpeaking, (int)animalAge, animalColour);
                animalsList.add(animals);
            }

            root.setName(name);
            root.setAnimals(animalsList);

            return root;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
