package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantidadeElementos = sc.nextInt();
        double[] vector = new double[quantidadeElementos];
        double mediaVector = 0.0;

        for(int i = 0; i < vector.length; i++){
            System.out.printf("Digite o %dº numero: ", i + 1);
            vector[i] = sc.nextDouble();
            mediaVector += vector[i];
        }
        System.out.println();
        System.out.println("MEDIA DO VETOR = " + mediaVector / vector.length);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(double j: vector){
            if(j < (mediaVector / vector.length)){
                System.out.printf("%.2f%n", j);
            }
        }
        sc.close();

    }
}
