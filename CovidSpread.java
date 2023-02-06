import java.util.ArrayList;
import java.util.Random;

import javax.sound.midi.Patch;

public class CovidSpread {
    
//Delration 

//private ArrayList<Human> PostiveC = new ArrayList<Human>();
private Random rad = new Random() ;

/// constrictor
public CovidSpread(){

}


// Covid start

public void StartCovid(City CityName){

    int numberOfPatients = (int) (CityName.get_Population() *0.05);
    int PatientIndex;
    Human Patient;
    ArrayList<Human> Citizen = CityName.get_Citizen();


    covidInfection TypeA = new A(); 

    for (int i = 0 ; i < numberOfPatients ; i++) {

        PatientIndex = rad.nextInt(CityName.get_Population()-1);

        Patient = Citizen.get(PatientIndex);

        Patient.setCovidInfection_Type(TypeA);

        //System.out.println(Patient);
  
    } 

    CityName.setCitizen(Citizen);


}


////Spreading B Type :

public void SpreadingB(Human Patient){

    ArrayList<Human> family =  Patient.getfamily_Arraylist();
    ArrayList<Human> friends  = Patient.getfriends_Arraylist();
    ArrayList<Human> coWorkers = Patient.getcoWorkers_Arraylist();
    ArrayList<Human> randomIndividuals = Patient.getrandomIndividuals_Arraylist();
    
    covidInfection TypeB = new B();
    
    // family to TaypeB

    for (Human F : family) {
        String Taype = F.getCovidInfection_Type().getType();
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
            F.setCovidInfection_Type(TypeB);
    }

    // friends to TaypeB

    int numberOfFriends = (int) (friends.size() * 0.50);
    int FriendIndex;
    Human Friend;

    for (int i = 0; i < numberOfFriends; i++) {
        
        FriendIndex = rad.nextInt(friends.size()-1);

        // if(friends.get(FriendIndex).getCovidInfection_Type().getType() == "B")
        //     continue;

        Friend = friends.get(FriendIndex);
        String Taype = Friend.getCovidInfection_Type().getType();
        
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                     Friend.setCovidInfection_Type(TypeB);
        
    }

    // coWorkers to TaypeB

    int numberOfCoWorkers = (int) (coWorkers.size() * 0.75);
    int coWorkerIndex;
    Human coWorker;

    for (int i = 0; i < numberOfCoWorkers; i++) {

        coWorkerIndex = rad.nextInt(coWorkers.size()-1);

        coWorker = coWorkers.get(coWorkerIndex);
        String Taype = coWorker.getCovidInfection_Type().getType();
        
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                    coWorker.setCovidInfection_Type(TypeB);
        
    }

    // randomIndividuals to TaypeB

    int numberOfRandomIndividuals = (int) (friends.size() * 0.25);
    int randomIndividualsIndex;
    Human randomIndividual;

    for (int i = 0; i < numberOfRandomIndividuals; i++) {

        randomIndividualsIndex = rad.nextInt(randomIndividuals.size()-1);

        randomIndividual = randomIndividuals.get(randomIndividualsIndex);
        String Taype = randomIndividual.getCovidInfection_Type().getType();
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                    randomIndividual.setCovidInfection_Type(TypeB);
        
    }
    
    
    

}
////// Spreading C Type 
public void SpreadingC(Human Patient){

    ArrayList<Human> family =  Patient.getfamily_Arraylist();
    ArrayList<Human> friends  = Patient.getfriends_Arraylist();
    ArrayList<Human> coWorkers = Patient.getcoWorkers_Arraylist();
    ArrayList<Human> randomIndividuals = Patient.getrandomIndividuals_Arraylist();
    covidInfection TypeC = new C();
    
    // family to TaypeC

    for (Human F : family) {
        String Taype = F.getCovidInfection_Type().getType();
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                    F.setCovidInfection_Type(TypeC);
    }

    // friends to TaypeC

    int numberOfFriends = (int) (friends.size() * 0.75);
    int FriendIndex;
    Human Friend;

    for (int i = 0; i < numberOfFriends; i++) {

        FriendIndex = rad.nextInt(friends.size()-1);

        Friend = friends.get(FriendIndex);
        String Taype = Friend.getCovidInfection_Type().getType();
        
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                     Friend.setCovidInfection_Type(TypeC);
        
    }

    // coWorkers to TaypeC

    int numberOfCoWorkers = (int) (coWorkers.size() * 0.50);
    int coWorkerIndex;
    Human coWorker;

    for (int i = 0; i < numberOfCoWorkers; i++) {

        coWorkerIndex = rad.nextInt(coWorkers.size()-1);

        coWorker = coWorkers.get(coWorkerIndex);
        String Taype = coWorker.getCovidInfection_Type().getType();
        
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                     coWorker.setCovidInfection_Type(TypeC);
        
    }

    // randomIndividuals to TaypeC

    int numberOfRandomIndividuals = (int) (randomIndividuals.size() * 0.25);
    int randomIndividualsIndex;
    Human randomIndividual;

    for (int i = 0; i < numberOfRandomIndividuals; i++) {

        randomIndividualsIndex = rad.nextInt(randomIndividuals.size()-1);

        randomIndividual = randomIndividuals.get(randomIndividualsIndex);
        String Taype = randomIndividual.getCovidInfection_Type().getType();
        if (!(Taype.equals("A")))
            if(!(Taype.equals("B")))
                if(!(Taype.equals("C")))
                     randomIndividual.setCovidInfection_Type(TypeC);
        
    }
    
    
    

}





///////////////////////////////////////////////



public static void main(String[] args) {

    Region South = new Region("South");
    South.addCity("FU_GAMDI", 10000, 1600);

    CovidSpread covid = new CovidSpread();

    covid.StartCovid(South.Cities.get(0));

    for (Human H : South.Cities.get(0).get_Citizen()) {

        if(H.getCovidInfection_Type().getType().equals("A"))
           covid.SpreadingB(H);
        else if(H.getCovidInfection_Type().getType().equals("B"))
            covid.SpreadingC(H);
        
        
    }

    // System.out.println(South.Cities.get(0).get_Citizeninfo());
    System.out.println(South.Cities.get(0).get_Citizen().size());

    int numOf_A=0;
    int numOf_B=0;
    int numOf_C=0;
    int numOf_Normal=0;
    for (Human H : South.Cities.get(0).get_Citizen()) {
        
        String Z= H.getCovidInfection_Type().getType();

       switch (Z){
       
       
       case "A":
       numOf_A++;

       break;
    
       case "B":
       numOf_B++;

       break;
       

       case "C":
       numOf_C++;

       break;


       case "Normal":

       numOf_Normal++;

       break;






       
       }






    }

System.out.println("A num = "+numOf_A );
System.out.println("B num = "+numOf_B );
System.out.println("C num = "+numOf_C );
System.out.println("Normal num = "+numOf_Normal );

}

}
