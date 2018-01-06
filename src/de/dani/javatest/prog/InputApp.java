package de.dani.javatest.prog;


import java.util.Scanner;

public class InputApp {

    public static void main(String[] args) {
        System.out.println("Dani gibt ihre Lieblingszahl ein");
        Scanner scanner = new Scanner(System.in);

        try {
            Integer lz = scanner.nextInt();
            System.out.println("Soso! Wusste ich doch es war die " + lz);
        } catch (Exception e) {
            System.err.println("nicht mogeln!!");
        }

/*
Das ist ein
Multiline
Comment
 */
    }


}
