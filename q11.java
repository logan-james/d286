public class q11 { // Debt class
  // TODO: Declare private field - debtRatio
  private double debtRatio;
    
 // TODO: Define public method - calculateDR()
 public void calculateDR(double totalDebt, double totalAssets) {
    if (totalAssets != 0) {
       debtRatio = totalDebt / totalAssets;
    }else {
       debtRatio = 0.0;
    }
 }

 
 // TODO: Define public method - getDR()
 public double getDR() {
    return debtRatio;
 }
}

/*
 * This class was used in main() of another class.
 * Declared private double variable 'debtRatio'
 * Created method that finds the debtRatio via accepting parameters
 * last method is a getter or 'public accessor'
 */