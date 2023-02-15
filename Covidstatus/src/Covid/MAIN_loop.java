package Covid;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.collections.ObservableList;



public class MAIN_loop {
    public static Main_Method R2_C1;
    public static Main_Method R2_C2;
    public static Main_Method R2_C3;
    public static Main_Method R2_C4;
public static ObservableList <String> RRRR;
    static Main_Method R3_C1;
    static Main_Method R3_C2;
    static Main_Method R3_C3;
    static Main_Method R3_C4;
    static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    int PickedDay=1;
    boolean ON_OFF=true;   
    
//(Genrating Objects )    
///////////////////////Genertings Cites and Regins



//////////////////////////////////////////////// Region 2 and its Cities 
Region East = new Region("East");                                
East.addCity("Dammam", 5000, 0);
East.addCity("Jubail", 5000, 0);
East.addCity("Qatif", 5000, 0);
East.addCity("Ras Tanura", 5000, 0); 
//Saving them to a Varible
City East_City_1=East.Cities.get(0);
City East_City_2=East.Cities.get(1);
City East_City_3=East.Cities.get(2);
City East_City_4=East.Cities.get(3);

 //////////////////////////////////////////////// Region 3 and its Cities                                
Region West = new Region("West");                               
West.addCity("Jeddah", 5000, 0);
West.addCity("Mecca", 5000, 0);
West.addCity("Medina", 5000, 0);
West.addCity("Taif", 5000, 0);
//Saving them to a Varible
City West_City_1=West.Cities.get(0);
City West_City_2=West.Cities.get(1);
City West_City_3=West.Cities.get(2);
City West_City_4=West.Cities.get(3);

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


/////////////////////////////////////////////////////////////////

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

R2_C1 = new Main_Method();
R2_C2 = new Main_Method();
R2_C3 = new Main_Method();
R2_C4 = new Main_Method();

R3_C1 = new Main_Method();
R3_C2 = new Main_Method();
R3_C3 = new Main_Method();
R3_C4 = new Main_Method();

ArrayList<City> Cities = new ArrayList<>();

Cities.addAll(West.getCities());
Cities.addAll(East.getCities());

int Porgress=0;
int days=365;// a year
int numOfTravle;
for (int day = 1; day <=days  ; day++) {


   

    R2_C1.City_Activite(day, East_City_1, GovR2_C1, icuR2_C1, covid);
    R2_C2.City_Activite(day, East_City_2, GovR2_C2, icuR2_C2, covid);
    R2_C3.City_Activite(day, East_City_3, GovR2_C3, icuR2_C3, covid);
    R2_C4.City_Activite(day, East_City_4, GovR2_C4, icuR2_C4, covid);

    R3_C1.City_Activite(day, West_City_1, GovR3_C1, icuR3_C1, covid);
    R3_C2.City_Activite(day, West_City_2, GovR3_C2, icuR3_C2, covid);
    R3_C3.City_Activite(day, West_City_3, GovR3_C3, icuR3_C3, covid);
    R3_C4.City_Activite(day, West_City_4, GovR3_C4, icuR3_C4, covid);

    
    Porgress++;
    System.out.println("day:"+Porgress);
    
    // System.out.println(West_City_2.get_Citizen().size());


    numOfTravle = (int) (Math.random()*100);

    for (int i = 0; i < numOfTravle; i++) {
        City.Travel(Cities, day);
    }
    


    

while(day>=PickedDay){
    ON_OFF=true;
while  ( ON_OFF==true){


System.out.println("the Day is:"+day+
" Pick Regin \n"+
"1 East:\n"+
"2 West:\n"+
"3 Next Day\n"+
"4 Pick A Day\n");

// int  User_Choice= input.nextInt();
 int  User_Choice= R2_C1.Switchinput();



switch (User_Choice){


//////////////////////////
case 1:
System.out.println("East");

    System.out.println("Pick The City\n"+
    "1 Dammam:\n"+
    "2 Jubail:\n"+
    "3 Qatif:\n"+
    "4 Ras Tanura:\n");

    User_Choice= R2_C1.Switchinput();   
    switch (User_Choice){

        case 1:
        R2_C1.CitySwitch(East_City_1,day,icuR2_C1);
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Output for java Fx
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
RRRR =R2_C1.Out1;









//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
}//end of main loop





// System.out.println("East");

// System.out.println("City1");
// R2_C1.City_Output(days);
// System.out.println("City2");
// R2_C2.City_Output(days);
// System.out.println("City3");
// R2_C3.City_Output(days);
// System.out.println("City4");
// R2_C4.City_Output(days);

// System.out.println("West");
// System.out.println("City1");
// R3_C1.City_Output(days);
// System.out.println("City2");
// R3_C2.City_Output(days);
// System.out.println("City3");
// R3_C3.City_Output(days);
// System.out.println("City4");
// R3_C4.City_Output(days);


















////////////////////////////////////////////////////////////////////////





}// end of main 
   
}
