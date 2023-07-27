package utilities;

import entities.People;

public class Calculation {
    public double shorterHeight(People[] args, double shortHeight){
        for (People arg : args) {
            if (arg.getHeight() < shortHeight) {
                shortHeight = arg.getHeight();
            }
        }
        return shortHeight;
    }
    public double greaterHeight(People[] args, double greatHeight){
        for (People arg : args) {
            if (arg.getHeight() > greatHeight) {
                greatHeight = arg.getHeight();
            }
        }
        return greatHeight;
    }
    public double averageWomen(People[] args){
        double average = 0;
        int numberOfWoman = 0;
        for(People arg : args){
            if (arg.getGender() == 'F' || arg.getGender() == 'f'){
                numberOfWoman += 1;
                average += arg.getHeight();
            }
        }
        return average / numberOfWoman;
    }
    public int numberOfMen(People[] args){
        int number = 0;
        for (People arg : args){
            if (arg.getGender() == 'm' || arg.getGender() == 'M')
                number++;
        }
        return number;
    }
}
