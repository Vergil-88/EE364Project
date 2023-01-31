import java.util.ArrayList;

public abstract class Human {
    
    private int id;
    private int Age;
    private String Sex;
    private String cD;
    private boolean Alive;

    private ArrayList<Human> friends =new ArrayList<>();
    private ArrayList<Human> family =new ArrayList<>();
    private ArrayList<Human> coWorkers =new ArrayList<>();
    private ArrayList<Human> randomIndividuals =new ArrayList<Human>();

    public Human()
    {

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

    public String getcD()
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





}
