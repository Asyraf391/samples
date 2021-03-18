package calculate;

public class CalculateController {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CalculateView viewObj = new CalculateView();
        
        viewObj.main();
    }
    
    public Double calculateWeight(Double weight) {
        // TODO Auto-generated method stub
        
        double weight_on_mars = (weight / 9.81) * 3.711;
        
        return weight_on_mars;
    }

}