package model;

import java.util.Scanner;

public class StudentsGrade {
    private static double[] arrayStudentsGrade;

    public static double[] readStudentsGrade() {
        Scanner input = new Scanner(System.in);

        arrayStudentsGrade = new double[10];

        for(int i = 0; i < 10; i++) {
            System.out.printf("Informe a nota do %dº aluno: ", i+1);
            arrayStudentsGrade[i] = input.nextDouble();
        }
        return arrayStudentsGrade;
    }

    public static double calculateAverageOfTheGrades() {
        double accumulator = 0;

        for(int i = 0; i < arrayStudentsGrade.length; i++) {
            accumulator += arrayStudentsGrade[i];
        }

        return accumulator / arrayStudentsGrade.length;
    }

    public static int calculateNumberOfGradesAboveAverage() {
        int accumulator = 0;
        for(int i = 0; i < arrayStudentsGrade.length; i++) {
            if(arrayStudentsGrade[i] > calculateAverageOfTheGrades()) {
                accumulator++;
            }
        }
        return accumulator;
    }

    public static int calculateNumberOfGradesBelowAverage() {
        int accumulator = 0;
        for(int i = 0; i < arrayStudentsGrade.length; i++) {
            if(arrayStudentsGrade[i] < calculateAverageOfTheGrades()) {
                accumulator++;
            }
        }
        return accumulator;
    }
}
