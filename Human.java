import java.util.ArrayList;
import java.util.Random;


public class Human {
    
    private int id;
    private int Age;
    private String Sex;
    private boolean cD;
    /*how many critical dieases do you guys want? three? or four?
    /* and what about we make "String cD" boolean instead of a string of dieases which will make it easier for us because if it was true we can apply a percantage where the person can get covid faster or not
    */
    private boolean Alive;
    private covidInfection CovidInfection_Type;
    private ArrayList<Human> friends =new ArrayList<>();
    private ArrayList<Human> family =new ArrayList<>();
    private ArrayList<Human> coWorkers =new ArrayList<>();
    private ArrayList<Human> randomIndividuals =new ArrayList<Human>();

   
    public Human()
    {
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
        int j=random.nextInt(2);
        if(j == 0)
            this.cD= true;
        else
            this.cD = false;
        //












    }

    public int getId()
    {
        return id;
    }

    public int getAge()
    {
        return Age;
    }

    public String getSex()
    {
        return Sex;
    }

    public boolean getcD()
    {
        return cD;
    }

    public boolean getAlive()
    {
        return Alive;
    }

    public ArrayList getfamily()
    {
        return family;
    }

    public ArrayList getfriends()
    {
        return friends;
    }

    public ArrayList getcoWorkers()
    {
        return coWorkers;
    }

    public ArrayList getrandomIndividuals()
    {
        return randomIndividuals;
    }





    public covidInfection getCovidInfection_Type(){



        return CovidInfection_Type;

    }

  public void setCovidInfection_Type(covidInfection X){


    CovidInfection_Type= X;

           
    }




}
