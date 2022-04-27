package Map;

public class Setup {

    /*                                       Attributes                                            */
    /***********************************************************************************************/

    private int length;
    private int width;
    private int number_commanders;
    private int number_workers;
    private int food;
    private int hp;

    /*                                       Constructors                                          */
    /***********************************************************************************************/

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

}
