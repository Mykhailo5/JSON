package parser;

import java.io.FileReader;
import Constants.Constants;
import com.google.gson.Gson;
import helpers.Root;

public class GSONParser {

    public Root parse() {
        Gson gson = new Gson();
        try {
            FileReader fileReader = new FileReader(Constants.JSON_FILE_NAME);

            return gson.fromJson(fileReader, Root.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
