package application;

import java.util.Locale;
import java.util.Scanner;

public class SumVector {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();
        double sum = 0;
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {

            System.out.printf("Type %dº number: ", i + 1);
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }
        System.out.print("VALUES= ");

        for (double j : vect) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.printf("SUM = %.2f%n", sum);
        System.out.printf("AVERAGE = %.2f%n", sum / vect.length);

        sc.close();
    }
}
