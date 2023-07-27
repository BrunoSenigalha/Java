package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int number = sc.nextInt();
        sc.nextLine();

        List<Employee> employeeList = new ArrayList<>(number);

        for (int i =0; i < number; i++){
            System.out.printf("Employee # %d:\n", i+1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (hasId(employeeList, id)){
                System.out.print("This Id exists, type a different Id: ");
                id = sc.nextInt();
            }

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (emp == null){
            System.out.println();
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        for (Employee employee : employeeList){
            System.out.println(employee.getString());
        }

        sc.close();
        }

        public static boolean hasId(List<Employee> list, int id){
            Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            return emp != null;
        }
}
