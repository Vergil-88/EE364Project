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
public void CallCenter(ArrayList <Human> Calls){

this.Calls = Calls ;

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
      ArrayList <Human>  family =x.getfamily();
      ArrayList <Human>  friends =x.getfriends();
      ArrayList <Human>  coWorkers =x.getcoWorkers();
      ArrayList <Human>  randomIndividuals =x.getrandomIndividuals();
      
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
        ArrayList <Human>  family =x.getfamily();
        ArrayList <Human>  friends =x.getfriends();
        ArrayList <Human>  coWorkers =x.getcoWorkers();
        ArrayList <Human>  randomIndividuals =x.getrandomIndividuals();
        
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















}

