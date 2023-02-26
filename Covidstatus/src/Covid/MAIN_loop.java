package Covid;
import java.util.ArrayList;
import java.util.Scanner;
import covidstatus.*;

public class MAIN_loop {
    static Scanner input = new Scanner(System.in);
    ////////////////////////////////////////////////
   public static ArrayList<Human> R1_city1_Citizen;
   public static ArrayList<Human> R1_city1_DeadCitizen;
   public static ArrayList<String> R1_city1_pView ;
   public static ArrayList<String> R1_city1_GovView ;
   public static ArrayList<Human> R1_city1_Travel ;
   public static ArrayList<Human> R1_city1_ICU ;

   public static ArrayList<Human> R1_city2_Citizen;
   public static ArrayList<Human> R1_city2_DeadCitizen;
   public static ArrayList<String> R1_city2_pView ;
   public static ArrayList<String> R1_city2_GovView ;
   public static ArrayList<Human> R1_city2_Travel ;
   public static ArrayList<Human> R1_city2_ICU ;

  public  static ArrayList<Human> R1_city3_Citizen;
  public  static ArrayList<Human> R1_city3_DeadCitizen;
  public  static ArrayList<String> R1_city3_pView ;
  public static ArrayList<String> R1_city3_GovView ;
  public  static ArrayList<Human> R1_city3_Travel ;
  public  static ArrayList<Human> R1_city3_ICU ;

  public  static ArrayList<Human> R1_city4_Citizen;
 public   static ArrayList<Human> R1_city4_DeadCitizen;
 public   static ArrayList<String> R1_city4_pView ;
 public static ArrayList<String> R1_city4_GovView ;
  public  static ArrayList<Human> R1_city4_Travel ;
   public static ArrayList<Human> R1_city4_ICU ;

////////////// Region2


  public  static ArrayList<Human> R2_city1_Citizen;
   public static ArrayList<Human> R2_city1_DeadCitizen;
   public static ArrayList<String> R2_city1_pView ;
   public static ArrayList<String> R2_city1_GovView ;
  public  static ArrayList<Human> R2_city1_Travel ;
   public static ArrayList<Human> R2_city1_ICU ;

   public static ArrayList<Human> R2_city2_Citizen;
  public  static ArrayList<Human> R2_city2_DeadCitizen;
  public  static ArrayList<String> R2_city2_pView ;
  public static ArrayList<String> R2_city2_GovView ;
  public  static ArrayList<Human> R2_city2_Travel ;
  public  static ArrayList<Human> R2_city2_ICU ;

  public  static ArrayList<Human> R2_city3_Citizen;
  public  static ArrayList<Human> R2_city3_DeadCitizen;
  public  static ArrayList<String> R2_city3_pView ;
  public static ArrayList<String> R2_city3_GovView ;
  public  static ArrayList<Human> R2_city3_Travel ;
  public  static ArrayList<Human> R2_city3_ICU ;

 public   static ArrayList<Human> R2_city4_Citizen;
  public  static ArrayList<Human> R2_city4_DeadCitizen;
  public  static ArrayList<String> R2_city4_pView ;
  public static ArrayList<String> R2_city4_GovView ;
  public  static ArrayList<Human> R2_city4_Travel ;
  public  static ArrayList<Human> R2_city4_ICU ;

      ////////////////////////////////// Clone
  public    static ArrayList<Human> P2_R1_city1_Citizen;
 public     static ArrayList<Human> P2_R1_city1_DeadCitizen;
 public     static ArrayList<String> P2_R1_city1_pView ;
 public     static ArrayList<String> P2_R1_city1_GovView ;
 public     static ArrayList<Human> P2_R1_city1_Travel ;
public      static ArrayList<Human> P2_R1_city1_ICU ;
  
  public    static ArrayList<Human> P2_R1_city2_Citizen;
  public    static ArrayList<Human> P2_R1_city2_DeadCitizen;
  public    static ArrayList<String> P2_R1_city2_pView ;
  public     static ArrayList<String> P2_R1_city2_GovView ;
   public   static ArrayList<Human> P2_R1_city2_Travel ;
   public   static ArrayList<Human> P2_R1_city2_ICU ;
  
   public   static ArrayList<Human> P2_R1_city3_Citizen;
   public   static ArrayList<Human> P2_R1_city3_DeadCitizen;
    public  static ArrayList<String> P2_R1_city3_pView ;
    public     static ArrayList<String> P2_R1_city3_GovView ;
    public  static ArrayList<Human> P2_R1_city3_Travel ;
    public  static ArrayList<Human> P2_R1_city3_ICU ;
  
