import java.util.Scanner;

public class MAIN_loop {
public static void main(String[] args) {
 
//(Genrating Objects )    
///////////////////////Genertings Cites and Regins

//////////////////////////////////////////////// Region 1 and its Cities 
Region South = new Region("South");                            
South.addCity("Abha", 10000, 0);
South.addCity("Jizan", 10000, 0);
South.addCity("Najran", 10000, 0);
South.addCity("AlBahah", 10000, 0);
//Saving them to a Varible
City South_City_1=South.Cities.get(0);
City South_City_2=South.Cities.get(1);
City South_City_3=South.Cities.get(2);
City South_City_4=South.Cities.get(3);

//////////////////////////////////////////////// Region 2 and its Cities 
Region East = new Region("East");                                
East.addCity("Dammam", 10000, 0);
East.addCity("Jubail", 10000, 0);
East.addCity("Qatif", 10000, 0);
East.addCity("Ras Tanura", 10000, 0); 
//Saving them to a Varible
City East_City_1=East.Cities.get(0);
City East_City_2=East.Cities.get(1);
City East_City_3=East.Cities.get(2);
City East_City_4=East.Cities.get(3);

 //////////////////////////////////////////////// Region 3 and its Cities                                
Region West = new Region("West");                               
West.addCity("Jeddah", 10000, 0);
West.addCity("Mecca", 10000, 0);
West.addCity("Medina", 10000, 0);
West.addCity("Taif", 10000, 0);
//Saving them to a Varible
City West_City_1=West.Cities.get(0);
City West_City_2=West.Cities.get(1);
City West_City_3=West.Cities.get(2);
City West_City_4=West.Cities.get(3);

//////////////////////////////////////////////// Region 4 and its Cities 
Region North = new Region("North");
North.addCity("Tabuk", 10000, 0);
North.addCity("Sakakah", 10000, 0);
North.addCity("Arar", 10000, 0);
North.addCity("Hail", 10000, 0);
//Saving them to a Varible
City North_City_1=North.Cities.get(0);
City North_City_2=North.Cities.get(1);
City North_City_3=North.Cities.get(2);
City North_City_4=North.Cities.get(3);

////////////////////////////////////////////////////////////// Start Covid just Happens for 1 time for all the Cities
CovidSpread covid = new CovidSpread();

covid.StartCovid(South_City_1);
covid.StartCovid(South_City_2);
covid.StartCovid(South_City_3);
covid.StartCovid(South_City_4);

covid.StartCovid(East_City_1);
covid.StartCovid(East_City_2);
covid.StartCovid(East_City_3);
covid.StartCovid(East_City_4);

covid.StartCovid(West_City_1);
covid.StartCovid(West_City_2);
covid.StartCovid(West_City_3);
covid.StartCovid(West_City_4);

covid.StartCovid(North_City_1);
covid.StartCovid(North_City_2);
covid.StartCovid(North_City_3);
covid.StartCovid(North_City_4);
/////////////////////////////////////////////////////////////////

ministryofHealth Gov = new ministryofHealth();
ICU icu = new ICU();

/////////////////////////////////////////////////////////////////
Main_Method R1_C1 = new Main_Method();
Main_Method R1_C2 = new Main_Method();
Main_Method R1_C3 = new Main_Method();
Main_Method R1_C4 = new Main_Method();

Main_Method R2_C1 = new Main_Method();
Main_Method R2_C2 = new Main_Method();
Main_Method R2_C3 = new Main_Method();
Main_Method R2_C4 = new Main_Method();

Main_Method R3_C1 = new Main_Method();
Main_Method R3_C2 = new Main_Method();
Main_Method R3_C3 = new Main_Method();
Main_Method R3_C4 = new Main_Method();

Main_Method R4_C1 = new Main_Method();
Main_Method R4_C2 = new Main_Method();
Main_Method R4_C3 = new Main_Method();
Main_Method R4_C4 = new Main_Method();

int days=5;
for (int day = 1; day <=days  ; day++) {


    R1_C1.City_Activite(day, North_City_4, Gov, icu, covid);
    R1_C2.City_Activite(day, North_City_4, Gov, icu, covid);
    R1_C3.City_Activite(day, North_City_4, Gov, icu, covid);
    R1_C4.City_Activite(day, North_City_4, Gov, icu, covid); 

    R2_C1.City_Activite(day, North_City_4, Gov, icu, covid);
    R2_C2.City_Activite(day, North_City_4, Gov, icu, covid);
    R2_C3.City_Activite(day, North_City_4, Gov, icu, covid);
    R2_C4.City_Activite(day, North_City_4, Gov, icu, covid);

    R3_C1.City_Activite(day, North_City_4, Gov, icu, covid);
    R3_C2.City_Activite(day, North_City_4, Gov, icu, covid);
    R3_C3.City_Activite(day, North_City_4, Gov, icu, covid);
    R3_C4.City_Activite(day, North_City_4, Gov, icu, covid);

    R4_C1.City_Activite(day, North_City_4, Gov, icu, covid);
    R4_C2.City_Activite(day, North_City_4, Gov, icu, covid);
    R4_C3.City_Activite(day, North_City_4, Gov, icu, covid);
    R4_C4.City_Activite(day, North_City_4, Gov, icu, covid);







Scanner input = new Scanner(System.in);
System.out.println("");
int  User_Choice= input.nextInt();


switch (User_Choice){

case 1:
System.out.println(" day;"+ day + " Sammary ");


break;
//////////////////////////
case 2:





break;
//////////////////////////
case 3:




break;
//////////////////////////
case 4:



break;
//////////////////////////
case 5:




break;

}




    
}//end of main loop
System.out.println("South");

System.out.println("City1");
R1_C1.City_Output(days);
System.out.println("City2");
R1_C2.City_Output(days);
System.out.println("City3");
R1_C3.City_Output(days);
System.out.println("City4");
R1_C4.City_Output(days);


System.out.println("East");

System.out.println("City1");
R2_C1.City_Output(days);
System.out.println("City2");
R2_C2.City_Output(days);
System.out.println("City3");
R2_C3.City_Output(days);
System.out.println("City4");
R2_C4.City_Output(days);

System.out.println("West");
System.out.println("City1");
R3_C1.City_Output(days);
System.out.println("City2");
R3_C2.City_Output(days);
System.out.println("City3");
R3_C3.City_Output(days);
System.out.println("City4");
R3_C4.City_Output(days);

System.out.println("East");

System.out.println("City1");
R4_C1.City_Output(days);
System.out.println("City2");
R4_C2.City_Output(days);
System.out.println("City3");
R4_C3.City_Output(days);
System.out.println("City4");
R4_C4.City_Output(days);
















////////////////////////////////////////////////////////////////////////





}// end of main 
   
}
