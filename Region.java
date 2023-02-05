import java.util.ArrayList;

public class Region {
    private String Name;
    private int Population = 0;
    private double Area;
    private double Overpopulation;
    ArrayList <City> Cities = new ArrayList<City>();

    public Region( String Name, double Area ){
        this.Name = Name;
        this.Area = Area;

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

    public ArrayList get_Cities(){
        return Cities;
    }

    public void addCity(String Name, int Population, double Area){

        City City1 = new City(Name, Population, Area);
        Cities.add(City1);

    }

    public int getNumOfCities(){

        return Cities.size();
    }

    public  ArrayList <City>  getCities(){
        return Cities;
    }

    public void getPopulation(){

        for(City C : Cities){
            Population += C.get_Population();
        }

    }


    public String toString(){
        return Name + " | Population: " + Population + " | Area: " + Area + " | OverPopulation: " + Overpopulation  ;
 
    }





    public static void main(String[] args) {
        

        Region Sowth = new Region("Sowth", 153148);

        Sowth.addCity("Jeddah", 3000, 1600);

        System.out.println(Sowth.get_Cities());

        System.out.println(Sowth.getCities().get(0).get_Citizeninfo());


    }
}
