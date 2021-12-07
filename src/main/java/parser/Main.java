package parser;

import helpers.Root;

public class Main {
    public static void main(String[] args) {
        JSONSimpleParser jsonSimpleParser = new JSONSimpleParser();
        Root root = jsonSimpleParser.parse();
        System.out.println("Root : " + root);
    }
}
