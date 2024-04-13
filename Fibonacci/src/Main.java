import java.util.Arrays;

public class Main {
    public static int[] calculateFibonacci() {
        int[] arrayFibonacci = new int[30];
        int previous = 0;
        int aux = 0;
        int next = 1;
        for(int i = 0; i < 30; i++) {
            arrayFibonacci[i] = next;
            aux = next;
            next = previous + next;
            previous = aux;
        }
        return arrayFibonacci;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateFibonacci()));
    }
}
