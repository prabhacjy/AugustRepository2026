package day5w2JavaAdvExercises;

public class SalesItem implements Taxable {
 
	//private static double taxrate = 0.07; // 7% tax rate
	
	@Override
	public double calulateTax(double sellingprize) {
		// TODO Auto-generated method stub
		
		double taxamount = sellingprize*taxrate;
		return taxamount;

	}

}
