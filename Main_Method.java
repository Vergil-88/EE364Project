import java.util.ArrayList;
import java.util.Random;

public class Main_Method {
    ArrayList <String>  data     = new ArrayList <String>();
    ArrayList <String>  Dayslist = new ArrayList <String>();
    ArrayList <String>  Govdata  = new ArrayList <String>();




    Random rad = new Random();
    int numOf_A=0;
    int numOf_B=0;
    int numOf_C=0;
    int numOf_Normal=0;

    int GOV_A=0;
    int GOV_B=0;
    int GOV_Dead=0;
    int GOV_Recovered=0;    

public void City_Activite(int day,City city,ministryofHealth MinistryofHealth,ICU icu,CovidSpread covid){
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// First Block         this Block tells us who of Type B and C are Actlly A or Normal                      
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    if( day%3==0 ){//Happens Every 3 Days
        /// Changing B to A by Percentiges there rest that we havent made into A will become Normal 

        
        for (Human B: city.get_Citizen() ) {
            if(B.getCovidInfection_Type().getType().equals("B"))
                covid.B_Becomes_A(B,MinistryofHealth.getPostiveB(),day);  
        }


        /// Changing C to A by Percentiges there rest that we havent made into A will become Normal 

        for (Human C: city.get_Citizen() ) {
            if(C.getCovidInfection_Type().getType().equals("C"))
                covid.C_Becomes_A(C,MinistryofHealth.getPostiveC(),day);  
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 2nd Block Spreding the Covid for the Day Happens Every Day
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    /// 
    for (Human H : city.get_Citizen()) {                 
        if(H.getCovidInfection_Type().getType().equals("A"))
            covid.SpreadingB(H,day);
        else if(H.getCovidInfection_Type().getType().equals("B"))
            covid.SpreadingC(H,day);   
    } 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 3rd Block Calls Happen Every day
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    int number_of_A_Calls = (int) (numOf_A * 0.35);
    for (Human H : city.get_Citizen()) {
        if(H.getCovidInfection_Type().getType().equals("A")){
            MinistryofHealth.CallCenter(H);
            number_of_A_Calls--; 
            if(number_of_A_Calls <= 0)
            break;
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 4th Block MinistryofHealth Recives the Calls and Declare who is A and who they interacted with
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    MinistryofHealth.TestCenter(MinistryofHealth.getCalls());
    MinistryofHealth.Interacted_A_to_B();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 5th ICU Beds filing for the the Type Who needs it which is 0.25 of them
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   int numOfBeds = (int) (MinistryofHealth.getPostiveA().size() *0.25); 
   int typeAIndex; 
   Human person;
   
   while(numOfBeds != 0){
   
       typeAIndex = rad.nextInt(MinistryofHealth.getPostiveA().size()-1);
       ArrayList <Human> ArrayPostiveA= MinistryofHealth.getPostiveA();
       person =  ArrayPostiveA.get(typeAIndex);

       icu.SetBed(person,day);
       
       numOfBeds--;
   }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 6th Gov declaring type A Recoverd and Dead 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    MinistryofHealth.A_to_Dead(icu.getWaitingList(),day);

    MinistryofHealth.Recovered(day);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 7th Clearing the Calls form the day and moveing the Dead Citizins to A diffrant Array and Removing them fomr the Orignal 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    city.setDeadCitizen(MinistryofHealth.getDead());
    city.get_Citizen().removeAll(MinistryofHealth.getDead());
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Counting
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
int oldNum_A=numOf_A;
int oldNum_B=numOf_B;
int oldNum_C=numOf_C;
int oldNum_Normal=numOf_Normal;


numOf_A=0;
numOf_B=0;
numOf_C=0;
numOf_Normal=0;

for (Human H :  city.get_Citizen()) { 
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

    int oldGOV_A=GOV_A;
    int oldGOV_B=GOV_B;
    int oldGOV_Dead=GOV_Dead;
    int oldGOV_Recovered=GOV_Recovered;


    GOV_A=MinistryofHealth.getPostiveA().size();
    GOV_B=MinistryofHealth.getPostiveB().size();
    GOV_Dead=MinistryofHealth.getDead().size();
    GOV_Recovered=MinistryofHealth.getRecovered().size();


    oldGOV_A=GOV_A-oldGOV_A;
    oldGOV_B=GOV_B-oldGOV_B;
    oldGOV_Dead=GOV_Dead-oldGOV_Dead;
    oldGOV_Recovered=GOV_Recovered-oldGOV_Recovered;

    Dayslist.add(String.format("Day:%-5s",day) );
            data.add(String.format(" A num =  %-5d (%-10d) B num =  %-5d (%-5d) C num =  %-5d (%-5d) Normal num =   %-5d (%-5d)",numOf_A,oldNum_A,numOf_B,oldNum_B,numOf_C,oldNum_C,numOf_Normal,oldNum_Normal) );
            Govdata.add(String.format("The number of calls: %-5d Number of A's: %-5d (%-5d) Number of B's: %-5d (%-5d) Number of people in ICU: %-5d / %-5d  Number of Dead people: %-5d (%-5d) Number of Recovered people: %-5d (%-5d)",MinistryofHealth.getCalls().size(),MinistryofHealth.getPostiveA().size(),oldGOV_A, MinistryofHealth.getPostiveB().size(),oldGOV_B, icu.BedsinUse(),icu.getBeds().length,MinistryofHealth.getDead().size(),oldGOV_Dead,MinistryofHealth.getRecovered().size(),oldGOV_Recovered));
        for (Human  h :  city.get_Citizen()) {
            h.updateHistory(day);
          
///////////////////Clearing the Call history
MinistryofHealth.getCalls().clear();            


        }
}


public void City_Output(int day){

    TableViewer table = new TableViewer(Dayslist, data);
    System.out.println("Programmer view");
    table.viewTable(day, day);  
    System.out.println("Government view");
    TableViewer table1 = new TableViewer(Dayslist, Govdata);
    table1.viewTable(day, day);






}








}


