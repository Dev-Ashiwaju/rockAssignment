package rock;
import javax.swing.*;
public class DemoRock {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        double weight;
        
        //Accepting values from the user for fields and instantiate the superclass
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number Sample" , "Igneous Rock", JOptionPane.INFORMATION_MESSAGE));
        weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Weight of the Rock" , "Igneous Rock", JOptionPane.INFORMATION_MESSAGE));
        IgneousRock ignouse = new IgneousRock(num, weight);
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number Sample" , "Sedimentary Rock", JOptionPane.INFORMATION_MESSAGE));
        weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Weight of the Rock" , "Sedimentary Rock", JOptionPane.INFORMATION_MESSAGE));
        SedimentaryRock sedimentary = new SedimentaryRock(num, weight);
        
        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number Sample" , "Metamorphic Rock", JOptionPane.INFORMATION_MESSAGE));
        weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Weight of the Rock" , "Metamorphic Rock", JOptionPane.INFORMATION_MESSAGE));
        MetamorphicRock metamorphic = new MetamorphicRock(num, weight);
        
        //Display the results
        System.out.println("Number of samples Igneous: " + ignouse.getSampleNumber());
        System.out.println("Weight Igneous: " + ignouse.getWeight());
        System.out.println("Description Igneous: " + ignouse.getDescription());
        System.out.println("\n");
        
        System.out.println("Number of samples Sedimentary: " + sedimentary.getSampleNumber());
        System.out.println("Weight Sedimentary: " + sedimentary.getWeight());
        System.out.println("Description Sedimentary: " + sedimentary.getDescription());
        System.out.println("\n");
        
        System.out.println("Number of samples Metamorphic: " + metamorphic.getSampleNumber());
        System.out.println("Weight Metamorphic: " + metamorphic.getWeight());
        System.out.println("Description Metamorphic: " + metamorphic.getDescription());
    }
}
