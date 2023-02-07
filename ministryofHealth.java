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
public void A_to_Dead(ICU Beds){

 
int numOfDeath= (int) (PostiveA.size() * 0.005 );
int deadIndex;
Human person;

while(numOfDeath != 0){
    
    deadIndex = rad.nextInt(PostiveA.size()-1);
    person = PostiveA.get(deadIndex);

for (Human B : Beds.getBeds() ) {

    if(!(B.equals(person)))
        person.setDead();
        PostiveA.remove(person);
        Dead.add(person);
        numOfDeath--;
        break;
        
    
}
    

}




}

//////////////////////////////////////////////
public void Recovered(){

    int numOfRecovered= (int) (PostiveA.size() * 0.05 );
    int RecoveredIndex;
    Human person;
    covidInfection normal = new Normal();
    
    while(numOfRecovered != 0){
        
        RecoveredIndex = rad.nextInt(PostiveA.size());
        person = PostiveA.get(RecoveredIndex);
    
        person.setCovidInfection_Type(normal);

        PostiveA.remove(person);

        Recovered.add(person);
        
        numOfRecovered--;
        
    }




}

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


//////////////////////////////////////////////







public static void main(String[] args) {
    ArrayList <String>  data = new ArrayList <String>();
    ArrayList <String>  Dayslist= new ArrayList <String>();
    ArrayList <String>  Govdata = new ArrayList <String>();





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


for (int i = 1; i <= 10; i++) {           // Start of the main Loop




    if( i%3==0 ){
/// Changing B to A by Percentiges there rest that we havent made into A will become Normal 

// System.out.println("3 Days passed");
for (Human B: South.Cities.get(0).get_Citizen() ) {
    if(B.getCovidInfection_Type().getType().equals("B"))
        covid.B_Becomes_A(B,Gov.PostiveB);  
}


/// Changing C to A by Percentiges there rest that we havent made into A will become Normal 

for (Human C: South.Cities.get(0).get_Citizen() ) {
    if(C.getCovidInfection_Type().getType().equals("C"))
        covid.C_Becomes_A(C,Gov.PostiveC);  
    }
    }





/// Spreding the Covid for the Day 
for (Human H : South.Cities.get(0).get_Citizen()) {                 
    if(H.getCovidInfection_Type().getType().equals("A"))
       covid.SpreadingB(H);
    else if(H.getCovidInfection_Type().getType().equals("B"))
        covid.SpreadingC(H);
    
    
} 


///////////////////////////////////// Calls Happen 


    int number_of_A_Calls = (int) (numOf_A * 0.35);//
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
    // Gov.Interacted_B_to_C();

    for (Human posA : Gov.PostiveA) {/// make % % % not 100
    icu.SetBed(posA);
    }

    Gov.A_to_Dead(icu);

    Gov.Recovered();
           
    




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
 
Dayslist.add(String.valueOf("Day"+i) );
data.add(String.valueOf(" A num = "+numOf_A+"("+oldNum_A +")"+" B num = "+numOf_B+"("+oldNum_B +")"+" C num = "+numOf_C+"("+oldNum_C +")"+" Normal num = "+numOf_Normal+"("+oldNum_Normal +")") );
Govdata.add("The number of calls: " + Gov.Calls.size()+" Number of A's: "+Gov.getPostiveA().size()+"("+  oldGOV_A  +")"+" Number of B's: "+Gov.getPostiveB().size()+"("+  oldGOV_B  +")"+" Number of people in ICU: "+icu.BedsinUse()+"/"+icu.getBeds().length+" Number of Dead people: "+Gov.getDead().size()+"("+  oldGOV_Dead  +")"+" Number of Recovered people: "+Gov.getRecovered().size()+"("+  oldGOV_Recovered  +")");


// System.out.println("Day :"+i);

//  System.out.println("Programmer view");
//  System.out.println("---------------------");
//  System.out.println("A num = "+numOf_A );
//  System.out.println("B num = "+numOf_B );
//  System.out.println("C num = "+numOf_C );
//  System.out.println("Normal num = "+numOf_Normal );
//  System.out.println("---------------------");
//  System.out.println("Government view");
//  System.out.println("---------------------");
//  System.out.println("The number of calls: " + Gov.Calls.size());
//  System.out.println("Number of A's: "+Gov.getPostiveA().size());
//  System.out.println("Number of B's: "+Gov.getPostiveB().size());
//  System.out.println("Number of people in ICU: "+icu.BedsinUse()+"/"+icu.getBeds().length);
//  System.out.println("Number of Dead people: "+Gov.getDead().size());
//  System.out.println("Number of Recovered people: "+Gov.getRecovered().size());



/////Clearing The number of Calls After the Day is Done
    Gov.Calls.clear();
    


} // End of main Loop
TableViewer table = new TableViewer(Dayslist, data);
System.out.println("Programmer view");
table.viewTable(10, 10);  
System.out.println("Government view");
TableViewer table1 = new TableViewer(Dayslist, Govdata);
table1.viewTable(10, 10);  



}//end of main metohd












}