  public    static ArrayList<Human> P2_R1_city4_Citizen;
   public   static ArrayList<Human> P2_R1_city4_DeadCitizen;
   public   static ArrayList<String> P2_R1_city4_pView ;
   public     static ArrayList<String> P2_R1_city4_GovView ;
   public   static ArrayList<Human> P2_R1_city4_Travel ;
    public  static ArrayList<Human> P2_R1_city4_ICU ;
  
  ////////////// Region2
  
  
  public    static ArrayList<Human> P2_R2_city1_Citizen;
  public    static ArrayList<Human> P2_R2_city1_DeadCitizen;
   public   static ArrayList<String> P2_R2_city1_pView ;
   public   static ArrayList<String> P2_R2_city1_GovView ;
   public   static ArrayList<Human> P2_R2_city1_Travel ;
   public   static ArrayList<Human> P2_R2_city1_ICU ;
  
   public   static ArrayList<Human> P2_R2_city2_Citizen;
   public   static ArrayList<Human> P2_R2_city2_DeadCitizen;
   public   static ArrayList<String> P2_R2_city2_pView;
   public   static ArrayList<String> P2_R2_city2_GovView ;
   public   static ArrayList<Human> P2_R2_city2_Travel ;
   public   static ArrayList<Human> P2_R2_city2_ICU ;
  
    public  static ArrayList<Human> P2_R2_city3_Citizen;
    public  static ArrayList<Human> P2_R2_city3_DeadCitizen;
    public  static ArrayList<String> P2_R2_city3_pView ;
    public   static ArrayList<String> P2_R2_city3_GovView ;
    public  static ArrayList<Human> P2_R2_city3_Travel ;
    public  static ArrayList<Human> P2_R2_city3_ICU ;
  
    public  static ArrayList<Human> P2_R2_city4_Citizen;
    public  static ArrayList<Human> P2_R2_city4_DeadCitizen;
    public  static ArrayList<String> P2_R2_city4_pView;
    public   static ArrayList<String> P2_R2_city4_GovView ;
    public  static ArrayList<Human> P2_R2_city4_Travel ;
    public  static ArrayList<Human> P2_R2_city4_ICU ;
    














