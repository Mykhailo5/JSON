package parser;

import java.io.FileReader;
import constants.Constants;
import com.google.gson.Gson;
import models.Root;

public class GSONParser {

   private Gson gson;
   private Root root;

    public GSONParser() {
        gson = new Gson();
        try {
            FileReader fileReader = new FileReader(Constants.JSON_FILE_NAME);

            root = gson.fromJson(fileReader, Root.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Root getRoot(){
        return root;
    }
}
