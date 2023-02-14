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