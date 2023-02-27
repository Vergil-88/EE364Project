package Covid;
import java.util.ArrayList;
import java.util.Random;

public class ministryofHealth {
    //Delration

    private ArrayList<Human> Calls = new ArrayList<Human>();
    private ArrayList<Human> PostiveA = new ArrayList<Human>();
    private ArrayList<Human> PostiveB = new ArrayList<Human>();
    private ArrayList<Human> PostiveC = new ArrayList<Human>();
    private ArrayList<Human> Dead = new ArrayList<Human>();
    private ArrayList<Human> Recovered = new ArrayList<Human>();
    private Random rad = new Random();

    //methods

    // genrait Calls in main
    public void CallCenter(Human Newhu){

        this.Calls.add(Newhu) ;

    }



    // Test all the Calls if they type A or not

    public void TestCenter(ArrayList <Human> Calls){
        for(Human x : Calls){


            // add him to PostiveA Array if he was type (A)
            if  (x.getCovidInfection_TypeType().equals("A") ){
                if(!(PostiveA.contains(x)))

                PostiveA.add(x);


            }



        }

    }

    // Interacted TypeA With TypeB

    public void Interacted_A_to_B(){

        for(Human x : PostiveA){
            ArrayList <Human>  family =x.getfamily_Arraylist();
            ArrayList <Human>  friends =x.getfriends_Arraylist();
            ArrayList <Human>  coWorkers =x.getcoWorkers_Arraylist();
            ArrayList <Human>  randomIndividuals =x.getrandomIndividuals_Arraylist();

            // add family to PostiveB
            for(Human f : family){
                if( f.getCovidInfection_TypeType().equals("B") ){
                    if(!(PostiveB.contains(f)))
                    PostiveB.add(f);
                }
            }

            // add friends to PostiveB
            for(Human fr : friends){
                if( fr.getCovidInfection_TypeType().equals("B") ){
                    if(!(PostiveB.contains(fr)))

                    PostiveB.add(fr);
                }
            }

            // add coWorkers to PostiveB
            for(Human Co : coWorkers){
                if( Co.getCovidInfection_TypeType().equals("B") ){
                    if(!(PostiveB.contains(Co)))
                    PostiveB.add(Co);
                }
            }

            // add randomIndividuals to PostiveB
            for(Human r : randomIndividuals){
                if( r.getCovidInfection_TypeType().equals("B") ){
                    if(!(PostiveB.contains(r)))
                    PostiveB.add(r);
                }
            }


        }


    }

    // from TypeA to Dead
    public void A_to_Dead( ArrayList <Human>  WaitingList,int day,ICU icu){

        int Counter;

            // make sure there are Human in WaitingList.
            if(WaitingList.size()!=0){

            for (Human B : WaitingList ) {    // gose over the WaitingList Array

                covidInfection CovidInf = B.getCovidInfection_Type();
                Counter = CovidInf.getDaysCounter(); // get how many he is TypeA
                double Ran0= Math.random();// Random percentage.

            // if the human Vaccineted skip
            if(B.getVaccine()==true)
            continue;

                // TypeA more then 7 Days and Less then 14 days
                if(Counter>=7 && Counter<14 ){ 

                    if(Ran0 >= 0.98){//2% he die
                    B.setDead();                             //convert it to (Dead)
                    B.SetStatus("At Day:"+day+" Dead\n");   // Add to his History
                    PostiveA.remove(B);                     // remove him from PostiveA Array
                    Dead.add(B);                            // Add him to Dead Array

                    }

                // TypeA more then 14 Days 
                }else if(Counter>=14){
                    if(Ran0 >= 0.96){//4% he die
                    B.setDead();                             //convert it to (Dead)
                    B.SetStatus("At Day:"+day+" Dead\n");   // Add to his History
                    PostiveA.remove(B);                     // remove him from PostiveA Array
                    Dead.add(B);                            // Add him to Dead Array

                    }
                }
            }
        }

        int randomDead = (int) (PostiveA.size()*0.007);
        int randomIndex;
        Human Die;

        // Random Dead from TypeA

        for(int i = 0;i < randomDead;i++){

            randomIndex = rad.nextInt(PostiveA.size()-1);// random index
           
            Die = PostiveA.get(randomIndex);          // random Person

            Die.setDead();                             //convert it to (Dead)
            Die.SetStatus("At Day:"+day+" Dead\n");   // Add to his History
            PostiveA.remove(Die);                     // remove him from PostiveA Array
            Dead.add(Die);                            // Add him to Dead Array

        }

    }


    // from TypeA to Normal
    public void Recovered(int day,ICU icu){



        covidInfection normal = new Normal();


      for (Human human : PostiveA) {  // gose over the PostiveA Array
        double ran = Math.random();   // Random percentage.

        // human is  Vaccineted
        if(ran >= 0.70 && human.getVaccine()==true){ // 30% he convert to Normal (Recovered)
            human.setCovidInfection_Type(normal);   //convert to Normal
            human.SetStatus("At Day:"+day+"Normal\n"); // Add to his History


            icu.getWaitingList().remove(human);// remove human from WaitingList
            Recovered.add(human); // add human to Recovered Array

        }
        //human isn't  Vaccineted
        else if (ran >= 0.99 && human.getVaccine()==false){ // 1% he convert to Normal (Recovered)
            human.setCovidInfection_Type(normal);   //convert to Normal
            human.SetStatus("At Day:"+day+"Normal\n"); // Add to his History


            icu.getWaitingList().remove(human);// remove human from WaitingList
            Recovered.add(human); // add human to Recovered Array
        }

      }

      PostiveA.removeAll(Recovered);


    }




    //Geters

    public ArrayList<Human> getCalls() {
        return Calls;
    }

    public ArrayList<Human> getPostiveA() {
        return PostiveA;
    }

    public ArrayList<Human> getPostiveB() {
        return PostiveB;
    }

    public ArrayList<Human> getRecovered() {
        return Recovered;
    }

    public ArrayList<Human> getDead() {
        return Dead;
    }
    public ArrayList<Human> getPostiveC() {
        return PostiveC;
    }







}