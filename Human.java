import java.util.ArrayList;
import java.util.Random;

public class Human {
    
    private String id;
    private int Age;
    private String Sex;
    private boolean cD;
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

///////////////////////////////////////////////////












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
    public ArrayList <Human> getfamily()
    {
        return family;
    }
    public void setfamily(ArrayList <Human> family)
    {
       for (int i= 0; i<family.size()-1 ;i++ ){

        for (int j= 0; i<family.size()-1 ;i++ ){
            if(i==j){
                continue;
            }
            else{
                family.get(j);
            }

        }



       }


    }
    
///////////////////////////////////////////////////
    public ArrayList <Human>  getfriends()
    {
        return friends;
    }
    public void setfriends(ArrayList <Human> friends)
    {
         this.friends=friends;
    }

///////////////////////////////////////////////////
    public ArrayList <Human> getcoWorkers()
    {
        return coWorkers;
    }

    public void setcoWorkers(ArrayList <Human> coWorkers)
    {
         this.coWorkers=coWorkers;
    }




///////////////////////////////////////////////////
    public ArrayList <Human> getRandomIndividuals()
    {
        return randomIndividuals;
    }
    public void setRandomIndividuals(ArrayList <Human> randomIndividuals)
    {
         this.randomIndividuals=randomIndividuals;
    }



///////////////////////////////////////////////////
    public covidInfection getCovidInfection_Type(){



        return CovidInfection_Type;

    }

  public void setCovidInfection_Type(covidInfection X){


    CovidInfection_Type = X;

           
    }


    public String toString(){
        return " |ID: "+ id + " |Sex: " + Sex + " | CD: " + cD + " |Alive: " + Alive + " |CovidInfection Type: " + CovidInfection_Type.getType() + "\n "
        +"family Members are "+
        "------------------------------------------------------------------------------------------------------------------------------------"   ;
    }

public static void main(String[] args) {
Random ran1 = new Random();
    ArrayList <Human> Citizen = new ArrayList<Human>();
   
     for (int i = 0 ;i<100 ; i++ ){

         Citizen.add(new Human());


        //  System.out.println(Citizen.get(i).toString());

     }
    
     for(Human C : Citizen){
         int number_Of_family_mem=ran1.nextInt(7) + 2;

         for(int i=0 ; i < number_Of_family_mem ; i++){
            
           ArrayList <Human>  member= new ArrayList <Human>();// all the family is Created

         }

            Citizen.add(member); //all the familly add to the main Array 
            C.setfamily(member);//fammliy member to C
            
            member.setfamily(C );// familly to c
            for 

     }
}
    


}
