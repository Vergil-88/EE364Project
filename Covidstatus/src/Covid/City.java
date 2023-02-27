package Covid;
import java.util.ArrayList;
import java.util.Random;

public class City implements Places, Cloneable {
    // data field

    private String Name;
    private int Population;
    private double Area;
    private double Overpopulation;
    private ArrayList <Human> Citizen              =   new ArrayList<Human>();
    private ArrayList <Human> Quarantine_Citizen   =   new ArrayList<Human>();
    private ArrayList <Human> DeadCitizen          =   new ArrayList<Human>();
    private ArrayList <Human> Travelers            =   new ArrayList<Human>();
    
    
    // constructor
    
    public City(String Name, int Population, double Area){
        this.Name = Name;
        this.Population = Population;
        this.Area = Area;
        Overpopulation = Calc_Overpopulation(Population, Area);

        Random ran1 = new Random();

        // filing the Citizen Array

        for (int i = 0 ; i<Population ; i++ ){

            Citizen.add(new Human());
   
   
           
   
        }
        int size= Citizen.size();
        for(int xx=0; xx<size ;xx++){
            int number_Of_family_mem=ran1.nextInt(7) + 2;
            ArrayList <Human>  member= new ArrayList <Human>();
           
            for(int i=1 ; i < number_Of_family_mem ; i++){
                  
               member.add(new Human()) ;// all the family is Created
   
            }
                
            Citizen.addAll(member);
   
   

            for(Human W : member){
                   
                Citizen.get(xx).setfamily(W);//fammliy member to C 
            }
               
               
            for(Human W : member){
                   
                W.setfamily(Citizen.get(xx));// familly to c 
            }
               
   
   
   
            for(Human m : member){//the know each others 
                   
                for(Human m2 : member){
                    if(!(m.equals(m2)))
                    m.setfamily(m2);
                }
            }
               
   
        }
      
   
   
        Random numRan= new Random();
   
       // filling the friends Array 

        for (Human  C : Citizen) {
            int Num_Of_friends= (int)(Math.random()*5+2);
   
            for (int i = 0; i<Num_Of_friends; i++) {
               
            int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
            Human SearchCitizen = Citizen.get(index_of_friends);

            // conditions to make sure the Humen not in  family, friends, coWorkers,or randomIndividuals Arrays. 

            if( !(C.equals(SearchCitizen)))
                if(!(C.getfamily_Arraylist().contains(SearchCitizen)))
                    if(!(C.getfriends_Arraylist().contains(SearchCitizen)))
                        if(!(C.getcoWorkers_Arraylist().contains(SearchCitizen)))
                            if(!(C.getrandomIndividuals_Arraylist().contains(SearchCitizen))){
   
                                C.setfriends(Citizen.get(index_of_friends));
                                Citizen.get(index_of_friends).setfriends(C);
                            }
           }  
        }
       
           // filling the coWorkers Array 

       for (Human  C : Citizen) {
            int Num_Of_friends= (int)(Math.random()*5+2);
   
            for (int i = 0; i<Num_Of_friends; i++) {
               
            int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
   
            Human SearchCitizen = Citizen.get(index_of_friends);

            // conditions to make sure the Humen not in  family, friends, coWorkers,or randomIndividuals Arrays. 

            if( !(C.equals(SearchCitizen)))
                if(!(C.getfamily_Arraylist().contains(SearchCitizen)))
                    if(!(C.getfriends_Arraylist().contains(SearchCitizen)))
                        if(!(C.getcoWorkers_Arraylist().contains(SearchCitizen)))
                            if(!(C.getrandomIndividuals_Arraylist().contains(SearchCitizen))){
   
                                C.setcoWorkers(Citizen.get(index_of_friends));
                                Citizen.get(index_of_friends).setcoWorkers(C);
                            }
            }  
        }   
        // filling the RandomIndividuals Array 

        for (Human  C : Citizen) {
            int Num_Of_friends= (int)(Math.random()*5+2);
   
            for (int i = 0; i<Num_Of_friends; i++) {
               
            int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
   
            Human SearchCitizen = Citizen.get(index_of_friends);

            // conditions to make sure the Humen not in  family, friends, coWorkers,or randomIndividuals Arrays. 

            if( !(C.equals(SearchCitizen)))
                if(!(C.getfamily_Arraylist().contains(SearchCitizen)))
                    if(!(C.getfriends_Arraylist().contains(SearchCitizen)))
                        if(!(C.getcoWorkers_Arraylist().contains(SearchCitizen)))
                            if(!(C.getrandomIndividuals_Arraylist().contains(SearchCitizen))){
   
                                C.setRandomIndividuals(Citizen.get(index_of_friends));
                                Citizen.get(index_of_friends).setRandomIndividuals(C);
                            }
            }  
        }   
   


    }

