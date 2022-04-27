package Map;

import Fight.Fighters;

public class Case implements Fighters{

    /**************************************--Attributes--********************************************/

    private boolean isAntHill;
    private int position_X;
    private int position_y;
    private ArrayList<Fighters> FightersList;
    private Food aFood;
    private boolean aFight;

    /**************************************--Constructors--******************************************/

    public Case(int x , int y)
    {
        this.FightersList = new ArrayList<Fighters>();
        this.position_X = x;
        this.position_y = y;
        this.isAntHill = false;
        this.aFood = null;
        this.aFight = false;
    }

    }


}
