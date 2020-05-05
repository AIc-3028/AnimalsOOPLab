package com.company;

import java.util.Scanner;

public class ask {

    public static void runask() {

        Scanner in = new Scanner(System.in);

        System.out.println("Do you want to add a Bird? (Y/N)");

        String reply = in.nextLine();

        if (reply.equalsIgnoreCase("Y")) {
            addBird.runaddBird();
        }
    }
}
