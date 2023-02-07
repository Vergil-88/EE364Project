

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
//////////////////////////////////////////////// Region 2 and its Cities 
Region East = new Region("East");                                
East.addCity("Dammam", 10000, 0);
East.addCity("Jubail", 10000, 0);
East.addCity("Qatif", 10000, 0);
East.addCity("Ras Tanura", 10000, 0);                               
 //////////////////////////////////////////////// Region 3 and its Cities                                
Region West = new Region("West");                               
West.addCity("Jeddah", 10000, 0);
West.addCity("Mecca", 10000, 0);
West.addCity("Medina", 10000, 0);
West.addCity("Taif", 10000, 0);
//////////////////////////////////////////////// Region 4 and its Cities 
Region North = new Region("North");
North.addCity("Tabuk", 10000, 0);
North.addCity("Sakakah", 10000, 0);
North.addCity("Arar", 10000, 0);
North.addCity("Hail", 10000, 0);
////////////////////////////////////////////////////////////// Start Covid just Happens for 1 time for all the Cities
CovidSpread covid = new CovidSpread();

covid.StartCovid(South.Cities.get(0));
covid.StartCovid(South.Cities.get(1));
covid.StartCovid(South.Cities.get(2));
covid.StartCovid(South.Cities.get(3));

covid.StartCovid(East.Cities.get(0));
covid.StartCovid(East.Cities.get(1));
covid.StartCovid(East.Cities.get(2));
covid.StartCovid(East.Cities.get(3));

covid.StartCovid(West.Cities.get(0));
covid.StartCovid(West.Cities.get(1));
covid.StartCovid(West.Cities.get(2));
covid.StartCovid(West.Cities.get(3));

covid.StartCovid(North.Cities.get(0));
covid.StartCovid(North.Cities.get(1));
covid.StartCovid(North.Cities.get(2));
covid.StartCovid(North.Cities.get(3));
/////////////////////////////////////////////////////////////////



















////////////////////////////////////////////////////////////////////////
for (int Days = 1; Days <= 10; Days++) {





}

//           (Main Loop ) 

/*-MAIN_loop(Evrey_hour)
0-Normal Life
  

1- callers declare corona symptomes
         Random Genration
ex;10 calls 
2-Recrded go to Corna Test Center

ex:0.5*10=5 sick
2.5-type B is confirmed sick and calls people who were around him
 
3-Check up all covid patients
update the patients status (from the array) every 1 hour


 
4-Resgeter all sick to normal 
when done with quarantine        */















}// end of main 













    
}
