package entities;

public class Company extends Contributor{
    private int numberOfEmployees;

    public Company(){
    }

    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double taxes() {

        return numberOfEmployees > 10 ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16;
    }
}
