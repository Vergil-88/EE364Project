import java.util.ArrayList;
import java.util.Random;

public class Human {
    
    private String id;
    private int Age;
    private String Sex;
    private boolean cD;
    private String Status="";
    private String History="";
    private String TravelHistory="";
    /*how many critical dieases do you guys want? three? or four?
    /* and what about we make "String cD" boolean instead of a string of dieases which will make it easier for us because if it was true we can apply a percantage where the person can get covid faster or not
    */
    private boolean Alive;
    private covidInfection CovidInfection_Type;
    private ArrayList<Human> friends =new ArrayList<Human>();
    private ArrayList<Human> family =new ArrayList<Human>();
    private ArrayList<Human> coWorkers =new ArrayList<Human>();
    private ArrayList<Human> randomIndividuals =new ArrayList<Human>();
    
   
    public Human()
    {
       

        History= "Normal ";
        id=super.toString() ; 
        id = id.substring(id.indexOf("@")+1,id.length()-1);
       

       
        Random random = new Random();

        this.Age = random.nextInt(80) + 1;
        ///
        int i=random.nextInt(2);
        switch (i) {
            case 0:
            this.Sex = "Male";
                break;
            case 1:
            this.Sex = "Female";
                break;
        }
        ///
        int j=random.nextInt(8);
        if(j == 0)
            this.cD= true;
        else
            this.cD = false;
        //

        Alive = true;


    CovidInfection_Type = new Normal();





    }
///////////////////////////////////////////////////
    public String getId()
    {
        return id;
    }
///////////////////////////////////////////////////
    public int getAge()
    {
        return Age;
    }
///////////////////////////////////////////////////
    public String getSex()
    {
        return Sex;
    }
///////////////////////////////////////////////////
    public boolean getcD()
    {
        return cD;
    }
///////////////////////////////////////////////////
    public boolean getAlive()
    {
        return Alive;
    }
///////////////////////////////////////////////////
    public void setDead() {
        Alive = false;
    }
///////////////////////////////////////////////////
    public String getfamily()
    {
        String familyMembers="";
        for ( Human fm :family ) {
            familyMembers += fm.id+" | ";

        }

        return familyMembers;
    }

    public ArrayList getfamily_Arraylist(){
        return family;
    }

    public void setfamily(Human family)
    {
       this.family.add(family);


    }
    
///////////////////////////////////////////////////
    public String  getfriends()
    {
        String Friends="";
        for ( Human Friend :friends ) {
            Friends += Friend.id+" | ";

        }

        return Friends;
    }

    public ArrayList getfriends_Arraylist(){
        return friends;
    }

    public void setfriends( Human friends)
    {
         this.friends.add(friends);
    }

///////////////////////////////////////////////////
    public String getcoWorkers()
    {
        String colleagues="";
        for ( Human colleague :coWorkers ) {
            colleagues += colleague.id+" | ";

        }

        return colleagues;
    }

    public ArrayList getcoWorkers_Arraylist(){
        return coWorkers;
    }

    public void setcoWorkers(Human coWorkers)
    {
         this.coWorkers.add(coWorkers);
    }




///////////////////////////////////////////////////
    public String getRandomIndividuals()
    {
        String Randindivs="";
        for ( Human Randind :randomIndividuals ) {
            Randindivs += Randind.id+" | ";

        }

        return Randindivs;
    }

    public ArrayList getrandomIndividuals_Arraylist(){
        return randomIndividuals;
    }
    
    public void setRandomIndividuals(Human randomIndividuals)
    {
         this.randomIndividuals.add(randomIndividuals);
    }



///////////////////////////////////////////////////
    public covidInfection getCovidInfection_Type(){

        return CovidInfection_Type;

    }

  public void setCovidInfection_Type(covidInfection X){


    CovidInfection_Type = X;

           
    }


    public void SetStatus(String Status){

        this.Status=Status;
    }    

    public void updateHistory(int day){

        this.History +=" At day: "+day+" "+Status; 
    }

    public String getHistory() {
        return History + TravelHistory;
    }
   

    @Override
    public String toString() {
        
        return " |ID:"+ id+"|";
    }

