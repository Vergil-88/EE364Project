import java.util.ArrayList;

public class ICU {
    //Delration 
    private Human Beds[] = new Human [1000] ;
    private ArrayList <Human> waitingList = new ArrayList<Human>();
    private int bedNum = 1000 ; // number of availsble beds
//methods
    // public void SetBed(Human H){
    //     boolean inBed = false; // if the person is alraedy in bed or not

    //     for (Human human : Beds) {
    //             if(human.equals(H))
    //                 inBed = true;
    //     }

    //     if((bedNum != 0) && !(inBed)){ // if ther is a free bed and the person not in bed
    //         for (int i = 0; i <= Beds.length-1; i++) {
    //             if ((Beds[i] == null)){
    //                 Beds[i] = H;
    //                 H.updateHistory("\n Moved to ICU");
    //                 bedNum--;
    //                  break;
    //                 }       
    //          }   
    //     }
    //     else{
    //         if(!(inBed) && (bedNum == 0)){ // if ther is no free bed and the person not in bed
    //             waitingList.add(H);
    //             H.updateHistory("\n Moved to waiting List for bed");
    //         }
    //     }     

        

    // }
    public void SetBed(Human H){
        
        for (int i = 0; i < Beds.length-1; i++) {
         
            if (Beds[i] == null){
                bedNum = i;
                break;
            }
        }
    }

    public int BedsinUse(){
        int bed = 0;
        for (int i = 0; i <= Beds.length-1; i++) {
            if (Beds[i] != null){
                bed++;
            }
            // System.out.println(i);
            // System.out.println(bed);
        }
        return bed;
    }


    
//////////////////////////////////////////////    
    public int CheckBed(){
       
        for (int i = 0; i < Beds.length-1; i++) {
            if (Beds[i] == null)
            return i;
            
        }
        return 0;
            
        }


    public void RemoveBedof(Human person){

            for (Human bed : Beds) {

                if(person.equals(bed)){
                    bed = null;
                    bedNum++;
                }
                
            }

        }

    public Human[] getBeds() {
        return Beds;
    }

    public ArrayList<Human> getWaitingList() {
        return waitingList;
    }

    // public void addToWaitingList(Human person) {
    //     waitingList.add(person);
    // }

    public int getBedNum() {
        return bedNum;
    }
    


}


////////////////////////////////////////////// 
    


