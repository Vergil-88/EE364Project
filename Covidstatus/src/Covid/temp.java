package Covid;
// // public class temp {

// //     //////////////////////////////////////////////// Region 1 and its Cities 
// // Region South = new Region("South");                            
// // South.addCity("Abha", 10000, 0);
// // South.addCity("Jizan", 10000, 0);
// // South.addCity("Najran", 10000, 0);
// // South.addCity("AlBahah", 10000, 0);
// // //Saving them to a Varible
// // City South_City_1=South.Cities.get(0);
// // City South_City_2=South.Cities.get(1);
// // City South_City_3=South.Cities.get(2);
// // City South_City_4=South.Cities.get(3);

// // covid.StartCovid(South_City_1);
// // covid.StartCovid(South_City_2);
// // covid.StartCovid(South_City_3);
// // covid.StartCovid(South_City_4);

// // Region North = new Region("North");
// // North.addCity("Tabuk", 10000, 0);
// // North.addCity("Sakakah", 10000, 0);
// // North.addCity("Arar", 10000, 0);
// // North.addCity("Hail", 10000, 0);
// // //Saving them to a Varible
// // City North_City_1=North.Cities.get(0);
// // City North_City_2=North.Cities.get(1);
// // City North_City_3=North.Cities.get(2);
// // City North_City_4=North.Cities.get(3);

// // covid.StartCovid(North_City_1);
// // covid.StartCovid(North_City_2);
// // covid.StartCovid(North_City_3);
// // covid.StartCovid(North_City_4);

// // R1_C1.City_Activite(day, South_City_1, Gov, icu, covid);
// // R1_C2.City_Activite(day, South_City_1, Gov, icu, covid);
// // R1_C3.City_Activite(day, South_City_2, Gov, icu, covid);
// // R1_C4.City_Activite(day, South_City_4, Gov, icu, covid); 

// // R4_C1.City_Activite(day, North_City_1, Gov, icu, covid);
// //     R4_C2.City_Activite(day, North_City_2, Gov, icu, covid);
// //     R4_C3.City_Activite(day, North_City_3, Gov, icu, covid);
// //     R4_C4.City_Activite(day, North_City_4, Gov, icu, covid);
  
  
// //     case 1:
// // System.out.println("South");

// //     System.out.println("Pick The City\n"+
// //     "1 Abha:\n"+
// //     "2 Jizan:\n"+
// //     "3 Najran:\n"+
// //     "4 AlBahah:\n");
// //     User_Choice= input.nextInt();   
// //     switch (User_Choice){

// //         case 1:
// //         R1_C1.CitySwitch(South_City_1,day,icu);
// //         break;
// //         //////
// //         case 2:
// //         R1_C2.CitySwitch(South_City_2,day,icu);
// //         break;
// //         //////
// //         case 3:
// //         R1_C3.CitySwitch(South_City_3,day,icu);
// //         break;
// //         //////
// //         case 4:
// //         R1_C4.CitySwitch(South_City_4,day,icu);
// //         break;
// //     }
// // break;
// // }

// // case 1:
// //     R1_C1.CitySwitch(North_City_1,day,icu);
// //     break;
// //     //////
// //     case 2:
// //     R1_C2.CitySwitch(North_City_2,day,icu);
// //     break;
// //     //////
// //     case 3:
// //     R1_C3.CitySwitch(North_City_3,day,icu);
// //     break;
// //     //////
// //     case 4:
// //     R1_C4.CitySwitch(North_City_4,day,icu);
// //     break;
// // }
// // break;

// // case 4:
// // System.out.println("North");
// // System.out.println("Pick The City\n"+
// // "1 Tabuk:\n"+
// // "2 Sakakah:\n"+
// // "3 Arar:\n"+
// // "4 Hail:\n");
// // User_Choice= input.nextInt();   


// // switch (User_Choice){
// //     System.out.println("Enter The ID");
       
// //         String FindX = in.next();

// //         System.out.println("The history Of "+ FindX);
        
        
// //         city.Find_Citizen_History(FindX);
// //         break;