    public void Clear_F(){

        family.clear();
        randomIndividuals.clear();
    }
    public void updateTravelHistory(String CityName1,String CityName2,int day){
    

        TravelHistory+="at Day:"+day+" Moved from "+CityName1+ " to "+CityName2+"\n";


    }
    public String Sumarry(){
        return " |ID: "+ id + " |Sex: " + Sex + " | CD: " + cD + " |Alive: " + Alive + " |CovidInfection Type: " + CovidInfection_Type.getType() + "\n ";
        // +"family Members are "+ getfamily()+"\n"+
        // " friends are "+ getfriends()+"\n"+
        // " CoWorkers are "+ getcoWorkers()+"\n"+
        // " randomIndividuals are "+ getRandomIndividuals()+"\n"+
        // "------------------------------------------------------------------------------------------------------------------------------------"  
        //  ;
    }

    // public static void main(String[] args) {
    //     Human H = new Human();

    //     H.setCovidInfection_Type(new A());

    //     System.out.println(H);


    // }

public static void main(String[] args) {
Random ran1 = new Random();
     ArrayList <Human> Citizen = new ArrayList<Human>();
   
     for (int i = 0 ; i<10 ; i++ ){

         Citizen.add(new Human());


        //  System.out.println(Citizen.get(i).toString());

     }
    int size= Citizen.size();
     for(int xx=0; xx<size ;xx++){
         int number_Of_family_mem=ran1.nextInt(7) + 2;
         ArrayList <Human>  member= new ArrayList <Human>();
        
         for(int i=1 ; i < number_Of_family_mem ; i++){
               
            member.add(new Human()) ;// all the family is Created

         }
             
          Citizen.addAll(member);


            for(Human W : member){
                
                Citizen.get(xx).setfamily(W);//fammliy member to C 
                }
            
            
            for(Human W : member){
                
                W.setfamily(Citizen.get(xx));// familly to c 
                }
            



            for(Human m : member){//the know each others 
                
                for(Human m2 : member){
                    if(!(m.equals(m2)))
                    m.setfamily(m2);
                }
            }
            

     }
   


        Random numRan= new Random();

    
  for (Human  C : Citizen) {
        int Num_Of_friends= (int)(Math.random()*5+2);

        for (int i = 0; i<Num_Of_friends; i++) {
            
        int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
        
        Human SearchCitizen = Citizen.get(index_of_friends);

        if(!(C.equals(SearchCitizen)))
            if(!(C.family.contains(SearchCitizen)))
                if(!(C.friends.contains(SearchCitizen)))
                    if(!(C.coWorkers.contains(SearchCitizen)))
                         if(!(C.randomIndividuals.contains(SearchCitizen))){

                            C.setfriends(Citizen.get(index_of_friends));
                            Citizen.get(index_of_friends).setfriends(C);
                         }
        }  
    }
    
        
    for (Human  C : Citizen) {
        int Num_Of_friends= (int)(Math.random()*5+2);

        for (int i = 0; i<Num_Of_friends; i++) {
            
        int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
        Human SearchCitizen = Citizen.get(index_of_friends);

        if(!(C.equals(SearchCitizen)))
            if(!(C.family.contains(SearchCitizen)))
                if(!(C.friends.contains(SearchCitizen)))
                    if(!(C.coWorkers.contains(SearchCitizen)))
                         if(!(C.randomIndividuals.contains(SearchCitizen))){


                            C.setcoWorkers(Citizen.get(index_of_friends));
                            Citizen.get(index_of_friends).setcoWorkers(C);
                         }
        }  
    }   

    for (Human  C : Citizen) {
        int Num_Of_friends= (int)(Math.random()*5+2);

        for (int i = 0; i<Num_Of_friends; i++) {
            
        int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  

        Human SearchCitizen = Citizen.get(index_of_friends);

        if(!(C.equals(SearchCitizen)))
            if(!(C.family.contains(SearchCitizen)))
                if(!(C.friends.contains(SearchCitizen)))
                    if(!(C.coWorkers.contains(SearchCitizen)))
                         if(!(C.randomIndividuals.contains(SearchCitizen))){

                            C.setRandomIndividuals(Citizen.get(index_of_friends));
                            Citizen.get(index_of_friends).setRandomIndividuals(C);
                         }
        }  
    }   












        for (Human CC  : Citizen) {
            System.out.println(CC.toString());     
        }

        System.out.println(Citizen.size());

     

}

    


}