    ////////////////////////////////////////////////
    public static void main(String[] args) {
        int PickedDay=1;
        boolean ON_OFF=true;   
        
        //(Genrating Objects )    
        ///////////////////////Genertings Cites and Regins



               //////////////////////////////////////////////// Region 2 and its Cities 
               Places East = new Region("East");                              
               ((Region)East).addCity("Dammam", 5000, 0);
               ((Region)East).addCity("Jubail", 5000, 0);
               ((Region)East).addCity("Qatif", 5000, 0);
               ((Region)East).addCity("Ras Tanura", 5000, 0); 
               //Saving them to a Varible
               City East_City_1=((Region)East).Cities.get(0);
               City East_City_2=((Region)East).Cities.get(1);
               City East_City_3=((Region)East).Cities.get(2);
               City East_City_4=((Region)East).Cities.get(3);
       
               //////////////////////////////////////////////// Region 3 and its Cities                                
               Places West = new Region("West");                                
               ((Region)West).addCity("Jeddah", 5000, 0);
               ((Region)West).addCity("Mecca", 5000, 0);
               ((Region)West).addCity("Medina", 5000, 0);
               ((Region)West).addCity("Taif", 5000, 0);
               //Saving them to a Varible
               City West_City_1=((Region)West).Cities.get(0);
               City West_City_2=((Region)West).Cities.get(1);
               City West_City_3=((Region)West).Cities.get(2);
               City West_City_4=((Region)West).Cities.get(3);
       
       //////////////////////////////////////////////// Region 4 and its Cities 
       
       
               ////////////////////////////////////////////////////////////// Start Covid just Happens for 1 time for all the Cities
               CovidSpread covid = new CovidSpread();
       
       
       
               covid.StartCovid(East_City_1);
               covid.StartCovid(East_City_2);
               covid.StartCovid(East_City_3);
               covid.StartCovid(East_City_4);
       
               covid.StartCovid(West_City_1);
               covid.StartCovid(West_City_2);
               covid.StartCovid(West_City_3);
               covid.StartCovid(West_City_4);
       
       
               ////////////////////////////////////////////////////////////// 
       
               ministryofHealth GovR2_C1 = new ministryofHealth();
               ministryofHealth GovR2_C2 = new ministryofHealth();
               ministryofHealth GovR2_C3 = new ministryofHealth();
               ministryofHealth GovR2_C4 = new ministryofHealth();
       
               ministryofHealth GovR3_C1 = new ministryofHealth();
               ministryofHealth GovR3_C2 = new ministryofHealth();
               ministryofHealth GovR3_C3 = new ministryofHealth();
               ministryofHealth GovR3_C4 = new ministryofHealth();
       
               ICU icuR2_C1 = new ICU();
               ICU icuR2_C2 = new ICU();
               ICU icuR2_C3 = new ICU();
               ICU icuR2_C4 = new ICU();
       
               ICU icuR3_C1 = new ICU();
               ICU icuR3_C2 = new ICU();
               ICU icuR3_C3 = new ICU();
               ICU icuR3_C4 = new ICU();
       
       
           /////////////////////////////////////////////////////////////////
       
               Main_Method R2_C1 = new Main_Method();
               Main_Method R2_C2 = new Main_Method();
               Main_Method R2_C3 = new Main_Method();
               Main_Method R2_C4 = new Main_Method();
       
               Main_Method R3_C1 = new Main_Method();
               Main_Method R3_C2 = new Main_Method();
               Main_Method R3_C3 = new Main_Method();
               Main_Method R3_C4 = new Main_Method();
       
               ArrayList<City> Cities = new ArrayList<>();
       
               Cities.addAll(((Region)West).getCities());
               Cities.addAll(((Region)East).getCities());
       

        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Clone for Phase 2 and its Requrments          
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    City P2_East_City_1      =   East_City_1.clone();
    City P2_East_City_2      =   East_City_2.clone();
    City P2_East_City_3      =   East_City_3.clone();
    City P2_East_City_4      =   East_City_4.clone();

    City P2_West_City_1      =   West_City_1.clone();
    City P2_West_City_2      =   West_City_2.clone();
    City P2_West_City_3      =   West_City_3.clone();
    City P2_West_City_4      =   West_City_4.clone();

    Places P2_East = new Region("East");
    Places P2_West = new Region("West"); 


    ministryofHealth P2_GovR2_C1 = new ministryofHealth();
    ministryofHealth P2_GovR2_C2 = new ministryofHealth();
    ministryofHealth P2_GovR2_C3 = new ministryofHealth();
    ministryofHealth P2_GovR2_C4 = new ministryofHealth();

    ministryofHealth P2_GovR3_C1 = new ministryofHealth();
    ministryofHealth P2_GovR3_C2 = new ministryofHealth();
    ministryofHealth P2_GovR3_C3 = new ministryofHealth();
    ministryofHealth P2_GovR3_C4 = new ministryofHealth();

    ICU P2_icuR2_C1 = new ICU();
    ICU P2_icuR2_C2 = new ICU();
    ICU P2_icuR2_C3 = new ICU();
    ICU P2_icuR2_C4 = new ICU();

    ICU P2_icuR3_C1 = new ICU();
    ICU P2_icuR3_C2 = new ICU();
    ICU P2_icuR3_C3 = new ICU();
    ICU P2_icuR3_C4 = new ICU();


    covid.StartCovid(P2_East_City_1);
    covid.StartCovid(P2_East_City_2);
    covid.StartCovid(P2_East_City_3);
    covid.StartCovid(P2_East_City_4);

    covid.StartCovid(P2_West_City_1);
    covid.StartCovid(P2_West_City_2);
    covid.StartCovid(P2_West_City_3);
    covid.StartCovid(P2_West_City_4);

    Main_Method P2_R2_C1 = new Main_Method();
    Main_Method P2_R2_C2 = new Main_Method();
    Main_Method P2_R2_C3 = new Main_Method();
    Main_Method P2_R2_C4 = new Main_Method();

    Main_Method P2_R3_C1 = new Main_Method();
    Main_Method P2_R3_C2 = new Main_Method();
    Main_Method P2_R3_C3 = new Main_Method();
    Main_Method P2_R3_C4 = new Main_Method();

    ArrayList<City> P2_Cities = new ArrayList<>();

    P2_Cities.addAll(((Region)P2_West).getCities());
    P2_Cities.addAll(((Region)P2_East).getCities());



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Start of main loop for phase one and phase two          
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int Porgress=0;
        int days=10;// a year
        int numOfTravle;
        for (int day = 1; day <=days  ; day++) {


        

            R2_C1.City_Activite(day, East_City_1, GovR2_C1, icuR2_C1, covid,false);
            
            
            R2_C2.City_Activite(day, East_City_2, GovR2_C2, icuR2_C2, covid,false);
            R2_C3.City_Activite(day, East_City_3, GovR2_C3, icuR2_C3, covid,false);
            R2_C4.City_Activite(day, East_City_4, GovR2_C4, icuR2_C4, covid,false);

            R3_C1.City_Activite(day, West_City_1, GovR3_C1, icuR3_C1, covid,false);
            R3_C2.City_Activite(day, West_City_2, GovR3_C2, icuR3_C2, covid,false);
            R3_C3.City_Activite(day, West_City_3, GovR3_C3, icuR3_C3, covid,false);
            R3_C4.City_Activite(day, West_City_4, GovR3_C4, icuR3_C4, covid,false);





            P2_R2_C1.City_Activite(day, P2_East_City_1, P2_GovR2_C1, P2_icuR2_C1, covid,true);
            P2_R2_C2.City_Activite(day, P2_East_City_2, P2_GovR2_C2, P2_icuR2_C2, covid,true);
            P2_R2_C3.City_Activite(day, P2_East_City_3, P2_GovR2_C3, P2_icuR2_C3, covid,true);
            P2_R2_C4.City_Activite(day, P2_East_City_4, P2_GovR2_C4, P2_icuR2_C4, covid,true);

            P2_R3_C1.City_Activite(day, P2_West_City_1, P2_GovR3_C1, P2_icuR3_C1, covid,true);
            P2_R3_C2.City_Activite(day, P2_West_City_2, P2_GovR3_C2, P2_icuR3_C2, covid,true);
            P2_R3_C3.City_Activite(day, P2_West_City_3, P2_GovR3_C3, P2_icuR3_C3, covid,true);
            P2_R3_C4.City_Activite(day, P2_West_City_4, P2_GovR3_C4, P2_icuR3_C4, covid,true);

















            
            Porgress++;
            System.out.println("day:"+Porgress);
            
            


            numOfTravle = (int) (Math.random()*100);

            for (int i = 0; i < numOfTravle; i++) {
                City.Travel(Cities, day);
                //City.Travel(P2_Cities, day);
            }
            

            Boolean Switch_ON_OFF=true;
            if(Switch_ON_OFF==true){
            
            while(day>=PickedDay){
                ON_OFF=true;
                while  ( ON_OFF==true){


                System.out.println("the Day is:"+day+
                " Pick Regin \n"+
                "1 East:\n"+
                "2 West:\n"+
                "3 Next Day\n"+
                "4 Pick A Day\n");


                int  User_Choice= R2_C1.Switchinput();



                switch (User_Choice){


                //////////////////////////
                case 1:
                System.out.println("East");

                    System.out.println("Pick The City\n"+
                    "1 Dammam:\n"+
                    "2 Jubail:\n"+
                    "3 Alhfof:\n"+
                    "4 Hafr Albaten:\n");

                    User_Choice= R2_C1.Switchinput();   
                    switch (User_Choice){

                        case 1:
                        //R2_C1.CitySwitch(East_City_1,day,icuR2_C1);
                        P2_R2_C1.CitySwitch(P2_West_City_4, day, P2_icuR3_C4);
                        break;
                        //////
                        case 2:
                        R2_C2.CitySwitch(East_City_2,day,icuR2_C2);
                        break;
                        //////
                        case 3:
                        R2_C3.CitySwitch(East_City_3,day,icuR2_C3);
                        break;
                        //////
                        case 4:
                        R2_C4.CitySwitch(East_City_4,day,icuR2_C4);
                        break;
                    }
                    break;
                    //////////////////////////
                case 2:
                    System.out.println("West");
                    System.out.println("Pick The City\n"+
                    "1 Jeddah:\n"+
                    "2 Mecca:\n"+
                    "3 Medina:\n"+
                    "4 Taif:\n");
                    User_Choice= R3_C1.Switchinput();;   
                    switch (User_Choice){

                        case 1:
                        R3_C1.CitySwitch(West_City_1,day,icuR3_C1);
                        break;
                        //////
                        case 2:
                        R3_C2.CitySwitch(West_City_2,day,icuR3_C2);
                        break;
                        //////
                        case 3:
                        R3_C3.CitySwitch(West_City_3,day,icuR3_C3);
                        break;
                        //////
                        case 4:
                        R3_C4.CitySwitch(West_City_4,day,icuR3_C4);
                        break;
                    }
                    break;
                    ////////////////////////////


                        
                    ///////////////
                case 3:
                        ON_OFF=false;
                        PickedDay++;
                        
                    break;
                    //////////////////////////
                case 4:
                    System.out.println("Pick the Day");
                    PickedDay=User_Choice= R2_C1.Switchinput();
                    ON_OFF=false;
                }

                }
            }

        }
        }//end of main loop


        //////// print all City tabels

        R2_C1.CitySwitch(East_City_1,days,icuR2_C1);

        R2_C2.CitySwitch(East_City_2,days,icuR2_C2);

        R2_C3.CitySwitch(East_City_3,days,icuR2_C3);

        R2_C4.CitySwitch(East_City_4,days,icuR2_C4);

        R3_C1.CitySwitch(West_City_1,days,icuR3_C1);

        R3_C2.CitySwitch(West_City_2,days,icuR3_C2);

        R3_C3.CitySwitch(West_City_3,days,icuR3_C3);

        R3_C4.CitySwitch(West_City_4,days,icuR3_C4);

        ///////// Clone

        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("\nClone\n");
        System.out.println("\n///////////////////////////////////////////////////////////////////////////////////////////////");

        P2_R2_C1.CitySwitch(P2_East_City_1,days,P2_icuR2_C1);

        P2_R2_C2.CitySwitch(P2_East_City_2,days,P2_icuR2_C2);

        P2_R2_C3.CitySwitch(P2_East_City_3,days,P2_icuR2_C3);

        P2_R2_C4.CitySwitch(P2_East_City_4,days,P2_icuR2_C4);

        P2_R3_C1.CitySwitch(P2_West_City_1,days,P2_icuR3_C1);

        P2_R3_C2.CitySwitch(P2_West_City_2,days,P2_icuR3_C2);

        P2_R3_C3.CitySwitch(P2_West_City_3,days,P2_icuR3_C3);

        P2_R3_C4.CitySwitch(P2_West_City_4,days,P2_icuR3_C4);


        
        

////////////////////////////////////////////////////java fx passing
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// assigning the static varibles     
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

 
R1_city1_Citizen = East_City_1.get_Citizen();
R1_city1_DeadCitizen = East_City_1.getDeadCitizen();
R1_city1_pView = R2_C1.pView; 
R1_city1_GovView = R2_C1.GovView; 
R1_city1_Travel = East_City_1.getTravelers() ;
R1_city1_ICU = icuR2_C1.getBeds() ;

R1_city2_Citizen = East_City_2.get_Citizen();
R1_city2_DeadCitizen = East_City_2.getDeadCitizen();
R1_city2_pView = R2_C2.pView; 
R1_city2_GovView = R2_C2.GovView; 
R1_city2_Travel = East_City_2.getTravelers() ;
R1_city2_ICU = icuR2_C2.getBeds() ;

R1_city3_Citizen = East_City_3.get_Citizen();
R1_city3_DeadCitizen = East_City_3.getDeadCitizen();
R1_city3_pView = R2_C3.pView; 
R1_city3_GovView = R2_C3.GovView; 
R1_city3_Travel = East_City_3.getTravelers() ;
R1_city3_ICU = icuR2_C3.getBeds() ;

R1_city4_Citizen = East_City_4.get_Citizen();
R1_city4_DeadCitizen = East_City_4.getDeadCitizen();
R1_city4_pView = R2_C4.pView; 
R1_city4_GovView = R2_C4.GovView; 
R1_city4_Travel = East_City_4.getTravelers();
R1_city4_ICU = icuR2_C4.getBeds() ;

////////////////////////// Regoin2

R2_city1_Citizen = West_City_1.get_Citizen();
R2_city1_DeadCitizen = West_City_1.getDeadCitizen();
R2_city1_pView = R3_C1.pView; 
R2_city1_GovView = R3_C1.GovView;  
R2_city1_Travel = West_City_1.getTravelers() ;
R2_city1_ICU = icuR3_C1.getBeds() ;

R2_city2_Citizen = West_City_2.get_Citizen();
R2_city2_DeadCitizen = West_City_2.getDeadCitizen();
R2_city2_pView = R3_C2.pView; 
R2_city2_GovView = R3_C2.GovView;  
R2_city2_Travel = West_City_2.getTravelers();
R2_city2_ICU = icuR3_C2.getBeds() ;

R2_city3_Citizen = West_City_3.get_Citizen();
R2_city3_DeadCitizen = West_City_3.getDeadCitizen();
R2_city3_pView = R3_C3.pView; 
R2_city3_GovView = R3_C3.GovView;  
R2_city3_Travel = West_City_3.getTravelers() ;
R2_city3_ICU = icuR3_C3.getBeds() ;

R2_city4_Citizen = West_City_4.get_Citizen();
R2_city4_DeadCitizen = West_City_4.getDeadCitizen();
R2_city4_pView = R3_C4.pView; 
R2_city4_GovView = R3_C4.GovView;  
R2_city4_Travel = West_City_4.getTravelers() ;
R2_city4_ICU = icuR3_C4.getBeds() ;

///////////////// clone

P2_R1_city1_Citizen = P2_East_City_1.get_Citizen();
P2_R1_city1_DeadCitizen = P2_East_City_1.getDeadCitizen();
P2_R1_city1_pView = P2_R2_C1.pView; 
P2_R1_city1_GovView = P2_R2_C1.GovView; 
P2_R1_city1_Travel = P2_East_City_1.getTravelers() ;
P2_R1_city1_ICU = P2_icuR2_C1.getBeds() ;

P2_R1_city2_Citizen = P2_East_City_2.get_Citizen();
P2_R1_city2_DeadCitizen = P2_East_City_2.getDeadCitizen();
P2_R1_city2_pView = P2_R2_C2.pView; 
P2_R1_city2_GovView = P2_R2_C2.GovView; 
P2_R1_city2_Travel = P2_East_City_2.getTravelers() ;
P2_R1_city2_ICU = P2_icuR2_C2.getBeds() ;

P2_R1_city3_Citizen = P2_East_City_3.get_Citizen();
P2_R1_city3_DeadCitizen = P2_East_City_3.getDeadCitizen();
P2_R1_city3_pView = P2_R2_C3.pView; 
P2_R1_city3_GovView = P2_R2_C3.GovView; 
P2_R1_city3_Travel = P2_East_City_3.getTravelers() ;
P2_R1_city3_ICU = P2_icuR2_C3.getBeds() ;

P2_R1_city4_Citizen = P2_East_City_4.get_Citizen();
P2_R1_city4_DeadCitizen = P2_East_City_4.getDeadCitizen();
P2_R1_city4_pView = P2_R2_C4.pView; 
P2_R1_city4_GovView = P2_R2_C4.GovView; 
P2_R1_city4_Travel = P2_East_City_4.getTravelers();
P2_R1_city4_ICU = P2_icuR2_C4.getBeds() ;

////////////////////////// Regoin2

P2_R2_city1_Citizen = P2_West_City_1.get_Citizen();
P2_R2_city1_DeadCitizen = P2_West_City_1.getDeadCitizen();
P2_R2_city1_pView = P2_R3_C1.pView; 
P2_R2_city1_GovView = P2_R3_C1.GovView; 
P2_R2_city1_Travel = P2_West_City_1.getTravelers() ;
P2_R2_city1_ICU = P2_icuR3_C1.getBeds() ;

P2_R2_city2_Citizen = P2_West_City_2.get_Citizen();
P2_R2_city2_DeadCitizen = P2_West_City_2.getDeadCitizen();
P2_R2_city2_pView = P2_R3_C2.pView; 
P2_R2_city2_GovView = P2_R3_C2.GovView; 
P2_R2_city2_Travel =P2_West_City_2.getTravelers();
P2_R2_city2_ICU = P2_icuR3_C2.getBeds() ;

P2_R2_city3_Citizen = P2_West_City_3.get_Citizen();
P2_R2_city3_DeadCitizen = P2_West_City_3.getDeadCitizen();
P2_R2_city3_pView = P2_R3_C3.pView; 
P2_R2_city3_GovView = P2_R3_C3.GovView; 
P2_R2_city3_Travel = P2_West_City_3.getTravelers() ;
P2_R2_city3_ICU = P2_icuR3_C3.getBeds() ;

P2_R2_city4_Citizen = P2_West_City_4.get_Citizen();
P2_R2_city4_DeadCitizen = P2_West_City_4.getDeadCitizen();
P2_R2_city4_pView = P2_R3_C4.pView; 
P2_R2_city4_GovView = P2_R3_C4.GovView; 
P2_R2_city4_Travel = P2_West_City_4.getTravelers() ;
P2_R2_city4_ICU = P2_icuR3_C4.getBeds() ;

        System.out.println("Starting GUI");
Covidstatus.main(args);
    }// end of main 
   
}