// /////////////////////human run
// public static void main(String[] args) {
//     Random ran1 = new Random();
//          ArrayList <Human> Citizen = new ArrayList<Human>();
       
//          for (int i = 0 ; i<10 ; i++ ){
    
//              Citizen.add(new Human());
    
    
//             //  System.out.println(Citizen.get(i).toString());
    
//          }
//         int size= Citizen.size();
//          for(int xx=0; xx<size ;xx++){
//              int number_Of_family_mem=ran1.nextInt(7) + 2;
//              ArrayList <Human>  member= new ArrayList <Human>();
            
//              for(int i=1 ; i < number_Of_family_mem ; i++){
                   
//                 member.add(new Human()) ;// all the family is Created
    
//              }
                 
//               Citizen.addAll(member);
    
    
//                 for(Human W : member){
                    
//                     Citizen.get(xx).setfamily(W);//fammliy member to C 
//                     }
                
                
//                 for(Human W : member){
                    
//                     W.setfamily(Citizen.get(xx));// familly to c 
//                     }
                
    
    
    
//                 for(Human m : member){//the know each others 
                    
//                     for(Human m2 : member){
//                         if(!(m.equals(m2)))
//                         m.setfamily(m2);
//                     }
//                 }
                
    
//          }
       
    
    
//             Random numRan= new Random();
    
        
//       for (Human  C : Citizen) {
//             int Num_Of_friends= (int)(Math.random()*5+2);
    
//             for (int i = 0; i<Num_Of_friends; i++) {
                
//             int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
            
//             Human SearchCitizen = Citizen.get(index_of_friends);
    
//             if(!(C.equals(SearchCitizen)))
//                 if(!(C.family.contains(SearchCitizen)))
//                     if(!(C.friends.contains(SearchCitizen)))
//                         if(!(C.coWorkers.contains(SearchCitizen)))
//                              if(!(C.randomIndividuals.contains(SearchCitizen))){
    
//                                 C.setfriends(Citizen.get(index_of_friends));
//                                 Citizen.get(index_of_friends).setfriends(C);
//                              }
//             }  
//         }
        
            
//         for (Human  C : Citizen) {
//             int Num_Of_friends= (int)(Math.random()*5+2);
    
//             for (int i = 0; i<Num_Of_friends; i++) {
                
//             int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
//             Human SearchCitizen = Citizen.get(index_of_friends);
    
//             if(!(C.equals(SearchCitizen)))
//                 if(!(C.family.contains(SearchCitizen)))
//                     if(!(C.friends.contains(SearchCitizen)))
//                         if(!(C.coWorkers.contains(SearchCitizen)))
//                              if(!(C.randomIndividuals.contains(SearchCitizen))){
    
    
//                                 C.setcoWorkers(Citizen.get(index_of_friends));
//                                 Citizen.get(index_of_friends).setcoWorkers(C);
//                              }
//             }  
//         }   
    
//         for (Human  C : Citizen) {
//             int Num_Of_friends= (int)(Math.random()*5+2);
    
//             for (int i = 0; i<Num_Of_friends; i++) {
                
//             int index_of_friends =numRan.nextInt(Citizen.size()-1) ;  
    
//             Human SearchCitizen = Citizen.get(index_of_friends);
    
//             if(!(C.equals(SearchCitizen)))
//                 if(!(C.family.contains(SearchCitizen)))
//                     if(!(C.friends.contains(SearchCitizen)))
//                         if(!(C.coWorkers.contains(SearchCitizen)))
//                              if(!(C.randomIndividuals.contains(SearchCitizen))){
    
//                                 C.setRandomIndividuals(Citizen.get(index_of_friends));
//                                 Citizen.get(index_of_friends).setRandomIndividuals(C);
//                              }
//             }  
//         }   
    
    
    
    
    
    
    
    
    
    
    
    
//             for (Human CC  : Citizen) {
//                 System.out.println(CC.toString());     
//             }
    
