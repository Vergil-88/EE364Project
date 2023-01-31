import java.util.ArrayList;

public class City {
    
    private String Name;
    private int Population;
    private double Area;
    private double Overpopulation;
    ArrayList <Human> Citizen = new ArrayList<Human>();
    ArrayList <Human> quarantineCitizen = new ArrayList<Human>();

    public City(String N, int P, double A){
        Name = N;
        Population = P;
        Area = A;
    }

    public double Calc_Overpopulation(int P, double A){
        /* Since overpopulation is calculated through the number of people and the insumption 
         * we are going to improvise a way to calculate the OP. basically we are going to assume
         * that the area per human is 25 meters squared and multiply the population by the APH and then divide by the Area of the region */
        int APH = 5^2;
        double OP = (Population * APH) / Area;
        return OP;
    
    }


        public String get_Name(){
        return Name;
    }

    public int get_Population(){
        return Population;
    }

    public double get_Area(){
        return Area;
    }

    public double get_Overpopulation(){
        return Overpopulation;
    }



    public String toString(){
        return Name + " | Population: " + Population + " | Area: " + Area + " | OverPopulation: " + Overpopulation;
    }
}
