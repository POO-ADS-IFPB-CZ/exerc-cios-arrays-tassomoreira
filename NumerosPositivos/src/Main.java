import model.Numbers;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = Numbers.readNumbers();
        System.out.println(arrayNumbers);

        System.out.println("A quantidade de números informados foi "+ Numbers.calculateAmountOfNumbers());
        System.out.println("A média aritmética dos números informados é "+ Numbers.calculateAverageOfNumbers());
    }
}
