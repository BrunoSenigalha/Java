package application;

import entities.Importedproduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> productsList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = scanner.nextInt();

        for (int i = 1; i <= numberOfProducts; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char option = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();

            if(option == 'c'){
                Product product = new Product(name, price);
                productsList.add(product);

            } else if (option == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                scanner.nextLine();
                LocalDate manufactureDate = LocalDate.parse(scanner.nextLine(), fmt);
                Product product = new UsedProduct(name, price, manufactureDate);
                productsList.add(product);

            }else{
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                Product product = new Importedproduct(name, price, customsFee);
                productsList.add(product);
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : productsList) {
            System.out.println(product.priceTag());
        }
        scanner.close();
    }
}
