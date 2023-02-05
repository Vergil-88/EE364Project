import java.util.ArrayList;

public class Region {
    private String Name;
    private int Population;
    private double Area;
    private double Overpopulation;
    ArrayList <City> Cities = new ArrayList<City>();

    public Region(String Name){
        this.Name = Name;
        

        if (Name.equals("South")){
            this.Area = 250000;
            this.Population = 2500;

            this.addCity("Baha", this.Population/4, Area/4);
            this.addCity("Jazan", this.Population/4, Area/4);
            this.addCity("Najran", this.Population/4, Area/4);
            this.addCity("Abha", this.Population/4, Area/4);
        }

        if (Name.equals("North")){
            this.Area = 250000;
            this.Population = 2500;
            this.addCity("Tabuk", this.Population/4, Area/4);
            this.addCity("Arar", this.Population/4, Area/4);
            this.addCity("Rafha", this.Population/4, Area/4);
            this.addCity("Turayf", this.Population/4, Area/4);
        }

        if (Name.equals("West")){
            this.Area = 250000;
            this.Population = 2500;
            this.addCity("Jeddah", this.Population/4, Area/4);
            this.addCity("Makkah", this.Population/4, Area/4);
            this.addCity("Taif", this.Population/4, Area/4);
            this.addCity("Madinah", this.Population/4, Area/4);
        }

        if (Name.equals("East")){
            this.Area = 250000;
            this.Population = 2500;
            this.addCity("Dammam", this.Population/4, Area/4);
            this.addCity("Aljubail", this.Population/4, Area/4);
            this.addCity("Alhfof", this.Population/4, Area/4);
            this.addCity("Hafr Albaten", this.Population/4, Area/4);
        }


    }
    
    public void Calc_Overpopulation(){
        // To Calculate the OP of a region we are going to only consider the Cities' OP 
        // meaning we are going to find the mean of the OP in the whole region and use it as overpopulaiton
        int numofCities = Cities.size();
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
        return Name + " | Population: " + Population + " | Area: " + Area + " | OverPopulation: " + Overpopulation +"\n" ;
 
    }





    public static void main(String[] args) {
        

        Region South = new Region("South");
        Region West = new Region("West");
        Region East = new Region("East");
        Region North = new Region("North");


        System.out.println(South.get_Cities());
        System.out.println(North.get_Cities());
        System.out.println(West.get_Cities());
        System.out.println(East.get_Cities());

        

    }
}
