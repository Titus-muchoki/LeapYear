package org.example;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("");
        System.out.println("enter a year it will tell you if its a leap year: ");
        String stringYear = myConsole.readLine();
        int intYear = Integer.parseInt(stringYear);
        Main main = new Main();


    }
}