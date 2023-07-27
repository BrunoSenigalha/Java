package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        boolean flag = true;

        do{
            System.out.println("Type the option:");
            System.out.println("Option 1: New employee");
            System.out.println("Option 2: Update salary");
            System.out.println("Option 3: List of employees");
            System.out.println("Option 4: Remove employee");
            System.out.println("Option 5: Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (choice) {

                case 1 -> {
                    System.out.println("Type employee information: ");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    while (Employee.hasId(employeeList, id)) {
                        System.out.println("This ID already exists, type another.");
                        id = sc.nextInt();
                    }
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Salary: ");
                    Double salary = sc.nextDouble();
                    employeeList.add(new Employee(id, name, salary));
                    System.out.println("Employee successfully added! ");
                    System.out.println();
                }

                case 2 -> {
                    System.out.print("Type employee's ID: ");
                    int identification = sc.nextInt();
                    Employee emp = employeeList.stream().filter(x -> x.getId() == identification).findFirst().orElse(null);
                    if (emp == null) {
                        System.out.println();
                        System.out.println("This ID does not exist.");
                        System.out.println();
                    }
                    else {
                        System.out.print("Type the percent: ");
                        double percent = sc.nextDouble();
                        emp.newSalary(percent);
                        System.out.println("New salary was updated!");
                        System.out.println();
                    }
                }

                case 3 -> {
                   if (employeeList.isEmpty()){
                       System.out.println("There are no employees to list");
                       System.out.println();
                   }
                   else {
                       for (Employee info : employeeList) {
                           System.out.println(info.toString());
                       }
                   }
                    System.out.println();
                }

                case 4 -> {
                    System.out.println("Type employee's ID: ");
                    int id = sc.nextInt();
                    if(Employee.hasId(employeeList, id)){
                        employeeList.removeIf(x -> x.getId() == id);
                        System.out.println("Employee " + id + " is removed.");
                        System.out.println();
                    }
                    else{
                        System.out.println("Id not found.");
                        System.out.println();
                    }
                }

                case 5 ->{
                    System.out.print("...You left the system...");
                    flag = false;
                }
                default -> {
                    System.out.println("Wrong option!");
                    System.out.println();
                }
            }
        }while (flag);
        sc.close();
    }


}
