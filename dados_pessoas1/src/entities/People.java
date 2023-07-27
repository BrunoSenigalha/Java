package entities;

public class People {
    private double height;
    private char gender;


    public People(){

    }

    public People(double height, char gender){
        this.height = height;
        this.gender = gender;

    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }

    public double shorterHeight(People[] args, double shortHeight){
        for (People arg : args) {
            if (arg.height < shortHeight) {
                shortHeight = arg.height;
            }
        }
        return shortHeight;
    }
    public double greaterHeight(People[] args, double greatHeight){
        for (People arg : args) {
            if (arg.height > greatHeight) {
                greatHeight = arg.height;
            }
        }
        return greatHeight;
    }
    public double averageWomen(People[] args){
        double average = 0;
        int numberOfWoman = 0;
        for(People arg : args){
            if (arg.gender == 'F' || arg.gender == 'f'){
                numberOfWoman += 1;
                average += arg.height;
            }
        }
        return average / numberOfWoman;
    }
    public int numberOfMen(People[] args){
        int number = 0;
        for (People arg : args){
            if (arg.gender == 'm' || arg.gender == 'M')
                number++;
        }
        return number;
    }
}
