import java.util.ArrayList;
import java.util.Random;

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

        for (int i = 0 ; i < numberOfPatients ; i++){

            PatientIndex = rad.nextInt(CityName.get_Population()-1);

            Patient = Citizen.get(PatientIndex);

            Patient.setCovidInfection_Type(TypeA);

            Patient.SetStutes("At Day:"+1+" B\n");

            //System.out.println(Patient);
    
        } 

        CityName.setCitizen(Citizen);


    }


    ////Spreading B Type :

    public void SpreadingB(Human Patient,int day){

        ArrayList<Human> family =  Patient.getfamily_Arraylist();
        ArrayList<Human> friends  = Patient.getfriends_Arraylist();
        ArrayList<Human> coWorkers = Patient.getcoWorkers_Arraylist();
        ArrayList<Human> randomIndividuals = Patient.getrandomIndividuals_Arraylist();
        
        covidInfection TypeB = new B();
        
        //String patient = Patient.getId(); // if we want to add the id of type A to hostry

        // family to TaypeB

        for (Human F : family) {
            String Taype = F.getCovidInfection_Type().getType();
            if (!(Taype.equals("A")))
                if(!(Taype.equals("B")))
                    if(!(Taype.equals("C"))){
                        F.setCovidInfection_Type(TypeB);
                        F.SetStutes("At Day:"+day+" B\n");
                    }

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
                    if(!(Taype.equals("C"))){
                        Friend.setCovidInfection_Type(TypeB);
                        Friend.SetStutes("At Day:"+day+" B\n");
                    }
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
                    if(!(Taype.equals("C"))){
                        coWorker.setCovidInfection_Type(TypeB);
                        coWorker.SetStutes("At Day:"+day+" B\n");
                    }
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
                    if(!(Taype.equals("C"))){
                        randomIndividual.setCovidInfection_Type(TypeB);
                        randomIndividual.SetStutes("At Day:"+day+" B\n");
                    }
            
        }
        
    }
    ////// Spreading C Type 
    public void SpreadingC(Human Patient,int day){

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
                    if(!(Taype.equals("C"))){
                        F.setCovidInfection_Type(TypeC);
                        F.SetStutes("At Day:"+day+" C\n");
                }
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
                    if(!(Taype.equals("C"))){
                        Friend.setCovidInfection_Type(TypeC);
                        Friend.SetStutes("At Day:"+day+" C\n");
            }
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
                    if(!(Taype.equals("C"))){
                        coWorker.setCovidInfection_Type(TypeC);
                        coWorker.SetStutes("At Day:"+day+" C\n");
                }
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
                    if(!(Taype.equals("C"))){
                        randomIndividual.setCovidInfection_Type(TypeC);
                        randomIndividual.SetStutes("At Day:"+day+" C\n");
                }
        }
        
        
        

    }

    //// Chaing B to A by  
    public void B_Becomes_A(Human B,ArrayList <Human> PosB,int day){
        if(B.getCovidInfection_Type().getType().equals("B")){
            double percentge=Math.random();
            if(percentge>0.90){   //10%
                B.setCovidInfection_Type(new A());
                B.SetStutes("At Day:"+day+" A\n");

            }else{
                B.setCovidInfection_Type(new Normal());
                B.SetStutes("At Day:"+day+" Normal\n");

            }
            PosB.remove(B);
        }
    }

    //// Chaing C to A 
    public void C_Becomes_A(Human C,ArrayList <Human> PosC ,int day){
        if(C.getCovidInfection_Type().getType().equals("C")){
            double percentge=Math.random();
            if(percentge>0.98){  //%2
                C.setCovidInfection_Type(new A());
                C.SetStutes("At Day:"+day+" A\n");
            }
            else{
                C.setCovidInfection_Type(new Normal());
                C.SetStutes("At Day:"+day+" Normal\n");
        
            }

            PosC.remove(C);
        }
    
    }
    ///////////////////////////////////////////////

    public void Count_Types(ArrayList<Human>  C){
        int numOf_A=0;
        int numOf_B=0;
        int numOf_C=0;
        int numOf_Normal=0;

        for (Human H : C) { 
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



    }


}
