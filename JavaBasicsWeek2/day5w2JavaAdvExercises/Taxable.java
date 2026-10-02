package day5w2JavaAdvExercises;

public interface Taxable {
   final double taxrate = 0.07;
 // Interface is an 100% abstract - it contains methods which needs to be implemented
	double calulateTax(double taxamount);
}
