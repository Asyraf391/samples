package calculate;
import java.util.Scanner;  // Import the Scanner class
import java.text.DecimalFormat;

public class CalculateView {
  
    
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    
    public void main() {
        // TODO Auto-generated method stub
        
        Scanner scannerObj = new Scanner(System.in);
        CalculateController controllerObj = new CalculateController();
        Double weight, weight_on_mars;
        
        // Enter user weight and press Enter
        System.out.println("Enter your weight: "); // Input User Weight
        weight = scannerObj.nextDouble();
        scannerObj.close();
        
        weight_on_mars = controllerObj.calculateWeight(weight);
           
        System.out.println("Your weight on Mars is: " + df2.format(weight_on_mars));  // Output User Weight
    }
}