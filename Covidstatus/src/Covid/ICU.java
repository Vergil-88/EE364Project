package Covid;
import java.util.ArrayList;

public class ICU {
    //Delration 
    
    private int bedCap=1000;
    private  ArrayList <Human> Beds = new ArrayList<Human>();
    
    private ArrayList <Human> waitingList = new ArrayList<Human>();
    private int bedNum = Beds.size() ; // number of availsble beds
    private int inWitingList=0;
    
    //methods
    

    public void RemoveBedof(Human person){

           for (Human bed : Beds) {

            if(person.equals(bed)){
                Beds.remove(person); // Remove from icu
                bedNum++; // increas number of free beds
            }    
        }
    }

   public ArrayList<Human> getBeds() {
       return Beds;
   }

    public ArrayList<Human> getWaitingList() {
        return waitingList;
    }

    public int getBedNum() {
        return bedNum;
    }

    public int getInWitingList() {
        return inWitingList;
    }


    public void SetBedWithCap(Human human,int day){
        if(Beds.size()<bedCap){
            if(!Beds.contains(human))
                {
               
                Beds.add(human); // add human to ICU
                human.SetStatus("At Day:"+day+" ICU\n");// add to his History
                waitingList.remove(human);// remove human from waitingList

                }
                
            
        }
        // if there is no free bed start add to waitingList
        else{
            if(!waitingList.contains(human)){
                if(!Beds.contains(human))
                   {
                   
                waitingList.add(human);    // add human to waitingList        
                human.SetStatus("At Day: "+day+" Waiting List\n"); // add to his History
                    
                }
            }
        }
    }

    

    

    public int getBedCap() {
        return bedCap;
    }

    // remove the recoverd from icu and waitingList
    public void removeType_Normal_From_ICU(){

        for (int i=0; i < Beds.size() ;i++ ) {
            Human person = Beds.get(i);
            if(!(person.getCovidInfection_TypeType().equals("A"))||!(person.getAlive())){
                Beds.remove(i); // remove from ICU

            }

        for(int j=0; i<waitingList.size()-1;i++)
            if(waitingList.size()<j){
            if(waitingList.contains(Beds.get(j))){
                waitingList.remove(j);// remove from waitingList
            }
        }

        }

    }


    // to make sure all human in ICU are TypeA
   public void removeType_Anything_From_ICU(){
    ArrayList <Human> Remove = new ArrayList <Human>();

       for(Human H : Beds){
            if(!(H.getCovidInfection_TypeType().equals("A"))||!(H.getAlive())){
                Remove.add(H);
           
       }
     
       }
       Beds.removeAll(Remove);
       
       

    }











}