package rock;

public class MetamorphicRock extends Rock
{
    public MetamorphicRock( int number, double weight)
    {
       //MetamorphicRock constructor
       super(number, weight);
       super.description = "Flat or squished rocks that are formed by changes to Igneous or Sedimantary rocks from extreme heat or pressure";
    }

}
