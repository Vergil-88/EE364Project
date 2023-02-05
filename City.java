import java.util.ArrayList;
import java.util.Random;

public class City {
    
    private String Name;
    private int Population;
    private double Area;
    private double Overpopulation;
    private ArrayList <Human> Citizen = new ArrayList<Human>();
    private ArrayList <Human> quarantineCitizen = new ArrayList<Human>();

    public City(String Name, int Population, double Area){
        this.Name = Name;
        this.Population = Population;
        this.Area = Area;


        Random ran1 = new Random();
        
        for (int i = 0 ; i<Population ; i++ ){
    
             Citizen.add(new Human());
    
    
            //  System.out.println(Citizen.get(i).toString());
    
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
    
        
        for (Human  C : Citizen) {
            int Num_Of_friends= (int)(Math.random()*5+2);
    
            for (int i = 0; i<Num_Of_friends; i++) {
                
            int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
    
            if( !(C.equals(Citizen.get(index_of_friends))) )
            if(!(C.getfamily_Arraylist().contains(Citizen.get(index_of_friends))))
            if(!(C.getfriends_Arraylist().contains(Citizen.get(index_of_friends))))
                if(!(C.getcoWorkers_Arraylist().contains(Citizen.get(index_of_friends))))
                     if(!(C.getrandomIndividuals_Arraylist().contains(Citizen.get(index_of_friends)))){
    
                                C.setfriends(Citizen.get(index_of_friends));
                                Citizen.get(index_of_friends).setfriends(C);
                             }
            }  
        }
        
            
        for (Human  C : Citizen) {
            int Num_Of_friends= (int)(Math.random()*5+2);
    
            for (int i = 0; i<Num_Of_friends; i++) {
                
            int index_of_friends =numRan.nextInt( Citizen.size()-1) ;  
    
            if( !(C.equals(Citizen.get(index_of_friends))) )
                if(!(C.getfamily_Arraylist().contains(Citizen.get(index_of_friends))))
                    if(!(C.getfriends_Arraylist().contains(Citizen.get(index_of_friends))))
                        if(!(C.getcoWorkers_Arraylist().contains(Citizen.get(index_of_friends))))
                             if(!(C.getrandomIndividuals_Arraylist().contains(Citizen.get(index_of_friends)))){
    
                                C.setcoWorkers(Citizen.get(index_of_friends));
                                Citizen.get(index_of_friends).setcoWorkers(C);
                             }
            }  
        }   
    
        for (Human  C : Citizen) {
            int Num_Of_friends= (int)(Math.random()*5+2);
    
            for (int i = 0; i<Num_Of_friends; i++) {
                
            int index_of_friends =numRan.nextInt( Citizen.size()-1) ;  
    
            if( !(C.equals(Citizen.get(index_of_friends))) )
                if(!(C.getfamily_Arraylist().contains(Citizen.get(index_of_friends))))
                    if(!(C.getfriends_Arraylist().contains(Citizen.get(index_of_friends))))
                        if(!(C.getcoWorkers_Arraylist().contains(Citizen.get(index_of_friends))))
                             if(!(C.getrandomIndividuals_Arraylist().contains(Citizen.get(index_of_friends)))){
    
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

    //////////////////////  dummy code might consider adding    /////////////////////////////

    public String get_Citizeninfo(){
        String p="";
        for (Human human : Citizen) {
           p+= human.toString();
        }
        return p;
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    public String toString(){
        return Name + " | Population: " + Population + " | Area: " + Area + " | OverPopulation: " + Overpopulation;
    }



///////////////////////////////////////////////////////////////////////////////////////////



public static void main(String[] args) {
        
        City Jeddah = new City("Jeddah", 10000, 69);

         for (Human c : Jeddah.Citizen)  {
            System.out.println(c.toString());
  
         }
    
    }
}
