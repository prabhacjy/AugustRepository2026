package day2JavaBasicsExercises;

public class d2exer8 {

	public static void main(String[] args) {
		// Program for while do to print numbers from 1 to 10 except 5
		
		int i = 0;
		while (i<10) {
			if (i==5) {
				i=i+1;
			}
			System.out.println(i);
			i = i +1;
		}

	}

}
