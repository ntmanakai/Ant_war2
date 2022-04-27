package Map;

import Fight.Fighters;
import Item.Food;

import java.util.ArrayList;


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


    /*****************************************--Methods--********************************************/

    public void AntHillPosition()
    {
        this.isAntHill = true;
    }

    public void FoodPosition(Food food)
    {
        this.aFood = food;
    }

    public int FightersPosition(Fighters workers)
    {
        while(this.FightersList.size()>1)
        {
            return 1;
        }
        synchronized(this.FightersList)
        {
            this.FightersList.add(workers);
            return 0;
        }
    }

    public void DeletePositionFighters(Fighters workers)
    {
        synchronized(this.FightersList)
        {
            this.FightersList.remove(workers);
        }
    }

    public boolean IsFight() {
        if (this.FightersList.size() == 2) {
            if (this.FightersList.get(0).GetColor() == this.FightersList.get(1).GetColor())
                return false;
            else
                return true;
        } else if (this.FightersList.size() > 2) {
            System.out.println("Too many Fighters on a single case");
            return false;
        } else
            return false;
    }

        /*****************************************--Accessors--*****************************************/

        public int GetPositionX()
        {
            return this.position_X;
        }

        public int GetPositionY()
        {
          return this.position_y;
        }

        public boolean GetaFight()
        {
            return this.aFight ;
        }
        public void SetaFight()
        {
            this.aFight = true;
        }

        public void SetCombatFini()
        {
            this.aFight = false;
        }

        public ArrayList<Fighters> GetFighterList()
        {
            return this.FightersList;
        }

        public boolean GetIsAntHill()
        {
            return this.isAntHill;
        }

        public boolean GetIsFood()
        {
            if ( this.aFood == null)
                return false;
            else
                return true;
        }

        public Food GetFood()
        {
            return  this.aFood;
        }

        public void DeleteFood()
        {
            this.aFood = null;
        }

        @Override
        public void CombatLost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        @Override
        public String GetColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        @Override
        public Thread GetHisThread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }










