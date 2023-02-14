import java.util.ArrayList;
import java.util.Random;

public class ministryofHealth {
    //Delration 

    private ArrayList<Human> Calls = new ArrayList<Human>();
    private ArrayList<Human> PostiveA = new ArrayList<Human>();
    private ArrayList<Human> PostiveB = new ArrayList<Human>();
    private ArrayList<Human> PostiveC = new ArrayList<Human>();
    private ArrayList<Human> Dead = new ArrayList<Human>();
    private ArrayList<Human> Recovered = new ArrayList<Human>();
    private Random rad = new Random();
    //methods

    // genrait Calls in main
    public void CallCenter(Human Newhu){

        this.Calls.add(Newhu) ;

    }



    public void TestCenter(ArrayList <Human> Calls){
        for(Human x : Calls){
            

            if  (x.getCovidInfection_Type().getType().equals("A") ){
                if(!(PostiveA.contains(x)))

                PostiveA.add(x);


            }
        


        }

    }

    //////////////////////////////////////////////
    public void Interacted_A_to_B(){

        for(Human x : PostiveA){
            ArrayList <Human>  family =x.getfamily_Arraylist();
            ArrayList <Human>  friends =x.getfriends_Arraylist();
            ArrayList <Human>  coWorkers =x.getcoWorkers_Arraylist();
            ArrayList <Human>  randomIndividuals =x.getrandomIndividuals_Arraylist();
        
            for(Human f : family){
                if( f.getCovidInfection_Type().getType().equals("B") ){
                    if(!(PostiveB.contains(f)))
                    PostiveB.add(f);
                }
            }

            for(Human fr : friends){
                if( fr.getCovidInfection_Type().getType().equals("B") ){
                    if(!(PostiveB.contains(fr)))

                    PostiveB.add(fr);
                }
            }

            for(Human Co : coWorkers){
                if( Co.getCovidInfection_Type().getType().equals("B") ){
                    if(!(PostiveB.contains(Co)))
                    PostiveB.add(Co);
                }
            }

            for(Human r : randomIndividuals){
                if( r.getCovidInfection_Type().getType().equals("B") ){
                    if(!(PostiveB.contains(r)))
                    PostiveB.add(r);
                }
            }
            

        }


    }

    //////////////////////////////////////////////
    public void Interacted_B_to_C(){

        for(Human x : PostiveB){
            ArrayList <Human>  family =x.getfamily_Arraylist();
            ArrayList <Human>  friends =x.getfriends_Arraylist();
            ArrayList <Human>  coWorkers =x.getcoWorkers_Arraylist();
            ArrayList <Human>  randomIndividuals =x.getrandomIndividuals_Arraylist();
            
            for(Human f : family){
                if( f.getCovidInfection_Type().getType().equals("C") ){
                    if(!(PostiveC.contains(f)))

                    PostiveC.add(f);
                }
            }
    
            for(Human fr : friends){
                if( fr.getCovidInfection_Type().getType().equals("C") ){
                    if(!(PostiveC.contains(fr)))

                    PostiveC.add(fr);
                }
            }
    
            for(Human Co : coWorkers){
                if( Co.getCovidInfection_Type().getType().equals("C") ){
                    if(!(PostiveC.contains(Co)))

                    PostiveC.add(Co);
                }
            }
    
            for(Human r : randomIndividuals){
                if( r.getCovidInfection_Type().getType().equals("C") ){
                    if(!(PostiveC.contains(r)))

                    PostiveC.add(r);
                }
            }  
    
        }

    }

    //////////////////////////////////////////////
    public void A_to_Dead( ArrayList <Human>  WaitingList,int day){

        Human person;
        int Counter;

     
           
            
            if(WaitingList.size()!=0){
            
            for (Human B : WaitingList ) {    // gose over the WaitingList Array
                
                covidInfection CovidInf = B.getCovidInfection_Type();
                Counter = CovidInf.getDaysCounter();
                double Ran0= Math.random();
                double Ran1= Math.random();

                if(Counter>=7&&Counter<14 ){
                    if(Ran0 >= 0.90){//10%
                    B.setDead();
                    B.SetStatus("At Day:"+day+" Dead\n");
                    PostiveA.remove(B);
                    Dead.add(B); 
                    
                    
                    }
                }
               else if(Counter>=14){
                    if(Ran0 >= 0.80){//20%
                    B.setDead();
                    B.SetStatus("At Day:"+day+" Dead\n");
                    PostiveA.remove(B);
                    Dead.add(B); 
                    
                   
                    }
                }
            }
        }
    }

