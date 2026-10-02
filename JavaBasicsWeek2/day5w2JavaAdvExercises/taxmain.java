package day5w2JavaAdvExercises;

public class taxmain {

	public static void main(String[] args) {
		// main method to call the class SalesItem and ImportedItem  which implements Taxable interface
		
		Taxable salestax = new SalesItem();
		Taxable importtax = new ImportedItem();
		
		double sellingprize = 150.00;
		
		System.out.println("The sales tax amount is $"+salestax.calulateTax(sellingprize));
		System.out.println("The imported sales tax amount is $"+importtax.calulateTax(sellingprize));
		
		

	}

}
