package rock;

public class Rock {
    
    //Data Definitions
    int sample_number;
    String description;
    double rock_weight;
    
    //Super class constructor
    Rock(int sample, double weight){
        sample_number = sample;
        rock_weight = weight;
    }
    
    //get methods
    public int getSampleNumber(){
        return sample_number;
    }
    public String getDescription(){
        return description;
    }
    public double getWeight(){
        return rock_weight;
    }
}
