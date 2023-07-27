package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeNumero = sc.nextInt();
        sc.nextLine();
        int[] vector = new int[quantidadeNumero];
        int quantidadePares = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextInt();

            if (vector[i] % 2 == 0) {
                quantidadePares++;
            }
        }
        System.out.println("NUMEROS PARES: ");
        for (int j : vector) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidadePares);

        sc.close();
    }
}
