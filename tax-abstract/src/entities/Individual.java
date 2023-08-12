package entities;

public class Individual extends Contributor{
    private Double healthExpenditure;

    public Individual(){
    }

    public Individual(String name, Double annualIncome, Double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public double taxes() {
        double tax = getAnnualIncome() < 20000.00 ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;

        if (healthExpenditure > 0){
            tax -= healthExpenditure * 0.5;
        }

        return tax;
    }
}
