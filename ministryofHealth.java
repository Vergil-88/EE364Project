import java.util.ArrayList;

public class ministryofHealth {
//Delration 

private ArrayList<Human> Calls = new ArrayList<Human>();
private ArrayList<Human> PostiveA = new ArrayList<Human>();
private ArrayList<Human> PostiveB = new ArrayList<Human>();
private ArrayList<Human> PostiveC = new ArrayList<Human>();
private ArrayList<Human> Dead = new ArrayList<Human>();

//methods
public void TestCenter(ArrayList <Human> Calls){
int i=0;
    for(Human x : Calls){
        

       Human Obj =Calls.get(i);
        i++;
        covidInfection Co =Obj.getCovidInfection_Type(); //// Change name to someting makes sesns

        if  (Co.getType().equals("A") ){

            PostiveA.add(Obj);


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







    }



}

//////////////////////////////////////////////
public void Interacted_B_to_C(){





}

//////////////////////////////////////////////
public void A_to_Dead(){





}

//////////////////////////////////////////////
public void Recovered(){





}

//////////////////////////////////////////////















}
