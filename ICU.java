public class ICU {
    //Delration 
    Human Beds[] = new Human [100] ;
    int bedNum = 100000000;    
//methods
    public void SetBed(Human H){
        
        for (int i = 0; i < Beds.length-1; i++) {
            if (Beds[i] == null){
                bedNum = i;
                break;
            }
            
            
        }
            

        Beds[bedNum] = H;

    }

    public int BedsinUse(){
        int j = 0;
        for (int i = 0; i < Beds.length-1; i++) {
            if (!(Beds[i] == null)){
                j++;
            }
        }
        return j;
    }


    
//////////////////////////////////////////////    
    public int CheckBed(){
       
        for (int i = 0; i < Beds.length-1; i++) {
            if (Beds[i] == null)
            return i;
            
        }
        return 0;
            
        }


        public void RemoveBedof(){


    
        }

    public Human[] getBeds() {
        return Beds;
    }


}


////////////////////////////////////////////// 
    


