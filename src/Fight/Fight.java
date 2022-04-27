package Fight;


public class Fight <A extends Fighters, B extends Fighters> {

    private A fighter1;
    private B fighter2;



    public Fight(A c1, B c2)
    {
        this.fighter1 = c1;
        this.fighter2 = c2;

        String s1 = c1.GetColor();
        String s2 = c2.GetColor();

        if ( s1.equals(s2) == false)
            startFight();

    }

    public void startFight()
    {

        System.out.println("Ant "+this.fighter1.GetColor() +"  contre Fourmi "+this.fighter2.GetColor());

        int point1 = 0;
        int point2 = 0;

        while(point1 == point2)
        {
            point1 = (int)(Math.random()*(10));
            point2 = (int)(Math.random()*(10));
        }


        //If fighter1 win
        if( point1 > point2)
        {
            this.fighter2.CombatLost();
        }
        //If fighter2 win
        else
        {
            this.fighter1.CombatLost();
        }

    }
}
