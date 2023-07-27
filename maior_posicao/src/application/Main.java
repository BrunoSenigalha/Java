package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int quantidadeNumeros = sc.nextInt();
        double[] vector = new double[quantidadeNumeros];
        double maiorValor = 0.0;
        int maiorPosicao = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um numero: ");
            vector[i] = sc.nextDouble();
            if (vector[i] > maiorValor) {
                maiorValor = vector[i];
                maiorPosicao = i;
            }
        }
        System.out.println("MAIOR VALOR = " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = " + maiorPosicao);

        sc.close();
    }
}