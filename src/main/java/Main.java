import models.Root;
import parser.GSONParser;

public class Main {
    public static void main(String[] args) {
        GSONParser gsonParser = new GSONParser();
        System.out.println("Root : " + gsonParser.getRoot());
    }
}
