package day5w2JavaAdvExercises;

public class ImportedItem implements Taxable {

	@Override
	public double calulateTax(double sellingprize) {
		// TODO Auto-generated method stub
		double taxrate = 0.05;
		final double importrate = 0.04;
		
		double taxamount = sellingprize*(taxrate+importrate);
		
		return taxamount;
	}

}
