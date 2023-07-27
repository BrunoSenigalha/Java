package entities;

import java.util.List;

public class Employee {
    private final int id;
    private final String name;
    private Double salary;

    public Employee(int id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public void newSalary(double percentage){
        salary += salary * percentage / 100.0;
    }
    public String toString(){
        return id + ": " + name + ", R$" + String.format("%.2f", salary);
    }
    public static boolean hasId(List<Employee> employeeList, int id) {
        Employee emp = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

}
