package rock;

public class IgneousRock extends Rock
{
    //IgneousRock constructor
    IgneousRock(int number, double weight)
    {
       super(number, weight);
       super.description = "Fire rocks formed from cooled lava that often have large crystals in them";
    }
}