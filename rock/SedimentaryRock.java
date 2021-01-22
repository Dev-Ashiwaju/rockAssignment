package rock;

public class SedimentaryRock extends Rock
{
    //SedimentaryRock constructor
     public SedimentaryRock( int number, double weight)
    {
       super(number, weight);
       super.description = "Rocks formed from sediment or fossils that are fused together under water over time";
    }
}
