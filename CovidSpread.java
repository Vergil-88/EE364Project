import java.util.ArrayList;
import java.util.Random;

public class CovidSpread {
    
    //Delration 
private ArrayList<Human> PostiveA = new ArrayList<Human>();
private ArrayList<Human> PostiveB = new ArrayList<Human>();
//private ArrayList<Human> PostiveC = new ArrayList<Human>();
private Random rad = new Random() ;

public CovidSpread(City CityName){
   
    int numberOfPatients = (int) (CityName.get_Population() * 0.15);
    int PatientIndex;
    Human Patient;
    covidInfection TypeA = new A(); 

    for (int i = 0 ; i < numberOfPatients ; i++) {

        PatientIndex = rad.nextInt(CityName.get_Population()-1);

        Patient = CityName.get_Citizen().get(numberOfPatients);

        Patient.setCovidInfection_Type(TypeA);

        PostiveA.add(Patient);
  
    } 



}


////Spreading B Type :
public void SpreadingB(Human Patient){

    ArrayList<Human> family =  Patient.getfamily_Arraylist();
    ArrayList<Human> friends  = Patient.getfriends_Arraylist();
    ArrayList<Human> coWorkers = Patient.getcoWorkers_Arraylist();
    ArrayList<Human> randomIndividuals = Patient.getrandomIndividuals_Arraylist();
    covidInfection TypeC = new C();
    
    // family to TaypeB

    for (Human F : family) {

            F.setCovidInfection_Type(TypeB);
    }

    // friends to TaypeB

    int numberOfFriends = (int) (friends.size() * 0.75);
    int FriendIndex;
    Human Friend;

    for (int i = 0; i < numberOfFriends; i++) {

        FriendIndex = rad.nextInt(friends.size()-1);

        Friend = friends.get(FriendIndex);

        Friend.setCovidInfection_Type(TypeB);
        
    }

    // coWorkers to TaypeB

    int numberOfCoWorkers = (int) (friends.size() * 0.50);
    int coWorkerIndex;
    Human coWorker;

    for (int i = 0; i < numberOfCoWorkers; i++) {

        coWorkerIndex = rad.nextInt(coWorkers.size()-1);

        coWorker = friends.get(coWorkerIndex);

        coWorker.setCovidInfection_Type(TypeB);
        
    }

    // randomIndividuals to TaypeB

    int numberOfRandomIndividuals = (int) (friends.size() * 0.25);
    int randomIndividualsIndex;
    Human randomIndividual;

    for (int i = 0; i < numberOfRandomIndividuals; i++) {

        randomIndividualsIndex = rad.nextInt(randomIndividuals.size()-1);

        randomIndividual = friends.get(randomIndividualsIndex);

        randomIndividual.setCovidInfection_Type(TypeB);
        
    }
    
    
    

}

public void SpreadingC(Human Patient){

    ArrayList<Human> family =  Patient.getfamily_Arraylist();
    ArrayList<Human> friends  = Patient.getfriends_Arraylist();
    ArrayList<Human> coWorkers = Patient.getcoWorkers_Arraylist();
    ArrayList<Human> randomIndividuals = Patient.getrandomIndividuals_Arraylist();
    covidInfection TypeB = new B();
    
    // family to TaypeC

    for (Human F : family) {

            F.setCovidInfection_Type(TypeB);
    }

    // friends to TaypeC

    int numberOfFriends = (int) (friends.size() * 0.75);
    int FriendIndex;
    Human Friend;

    for (int i = 0; i < numberOfFriends; i++) {

        FriendIndex = rad.nextInt(friends.size()-1);

        Friend = friends.get(FriendIndex);

        Friend.setCovidInfection_Type(TypeB);
        
    }

    // coWorkers to TaypeC

    int numberOfCoWorkers = (int) (friends.size() * 0.50);
    int coWorkerIndex;
    Human coWorker;

    for (int i = 0; i < numberOfCoWorkers; i++) {

        coWorkerIndex = rad.nextInt(coWorkers.size()-1);

        coWorker = friends.get(coWorkerIndex);

        coWorker.setCovidInfection_Type(TypeB);
        
    }

    // randomIndividuals to TaypeC

    int numberOfRandomIndividuals = (int) (friends.size() * 0.25);
    int randomIndividualsIndex;
    Human randomIndividual;

    for (int i = 0; i < numberOfRandomIndividuals; i++) {

        randomIndividualsIndex = rad.nextInt(randomIndividuals.size()-1);

        randomIndividual = friends.get(randomIndividualsIndex);

        randomIndividual.setCovidInfection_Type(TypeB);
        
    }
    
    
    

}



////////////////seter and geter////////////////
//Type A:

public ArrayList<Human> getPostiveA(){

        return PostiveA;
}

public void setPotiveA(Human Patients ){
    PostiveA.add(Patients);
}

//Type B:

public ArrayList<Human> getPostiveB(){

    return PostiveB;
}

public void setPotiveB(Human Patients ){
PostiveB.add(Patients);
}

//Type C:

// public ArrayList<Human> getPostiveC(){

//     return PostiveC;
// }

// public void setPotiveC(Human Patients ){
// PostiveC.add(Patients);
// }

///////////////////////////////////////////////

public String toString(){

return "";
}



}