    public double Calc_Overpopulation(int P, double A){
        /* Since overpopulation is calculated through the number of people and the insumption 
         * we are going to improvise a way to calculate the OP. basically we are going to assume
         * that the area per human is 25 meters squared and multiply the population by the APH and then divide by the Area of the region */
        int APH = 5^2;
        double OP = (Population * APH) / Area;
        return OP;
    
    }



    
    public void setDeadCitizen(ArrayList<Human> deadCitizen) {
        DeadCitizen = deadCitizen;
    }
    public ArrayList<Human> getDeadCitizen() {
        return DeadCitizen;
    }

    // Print the History of Human.

    public void Find_Citizen_History(String ID){

    // find the Human and then print his history 

        for (Human human : Citizen) {
            if (human.getId().equals(ID)){
                System.out.println(human.getHistory()); 
            }
        }


            for (Human Person : DeadCitizen) {
                if (Person.getId().equals(ID)){
                    System.out.println(Person.getHistory()); 
                }
                    
            } 
            
                    
    }
        
    





    public static void Travel(ArrayList<City> cities,int day){
        
        Random R = new Random();
        int R1=0;
        int R2=0;

        // pick two random Cities
        do{
            R1=R.nextInt(cities.size()-1);
            R2=R.nextInt(cities.size()-1);
        }while(R1==R2);
        

        City City_1 = cities.get(R1);
        City City_2 = cities.get(R2);

        ArrayList<Human> Pepole_city2 = City_2.get_Citizen();
        ArrayList<Human> Pepole_city1 = City_1.get_Citizen();

        // pick a random Human 

        int NumberOfCitizin= Pepole_city1.size();
        int RandomIndex=R.nextInt(NumberOfCitizin-1);
        Human Person=Pepole_city1.get(RandomIndex);
       
        
        // Add the travler to the new city
        City_2.addCitizen(Person);   
        City_2.addTraveler(Person); 

        // remove the travler from the old city 
        Pepole_city1.remove(Person); 


        // Clears his Current Family and randomIndividuals so he dosent interact with them in the other City
        Person.Clear_F(); 
       
        
    
        //Person IS ASSIGNED NEW randomIndividuals
        int Num_Of_friends= (int)(Math.random()*5+2);

        // for loop to add all the new randomIndividuals
        for (int i = 0; i<Num_Of_friends; i++) {
           
        // pick random person
        int index_of_friends =R.nextInt(Pepole_city2.size()-1) ;  

        Human SearchCitizen = Pepole_city2.get(index_of_friends);

        // conditions to make sure the Humen not in  family, friends, coWorkers,or randomIndividuals Arrays. 
        if( !(Person.equals(SearchCitizen)))
            if(!(Person.getfamily_Arraylist().contains(SearchCitizen)))
                if(!(Person.getfriends_Arraylist().contains(SearchCitizen)))
                    if(!(Person.getcoWorkers_Arraylist().contains(SearchCitizen)))
                        if(!(Person.getrandomIndividuals_Arraylist().contains(SearchCitizen))){

                            Person.setRandomIndividuals(Pepole_city2.get(index_of_friends));
                            Pepole_city2.get(index_of_friends).setRandomIndividuals(Person);

                        }
        }  
       
        // update the travler history

        String City_1_Name=City_1.get_Name();
        String City_2_Name=City_2.get_Name();
        Person.updateTravelHistory(City_1_Name,City_2_Name , day);

        



    }


    /// Geters and Seters.

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

    public ArrayList<Human> get_Citizen(){
        
        return Citizen;
    }
    
    public void setCitizen(ArrayList<Human> citizen) {
        Citizen = citizen;
    }

    public ArrayList<Human> getTravelers() {
        return Travelers;
    }
    
   

    public String get_Citizeninfo(){
        String p="";
        for (Human human : Citizen) {
            p+= human.toString();
        }
        return p;
    }
    

    public void addCitizen(Human person) {


        Citizen.add(person);

    }
    public void addTraveler(Human person) {


        Travelers.add(person);

    }

    public ArrayList<Human> getQuarantine_Citizen() {
        return Quarantine_Citizen;
    }

    public void setQuarantine_Citizen(ArrayList<Human> quarantine_Citizen) {
        Quarantine_Citizen = quarantine_Citizen;
    }

    public void AddQuarantine_Citizen(Human human) {
        Quarantine_Citizen.add(human);
    }

    public String toString(){
        return Name + " | Population: " + Population + " | Area: " + Area + " | OverPopulation: " + Overpopulation;
    }




    // clone to Creat a Copy for the Phase2.

    public City clone() {

        return new City(Name, Population, Area);
    }

}
