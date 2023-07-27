package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int quantidadeAlunos = sc.nextInt();

        Students[] vector = new Students[quantidadeAlunos];

        for (int i = 0; i < vector.length; i++){
            sc.nextLine();
            System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno:\n ", i+1);
            String nome = sc.nextLine();
            double nota_1 = sc.nextDouble();
            double nota_2 = sc.nextDouble();
            vector[i] = new Students(nome, nota_1, nota_2);
        }

        System.out.println("Alunos Aprovados: ");

        for (Students students : vector) {
            if (students.getMediaAluno() >= 6.0) {
                System.out.println(students.getAluno());
            }
        }
        sc.close();

    }
}
