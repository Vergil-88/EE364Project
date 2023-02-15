package Covid;
import java.util.ArrayList;

public class ICU {
    //Delration 
    // private Human Beds[] = new Human [1000] ;
    private int bedCap=1000;
    private  ArrayList <Human> Beds = new ArrayList<Human>();
    
    private ArrayList <Human> waitingList = new ArrayList<Human>();
    private int bedNum = Beds.size() ; // number of availsble beds
    private int inWitingList=0;
    //methods
    


    // public void SetBed(Human H,int day){
    //     boolean inBed = false; // if the person is alraedy in bed or not
    //     String Type = H.getCovidInfection_Type().getType(); 
        
    //     for (Human human : Beds) { // gose Over beds
    //        if(!(human == null))     
    //             if(human.equals(H))  // if he exsit in bed 
    //                 inBed = true;  
    //     }
        

    //     if(Type.equals("A")) {
    //         if((bedNum != 0) && !(inBed)){ // if there is a free bed and the person not in bed
    //             for (int i = 0; i < Beds.size(); i++) {
    //                 if ((Beds.get(i) == null)){
    //                         Beds.get(i) = H;
                            
    //                         H.SetStatus("At Day:"+day+" ICU\n");
    //                         bedNum--;
    //                         break;
    //                     }       
    //             }   
    //         }
    //         else{
    //             if(!(inBed) && (bedNum == 0)){ // if there is no free bed and the person not in bed
    //                 if(!(waitingList.contains(H))){
    //                     waitingList.add(H);
    //                     inWitingList++;
    //                     H.SetStatus("At Day: "+day+" Waiting List\n");
    //                 }
    //             }
    //         }     
    //     }
        

    // }

    // public int BedsinUse(){
    //     int bed = 0;
    //     for (int i = 0; i <= Beds.length-1; i++) {
    //         if (Beds[i] != null){
    //             bed++;
    //         }

    //     }
    //     return bed;
    // }


    
    // //////////////////////////////////////////////    
    // public int CheckBed(){
       
    //     for (int i = 0; i < Beds.length-1; i++) {
    //         if (Beds[i] == null)
    //         return i;  
    //     }
    //     return 0;
            
    // }





    public void RemoveBedof(Human person){

           for (Human bed : Beds) {

            if(person.equals(bed)){
                bed = null;
                bedNum++;
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
          if(!Beds.contains(human)){
            Beds.add(human);
            human.SetStatus("At Day:"+day+" ICU\n");
            waitingList.remove(human);

          }
        }
        else{
            if(!waitingList.contains(human)){
                if(!Beds.contains(human)){
                waitingList.add(human);                
                human.SetStatus("At Day: "+day+" Waiting List\n");
                }
            }
        }
    }

    

    

public int getBedCap() {
    return bedCap;
}

public void removeType_Normal_From_ICU(){

    for (int i=0; i < Beds.size() ;i++ ) {
        Human person = Beds.get(i);
        if(!(person.getCovidInfection_TypeType().equals("A"))||!(person.getAlive())){
            Beds.remove(i);

        }
    //    if(waitingList.size()<=i){
    //     if(waitingList.contains(Beds.get(i))){
    //         Beds.remove(i);
    //     }
    // }

    }

}














}