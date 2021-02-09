package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {

    public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static void main(String[] args) {

        String name;
        int loanTermInYears;
        float bestRate;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");

        // Liest die Eingabe des Nutzers ein. Pausiert, solange kein Input erfolgt ist
        name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Liest die nächste Eingabe des Nutzers ein
        System.out.println("Enter the loan term (in years)");
        loanTermInYears = scanner.nextInt();

        bestRate = getRates(loanTermInYears);

        if(bestRate == 0.0f) {
            System.out.println("No available rates for term: " + loanTermInYears +" years");
        } else {
            System.out.println("Available Rate: " + getRates(loanTermInYears) + "%");
        }
        scanner.close();

    }

    public static float getRates(int loanTermInYears) {
        if (bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        } else
        return 0.0f;
    }
}
