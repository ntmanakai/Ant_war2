package Map;

public class Setup {

    /**************************************--Attributes--********************************************/


    private int length;
    private int width;
    private int number_commanders;
    private int number_workers;
    private int food;
    private int hp;


    /**************************************--Constructors--******************************************/

    //Default parameters
    public Setup()
    {
        this.length = 20;
        this.width = 20;
        this.number_commanders = 2;
        this.number_workers = 5;
        this.food = 10;
        this.hp = 40;
    }

    //Input Setup
    public Setup(int length, int width,int commanders , int workers,int food,int hp)
    {
        this.length = length;
        this.width = width;
        this.number_commanders = commanders;
        this.number_workers = workers;
        this.food = food;
        this.hp = hp;
    }


    /*****************************************--Methods--********************************************/

    public void Display_Setup()
    {
        System.out.println("\n--- Default parameter ---");
        System.out.println("Map length  "+this.length);
        System.out.println("Map width  "+this.width);
        System.out.println("Foods number  "+this.food);
        System.out.println("Commanders number  "+this.number_commanders);
        System.out.println("Workers number  "+this.number_workers);
        System.out.println("HP  "+this.hp);
        System.out.println(" ---\n");
    }


    /*****************************************--Accessors--*****************************************/

    public int GetLength()
    {
        return this.length;
    }

    public int GetWidth()
    {
        return this.width;
    }

    public int GetNbCommanders()
    {
        return this.number_commanders;
    }

    public int GetNbWorkers()
    {
        return this.number_workers;
    }

    public int GetNbFood()
    {
        return this.food;
    }
    public int GetHP()
    {
        return this.hp;
    }
}
