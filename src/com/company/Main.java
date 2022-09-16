package com.company;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        intro();
    }

    static void intro() {
        System.out.println("Zadejte vetu:");
        String userInputSentence = sc.nextLine();
        System.out.println("Zadejte serii znaku");
        String userInputCharseq = sc.nextLine();
        analisis(userInputSentence, userInputCharseq);
    }


    static void analisis(String userInputSentence, String userInputCharseq) {
        String[] splitted = userInputSentence.split(" ");
        int count = 0;
        for (String s : splitted) {
            if (s.contains(userInputCharseq)){
                count++;
            }
        }
        System.out.println("Veta obsahuje tuto sekvenci "+count+"krat.");
    }
}
