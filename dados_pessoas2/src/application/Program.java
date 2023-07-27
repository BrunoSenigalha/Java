package application;

import entities.People;
import utilities.Calculation;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculation calculation = new Calculation();
        double shortHeight;
        double greatHeight;


        System.out.print("How many people will be typed? ");
        int numberOfPeople = sc.nextInt();
        sc.nextLine();

        People[] vector = new People[numberOfPeople];

        for(int i = 0; i < vector.length; i++){
            System.out.printf("%dst person height: ", i+1);
            double height = sc.nextDouble();
            System.out.printf("%dst person gender: ", i+1);
            char gender = sc.next().charAt(0);
            vector[i] = new People(height, gender);
        }
        shortHeight = vector[0].getHeight();
        greatHeight = vector[0].getHeight();
        System.out.println("Shorter height = " + calculation.shorterHeight(vector, shortHeight));
        System.out.println("Greater height = " + calculation.greaterHeight(vector, greatHeight));
        System.out.printf("Average height of women = %.2f%n", calculation.averageWomen(vector));
        System.out.printf("Men's number = " + calculation.numberOfMen(vector));
    }
}
