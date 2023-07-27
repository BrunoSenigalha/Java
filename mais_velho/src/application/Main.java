package application;

import entities.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int quantidadePessoas = sc.nextInt();
        Pessoa[] vector = new Pessoa[quantidadePessoas];
        int maiorIdade = 0;

        for (int i = 0; i < vector.length; i++) {
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa: \n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vector[i] = new Pessoa(nome, idade);
            if (maiorIdade < vector[i].getIdade()) {
                maiorIdade = vector[i].getIdade();
            }
        }
        for (int i = 0; i < vector.length; i++) {
            if (maiorIdade == vector[i].getIdade()) {
                System.out.println("Pessoa mais velha: " + vector[i].getNome());
            }
        }
        sc.close();

    }
}
