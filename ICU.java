public class ICU {
    //Delration 
    Human Beds[] = new Human [100] ;
    int bedNum = 100000000;    
//methods
    public void SetBed(Human H){
        
        for (int i = 0; i <= Beds.length-1; i++) {
            if (Beds[i] == null){
                bedNum = i;
                break;
            }
            
            
        }
            

        Beds[bedNum] = H;

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
                }
                
            }

        }

    public Human[] getBeds() {
        return Beds;
    }


}


////////////////////////////////////////////// 
    


