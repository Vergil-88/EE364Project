package Covid;
public class A extends covidInfection{
   
    private int daysCounter=0; // Counter for how many days in A.

    public  String getType(){
        return "A";
    }

    // increas the counter.
    public void updatedaysCounter() {
        daysCounter++;
    }
    
    public int getDaysCounter() {
        return daysCounter;
    }
        



}