//             System.out.println(Citizen.size());
    
         
    
//     }
    
        
    
    
//     }


///////// Health main 

// public static void main(String[] args) {
//     ArrayList <String>  data = new ArrayList <String>();
//     ArrayList <String>  Dayslist= new ArrayList <String>();
//     ArrayList <String>  Govdata = new ArrayList <String>();

//     Random rad = new Random();



//     Region South = new Region("South");
//     South.addCity("Jeddah", 10000, 1600);

//     CovidSpread covid = new CovidSpread();

//     covid.StartCovid(South.Cities.get(0));



//     // System.out.println(South.Cities.get(0).get_Citizeninfo());
//     System.out.println(South.Cities.get(0).get_Citizen().size()); // population

//     int numOf_A=0;
//     int numOf_B=0;
//     int numOf_C=0;
//     int numOf_Normal=0;

//     int GOV_A=0;
//     int GOV_B=0;
//     int GOV_Dead=0;
//     int GOV_Recovered=0;

//     for (Human H : South.Cities.get(0).get_Citizen()) { 
//         String Z= H.getCovidInfection_Type().getType();
//         switch (Z){
//         case "A":
//             numOf_A++;
//             break;
//         case "B":
//             numOf_B++;
//             break;
//         case "C":
//             numOf_C++;
//             break;
//         case "Normal":
//             numOf_Normal++;
//             break;
//         }
//     }

//     System.out.println("A num = "+numOf_A );
//     System.out.println("B num = "+numOf_B );
//     System.out.println("C num = "+numOf_C );
//     System.out.println("Normal num = "+numOf_Normal );


//     ministryofHealth Gov = new ministryofHealth();
//     ICU icu = new ICU();


//     for (int i = 1; i <= 20; i++) {           // Start of the main Loop




//         if( i%3==0 ){
//             /// Changing B to A by Percentiges there rest that we havent made into A will become Normal 

//             // System.out.println("3 Days passed");
//             for (Human B: South.Cities.get(0).get_Citizen() ) {
//                 if(B.getCovidInfection_Type().getType().equals("B"))
//                     covid.B_Becomes_A(B,Gov.PostiveB,i);  
//             }


//             /// Changing C to A by Percentiges there rest that we havent made into A will become Normal 

//             for (Human C: South.Cities.get(0).get_Citizen() ) {
//                 if(C.getCovidInfection_Type().getType().equals("C"))
//                     covid.C_Becomes_A(C,Gov.PostiveC,i);  
//             }
//         }





//         /// Spreding the Covid for the Day 
//         for (Human H : South.Cities.get(0).get_Citizen()) {                 
//             if(H.getCovidInfection_Type().getType().equals("A"))
//                 covid.SpreadingB(H,i);
//             else if(H.getCovidInfection_Type().getType().equals("B"))
//                 covid.SpreadingC(H,i);   
//         } 


//         ///////////////////////////////////// Calls Happen 


//         int number_of_A_Calls = (int) (numOf_A * 0.35);
//         for (Human H : South.Cities.get(0).get_Citizen()) {
//             if(H.getCovidInfection_Type().getType().equals("A")){
//                 Gov.CallCenter(H);
//                 number_of_A_Calls--; 
//                 if(number_of_A_Calls <= 0)
//                 break;
//             }
//         }
//         ////////////////////////////////////////

//         Gov.TestCenter(Gov.Calls);
//         Gov.Interacted_A_to_B();
        

//         // ICU Beds filing
//         int numOfBeds = (int) (Gov.PostiveA.size() *0.25); 
//         int typeAIndex; 
//         Human person;
        
//         while(numOfBeds != 0){
        
//             typeAIndex = rad.nextInt(Gov.getPostiveA().size()-1);
//             person = Gov.PostiveA.get(typeAIndex);

//             icu.SetBed(person,i);
            
//             numOfBeds--;

//         }
        
//         //  for (Human posA : Gov.PostiveA) {/// make % % % not 100
//         //  icu.SetBed(posA,i);
//         // }


        
//         Gov.A_to_Dead(icu.getWaitingList(),i);

