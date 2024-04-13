package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    public static ArrayList<Integer> arrayNumbers;

    public static ArrayList<Integer> readNumbers() {
        Scanner input = new Scanner(System.in);

        arrayNumbers = new ArrayList<Integer>();

        int num;
        do {
            System.out.print("Informe um número inteiro: ");
            num = input.nextInt();

            arrayNumbers.add(num);
        } while(num >= 0);

        arrayNumbers.removeLast();

        return arrayNumbers;
    }

    public static int calculateAmountOfNumbers() {
        return arrayNumbers.size();
    }

    public static double calculateAverageOfNumbers() {
        int accumulator = 0;
        for(int i = 0; i < arrayNumbers.size(); i++) {
            accumulator += arrayNumbers.get(i);
        }
        return accumulator / calculateAmountOfNumbers();
    }
}
