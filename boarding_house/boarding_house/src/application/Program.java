package application;

import utilitie.BoardingHouse;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BoardingHouse[] vector = new BoardingHouse[10];

        System.out.print("How many rooms will be rented? ");
        int number = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.printf("Rent #%d%n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();
            vector[room] = new BoardingHouse(name, email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                System.out.println(i + ": " + vector[i]);
            }
        }
        sc.close();
    }
}
