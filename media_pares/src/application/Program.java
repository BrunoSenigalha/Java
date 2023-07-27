package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidadeElementos = sc.nextInt();
        int[] vector = new int[quantidadeElementos];
        double media = 0.0;
        int quantidadePares = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Digite o %dº numero: ", i + 1);
            vector[i] = sc.nextInt();

            if (vector[i] % 2 == 0) {
                media += vector[i];
                quantidadePares++;
            }
        }
        if (quantidadePares != 0.0) {
            System.out.printf("MEDIA DOS PARES = %.1f", media / quantidadePares);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
