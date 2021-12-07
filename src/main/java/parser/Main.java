package parser;

import helpers.Root;

public class Main {
    public static void main(String[] args) {
        GSONParser jsonSimpleParser = new GSONParser();
        Root root = jsonSimpleParser.parse();
        System.out.println("Root : " + root);
    }
}
