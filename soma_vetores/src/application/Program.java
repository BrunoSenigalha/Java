package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int numeroValores = sc.nextInt();
        int[] vectorA = new int[numeroValores];
        int[] vectorB = new int[numeroValores];
        int[] vectorC = new int[numeroValores];
        sc.nextLine();

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }
        sc.close();
    }
}
