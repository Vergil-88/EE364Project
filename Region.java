import java.util.ArrayList;

public class Region {
    private String Name;
    private int Population;
    private double Area;
    private double Overpopulation;
    ArrayList <City> Cities = new ArrayList<City>();

    public Region(String N, int P, double A){
        Name = N;
        Population = P;
        Area = A;
    }
    
    public void Calc_Overpopulation(){
        // To Calculate the OP of a region we are going to only consider the Cities' OP 
        // meaning we are going to find the mean of the OP in the whole region and use it as overpopulaiton
        int numofCities = 0;
        int totalOP = 0;
        for (City x : Cities){
            numofCities++;
            totalOP += x.get_Overpopulation();
        }
        Overpopulation = totalOP/numofCities;

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

    public int get_Cities(){
        return Cities.size();
    }


    public String toString(){
        return Name + " | Population: " + Population + " | Area: " + Area + " | OverPopulation: " + Overpopulation;
    }
}
