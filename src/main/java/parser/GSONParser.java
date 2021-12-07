package parser;

import java.io.FileReader;
import com.google.gson.Gson;
import helpers.Root;

public class GSONParser {

    public Root parse(){
        Gson gson = new Gson();
        try {
            FileReader fileReader = new FileReader("animals.json");

            Root root = gson.fromJson(fileReader, Root.class);
            return root;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
