public class TrackCapuchin
{
    private int monkeyXCoord;
    private int monkeyYCoord;
    private int foodXCoord;
    private int foodYCoord;

    public TrackCapuchin(int monkeyXCoord, int monkeyYCoord, int foodXCoord, int foodYCoord)
    {
        this.monkeyXCoord = monkeyXCoord;
        this.monkeyYCoord = monkeyYCoord;
        this.foodXCoord = foodXCoord;
        this.foodYCoord = foodYCoord;
    }

    public int getMonkeyXCoord()
    {
        return monkeyXCoord;
    }

    public int getMonkeyYCoord()
    {
        return monkeyYCoord;
    }

    public int getFoodXCoord()
    {
        return foodXCoord;
    }

    public int getFoodYCoord()
    {
        return foodYCoord;
    }

    public void moveMonkey(int xMovement, int yMovement)
    {
        monkeyXCoord = monkeyXCoord + xMovement;
        monkeyYCoord = monkeyYCoord + yMovement;
    }

    public double calcFoodDistance()
    {
        return(Math.sqrt(Math.pow((foodXCoord - monkeyXCoord), 2) + Math.pow((foodYCoord - monkeyYCoord), 2)));
    }

    public boolean isCloserThan(TrackCapuchin other)
    {
        if(calcFoodDistance() < other.calcFoodDistance())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}