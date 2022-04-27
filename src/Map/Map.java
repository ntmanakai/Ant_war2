package Map;

import Ants.Queen;
import Ants.Workers;


public class Map {

    //Instance unique
    private static Map INSTANCE = null;

    /**************************************--Attributes--********************************************/

    private String mymap;
    private Setup  setup;
    private int length;
    private int width;
    private ArrayList <Case> matrice;


    /**************************************--Constructors--******************************************/

    public Map ( String name )
    {
        Setup bydefault = new Setup();
        this.setup = bydefault;
        this.mymap = name;
        this.length = this.setup.GetLength();
        this.width = this.setup.GetWidth();



        initMatrice();
        Create_Food();
        //DisplayListFood();


        System.out.println("// Map creation "+ this.mymap+" dimension : "+ this.length +" x " + this.width );
    }


    public Map(String nom,Setup givenSetup)
    {
        setup = givenSetup;
        this.mymap = name;
        this.length = setup.GetLength();
        this.width = setup.GetWidth();

        System.out.println("// Map creation "+ this.mymap+" dimension : "+ this.length +" x " + this.width );

    }


    /*****************************************--Destructors--****************************************/

    public void finalize()
    {
        System.out.println("//Map destruction");
    }

    /*****************************************--Methods--********************************************/

    public void initMatrice()
    {
        //Instances case list
        matrice = new ArrayList<Case>();

        int i = 0 ;
        int j = 0 ;
        //Matrice initialisation
        for ( i = 0; i < this.width ;i++)
        {
            for ( j =0; j <this.length; j++)
            {
                Case oneCase = new Case(i, j);
                this.matrice.add(oneCase);
            }
        }
        System.out.println("//Initialiser matrice "+i+" x "+j);
    }


    public void Create_Food()
    {
        for ( int i = 0; i < this.setup.GetNbFood() ; i++)
        {
            Food unfood = new Food(this.width,this.length);

            //Add to case
            this.addFood(unfood);
        }

    }

    public void addFood(Food food)
    {
        for(Case onecase :this.matrice)
        {

            if ( onecase.GetPositionX() == food.GetPositionX() && onecase.GetPositionY()==food.GetPositionY())
            {
                if ( onecase.GetIsFood() == true)
                {
                    Food thefood = onecase.GetFood();
                    thefood.EditAddFood();
                }
                else
                    onecase.PositionFood(food);
            }
        }
    }

    public void addAntHill(Queen queen)
    {
        for(Case onecase :this.matrice)
        {

            if ( onecase.GetPositionX() == queen.GetPositionX() && onecase.GetPositionY()==queen.GetPositionY())
            {
                onecase.AntHillPosition();
            }
        }
    }

    public int addSoldat(Workers workers)
    {
        int check ;
        for(Case onecase :this.matrice)
        {

            if ( onecase.GetPositionX() == workers.GetPositionX() && onecase.GetPositionY()==workers.GetPositionY())
            {
                check= onecase.FightersPosition(workers);
                return check;
            }
        }
        return 1;
    }

    public void removeWorkers(Workers workers)
    {
        for(Case onecase :this.matrice)
        {

            if ( onecase.GetPositionX() == matrice.GetPositionX() && onecase.GetPositionY()==matrice.GetPositionY())
            {
                onecase.DeletePositionFighters(workers);
            }
        }
    }





}