    //////////////////////////////////////////////
    public void Recovered(int day){

        int numOfRecovered= (int) (PostiveA.size() * 0.05 );
        int RecoveredIndex;
        Human person;
        covidInfection normal = new Normal();
        
        while(numOfRecovered != 0){
            
            RecoveredIndex = rad.nextInt(PostiveA.size());
            person = PostiveA.get(RecoveredIndex);
        
            person.setCovidInfection_Type(normal);

            person.SetStatus("At Day:"+day+"Normal\n");

            PostiveA.remove(person);
            Recovered.add(person);
            

            numOfRecovered--;
            
        }




    }

    // public void RecoveredICU(int day,ICU icu){// like the one above it but it deals wiht ppl in the ICU 
    //     Human Bed[]=icu.getBeds();
    //     int numOfRecovered= (int) (Bed.length * 0.05 );
    //     int RecoveredIndex;
    //     Human person;
    //     covidInfection normal = new Normal();
        
    //     while(numOfRecovered != 0){
            
    //         RecoveredIndex = rad.nextInt(Bed.length);
    //         try {
    //             person = Bed[RecoveredIndex] ;  
    //             person.setCovidInfection_Type(normal);

    //             person.SetStatus("At Day:"+day+"Normal\n");
    
    //             PostiveA.remove(person);
    //             Recovered.add(person);
                
    //             icu.RemoveBedof(person);//this line cuze 0 death for someReson
    //             numOfRecovered--;

    //         } catch (Exception e) {
             
                

    //         }
            
        
            
            
    //     }




    // }



























    ///////Geters/////////////

    public ArrayList<Human> getCalls() {
        return Calls;
    }

    public ArrayList<Human> getPostiveA() {
        return PostiveA;
    }

    public ArrayList<Human> getPostiveB() {
        return PostiveB;
    }

    public ArrayList<Human> getRecovered() {
        return Recovered;
    }

    public ArrayList<Human> getDead() {
        return Dead;
    }
    public ArrayList<Human> getPostiveC() {
        return PostiveC;
    }

    //////////////////////////////////////////////







