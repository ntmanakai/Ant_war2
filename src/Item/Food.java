package Item;

public class Food extends Start{

    /**************************************--Attributes--********************************************/

    private int nbs ;

    /**************************************--Constructors--******************************************/

    public Food(int length,int width)
    {
        this.position_X = (int)(Math.random()*(width));
        this.position_Y = (int)(Math.random()*(length));
        this.nbs = 1;

        System.out.println("//Food creation on position "+this.position_X  +"  "+this.position_Y);
    }


    /**************************************--Destructors--******************************************/
    public void finalize()
    {
        System.out.println("//Food delete on position "+this.position_X  +"  "+this.position_Y);
    }


    /*****************************************--Methods--********************************************/
    public void EditAddFood()
    {
        this.nbs += 1;
    }

    public void EditDelFood()
    {
        this.nbs -= 1;

    }

    /*****************************************--Accessors--********************************************/
    public int GetNbs()
    {
        return this.nbs;
    }
}
