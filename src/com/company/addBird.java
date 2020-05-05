package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addBird {

    public static void runaddBird() {

        Scanner in = new Scanner(System.in);
        List<Aves> myBirds = new ArrayList<>();

        System.out.println("The Bird's name?");
        String name = in.nextLine();

        System.out.println("The Bird's species?");
        String species = in.nextLine();

        System.out.println("The Bird's color?");
        String featherColor = in.nextLine();

        System.out.println("The Bird's wingspan?");
        int wingspan = in.nextInt();

        System.out.println("The Bird's beak color?");
        String beakColor = in.next();

        System.out.println("The Bird's beak shape?");
        String beakShape = in.next();

        System.out.println("The Bird's body length?");
        int bodyLength = in.nextInt();


        Aves bird = new CommonRaven(species, name, featherColor, wingspan, beakColor, beakShape, bodyLength);
        myBirds.add(bird);

        FileWriter fileWriter = null;
        try {

            FileWriter fw = null;
            BufferedWriter bw = null;
            PrintWriter pw = null;

            fw = new FileWriter("Birds.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            for (Aves bird1 : myBirds) {
                pw.printf("%s: %s%n" +
                                "Color: %s%n" +
                                "Beak Color: %s%n" +
                                "Beak Shape: %s%n" +
                                "Wingspan: %d cm%n" +
                                "Body Length: %d cm%n%n", bird1.getName(),
                        bird1.getSpecies(), bird1.getFeatherColor(),
                        bird1.getBeakColor(), bird1.getBeakShape(),
                        bird1.getWingspan(), bird1.getBodyLength());
            }

            System.out.println("Data Successfully appended into file");

            pw.flush();
            pw.close();
            bw.close();
            fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        ask.runask();

    }
}

