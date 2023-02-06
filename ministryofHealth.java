import java.util.ArrayList;

public class ministryofHealth {
//Delration 

private ArrayList<Human> Calls = new ArrayList<Human>();
private ArrayList<Human> PostiveA = new ArrayList<Human>();
private ArrayList<Human> PostiveB = new ArrayList<Human>();
private ArrayList<Human> PostiveC = new ArrayList<Human>();
private ArrayList<Human> Dead = new ArrayList<Human>();

//methods

// genrait Calls in main
public void CallCenter(Human Newhu){

this.Calls.add(Newhu) ;

}



public void TestCenter(ArrayList <Human> Calls){
    for(Human x : Calls){
        

        if  (x.getCovidInfection_Type().getType().equals("A") ){

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
            PostiveB.add(f);
        }
    }

        for(Human fr : friends){
            if( fr.getCovidInfection_Type().getType().equals("B") ){
                PostiveB.add(fr);
            }
      }

      for(Human Co : coWorkers){
        if( Co.getCovidInfection_Type().getType().equals("B") ){
            PostiveB.add(Co);
        }
    }

    for(Human r : randomIndividuals){
        if( r.getCovidInfection_Type().getType().equals("B") ){
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
              PostiveC.add(f);
          }
      }
  
          for(Human fr : friends){
              if( fr.getCovidInfection_Type().getType().equals("C") ){
                  PostiveC.add(fr);
              }
        }
  
        for(Human Co : coWorkers){
          if( Co.getCovidInfection_Type().getType().equals("C") ){
              PostiveC.add(Co);
          }
      }
  
      for(Human r : randomIndividuals){
          if( r.getCovidInfection_Type().getType().equals("C") ){
              PostiveC.add(r);
          }
      }
          
  
      }





}

//////////////////////////////////////////////
public void A_to_Dead(){

for (Human D : PostiveA){

    if (!(D.getAlive())){

        Dead.add(D);

    }

}



}

//////////////////////////////////////////////
public void Recovered(){

for(Human Recovered : PostiveA){
    if(Recovered.getCovidInfection_Type().getType().equals("Normal")){

        PostiveA.remove(Recovered);

    }
}



}

//////////////////////////////////////////////






public static void main(String[] args) {

    Region South = new Region("South");
    South.addCity("Jeddah", 1000, 1600);

    CovidSpread covid = new CovidSpread();

    covid.StartCovid(South.Cities.get(0));



    // System.out.println(South.Cities.get(0).get_Citizeninfo());
    System.out.println(South.Cities.get(0).get_Citizen().size());

    int numOf_A=0;
    int numOf_B=0;
    int numOf_C=0;
    int numOf_Normal=0;

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

System.out.println("A num = "+numOf_A );
System.out.println("B num = "+numOf_B );
System.out.println("C num = "+numOf_C );
System.out.println("Normal num = "+numOf_Normal );





ministryofHealth Gov = new ministryofHealth();


for (int i = 0; i < 1; i++) {


/// Spreding the Covid 
for (Human H : South.Cities.get(0).get_Citizen()) {                 

    if(H.getCovidInfection_Type().getType().equals("A"))
       covid.SpreadingB(H);
    else if(H.getCovidInfection_Type().getType().equals("B"))
        covid.SpreadingC(H);
    
    
} 
///////////////////////////////////// 



int number_of_A_Calls= (int) ((  numOf_A  ) *  0.35);
    while( number_of_A_Calls >=0  )   {
        
        for (Human H : South.Cities.get(0).get_Citizen()) {
    
            
            

            if(H.getCovidInfection_Type().getType().equals("A")){
                Gov.CallCenter(H);
                number_of_A_Calls--; 
                if(number_of_A_Calls==0)
                break;
            }
   

    }


} 

}

//////////////////////////////////////

System.out.println("---------------------");
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


System.out.println("A num = "+numOf_A );
System.out.println("B num = "+numOf_B );
System.out.println("C num = "+numOf_C );
System.out.println("Normal num = "+numOf_Normal );

System.out.println(Gov.Calls.size());





}//end of mian metohd












}



