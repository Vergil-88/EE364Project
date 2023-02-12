import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_Method {
    ArrayList <String>  data     = new ArrayList <String>();
    ArrayList <String>  Dayslist = new ArrayList <String>();
    ArrayList <String>  Govdata  = new ArrayList <String>();
    Scanner in = new Scanner(System.in);
    Object [][] table = new String[Dayslist.size()+2][];

    


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
// 5th ICU Beds filing for the the Type Who needs it which is 0.15 of them
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
   int numOfBeds = (int) (MinistryofHealth.getPostiveA().size() *0.15); 
   int typeAIndex; 
   Human person;
   
   while(numOfBeds != 0){
   
       typeAIndex = rad.nextInt(MinistryofHealth.getPostiveA().size()-1);
       ArrayList <Human> ArrayPostiveA= MinistryofHealth.getPostiveA();
       person =  ArrayPostiveA.get(typeAIndex);

       icu.SetBed(person,day);
       
       numOfBeds--;

       
   }

   if(icu.getBeds().length == 0 )
        System.out.println("At Day " + day + " The ICU is Full ");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 6th Gov declaring type A Recoverd and Dead 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
if(day>=4){
        MinistryofHealth.A_to_Dead(icu.getWaitingList(),day);
   
        MinistryofHealth.Recovered(day);
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 7th Clearing the Calls form the day and moveing the Dead Citizins to A diffrant Array and Removing them fomr the Orignal 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
ArrayList<Human> Dead = MinistryofHealth.getDead();

for (Human  h :  city.get_Citizen()) {
    h.updateHistory(day);
} // UpdateHistry
    city.setDeadCitizen(Dead);
    city.get_Citizen().removeAll(Dead);


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
        
    
            

            
    Table_XYZ(day,Dayslist, numOf_A, numOf_B, numOf_C, numOf_Normal, oldNum_A, oldNum_B, oldNum_C, oldNum_Normal);
          
///////////////////Clearing the Call history
MinistryofHealth.getCalls().clear();            


        
}


public void City_Output(int day){

    TableViewer table = new TableViewer(Dayslist, data);
    System.out.println("Programmer view");
    table.viewTable(day, day);  
    System.out.println("Government view");
    TableViewer table1 = new TableViewer(Dayslist, Govdata);
    table1.viewTable(day, day);






}

public  void CitySwitch(City city,int day, ICU icu){
    

    System.out.println("The City Name "+ city.get_Name());
    // City_Output(day);
    PrintTable_XYZ();
    Table_XY(city, icu);
    System.out.println("Pick the information you wanna see\n"+
    "1 Alive Citzizas:\n"+
    "2 Dead Citzizas:\n"+
    "3 IN ICU:\n"+
    "4 Check History of an Individual:\n");
    int User_Choice= in.nextInt();
    

    switch (User_Choice){

        case 1:
        System.out.println("The Alive Citzizas Are");
        System.out.println(city.get_Citizen());
        break;
        
        case 2:
        System.out.println("The Dead Citzizas Are");
        System.out.println(city.getDeadCitizen());
        break;
        
        case 3:
        System.out.println("The  Citzizas in ICU Are");
        // System.out.println(icu.getBeds());

        break;
        
        case 4:
        System.out.println("Enter The ID");
       
        String FindX = in.next();

        System.out.println("The history Of "+ FindX);
        
        
        city.Find_Citizen_History(FindX);
        break;
    }



}

public void Table_XY (City city, ICU icu ){

    ArrayList<Human> Alive = city.get_Citizen();
    ArrayList<Human> Dead = city.getDeadCitizen();
    Human Beds [] = icu.getBeds();
    Human indexAlive;
    Human indexDead;
    Human indexBed;
    String indexAliveID;
    String indexDeadID;
    String indexBedID;

    Object [][] table = new String[11][];

    table[0] = new String[]{"num","Alive","Dead","ICU"};

    for(int i = 1 ; i <= 10; i++){
        indexAlive = Alive.get(i);
        indexAliveID = indexAlive.getId();

        indexDead = Dead.get(i);
        indexDeadID = indexDead.getId();

        indexBed = Beds[i];
        indexBedID = indexBed.getId();

        table[i] = new String[]{String.valueOf(i),indexAliveID,indexDeadID,indexBedID};


    }

    for (Object[] row : table) {
        System.out.format("%15s%15s%15s%15s%n", row);
    }


}

public  void Table_XYZ (int day,ArrayList Dayslist, int numOf_A,int numOf_B,int numOf_C,int numOf_Normal,int oldNum_A,int oldNum_B,int oldNum_C,int oldNum_Normal){


    String A=String.valueOf(numOf_A+"("+oldNum_A+")");
    String B=String.valueOf(numOf_B+"("+oldNum_B+")");
    String C=String.valueOf(numOf_C+"("+oldNum_C+")");
    String Normal=String.valueOf(numOf_Normal+"("+oldNum_Normal+")");



        table[0] = new String[]{"DAY","A","B","C","Normal"};
       

        table[day] = new String[]{String.valueOf(day),A,B,C,Normal};




   
    }
    public void PrintTable_XYZ(){
        for (Object[] row : table) {
            System.out.format("%15s%15s%15s%15s%15s%n", row);
    }

}
}












