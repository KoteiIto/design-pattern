package jp.kotei.ito.adapter;

import java.io.IOException;

public class Main {
    public static void main(String args[]) {
        Print printBanner = new PrintBanner("バナー");
        printBanner.printWeek();
        printBanner.printStrong();

        FileIO properties = new FileProperties();
        properties.setValue("name", "kotei");
        try {
            properties.writeToFile("properties.txt");
            properties.readFromFile("properties.txt");
            String name = properties.getValue("name");
            System.out.println(name);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
