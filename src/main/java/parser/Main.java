package parser;

import com.google.gson.Gson;
import helpers.Root;

public class Main {
    public static void main(String[] args) {
        GSONParser gsonParser = new GSONParser();
        Root root = gsonParser.parse();
        System.out.println("Root : " + root);
    }
}