    public static void main(String[] args) {
        ArrayList <String>  data = new ArrayList <String>();
        ArrayList <String>  Dayslist= new ArrayList <String>();
        ArrayList <String>  Govdata = new ArrayList <String>();

        Random rad = new Random();



        Region South = new Region("South");
        South.addCity("Jeddah", 10000, 1600);

        CovidSpread covid = new CovidSpread();

        covid.StartCovid(South.Cities.get(0));



        // System.out.println(South.Cities.get(0).get_Citizeninfo());
        System.out.println(South.Cities.get(0).get_Citizen().size()); // population

        int numOf_A=0;
        int numOf_B=0;
        int numOf_C=0;
        int numOf_Normal=0;

        int GOV_A=0;
        int GOV_B=0;
        int GOV_Dead=0;
        int GOV_Recovered=0;

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


        ministryofHealth Gov = new ministryofHealth();
        ICU icu = new ICU();


        for (int i = 1; i <= 20; i++) {           // Start of the main Loop




            if( i%3==0 ){
                /// Changing B to A by Percentiges there rest that we havent made into A will become Normal 

                // System.out.println("3 Days passed");
                for (Human B: South.Cities.get(0).get_Citizen() ) {
                    if(B.getCovidInfection_Type().getType().equals("B"))
                        covid.B_Becomes_A(B,Gov.PostiveB,i);  
                }


                /// Changing C to A by Percentiges there rest that we havent made into A will become Normal 

                for (Human C: South.Cities.get(0).get_Citizen() ) {
                    if(C.getCovidInfection_Type().getType().equals("C"))
                        covid.C_Becomes_A(C,Gov.PostiveC,i);  
                }
            }





            /// Spreding the Covid for the Day 
            for (Human H : South.Cities.get(0).get_Citizen()) {                 
                if(H.getCovidInfection_Type().getType().equals("A"))
                    covid.SpreadingB(H,i);
                else if(H.getCovidInfection_Type().getType().equals("B"))
                    covid.SpreadingC(H,i);   
            } 


            ///////////////////////////////////// Calls Happen 


            int number_of_A_Calls = (int) (numOf_A * 0.35);
            for (Human H : South.Cities.get(0).get_Citizen()) {
                if(H.getCovidInfection_Type().getType().equals("A")){
                    Gov.CallCenter(H);
                    number_of_A_Calls--; 
                    if(number_of_A_Calls <= 0)
                    break;
                }
            }
            ////////////////////////////////////////

            Gov.TestCenter(Gov.Calls);
            Gov.Interacted_A_to_B();
            

            // ICU Beds filing
            int numOfBeds = (int) (Gov.PostiveA.size() *0.25); 
            int typeAIndex; 
            Human person;
            
            while(numOfBeds != 0){
            
                typeAIndex = rad.nextInt(Gov.getPostiveA().size()-1);
                person = Gov.PostiveA.get(typeAIndex);

                icu.SetBed(person,i);
                
                numOfBeds--;
    
            }
            
            //  for (Human posA : Gov.PostiveA) {/// make % % % not 100
            //  icu.SetBed(posA,i);
            // }


            
            Gov.A_to_Dead(icu.getWaitingList(),i);

            Gov.Recovered(i);
                
            




            ////////////////////////////////////// Counteing the number of Types for the Current Day  
            // System.out.println("---------------------");
            int oldNum_A=numOf_A;
            int oldNum_B=numOf_B;
            int oldNum_C=numOf_C;
            int oldNum_Normal=numOf_Normal;


            numOf_A=0;
            numOf_B=0;
            numOf_C=0;
            numOf_Normal=0;

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

            oldNum_A=numOf_A-oldNum_A;
            oldNum_B=numOf_B-oldNum_B;
            oldNum_C=numOf_C-oldNum_C;
            oldNum_Normal=numOf_Normal-oldNum_Normal;
            ////////////////////////////////////////////////calculating the diff between Days
            int oldGOV_A=GOV_A;
            int oldGOV_B=GOV_B;
            int oldGOV_Dead=GOV_Dead;
            int oldGOV_Recovered=GOV_Recovered;


            GOV_A=Gov.getPostiveA().size();
            GOV_B=Gov.getPostiveB().size();
            GOV_Dead=Gov.getDead().size();
            GOV_Recovered=Gov.getRecovered().size();


            oldGOV_A=GOV_A-oldGOV_A;
            oldGOV_B=GOV_B-oldGOV_B;
            oldGOV_Dead=GOV_Dead-oldGOV_Dead;
            oldGOV_Recovered=GOV_Recovered-oldGOV_Recovered;

            ///////////////////// Output of the  Day ////////////////////////   
            
            Dayslist.add(String.format("Day:%-5s",i) );
            data.add(String.format(" A num =  %-5d (%-10d) B num =  %-5d (%-5d) C num =  %-5d (%-5d) Normal num =   %-5d (%-5d)",numOf_A,oldNum_A,numOf_B,oldNum_B,numOf_C,oldNum_C,numOf_Normal,oldNum_Normal) );
            Govdata.add(String.format("The number of calls: %-5d Number of A's: %-5d (%-5d) Number of B's: %-5d (%-5d) Number of people in ICU: %-5d / %-5d  Number of Dead people: %-5d (%-5d) Number of Recovered people: %-5d (%-5d)",Gov.Calls.size(),Gov.getPostiveA().size(),oldGOV_A, Gov.getPostiveB().size(),oldGOV_B, icu.BedsinUse(),icu.getBeds().length,Gov.getDead().size(),oldGOV_Dead,Gov.getRecovered().size(),oldGOV_Recovered));

            



                for (Human  h :  South.getCities().get(0).get_Citizen()) {
                    h.updateHistory(i);
                    
                }

                /////Clearing The number of Calls After the Day is Done
                Gov.Calls.clear();
                South.getCities().get(0).setDeadCitizen(Gov.getDead());
                South.getCities().get(0).get_Citizen().removeAll(Gov.getDead());
                System.out.println(South.getCities().get(0).getDeadCitizen()); 



            ///////////////


        } // End of main Loop



        TableViewer table = new TableViewer(Dayslist, data);
        System.out.println("Programmer view");
        table.viewTable(10, 10);  
        System.out.println("Government view");
        TableViewer table1 = new TableViewer(Dayslist, Govdata);
        table1.viewTable(10, 10);  

        for (Human  h :  South.getCities().get(0).getDeadCitizen() ) {
            
            System.out.println(h.getHistory()); 
            
        }

    }//end of main metohd


}




