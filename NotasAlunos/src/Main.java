import model.StudentsGrade;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arrayStudentsGrade = StudentsGrade.readStudentsGrade();
        System.out.println("Notas dos alunos: "+ Arrays.toString(arrayStudentsGrade));
        System.out.println("Média destas notas: "+StudentsGrade.calculateAverageOfTheGrades());
        System.out.println("Quantidade de notas acima da média: "+ StudentsGrade.calculateNumberOfGradesAboveAverage());
        System.out.println("Quantidade de notas abaixo da média: "+ StudentsGrade.calculateNumberOfGradesBelowAverage());
    }
}
