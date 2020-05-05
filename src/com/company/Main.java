package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        CommonRaven raven1 = new CommonRaven("Common Raven", "Marv",
                "black iridescent", 130,
                "black", "large and slightly curved",
                59);
        CommonRaven raven2 = new CommonRaven("Common Raven", "Bill", "black",
                116, "black",
                "large", 60);
        AmericanCrow crow1 = new AmericanCrow("American Crow", "Steve", "black iridescent",
                30, "black", "medium", 42);
        GreyParrot parrot1 = new GreyParrot("Gary Parrot", "Phil", "light-gray, cherry tail",
                50, "black", "curved", 33);
        TimnehParrot parrot2 = new TimnehParrot("Timneh Parrot", "Alex", "charcoal gray",
                35, "black", "curved", 25);

        List<Aves> myBirds = new ArrayList<>();
        myBirds.add(raven1);
        myBirds.add(raven2);
        myBirds.add(crow1);
        myBirds.add(parrot1);
        myBirds.add(parrot2);


        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Birds.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            for (Aves bird1 : myBirds) {
                printWriter.printf("%s: %s%n" +
                                "Color: %s%n" +
                                "Beak Color: %s%n" +
                                "Beak Shape: %s%n" +
                                "Wingspan: %d cm%n" +
                                "Body Length: %d cm%n%n", bird1.getName(),
                        bird1.getSpecies(), bird1.getFeatherColor(),
                        bird1.getBeakColor(), bird1.getBeakShape(),
                        bird1.getWingspan(), bird1.getBodyLength());
            }
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



        System.out.println("Uploading Current Birds");

        for (Aves bird1 : myBirds) {
            System.out.printf("%s: %s%n" +
                            "Color: %s%n" +
                            "Beak Color: %s%n" +
                            "Beak Shape: %s%n" +
                            "Wingspan: %d cm%n" +
                            "Body Length: %d cm%n%n", bird1.getName(),
                    bird1.getSpecies(), bird1.getFeatherColor(),
                    bird1.getBeakColor(), bird1.getBeakShape(),
                    bird1.getWingspan(), bird1.getBodyLength());
        }

        ask.runask();

        System.out.println("Goodbye");
    }
}