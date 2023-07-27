package application;

import utilities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int numeroPessoas = sc.nextInt();
        Person[] vector = new Person[numeroPessoas];
        double sum = 0.0;
        int contadorIdade = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("Dados da %dº pessoa: ", i + 1);
            sc.nextLine();
            System.out.println();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            vector[i] = new Person(nome, idade, altura);
            sum += vector[i].getAltura();

            if (vector[i].getIdade() < 16) {
                contadorIdade += 1;
            }
        }

        System.out.println();
        System.out.printf("Altura média: %.2f%n", sum / numeroPessoas);
        double porcentagem = (double) (contadorIdade * 100) / vector.length;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        for (Person person : vector) {
            if (person.getIdade() < 16) {
                System.out.println(person.getNome());

            }
        }
        sc.close();
    }
}