//         Gov.Recovered(i);
            
        




//         ////////////////////////////////////// Counteing the number of Types for the Current Day  
//         // System.out.println("---------------------");
//         int oldNum_A=numOf_A;
//         int oldNum_B=numOf_B;
//         int oldNum_C=numOf_C;
//         int oldNum_Normal=numOf_Normal;


//         numOf_A=0;
//         numOf_B=0;
//         numOf_C=0;
//         numOf_Normal=0;

//         for (Human H : South.Cities.get(0).get_Citizen()) { 
//         String Z= H.getCovidInfection_Type().getType();
//             switch (Z){
//                 case "A":
//                     numOf_A++;
//                     break;
//                 case "B":
//                     numOf_B++;
//                     break;
//                 case "C":
//                     numOf_C++;
//                     break;
//                 case "Normal":
//                     numOf_Normal++;
//                     break;
//             }
//         }

//         oldNum_A=numOf_A-oldNum_A;
//         oldNum_B=numOf_B-oldNum_B;
//         oldNum_C=numOf_C-oldNum_C;
//         oldNum_Normal=numOf_Normal-oldNum_Normal;
//         ////////////////////////////////////////////////calculating the diff between Days
//         int oldGOV_A=GOV_A;
//         int oldGOV_B=GOV_B;
//         int oldGOV_Dead=GOV_Dead;
//         int oldGOV_Recovered=GOV_Recovered;


//         GOV_A=Gov.getPostiveA().size();
//         GOV_B=Gov.getPostiveB().size();
//         GOV_Dead=Gov.getDead().size();
//         GOV_Recovered=Gov.getRecovered().size();


//         oldGOV_A=GOV_A-oldGOV_A;
//         oldGOV_B=GOV_B-oldGOV_B;
//         oldGOV_Dead=GOV_Dead-oldGOV_Dead;
//         oldGOV_Recovered=GOV_Recovered-oldGOV_Recovered;

//         ///////////////////// Output of the  Day ////////////////////////   
        
//         Dayslist.add(String.format("Day:%-5s",i) );
//         data.add(String.format(" A num =  %-5d (%-10d) B num =  %-5d (%-5d) C num =  %-5d (%-5d) Normal num =   %-5d (%-5d)",numOf_A,oldNum_A,numOf_B,oldNum_B,numOf_C,oldNum_C,numOf_Normal,oldNum_Normal) );
//         Govdata.add(String.format("The number of calls: %-5d Number of A's: %-5d (%-5d) Number of B's: %-5d (%-5d) Number of people in ICU: %-5d / %-5d  Number of Dead people: %-5d (%-5d) Number of Recovered people: %-5d (%-5d)",Gov.Calls.size(),Gov.getPostiveA().size(),oldGOV_A, Gov.getPostiveB().size(),oldGOV_B, icu.BedsinUse(),icu.getBeds().length,Gov.getDead().size(),oldGOV_Dead,Gov.getRecovered().size(),oldGOV_Recovered));

        



//             for (Human  h :  South.getCities().get(0).get_Citizen()) {
//                 h.updateHistory(i);
                
//             }

//             /////Clearing The number of Calls After the Day is Done
//             Gov.Calls.clear();
//             South.getCities().get(0).setDeadCitizen(Gov.getDead());
//             South.getCities().get(0).get_Citizen().removeAll(Gov.getDead());
//             System.out.println(South.getCities().get(0).getDeadCitizen()); 



//         ///////////////


//     } // End of main Loop



//     TableViewer table = new TableViewer(Dayslist, data);
//     System.out.println("Programmer view");
//     table.viewTable(10, 10);  
//     System.out.println("Government view");
//     TableViewer table1 = new TableViewer(Dayslist, Govdata);
//     table1.viewTable(10, 10);  

//     for (Human  h :  South.getCities().get(0).getDeadCitizen() ) {
        
//         System.out.println(h.getHistory()); 
        
//     }

// }//end of main metohd


// }




