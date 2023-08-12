package application;

import entities.Company;
import entities.Contributor;
import entities.Individual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        List<Contributor> contributorList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char option = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if (option == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Contributor contributor = new Individual(name, annualIncome, healthExpenditures);
                contributorList.add(contributor);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                Contributor contributor = new Company(name, annualIncome, numberOfEmployees);
                contributorList.add(contributor);
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contributor contributor : contributorList) {
            System.out.print(contributor.getName() + ": $ " + String.format("%.2f%n", contributor.taxes()));
            sum += contributor.taxes();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);

        sc.close();
    }
}
