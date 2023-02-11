public class temp {

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

covid.StartCovid(South_City_1);
covid.StartCovid(South_City_2);
covid.StartCovid(South_City_3);
covid.StartCovid(South_City_4);

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

covid.StartCovid(North_City_1);
covid.StartCovid(North_City_2);
covid.StartCovid(North_City_3);
covid.StartCovid(North_City_4);

R1_C1.City_Activite(day, South_City_1, Gov, icu, covid);
R1_C2.City_Activite(day, South_City_1, Gov, icu, covid);
R1_C3.City_Activite(day, South_City_2, Gov, icu, covid);
R1_C4.City_Activite(day, South_City_4, Gov, icu, covid); 

R4_C1.City_Activite(day, North_City_1, Gov, icu, covid);
    R4_C2.City_Activite(day, North_City_2, Gov, icu, covid);
    R4_C3.City_Activite(day, North_City_3, Gov, icu, covid);
    R4_C4.City_Activite(day, North_City_4, Gov, icu, covid);
  
  
    case 1:
System.out.println("South");

    System.out.println("Pick The City\n"+
    "1 Abha:\n"+
    "2 Jizan:\n"+
    "3 Najran:\n"+
    "4 AlBahah:\n");
    User_Choice= input.nextInt();   
    switch (User_Choice){

        case 1:
        R1_C1.CitySwitch(South_City_1,day,icu);
        break;
        //////
        case 2:
        R1_C2.CitySwitch(South_City_2,day,icu);
        break;
        //////
        case 3:
        R1_C3.CitySwitch(South_City_3,day,icu);
        break;
        //////
        case 4:
        R1_C4.CitySwitch(South_City_4,day,icu);
        break;
    }
break;
}

case 1:
    R1_C1.CitySwitch(North_City_1,day,icu);
    break;
    //////
    case 2:
    R1_C2.CitySwitch(North_City_2,day,icu);
    break;
    //////
    case 3:
    R1_C3.CitySwitch(North_City_3,day,icu);
    break;
    //////
    case 4:
    R1_C4.CitySwitch(North_City_4,day,icu);
    break;
}
break;

case 4:
System.out.println("North");
System.out.println("Pick The City\n"+
"1 Tabuk:\n"+
"2 Sakakah:\n"+
"3 Arar:\n"+
"4 Hail:\n");
User_Choice= input.nextInt();   
switch (User_Choice){
